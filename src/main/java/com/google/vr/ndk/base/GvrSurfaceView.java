package com.google.vr.ndk.base;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.opengl.GLSurfaceView.EGLContextFactory;
import android.opengl.GLSurfaceView.EGLWindowSurfaceFactory;
import android.opengl.GLSurfaceView.Renderer;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;
import android.view.SurfaceView;
import com.google.vr.cardboard.EglReadyListener;
import defpackage.bafg;
import defpackage.bafi;
import defpackage.bafz;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

public class GvrSurfaceView extends SurfaceView implements Callback2 {
    public EglReadyListener mAppContextListener;
    public int mDebugFlags;
    public boolean mDetached;
    public EGLConfigChooser mEGLConfigChooser;
    public int mEGLContextClientVersion;
    public EGLContextFactory mEGLContextFactory;
    public EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    public GLThread mGLThread;
    public GLWrapper mGLWrapper;
    public boolean mPreserveEGLContextOnPause;
    public boolean mPreserveGlThreadOnDetachedFromWindow;
    public Renderer mRenderer;
    public final WeakReference mThisWeakRef = new WeakReference(this);

    abstract class BaseConfigChooser implements EGLConfigChooser {
        public int[] mConfigSpec;

        public BaseConfigChooser(int[] iArr) {
            this.mConfigSpec = filterConfigSpec(iArr);
        }

        public abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int i = 1;
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr)) {
                int i2 = iArr[0];
                if (i2 > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                    if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i2, iArr)) {
                        EGLConfig chooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
                        if (chooseConfig != null) {
                            return chooseConfig;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            while (true) {
                int[] iArr2 = this.mConfigSpec;
                if (i >= iArr2.length) {
                    throw new IllegalArgumentException("eglChooseConfig failed");
                } else if (iArr2[i - 1] == 12352 && iArr2[i] == 64) {
                    Log.w("GvrSurfaceView", "Failed to choose GLES 3 config, will try 2.");
                    this.mConfigSpec[i] = 4;
                    return chooseConfig(egl10, eGLDisplay);
                } else {
                    i++;
                }
            }
        }

        private int[] filterConfigSpec(int[] iArr) {
            if (GvrSurfaceView.this.mEGLContextClientVersion != 2 && GvrSurfaceView.this.mEGLContextClientVersion != 3) {
                return iArr;
            }
            int[] iArr2 = new int[15];
            System.arraycopy(iArr, 0, iArr2, 0, 12);
            iArr2[12] = 12352;
            if (GvrSurfaceView.this.mEGLContextClientVersion == 2) {
                iArr2[13] = 4;
            } else {
                iArr2[13] = 64;
            }
            iArr2[14] = 12344;
            return iArr2;
        }
    }

    class DefaultContextFactory implements EGLContextFactory {
        private DefaultContextFactory() {
        }

        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = new int[]{12440, GvrSurfaceView.this.mEGLContextClientVersion, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (GvrSurfaceView.this.mEGLContextClientVersion == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                String valueOf = String.valueOf(eGLDisplay);
                String valueOf2 = String.valueOf(eGLContext);
                StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 18) + valueOf2.length());
                stringBuilder.append("display:");
                stringBuilder.append(valueOf);
                stringBuilder.append(" context: ");
                stringBuilder.append(valueOf2);
                Log.e("DefaultContextFactory", stringBuilder.toString());
                EglHelper.throwEglException("eglDestroyContext", egl10.eglGetError());
            }
        }
    }

    class DefaultWindowSurfaceFactory implements EGLWindowSurfaceFactory {
        private DefaultWindowSurfaceFactory() {
        }

        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            EGLSurface eGLSurface = null;
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
                return eGLSurface;
            } catch (IllegalArgumentException e) {
                Log.e("GvrSurfaceView", "eglCreateWindowSurface", e);
                return eGLSurface;
            }
        }

        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    class EglHelper {
        public EGL10 mEgl;
        public EGLConfig mEglConfig;
        public EGLContext mEglContext;
        public EGLDisplay mEglDisplay;
        public EGLSurface mEglSurface;
        public WeakReference mGvrSurfaceViewWeakRef;
        public EGLContext mPendingEglContext;
        public EGLDisplay mPendingEglDisplay;

        public EglHelper(WeakReference weakReference) {
            this.mGvrSurfaceViewWeakRef = weakReference;
        }

        public void start() {
            if (this.mEgl == null) {
                initialize();
            }
            EGLContext eGLContext = this.mEglContext;
            if (eGLContext != null) {
                this.mEgl.eglDestroyContext(this.mEglDisplay, eGLContext);
                this.mEglContext = null;
            }
            if (this.mPendingEglContext == null) {
                createPendingEglContext();
            }
            this.mEglContext = this.mPendingEglContext;
            this.mEglDisplay = this.mPendingEglDisplay;
            this.mPendingEglContext = null;
            this.mPendingEglDisplay = null;
        }

        public void renewPendingEglContext() {
            if (this.mEgl == null) {
                initialize();
            }
            EGLContext eGLContext = this.mPendingEglContext;
            if (eGLContext != null) {
                this.mEgl.eglDestroyContext(this.mEglDisplay, eGLContext);
            }
            createPendingEglContext();
        }

        private void initialize() {
            this.mEgl = (EGL10) EGLContext.getEGL();
            this.mEglDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.mEglDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.mEgl.eglInitialize(this.mEglDisplay, new int[2])) {
                    this.mEglSurface = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        private void createPendingEglContext() {
            this.mPendingEglDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.mPendingEglDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.mEgl.eglInitialize(this.mPendingEglDisplay, new int[2])) {
                    EGLContext eGLContext;
                    GvrSurfaceView gvrSurfaceView = (GvrSurfaceView) this.mGvrSurfaceViewWeakRef.get();
                    EGLContext eGLContext2 = null;
                    if (gvrSurfaceView == null) {
                        this.mEglConfig = null;
                        eGLContext = null;
                    } else {
                        if (gvrSurfaceView.mAppContextListener != null) {
                            eGLContext = gvrSurfaceView.mAppContextListener.a;
                            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                                throwEglException("Unable to obtain application's OpenGL context.");
                            } else {
                                bafg bafg = (bafg) gvrSurfaceView.mEGLContextFactory;
                                int i = gvrSurfaceView.mAppContextListener.b;
                                bafg.f = eGLContext;
                                bafg.d = (i & 8) == 0;
                                bafg.e = gvrSurfaceView.mAppContextListener.c;
                            }
                        }
                        this.mEglConfig = gvrSurfaceView.mEGLConfigChooser.chooseConfig(this.mEgl, this.mPendingEglDisplay);
                        eGLContext = gvrSurfaceView.mEGLContextFactory.createContext(this.mEgl, this.mPendingEglDisplay, this.mEglConfig);
                    }
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        int eglGetError = this.mEgl.eglGetError();
                        if (eglGetError == 12294) {
                            Log.e("EglHelper", "Stashed EGL context has become invalid and can no longer be used for sharing.");
                            this.mPendingEglContext = null;
                            this.mPendingEglDisplay = null;
                            this.mEglConfig = null;
                            if (gvrSurfaceView.mAppContextListener != null) {
                                EglReadyListener access$300 = gvrSurfaceView.mAppContextListener;
                                synchronized (access$300.d) {
                                    access$300.a = null;
                                    access$300.c = 2;
                                    access$300.b = 0;
                                }
                            }
                            return;
                        }
                        throwEglException("createPendingEglContext", eglGetError);
                    } else {
                        eGLContext2 = eGLContext;
                    }
                    this.mPendingEglContext = eGLContext2;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        public boolean createSurface() {
            if (this.mEgl == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.mEglDisplay == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.mEglConfig != null) {
                destroySurfaceImp();
                GvrSurfaceView gvrSurfaceView = (GvrSurfaceView) this.mGvrSurfaceViewWeakRef.get();
                if (gvrSurfaceView != null) {
                    this.mEglSurface = gvrSurfaceView.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, gvrSurfaceView.getHolder());
                } else {
                    this.mEglSurface = null;
                }
                EGLSurface eGLSurface = this.mEglSurface;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    if (this.mEgl.eglGetError() == 12299) {
                        Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                    }
                    return false;
                }
                EGL10 egl10 = this.mEgl;
                EGLDisplay eGLDisplay = this.mEglDisplay;
                EGLSurface eGLSurface2 = this.mEglSurface;
                if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.mEglContext)) {
                    return true;
                }
                logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
                return false;
            } else {
                throw new RuntimeException("mEglConfig not initialized");
            }
        }

        /* Access modifiers changed, original: 0000 */
        public GL createGL() {
            GL gl = this.mEglContext.getGL();
            GvrSurfaceView gvrSurfaceView = (GvrSurfaceView) this.mGvrSurfaceViewWeakRef.get();
            if (gvrSurfaceView == null) {
                return gl;
            }
            if (gvrSurfaceView.mGLWrapper != null) {
                gl = gvrSurfaceView.mGLWrapper.wrap(gl);
            }
            if ((gvrSurfaceView.mDebugFlags & 3) == 0) {
                return gl;
            }
            return GLDebugHelper.wrap(gl, gvrSurfaceView.mDebugFlags & 1, (gvrSurfaceView.mDebugFlags & 2) != 0 ? new LogWriter() : null);
        }

        public int swap() {
            return !this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface) ? this.mEgl.eglGetError() : 12288;
        }

        public void destroySurface() {
            destroySurfaceImp();
        }

        public void setEglSurfaceAttrib(int i, int i2) {
            if (!EGL14.eglSurfaceAttrib(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377), i, i2)) {
                StringBuilder stringBuilder = new StringBuilder(66);
                stringBuilder.append("eglSurfaceAttrib() failed. attribute=");
                stringBuilder.append(i);
                stringBuilder.append(" value=");
                stringBuilder.append(i2);
                Log.e("EglHelper", stringBuilder.toString());
            }
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface = this.mEglSurface;
            if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                this.mEgl.eglMakeCurrent(this.mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                GvrSurfaceView gvrSurfaceView = (GvrSurfaceView) this.mGvrSurfaceViewWeakRef.get();
                if (gvrSurfaceView != null) {
                    gvrSurfaceView.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
                }
                this.mEglSurface = null;
            }
        }

        public void finish() {
            if (this.mEglContext != null) {
                GvrSurfaceView gvrSurfaceView = (GvrSurfaceView) this.mGvrSurfaceViewWeakRef.get();
                if (gvrSurfaceView != null) {
                    gvrSurfaceView.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
                }
                this.mEglContext = null;
            }
            EGLDisplay eGLDisplay = this.mEglDisplay;
            if (eGLDisplay != null) {
                this.mEgl.eglTerminate(eGLDisplay);
                this.mEglDisplay = null;
            }
        }

        private void throwEglException(String str) {
            throwEglException(str, this.mEgl.eglGetError());
        }

        public static void throwEglException(String str, int i) {
            throw new RuntimeException(formatEglError(str, i));
        }

        public static void logEglErrorAsWarning(String str, String str2, int i) {
            Log.w(str, formatEglError(str2, i));
        }

        public static String formatEglError(String str, int i) {
            String errorString = getErrorString(i);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 9) + String.valueOf(errorString).length());
            stringBuilder.append(str);
            stringBuilder.append(" failed: ");
            stringBuilder.append(errorString);
            return stringBuilder.toString();
        }

        private static String getHex(int i) {
            String valueOf = String.valueOf(Integer.toHexString(i));
            String str = "0x";
            return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        }

        private static String getErrorString(int i) {
            switch (i) {
                case 12288:
                    return "EGL_SUCCESS";
                case 12289:
                    return "EGL_NOT_INITIALIZED";
                case 12290:
                    return "EGL_BAD_ACCESS";
                case 12291:
                    return "EGL_BAD_ALLOC";
                case 12292:
                    return "EGL_BAD_ATTRIBUTE";
                case 12293:
                    return "EGL_BAD_CONFIG";
                case 12294:
                    return "EGL_BAD_CONTEXT";
                case 12295:
                    return "EGL_BAD_CURRENT_SURFACE";
                case 12296:
                    return "EGL_BAD_DISPLAY";
                case 12297:
                    return "EGL_BAD_MATCH";
                case 12298:
                    return "EGL_BAD_NATIVE_PIXMAP";
                case 12299:
                    return "EGL_BAD_NATIVE_WINDOW";
                case 12300:
                    return "EGL_BAD_PARAMETER";
                case 12301:
                    return "EGL_BAD_SURFACE";
                case 12302:
                    return "EGL_CONTEXT_LOST";
                default:
                    return getHex(i);
            }
        }
    }

    public interface GLWrapper {
        GL wrap(GL gl);
    }

    class LogWriter extends Writer {
        public StringBuilder mBuilder = new StringBuilder();

        LogWriter() {
        }

        public void close() {
            flushBuilder();
        }

        public void flush() {
            flushBuilder();
        }

        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == 10) {
                    flushBuilder();
                } else {
                    this.mBuilder.append(c);
                }
            }
        }

        private void flushBuilder() {
            if (this.mBuilder.length() > 0) {
                this.mBuilder.toString();
                StringBuilder stringBuilder = this.mBuilder;
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
    }

    class ComponentSizeChooser extends BaseConfigChooser {
        public int mAlphaSize;
        public int mBlueSize;
        public int mDepthSize;
        public int mGreenSize;
        public int mRedSize;
        public int mStencilSize;
        public int[] mValue = new int[1];

        public ComponentSizeChooser(GvrSurfaceView gvrSurfaceView, int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, 16, 12326, 0, 12344});
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = 16;
            this.mStencilSize = 0;
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                int findConfigAttrib = findConfigAttrib(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                    egl102 = egl10;
                    eGLDisplay2 = eGLDisplay;
                    eGLConfig2 = eGLConfig;
                    findConfigAttrib = findConfigAttrib(egl102, eGLDisplay2, eGLConfig2, 12324, 0);
                    int findConfigAttrib3 = findConfigAttrib(egl102, eGLDisplay2, eGLConfig2, 12323, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl102, eGLDisplay2, eGLConfig2, 12322, 0);
                    findConfigAttrib2 = findConfigAttrib(egl102, eGLDisplay2, eGLConfig2, 12321, 0);
                    if (findConfigAttrib == this.mRedSize && findConfigAttrib3 == this.mGreenSize && findConfigAttrib4 == this.mBlueSize && findConfigAttrib2 == this.mAlphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue)) {
                return this.mValue[0];
            }
            return 0;
        }
    }

    class GLThread extends Thread implements bafi {
        public EglHelper mEglHelper;
        public ArrayList mEventQueue = new ArrayList();
        public boolean mExited;
        public boolean mFinishedCreatingEglSurface;
        public final GLThreadManager mGLThreadManager = new GLThreadManager();
        public WeakReference mGvrSurfaceViewWeakRef;
        public boolean mHasSurface;
        public boolean mHaveEglContext;
        public boolean mHaveEglSurface;
        public int mHeight = 0;
        public boolean mPaused;
        public boolean mRenderComplete;
        public int mRenderMode = 1;
        public boolean mRequestPaused;
        public boolean mRequestRender = true;
        public int mRequestedSwapMode = 0;
        public boolean mShouldExit;
        public boolean mShouldReleaseEglContext;
        public boolean mSizeChanged = true;
        public boolean mSurfaceIsBad;
        public boolean mWaitingForSurface;
        public boolean mWantRenderNotification = false;
        public int mWidth = 0;

        class GLThreadManager {
            private GLThreadManager() {
            }

            public synchronized void threadExiting(GLThread gLThread) {
                gLThread.mExited = true;
                notifyAll();
            }

            public void releaseEglContextLocked(GLThread gLThread) {
                notifyAll();
            }
        }

        GLThread(WeakReference weakReference) {
            this.mGvrSurfaceViewWeakRef = weakReference;
            GvrSurfaceView gvrSurfaceView = (GvrSurfaceView) weakReference.get();
            if (gvrSurfaceView != null && gvrSurfaceView.mAppContextListener != null) {
                EglReadyListener access$300 = gvrSurfaceView.mAppContextListener;
                synchronized (access$300.f) {
                    access$300.e = this;
                }
            }
        }

        public void onEglReady() {
            synchronized (this.mGLThreadManager) {
                this.mEglHelper.renewPendingEglContext();
                this.mGLThreadManager.notifyAll();
            }
        }

        public void run() {
            long id = getId();
            StringBuilder stringBuilder = new StringBuilder(29);
            stringBuilder.append("GLThread ");
            stringBuilder.append(id);
            setName(stringBuilder.toString());
            try {
                guardedRun();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                this.mGLThreadManager.threadExiting(this);
            }
            this.mGLThreadManager.threadExiting(this);
        }

        private void stopEglSurfaceLocked() {
            if (this.mHaveEglSurface) {
                this.mHaveEglSurface = false;
                this.mEglHelper.destroySurface();
            }
        }

        private void stopEglContextLocked() {
            if (this.mHaveEglContext) {
                this.mEglHelper.finish();
                this.mHaveEglContext = false;
                this.mGLThreadManager.releaseEglContextLocked(this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:218:0x010c A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x0236  */
        /* JADX WARNING: Removed duplicated region for block: B:190:0x022f  */
        /* JADX WARNING: Missing block: B:97:0x0138, code skipped:
            if (r15 == null) goto L_0x0140;
     */
        /* JADX WARNING: Missing block: B:99:?, code skipped:
            r15.run();
            r15 = null;
     */
        /* JADX WARNING: Missing block: B:100:0x0140, code skipped:
            if (r4 == null) goto L_0x016e;
     */
        /* JADX WARNING: Missing block: B:102:0x0148, code skipped:
            if (r1.mEglHelper.createSurface() == false) goto L_0x015b;
     */
        /* JADX WARNING: Missing block: B:103:0x014a, code skipped:
            r2 = r1.mGLThreadManager;
     */
        /* JADX WARNING: Missing block: B:104:0x014c, code skipped:
            monitor-enter(r2);
     */
        /* JADX WARNING: Missing block: B:107:?, code skipped:
            r1.mFinishedCreatingEglSurface = true;
            r1.mGLThreadManager.notifyAll();
     */
        /* JADX WARNING: Missing block: B:108:0x0155, code skipped:
            monitor-exit(r2);
     */
        /* JADX WARNING: Missing block: B:109:0x0156, code skipped:
            r12 = 0;
     */
        /* JADX WARNING: Missing block: B:114:0x015b, code skipped:
            r2 = r1.mGLThreadManager;
     */
        /* JADX WARNING: Missing block: B:115:0x015d, code skipped:
            monitor-enter(r2);
     */
        /* JADX WARNING: Missing block: B:118:?, code skipped:
            r1.mFinishedCreatingEglSurface = true;
            r1.mSurfaceIsBad = true;
            r1.mGLThreadManager.notifyAll();
     */
        /* JADX WARNING: Missing block: B:119:0x0168, code skipped:
            monitor-exit(r2);
     */
        /* JADX WARNING: Missing block: B:169:0x0200, code skipped:
            if (r12 != 0) goto L_0x0202;
     */
        private void guardedRun() {
            /*
            r18 = this;
            r1 = r18;
            r0 = new com.google.vr.ndk.base.GvrSurfaceView$EglHelper;
            r2 = r1.mGvrSurfaceViewWeakRef;
            r0.<init>(r2);
            r1.mEglHelper = r0;
            r0 = 0;
            r1.mHaveEglContext = r0;
            r1.mHaveEglSurface = r0;
            r1.mWantRenderNotification = r0;
            r4 = 0;
            r5 = 0;
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 0;
            r13 = 0;
            r14 = 0;
            r15 = 0;
            r16 = 0;
        L_0x0020:
            r17 = 0;
        L_0x0022:
            r2 = r1.mGLThreadManager;	 Catch:{ all -> 0x024c }
            monitor-enter(r2);	 Catch:{ all -> 0x024c }
        L_0x0025:
            r3 = r1.mShouldExit;	 Catch:{ all -> 0x0249 }
            if (r3 == 0) goto L_0x0038;
        L_0x0029:
            monitor-exit(r2);	 Catch:{ all -> 0x0249 }
            r3 = r1.mGLThreadManager;
            monitor-enter(r3);
            r18.stopEglSurfaceLocked();	 Catch:{ all -> 0x0035 }
            r18.stopEglContextLocked();	 Catch:{ all -> 0x0035 }
            monitor-exit(r3);	 Catch:{ all -> 0x0035 }
            return;
        L_0x0035:
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0035 }
            throw r0;
        L_0x0038:
            r3 = r1.mEventQueue;	 Catch:{ all -> 0x0249 }
            r3 = r3.isEmpty();	 Catch:{ all -> 0x0249 }
            if (r3 != 0) goto L_0x004b;
        L_0x0040:
            r3 = r1.mEventQueue;	 Catch:{ all -> 0x0249 }
            r3 = r3.remove(r0);	 Catch:{ all -> 0x0249 }
            r3 = (java.lang.Runnable) r3;	 Catch:{ all -> 0x0249 }
            r15 = r3;
            goto L_0x0137;
        L_0x004b:
            r3 = r1.mPaused;	 Catch:{ all -> 0x0249 }
            r0 = r1.mRequestPaused;	 Catch:{ all -> 0x0249 }
            if (r3 == r0) goto L_0x0059;
        L_0x0051:
            r1.mPaused = r0;	 Catch:{ all -> 0x0249 }
            r3 = r1.mGLThreadManager;	 Catch:{ all -> 0x0249 }
            r3.notifyAll();	 Catch:{ all -> 0x0249 }
            goto L_0x005a;
        L_0x0059:
            r0 = 0;
        L_0x005a:
            r3 = r1.mShouldReleaseEglContext;	 Catch:{ all -> 0x0249 }
            if (r3 == 0) goto L_0x0068;
        L_0x005e:
            r18.stopEglSurfaceLocked();	 Catch:{ all -> 0x0249 }
            r18.stopEglContextLocked();	 Catch:{ all -> 0x0249 }
            r3 = 0;
            r1.mShouldReleaseEglContext = r3;	 Catch:{ all -> 0x0249 }
            r9 = 1;
        L_0x0068:
            if (r6 == 0) goto L_0x0070;
        L_0x006a:
            r18.stopEglSurfaceLocked();	 Catch:{ all -> 0x0249 }
            r18.stopEglContextLocked();	 Catch:{ all -> 0x0249 }
        L_0x0070:
            if (r0 == 0) goto L_0x0090;
        L_0x0072:
            r0 = r1.mHaveEglSurface;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x0079;
        L_0x0076:
            r18.stopEglSurfaceLocked();	 Catch:{ all -> 0x0249 }
        L_0x0079:
            r0 = r1.mHaveEglContext;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x0090;
        L_0x007d:
            r0 = r1.mGvrSurfaceViewWeakRef;	 Catch:{ all -> 0x0249 }
            r0 = r0.get();	 Catch:{ all -> 0x0249 }
            r0 = (com.google.vr.ndk.base.GvrSurfaceView) r0;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x008d;
        L_0x0087:
            r0 = r0.mPreserveEGLContextOnPause;	 Catch:{ all -> 0x0249 }
            if (r0 != 0) goto L_0x0090;
        L_0x008d:
            r18.stopEglContextLocked();	 Catch:{ all -> 0x0249 }
        L_0x0090:
            r0 = r1.mHasSurface;	 Catch:{ all -> 0x0249 }
            if (r0 != 0) goto L_0x00aa;
        L_0x0094:
            r0 = r1.mWaitingForSurface;	 Catch:{ all -> 0x0249 }
            if (r0 != 0) goto L_0x00aa;
        L_0x0098:
            r0 = r1.mHaveEglSurface;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x009f;
        L_0x009c:
            r18.stopEglSurfaceLocked();	 Catch:{ all -> 0x0249 }
        L_0x009f:
            r0 = 1;
            r1.mWaitingForSurface = r0;	 Catch:{ all -> 0x0249 }
            r0 = 0;
            r1.mSurfaceIsBad = r0;	 Catch:{ all -> 0x0249 }
            r0 = r1.mGLThreadManager;	 Catch:{ all -> 0x0249 }
            r0.notifyAll();	 Catch:{ all -> 0x0249 }
        L_0x00aa:
            r0 = r1.mHasSurface;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x00ba;
        L_0x00ae:
            r0 = r1.mWaitingForSurface;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x00ba;
        L_0x00b2:
            r0 = 0;
            r1.mWaitingForSurface = r0;	 Catch:{ all -> 0x0249 }
            r0 = r1.mGLThreadManager;	 Catch:{ all -> 0x0249 }
            r0.notifyAll();	 Catch:{ all -> 0x0249 }
        L_0x00ba:
            if (r8 == 0) goto L_0x00c7;
        L_0x00bc:
            r0 = 0;
            r1.mWantRenderNotification = r0;	 Catch:{ all -> 0x0249 }
            r0 = 1;
            r1.mRenderComplete = r0;	 Catch:{ all -> 0x0249 }
            r0 = r1.mGLThreadManager;	 Catch:{ all -> 0x0249 }
            r0.notifyAll();	 Catch:{ all -> 0x0249 }
        L_0x00c7:
            r0 = r18.readyToDraw();	 Catch:{ all -> 0x0249 }
            if (r0 != 0) goto L_0x00d2;
        L_0x00cd:
            r3 = r7;
        L_0x00ce:
            r0 = 0;
            r7 = 1;
            goto L_0x023f;
        L_0x00d2:
            r0 = r1.mHaveEglContext;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x00d7;
        L_0x00d6:
            goto L_0x00f7;
        L_0x00d7:
            if (r9 != 0) goto L_0x00f6;
        L_0x00d9:
            r0 = r1.mEglHelper;	 Catch:{ RuntimeException -> 0x00ef }
            r0.start();	 Catch:{ RuntimeException -> 0x00ef }
            r0 = r1.mEglHelper;	 Catch:{ all -> 0x0249 }
            r0 = r0.mEglContext;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x00f7;
        L_0x00e4:
            r0 = 1;
            r1.mHaveEglContext = r0;	 Catch:{ all -> 0x0249 }
            r0 = r1.mGLThreadManager;	 Catch:{ all -> 0x0249 }
            r0.notifyAll();	 Catch:{ all -> 0x0249 }
            r17 = 1;
            goto L_0x00f7;
        L_0x00ef:
            r0 = move-exception;
            r3 = r1.mGLThreadManager;	 Catch:{ all -> 0x0249 }
            r3.releaseEglContextLocked(r1);	 Catch:{ all -> 0x0249 }
            throw r0;	 Catch:{ all -> 0x0249 }
        L_0x00f6:
            r9 = 0;
        L_0x00f7:
            r0 = r1.mHaveEglContext;	 Catch:{ all -> 0x0249 }
            if (r0 != 0) goto L_0x00fc;
        L_0x00fb:
            goto L_0x0100;
        L_0x00fc:
            r0 = r1.mHaveEglSurface;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x0102;
        L_0x0100:
            r3 = r7;
            goto L_0x0108;
        L_0x0102:
            r0 = 1;
            r1.mHaveEglSurface = r0;	 Catch:{ all -> 0x0249 }
            r3 = 1;
            r4 = 1;
            r5 = 1;
        L_0x0108:
            r0 = r1.mHaveEglSurface;	 Catch:{ all -> 0x0249 }
            if (r0 == 0) goto L_0x00ce;
        L_0x010c:
            r0 = r1.mSizeChanged;	 Catch:{ all -> 0x0249 }
            if (r0 != 0) goto L_0x0112;
        L_0x0110:
            r0 = 0;
            goto L_0x011e;
        L_0x0112:
            r13 = r1.mWidth;	 Catch:{ all -> 0x0249 }
            r14 = r1.mHeight;	 Catch:{ all -> 0x0249 }
            r0 = 1;
            r1.mWantRenderNotification = r0;	 Catch:{ all -> 0x0249 }
            r0 = 0;
            r1.mSizeChanged = r0;	 Catch:{ all -> 0x0249 }
            r3 = 1;
            r4 = 1;
        L_0x011e:
            r1.mRequestRender = r0;	 Catch:{ all -> 0x0249 }
            r6 = r1.mGLThreadManager;	 Catch:{ all -> 0x0249 }
            r6.notifyAll();	 Catch:{ all -> 0x0249 }
            r6 = r1.mWantRenderNotification;	 Catch:{ all -> 0x0249 }
            if (r6 != 0) goto L_0x012a;
        L_0x0129:
            goto L_0x012b;
        L_0x012a:
            r10 = 1;
        L_0x012b:
            r6 = r1.mRequestedSwapMode;	 Catch:{ all -> 0x0249 }
            if (r6 == r12) goto L_0x0131;
        L_0x012f:
            r7 = 1;
            goto L_0x0132;
        L_0x0131:
            r7 = 0;
        L_0x0132:
            r12 = r6;
            r11 = r7;
            r6 = 0;
            r8 = 0;
            r7 = r3;
        L_0x0137:
            monitor-exit(r2);	 Catch:{ all -> 0x0249 }
            if (r15 == 0) goto L_0x0140;
        L_0x013a:
            r15.run();	 Catch:{ all -> 0x024c }
            r15 = 0;
            goto L_0x0022;
        L_0x0140:
            if (r4 == 0) goto L_0x016e;
        L_0x0142:
            r2 = r1.mEglHelper;	 Catch:{ all -> 0x024c }
            r2 = r2.createSurface();	 Catch:{ all -> 0x024c }
            if (r2 == 0) goto L_0x015b;
        L_0x014a:
            r2 = r1.mGLThreadManager;	 Catch:{ all -> 0x024c }
            monitor-enter(r2);	 Catch:{ all -> 0x024c }
            r3 = 1;
            r1.mFinishedCreatingEglSurface = r3;	 Catch:{ all -> 0x0158 }
            r3 = r1.mGLThreadManager;	 Catch:{ all -> 0x0158 }
            r3.notifyAll();	 Catch:{ all -> 0x0158 }
            monitor-exit(r2);	 Catch:{ all -> 0x0158 }
            r12 = 0;
            goto L_0x016e;
        L_0x0158:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0158 }
            throw r0;	 Catch:{ all -> 0x024c }
        L_0x015b:
            r2 = r1.mGLThreadManager;	 Catch:{ all -> 0x024c }
            monitor-enter(r2);	 Catch:{ all -> 0x024c }
            r3 = 1;
            r1.mFinishedCreatingEglSurface = r3;	 Catch:{ all -> 0x016b }
            r1.mSurfaceIsBad = r3;	 Catch:{ all -> 0x016b }
            r3 = r1.mGLThreadManager;	 Catch:{ all -> 0x016b }
            r3.notifyAll();	 Catch:{ all -> 0x016b }
            monitor-exit(r2);	 Catch:{ all -> 0x016b }
            goto L_0x0022;
        L_0x016b:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x016b }
            throw r0;	 Catch:{ all -> 0x024c }
        L_0x016e:
            if (r5 == 0) goto L_0x0179;
        L_0x0170:
            r2 = r1.mEglHelper;	 Catch:{ all -> 0x024c }
            r2 = r2.createGL();	 Catch:{ all -> 0x024c }
            r2 = (javax.microedition.khronos.opengles.GL10) r2;	 Catch:{ all -> 0x024c }
            goto L_0x017b;
        L_0x0179:
            r2 = r16;
        L_0x017b:
            if (r17 == 0) goto L_0x01a0;
        L_0x017d:
            r3 = r1.mGvrSurfaceViewWeakRef;	 Catch:{ all -> 0x024c }
            r3 = r3.get();	 Catch:{ all -> 0x024c }
            r3 = (com.google.vr.ndk.base.GvrSurfaceView) r3;	 Catch:{ all -> 0x024c }
            if (r3 == 0) goto L_0x01a0;
        L_0x0187:
            r4 = "onSurfaceCreated";
            com.google.vr.ndk.base.TraceCompat.beginSection(r4);	 Catch:{ all -> 0x019b }
            r3 = r3.mRenderer;	 Catch:{ all -> 0x019b }
            r4 = r1.mEglHelper;	 Catch:{ all -> 0x019b }
            r4 = r4.mEglConfig;	 Catch:{ all -> 0x019b }
            r3.onSurfaceCreated(r2, r4);	 Catch:{ all -> 0x019b }
            com.google.vr.ndk.base.TraceCompat.endSection();	 Catch:{ all -> 0x024c }
            goto L_0x01a0;
        L_0x019b:
            r0 = move-exception;
            com.google.vr.ndk.base.TraceCompat.endSection();	 Catch:{ all -> 0x024c }
            throw r0;	 Catch:{ all -> 0x024c }
        L_0x01a0:
            if (r7 == 0) goto L_0x01c1;
        L_0x01a2:
            r3 = r1.mGvrSurfaceViewWeakRef;	 Catch:{ all -> 0x024c }
            r3 = r3.get();	 Catch:{ all -> 0x024c }
            r3 = (com.google.vr.ndk.base.GvrSurfaceView) r3;	 Catch:{ all -> 0x024c }
            if (r3 == 0) goto L_0x01c1;
        L_0x01ac:
            r4 = "onSurfaceChanged";
            com.google.vr.ndk.base.TraceCompat.beginSection(r4);	 Catch:{ all -> 0x01bc }
            r3 = r3.mRenderer;	 Catch:{ all -> 0x01bc }
            r3.onSurfaceChanged(r2, r13, r14);	 Catch:{ all -> 0x01bc }
            com.google.vr.ndk.base.TraceCompat.endSection();	 Catch:{ all -> 0x024c }
            goto L_0x01c1;
        L_0x01bc:
            r0 = move-exception;
            com.google.vr.ndk.base.TraceCompat.endSection();	 Catch:{ all -> 0x024c }
            throw r0;	 Catch:{ all -> 0x024c }
        L_0x01c1:
            if (r11 == 0) goto L_0x01de;
        L_0x01c3:
            r3 = r1.mEglHelper;	 Catch:{ all -> 0x024c }
            r4 = 1;
            if (r12 != r4) goto L_0x01cb;
        L_0x01c8:
            r5 = 12421; // 0x3085 float:1.7406E-41 double:6.137E-320;
            goto L_0x01cd;
        L_0x01cb:
            r5 = 12420; // 0x3084 float:1.7404E-41 double:6.1363E-320;
        L_0x01cd:
            r7 = 12422; // 0x3086 float:1.7407E-41 double:6.1373E-320;
            r3.setEglSurfaceAttrib(r7, r5);	 Catch:{ all -> 0x024c }
            r3 = r1.mEglHelper;	 Catch:{ all -> 0x024c }
            if (r12 != r4) goto L_0x01d8;
        L_0x01d6:
            r4 = 1;
            goto L_0x01d9;
        L_0x01d8:
            r4 = 0;
        L_0x01d9:
            r5 = 12620; // 0x314c float:1.7684E-41 double:6.235E-320;
            r3.setEglSurfaceAttrib(r5, r4);	 Catch:{ all -> 0x024c }
        L_0x01de:
            r3 = r1.mGvrSurfaceViewWeakRef;	 Catch:{ all -> 0x024c }
            r3 = r3.get();	 Catch:{ all -> 0x024c }
            r3 = (com.google.vr.ndk.base.GvrSurfaceView) r3;	 Catch:{ all -> 0x024c }
            if (r3 == 0) goto L_0x01fd;
        L_0x01e8:
            r4 = "onDrawFrame";
            com.google.vr.ndk.base.TraceCompat.beginSection(r4);	 Catch:{ all -> 0x01f8 }
            r3 = r3.mRenderer;	 Catch:{ all -> 0x01f8 }
            r3.onDrawFrame(r2);	 Catch:{ all -> 0x01f8 }
            com.google.vr.ndk.base.TraceCompat.endSection();	 Catch:{ all -> 0x024c }
            goto L_0x01fd;
        L_0x01f8:
            r0 = move-exception;
            com.google.vr.ndk.base.TraceCompat.endSection();	 Catch:{ all -> 0x024c }
            throw r0;	 Catch:{ all -> 0x024c }
        L_0x01fd:
            if (r11 == 0) goto L_0x0200;
        L_0x01ff:
            goto L_0x0204;
        L_0x0200:
            if (r12 == 0) goto L_0x0204;
        L_0x0202:
            r7 = 1;
            goto L_0x022d;
        L_0x0204:
            r3 = r1.mEglHelper;	 Catch:{ all -> 0x024c }
            r3 = r3.swap();	 Catch:{ all -> 0x024c }
            r4 = 12288; // 0x3000 float:1.7219E-41 double:6.071E-320;
            if (r3 == r4) goto L_0x0202;
        L_0x020e:
            r4 = 12302; // 0x300e float:1.7239E-41 double:6.078E-320;
            if (r3 == r4) goto L_0x022b;
        L_0x0212:
            r4 = "GLThread";
            r5 = "eglSwapBuffers";
            com.google.vr.ndk.base.GvrSurfaceView.EglHelper.logEglErrorAsWarning(r4, r5, r3);	 Catch:{ all -> 0x024c }
            if (r12 != 0) goto L_0x0202;
        L_0x021b:
            r3 = r1.mGLThreadManager;	 Catch:{ all -> 0x024c }
            monitor-enter(r3);	 Catch:{ all -> 0x024c }
            r7 = 1;
            r1.mSurfaceIsBad = r7;	 Catch:{ all -> 0x0228 }
            r4 = r1.mGLThreadManager;	 Catch:{ all -> 0x0228 }
            r4.notifyAll();	 Catch:{ all -> 0x0228 }
            monitor-exit(r3);	 Catch:{ all -> 0x0228 }
            goto L_0x022d;
        L_0x0228:
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0228 }
            throw r0;	 Catch:{ all -> 0x024c }
        L_0x022b:
            r7 = 1;
            r6 = 1;
        L_0x022d:
            if (r10 != 0) goto L_0x0236;
        L_0x022f:
            r16 = r2;
            r4 = 0;
            r5 = 0;
            r7 = 0;
            goto L_0x0020;
        L_0x0236:
            r16 = r2;
            r4 = 0;
            r5 = 0;
            r7 = 0;
            r8 = 1;
            r10 = 0;
            goto L_0x0020;
        L_0x023f:
            r6 = r1.mGLThreadManager;	 Catch:{ all -> 0x0249 }
            r6.wait();	 Catch:{ all -> 0x0249 }
            r7 = r3;
            r6 = 0;
            r8 = 0;
            goto L_0x0025;
        L_0x0249:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0249 }
            throw r0;	 Catch:{ all -> 0x024c }
        L_0x024c:
            r0 = move-exception;
            r2 = r1.mGLThreadManager;
            monitor-enter(r2);
            r18.stopEglSurfaceLocked();	 Catch:{ all -> 0x0258 }
            r18.stopEglContextLocked();	 Catch:{ all -> 0x0258 }
            monitor-exit(r2);	 Catch:{ all -> 0x0258 }
            throw r0;
        L_0x0258:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0258 }
            goto L_0x025c;
        L_0x025b:
            throw r0;
        L_0x025c:
            goto L_0x025b;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.GvrSurfaceView$GLThread.guardedRun():void");
        }

        public boolean ableToDraw() {
            return this.mHaveEglContext && this.mHaveEglSurface && readyToDraw();
        }

        private boolean readyToDraw() {
            GvrSurfaceView gvrSurfaceView = (GvrSurfaceView) this.mGvrSurfaceViewWeakRef.get();
            EglReadyListener access$300 = gvrSurfaceView != null ? gvrSurfaceView.mAppContextListener : null;
            boolean z = false;
            Object obj = (access$300 == null || access$300.a != null) ? 1 : null;
            if (!this.mPaused && obj != null && this.mHasSurface && !this.mSurfaceIsBad && this.mWidth > 0 && this.mHeight > 0) {
                if (this.mRequestRender) {
                    z = true;
                } else if (this.mRenderMode != 1) {
                    return z;
                } else {
                    return true;
                }
            }
            return z;
        }

        public void setRenderMode(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (this.mGLThreadManager) {
                this.mRenderMode = i;
                this.mGLThreadManager.notifyAll();
            }
        }

        public void setSwapMode(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("swapMode");
            }
            synchronized (this.mGLThreadManager) {
                this.mRequestedSwapMode = i;
                this.mGLThreadManager.notifyAll();
            }
        }

        public int getRenderMode() {
            int i;
            synchronized (this.mGLThreadManager) {
                i = this.mRenderMode;
            }
            return i;
        }

        public int getSwapMode() {
            int i;
            synchronized (this.mGLThreadManager) {
                i = this.mRequestedSwapMode;
            }
            return i;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0030 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|32) */
        /* JADX WARNING: Missing block: B:20:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        /* JADX WARNING: Missing block: B:22:0x0039, code skipped:
            return;
     */
        public void requestRenderAndWait() {
            /*
            r2 = this;
            r0 = r2.mGLThreadManager;
            monitor-enter(r0);
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x003a }
            if (r1 != r2) goto L_0x000b;
        L_0x0009:
            monitor-exit(r0);	 Catch:{ all -> 0x003a }
            return;
        L_0x000b:
            r1 = 1;
            r2.mWantRenderNotification = r1;	 Catch:{ all -> 0x003a }
            r2.mRequestRender = r1;	 Catch:{ all -> 0x003a }
            r1 = 0;
            r2.mRenderComplete = r1;	 Catch:{ all -> 0x003a }
            r1 = r2.mGLThreadManager;	 Catch:{ all -> 0x003a }
            r1.notifyAll();	 Catch:{ all -> 0x003a }
        L_0x0018:
            r1 = r2.mExited;	 Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0038;
        L_0x001c:
            r1 = r2.mPaused;	 Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0038;
        L_0x0020:
            r1 = r2.mRenderComplete;	 Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0038;
        L_0x0024:
            r1 = r2.ableToDraw();	 Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0038;
        L_0x002a:
            r1 = r2.mGLThreadManager;	 Catch:{ InterruptedException -> 0x0030 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0030 }
            goto L_0x0018;
        L_0x0030:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x003a }
            r1.interrupt();	 Catch:{ all -> 0x003a }
            goto L_0x0018;
        L_0x0038:
            monitor-exit(r0);	 Catch:{ all -> 0x003a }
            return;
        L_0x003a:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x003a }
            goto L_0x003e;
        L_0x003d:
            throw r1;
        L_0x003e:
            goto L_0x003d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.GvrSurfaceView$GLThread.requestRenderAndWait():void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0020 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|26) */
        /* JADX WARNING: Missing block: B:15:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void surfaceCreated() {
            /*
            r2 = this;
            r0 = r2.mGLThreadManager;
            monitor-enter(r0);
            r1 = 1;
            r2.mHasSurface = r1;	 Catch:{ all -> 0x002a }
            r1 = 0;
            r2.mFinishedCreatingEglSurface = r1;	 Catch:{ all -> 0x002a }
            r1 = r2.mGLThreadManager;	 Catch:{ all -> 0x002a }
            r1.notifyAll();	 Catch:{ all -> 0x002a }
        L_0x000e:
            r1 = r2.mWaitingForSurface;	 Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0028;
        L_0x0012:
            r1 = r2.mFinishedCreatingEglSurface;	 Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028;
        L_0x0016:
            r1 = r2.mExited;	 Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028;
        L_0x001a:
            r1 = r2.mGLThreadManager;	 Catch:{ InterruptedException -> 0x0020 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0020 }
            goto L_0x000e;
        L_0x0020:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x002a }
            r1.interrupt();	 Catch:{ all -> 0x002a }
            goto L_0x000e;
        L_0x0028:
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            return;
        L_0x002a:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            goto L_0x002e;
        L_0x002d:
            throw r1;
        L_0x002e:
            goto L_0x002d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.GvrSurfaceView$GLThread.surfaceCreated():void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0020 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|26) */
        /* JADX WARNING: Missing block: B:16:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void surfaceDestroyed(java.lang.Runnable r3) {
            /*
            r2 = this;
            r0 = r2.mGLThreadManager;
            monitor-enter(r0);
            r1 = 0;
            r2.mHasSurface = r1;	 Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x000d;
        L_0x0008:
            r1 = r2.mEventQueue;	 Catch:{ all -> 0x002a }
            r1.add(r3);	 Catch:{ all -> 0x002a }
        L_0x000d:
            r3 = r2.mGLThreadManager;	 Catch:{ all -> 0x002a }
            r3.notifyAll();	 Catch:{ all -> 0x002a }
        L_0x0012:
            r3 = r2.mWaitingForSurface;	 Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0028;
        L_0x0016:
            r3 = r2.mExited;	 Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0028;
        L_0x001a:
            r3 = r2.mGLThreadManager;	 Catch:{ InterruptedException -> 0x0020 }
            r3.wait();	 Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0012;
        L_0x0020:
            r3 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x002a }
            r3.interrupt();	 Catch:{ all -> 0x002a }
            goto L_0x0012;
        L_0x0028:
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            return;
        L_0x002a:
            r3 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            goto L_0x002e;
        L_0x002d:
            throw r3;
        L_0x002e:
            goto L_0x002d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.GvrSurfaceView$GLThread.surfaceDestroyed(java.lang.Runnable):void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0020 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|26) */
        /* JADX WARNING: Missing block: B:16:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void onPause(java.lang.Runnable r3) {
            /*
            r2 = this;
            r0 = r2.mGLThreadManager;
            monitor-enter(r0);
            r1 = 1;
            r2.mRequestPaused = r1;	 Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x000d;
        L_0x0008:
            r1 = r2.mEventQueue;	 Catch:{ all -> 0x002a }
            r1.add(r3);	 Catch:{ all -> 0x002a }
        L_0x000d:
            r3 = r2.mGLThreadManager;	 Catch:{ all -> 0x002a }
            r3.notifyAll();	 Catch:{ all -> 0x002a }
        L_0x0012:
            r3 = r2.mExited;	 Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0028;
        L_0x0016:
            r3 = r2.mPaused;	 Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0028;
        L_0x001a:
            r3 = r2.mGLThreadManager;	 Catch:{ InterruptedException -> 0x0020 }
            r3.wait();	 Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0012;
        L_0x0020:
            r3 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x002a }
            r3.interrupt();	 Catch:{ all -> 0x002a }
            goto L_0x0012;
        L_0x0028:
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            return;
        L_0x002a:
            r3 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            goto L_0x002e;
        L_0x002d:
            throw r3;
        L_0x002e:
            goto L_0x002d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.GvrSurfaceView$GLThread.onPause(java.lang.Runnable):void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0022 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|26) */
        /* JADX WARNING: Missing block: B:15:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void onResume() {
            /*
            r3 = this;
            r0 = r3.mGLThreadManager;
            monitor-enter(r0);
            r1 = 0;
            r3.mRequestPaused = r1;	 Catch:{ all -> 0x002c }
            r2 = 1;
            r3.mRequestRender = r2;	 Catch:{ all -> 0x002c }
            r3.mRenderComplete = r1;	 Catch:{ all -> 0x002c }
            r1 = r3.mGLThreadManager;	 Catch:{ all -> 0x002c }
            r1.notifyAll();	 Catch:{ all -> 0x002c }
        L_0x0010:
            r1 = r3.mExited;	 Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a;
        L_0x0014:
            r1 = r3.mPaused;	 Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a;
        L_0x0018:
            r1 = r3.mRenderComplete;	 Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a;
        L_0x001c:
            r1 = r3.mGLThreadManager;	 Catch:{ InterruptedException -> 0x0022 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0022 }
            goto L_0x0010;
        L_0x0022:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x002c }
            r1.interrupt();	 Catch:{ all -> 0x002c }
            goto L_0x0010;
        L_0x002a:
            monitor-exit(r0);	 Catch:{ all -> 0x002c }
            return;
        L_0x002c:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x002c }
            goto L_0x0030;
        L_0x002f:
            throw r1;
        L_0x0030:
            goto L_0x002f;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.GvrSurfaceView$GLThread.onResume():void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|32) */
        /* JADX WARNING: Missing block: B:20:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        /* JADX WARNING: Missing block: B:22:0x003d, code skipped:
            return;
     */
        public void onWindowResize(int r2, int r3) {
            /*
            r1 = this;
            r0 = r1.mGLThreadManager;
            monitor-enter(r0);
            r1.mWidth = r2;	 Catch:{ all -> 0x003e }
            r1.mHeight = r3;	 Catch:{ all -> 0x003e }
            r2 = 1;
            r1.mSizeChanged = r2;	 Catch:{ all -> 0x003e }
            r1.mRequestRender = r2;	 Catch:{ all -> 0x003e }
            r2 = 0;
            r1.mRenderComplete = r2;	 Catch:{ all -> 0x003e }
            r2 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x003e }
            if (r2 != r1) goto L_0x0017;
        L_0x0015:
            monitor-exit(r0);	 Catch:{ all -> 0x003e }
            return;
        L_0x0017:
            r2 = r1.mGLThreadManager;	 Catch:{ all -> 0x003e }
            r2.notifyAll();	 Catch:{ all -> 0x003e }
        L_0x001c:
            r2 = r1.mExited;	 Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x003c;
        L_0x0020:
            r2 = r1.mPaused;	 Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x003c;
        L_0x0024:
            r2 = r1.mRenderComplete;	 Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x003c;
        L_0x0028:
            r2 = r1.ableToDraw();	 Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x003c;
        L_0x002e:
            r2 = r1.mGLThreadManager;	 Catch:{ InterruptedException -> 0x0034 }
            r2.wait();	 Catch:{ InterruptedException -> 0x0034 }
            goto L_0x001c;
        L_0x0034:
            r2 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x003e }
            r2.interrupt();	 Catch:{ all -> 0x003e }
            goto L_0x001c;
        L_0x003c:
            monitor-exit(r0);	 Catch:{ all -> 0x003e }
            return;
        L_0x003e:
            r2 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x003e }
            goto L_0x0042;
        L_0x0041:
            throw r2;
        L_0x0042:
            goto L_0x0041;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.GvrSurfaceView$GLThread.onWindowResize(int, int):void");
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0015 */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|35) */
        /* JADX WARNING: Missing block: B:11:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
        public void requestExitAndWait() {
            /*
            r4 = this;
            r0 = r4.mGLThreadManager;
            monitor-enter(r0);
            r1 = 1;
            r4.mShouldExit = r1;	 Catch:{ all -> 0x003e }
            r1 = r4.mGLThreadManager;	 Catch:{ all -> 0x003e }
            r1.notifyAll();	 Catch:{ all -> 0x003e }
        L_0x000b:
            r1 = r4.mExited;	 Catch:{ all -> 0x003e }
            if (r1 != 0) goto L_0x001d;
        L_0x000f:
            r1 = r4.mGLThreadManager;	 Catch:{ InterruptedException -> 0x0015 }
            r1.wait();	 Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000b;
        L_0x0015:
            r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x003e }
            r1.interrupt();	 Catch:{ all -> 0x003e }
            goto L_0x000b;
        L_0x001d:
            r1 = r4.mGvrSurfaceViewWeakRef;	 Catch:{ all -> 0x003e }
            r1 = r1.get();	 Catch:{ all -> 0x003e }
            r1 = (com.google.vr.ndk.base.GvrSurfaceView) r1;	 Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x003c;
        L_0x0027:
            r2 = r1.mAppContextListener;	 Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x003c;
        L_0x002d:
            r1 = r1.mAppContextListener;	 Catch:{ all -> 0x003e }
            r2 = r1.f;	 Catch:{ all -> 0x003e }
            monitor-enter(r2);	 Catch:{ all -> 0x003e }
            r3 = 0;
            r1.e = r3;	 Catch:{ all -> 0x0039 }
            monitor-exit(r2);	 Catch:{ all -> 0x0039 }
            goto L_0x003c;
        L_0x0039:
            r1 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0039 }
            throw r1;	 Catch:{ all -> 0x003e }
        L_0x003c:
            monitor-exit(r0);	 Catch:{ all -> 0x003e }
            return;
        L_0x003e:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x003e }
            goto L_0x0042;
        L_0x0041:
            throw r1;
        L_0x0042:
            goto L_0x0041;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.GvrSurfaceView$GLThread.requestExitAndWait():void");
        }

        public void queueEvent(Runnable runnable) {
            if (runnable != null) {
                synchronized (this.mGLThreadManager) {
                    this.mEventQueue.add(runnable);
                    this.mGLThreadManager.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    class SimpleEGLConfigChooser extends ComponentSizeChooser {
        public SimpleEGLConfigChooser(GvrSurfaceView gvrSurfaceView, boolean z) {
            super(gvrSurfaceView, 8, 8, 8, 0, 16, 0);
        }
    }

    public GvrSurfaceView(Context context) {
        super(context);
        init();
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                gLThread.requestExitAndWait();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    private void init() {
        getHolder().addCallback(this);
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = true;
    }

    public void setRenderer(Renderer renderer) {
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new SimpleEGLConfigChooser(this, true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = new DefaultContextFactory();
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        this.mRenderer = renderer;
        this.mGLThread = new GLThread(this.mThisWeakRef);
        this.mGLThread.start();
    }

    public void setEglReadyListener(EglReadyListener eglReadyListener) {
        this.mAppContextListener = eglReadyListener;
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        checkRenderThreadState();
        this.mEGLContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.mEGLConfigChooser = eGLConfigChooser;
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new ComponentSizeChooser(this, i, i2, i3, i4, 16, 0));
    }

    public void setEGLContextClientVersion(int i) {
        checkRenderThreadState();
        this.mEGLContextClientVersion = 2;
    }

    public void setSwapMode(int i) {
        if (bafz.a()) {
            Log.e("GvrSurfaceView", "setSwapMode(SWAPMODE_SINGLE) requires Jellybean MR1 (EGL14 dependency) and is not supported on emulators.");
        } else {
            this.mGLThread.setSwapMode(1);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mGLThread.surfaceCreated();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        onSurfaceDestroyed(null);
    }

    public void onSurfaceDestroyed(Runnable runnable) {
        this.mGLThread.surfaceDestroyed(runnable);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.mGLThread.onWindowResize(i2, i3);
    }

    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        this.mGLThread.requestRenderAndWait();
    }

    public void onPause() {
        this.mGLThread.onPause(null);
    }

    public void onPause(Runnable runnable) {
        this.mGLThread.onPause(runnable);
    }

    public void onResume() {
        this.mGLThread.onResume();
    }

    public void queueEvent(Runnable runnable) {
        this.mGLThread.queueEvent(runnable);
    }

    public void requestExitAndWait() {
        this.mGLThread.requestExitAndWait();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(!this.mDetached || this.mRenderer == null || this.mPreserveGlThreadOnDetachedFromWindow)) {
            int renderMode;
            int swapMode;
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                renderMode = gLThread.getRenderMode();
                swapMode = this.mGLThread.getSwapMode();
            } else {
                renderMode = 1;
                swapMode = 0;
            }
            this.mGLThread = new GLThread(this.mThisWeakRef);
            if (renderMode != 1) {
                this.mGLThread.setRenderMode(renderMode);
            }
            if (swapMode != 0) {
                this.mGLThread.setSwapMode(swapMode);
            }
            this.mGLThread.start();
        }
        this.mDetached = false;
    }

    public void onDetachedFromWindow() {
        if (!(this.mGLThread == null || this.mPreserveGlThreadOnDetachedFromWindow)) {
            requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected */
    public boolean isDetachedFromWindow() {
        return this.mDetached;
    }

    private void checkRenderThreadState() {
        if (this.mGLThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }
}
