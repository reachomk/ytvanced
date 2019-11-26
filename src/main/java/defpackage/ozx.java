package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: ozx */
final class ozx extends HandlerThread implements Callback {
    public oyi a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public ozy e;

    public ozx() {
        super("dummySurface");
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        EGLDisplay eglGetDisplay;
        EGLContext eglCreateContext;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                oxz.a(this.a);
                oyi oyi = this.a;
                eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != null) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        oyi.d = eglGetDisplay;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        iArr = new int[1];
                        if (EGL14.eglChooseConfig(oyi.d, oyi.a, 0, eGLConfigArr, 0, 1, iArr, 0) && iArr[0] > 0) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            if (eGLConfig != null) {
                                eglCreateContext = EGL14.eglCreateContext(oyi.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                                if (eglCreateContext != null) {
                                    EGLSurface eglCreatePbufferSurface;
                                    oyi.e = eglCreateContext;
                                    eglGetDisplay = oyi.d;
                                    EGLContext eGLContext = oyi.e;
                                    if (i2 != 1) {
                                        eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                                        if (eglCreatePbufferSurface == null) {
                                            throw new oyh("eglCreatePbufferSurface failed");
                                        }
                                    } else {
                                        eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                                    }
                                    if (EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
                                        oyi.f = eglCreatePbufferSurface;
                                        GLES20.glGenTextures(1, oyi.c, 0);
                                        i2 = 0;
                                        while (true) {
                                            int glGetError = GLES20.glGetError();
                                            if (glGetError == 0) {
                                                break;
                                            }
                                            String str = "GlUtil";
                                            String str2 = "glError ";
                                            String valueOf = String.valueOf(GLU.gluErrorString(i2));
                                            if (valueOf.length() == 0) {
                                                valueOf = new String(str2);
                                            } else {
                                                valueOf = str2.concat(valueOf);
                                            }
                                            oyp.b(str, valueOf);
                                            i2 = glGetError;
                                        }
                                        oyi.g = new SurfaceTexture(oyi.c[0]);
                                        oyi.g.setOnFrameAvailableListener(oyi);
                                        this.e = new ozy(this, (SurfaceTexture) oxz.a(this.a.g));
                                        synchronized (this) {
                                            notify();
                                        }
                                        return true;
                                    }
                                    throw new oyh("eglMakeCurrent failed");
                                }
                                throw new oyh("eglCreateContext failed");
                            }
                        }
                        throw new oyh(ozp.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(r6), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
                    }
                    throw new oyh("eglInitialize failed");
                }
                throw new oyh("eglGetDisplay failed");
            } catch (RuntimeException e) {
                oyp.b("DummySurface", "Failed to initialize dummy surface", e);
                this.d = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    oyp.b("DummySurface", "Failed to initialize dummy surface", e2);
                    this.c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                    }
                }
            }
        } else if (i != 2) {
            return true;
        } else {
            oyi oyi2;
            EGLDisplay eGLDisplay;
            try {
                oxz.a(this.a);
                oyi2 = this.a;
                oyi2.b.removeCallbacks(oyi2);
                SurfaceTexture surfaceTexture = oyi2.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, oyi2.c, 0);
                }
                EGLDisplay eGLDisplay2 = oyi2.d;
                if (!(eGLDisplay2 == null || eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY))) {
                    EGL14.eglMakeCurrent(oyi2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface = oyi2.f;
                if (!(eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE))) {
                    EGL14.eglDestroySurface(oyi2.d, oyi2.f);
                }
                EGLContext eGLContext2 = oyi2.e;
                if (eGLContext2 != null) {
                    EGL14.eglDestroyContext(oyi2.d, eGLContext2);
                }
                if (ozp.a >= 19) {
                    EGL14.eglReleaseThread();
                }
                eGLDisplay = oyi2.d;
                if (!(eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY))) {
                    EGL14.eglTerminate(oyi2.d);
                }
                oyi2.d = null;
                oyi2.e = null;
                oyi2.f = null;
                oyi2.g = null;
                quit();
            } catch (Throwable th2) {
                try {
                    oyp.b("DummySurface", "Failed to release dummy surface", th2);
                } finally {
                    quit();
                }
            }
            return true;
        }
    }
}
