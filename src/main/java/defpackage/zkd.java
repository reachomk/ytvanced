package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.HashMap;

/* renamed from: zkd */
public final class zkd {
    private static final HashMap a = new HashMap();
    private static final HashMap b = new HashMap();
    private static final ThreadLocal c = new ThreadLocal();
    private static final ThreadLocal d = new ThreadLocal();
    private Object e = null;
    private final EGLConfig f;
    private final EGLDisplay g;
    private EGLContext h;
    private EGLSurface i;
    private final int j;
    private final boolean k;
    private final boolean l;

    public static zkd a(int i, int i2) {
        return zkd.a(i, i2, null);
    }

    public static zkd a(int i, int i2, EGLContext eGLContext) {
        if (eGLContext != null) {
            String.valueOf(eGLContext).length();
        } else {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        String valueOf;
        String str;
        if (amqq.a(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            valueOf = String.valueOf(zkd.f());
            str = "EGL Error: Bad display: ";
            throw new RuntimeException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            EGLConfig eGLConfig;
            EGLConfig a = zkd.a(eglGetDisplay, 2);
            if (a != null) {
                try {
                    eGLContext2 = zkd.a(eglGetDisplay, a, 2, eGLContext);
                } catch (RuntimeException unused) {
                    eGLContext2 = EGL14.EGL_NO_CONTEXT;
                }
            }
            if (amqq.a(eGLContext2, EGL14.EGL_NO_CONTEXT)) {
                EGLConfig a2 = zkd.a(eglGetDisplay, 1);
                if (a2 != null) {
                    eGLContext = zkd.a(eglGetDisplay, a2, 1, eGLContext);
                    eGLConfig = a2;
                } else {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
            }
            eGLContext = eGLContext2;
            eGLConfig = a;
            Object eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
            zkd zkd = new zkd(eglGetDisplay, eGLConfig, eGLContext, eglCreatePbufferSurface, 0, true, true);
            zkd.a(eglCreatePbufferSurface);
            zkd.b();
            int[] iArr2 = new int[1];
            EGL14.eglQueryContext(eglGetDisplay, eGLContext, 12440, iArr2, 0);
            int i3 = iArr2[0];
            int i4 = -1;
            if (VERSION.SDK_INT >= 18 && i3 >= 3) {
                GLES20.glGetIntegerv(33307, iArr2, 0);
                i3 = iArr2[0];
                GLES20.glGetIntegerv(33308, iArr2, 0);
                i4 = iArr2[0];
            }
            StringBuilder stringBuilder = new StringBuilder(30);
            stringBuilder.append("GL context version ");
            stringBuilder.append(i3);
            String stringBuilder2 = stringBuilder.toString();
            if (i4 >= 0) {
                String.valueOf(stringBuilder2).length();
            }
            EGL14.eglQueryString(eglGetDisplay, 12372);
            return zkd;
        }
        valueOf = String.valueOf(zkd.f());
        str = "EGL Error: eglInitialize failed ";
        throw new RuntimeException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }

    public static zkd a() {
        return (zkd) c.get();
    }

    public static void a(zkd zkd) {
        d.set(zkd);
    }

    public static zkd a(ayx ayx) {
        zkd zkd = (zkd) d.get();
        if (zkd != null) {
            zkd.b();
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            ayv.a("glGenFramebuffers");
            int i = iArr[0];
            GLES20.glBindFramebuffer(36160, i);
            ayv.a("glBindFramebuffer");
            GLES20.glFramebufferTexture2D(36160, 36064, ayx.b, ayx.a, 0);
            ayv.a("glFramebufferTexture2D");
            return new zkd(zkd.g, zkd.f, zkd.h, zkd.i, i, false, false);
        }
        throw new RuntimeException("Can't call forTexture() without main target set.");
    }

    public final zkd a(SurfaceTexture surfaceTexture) {
        Object obj;
        synchronized (a) {
            EGLSurface eGLSurface = (EGLSurface) a.get(surfaceTexture);
            if (eGLSurface == null) {
                eGLSurface = EGL14.eglCreateWindowSurface(this.g, this.f, surfaceTexture, new int[]{12344}, 0);
                a.put(surfaceTexture, eGLSurface);
            }
            obj = eGLSurface;
        }
        zkd.a("eglCreateWindowSurface");
        if (amqq.a(obj, EGL14.EGL_NO_SURFACE)) {
            String valueOf = String.valueOf(zkd.f());
            String str = "EGL Error: Bad surface: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new RuntimeException(valueOf);
        }
        zkd zkd = new zkd(this.g, this.f, this.h, obj, 0, false, true);
        zkd.e = surfaceTexture;
        zkd.a(obj);
        return zkd;
    }

    public final void b() {
        if (((zkd) c.get()) != this) {
            EGLDisplay eGLDisplay = this.g;
            EGLSurface eGLSurface = this.i;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.h);
            c.set(this);
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        int i = iArr[0];
        int i2 = this.j;
        if (i != i2) {
            GLES20.glBindFramebuffer(36160, i2);
            ayv.a("glBindFramebuffer");
        }
    }

    public static void c() {
        EGL14.eglMakeCurrent(EGL14.eglGetCurrentDisplay(), EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        c.set(null);
        zkd.a("eglMakeCurrent");
    }

    public final void d() {
        if (this.j == 0 && !EGL14.eglSwapBuffers(this.g, this.i)) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError != 12288) {
                String valueOf = String.valueOf(Integer.toHexString(eglGetError));
                String str = "Error executing eglSwapBuffers! EGL error = 0x";
                throw new RuntimeException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
    }

    public final void e() {
        if (this.k) {
            EGL14.eglDestroyContext(this.g, this.h);
            this.h = EGL14.EGL_NO_CONTEXT;
            EGL14.eglTerminate(this.g);
        }
        if (this.l) {
            synchronized (a) {
                EGLSurface eGLSurface = this.i;
                Integer num = (Integer) b.get(eGLSurface);
                if (num == null || num.intValue() <= 0) {
                    String valueOf = String.valueOf(eGLSurface);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 41);
                    stringBuilder.append("Removing reference of already released: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append("!");
                    Log.e("RenderTarget", stringBuilder.toString());
                } else {
                    num = Integer.valueOf(num.intValue() - 1);
                    b.put(eGLSurface, num);
                    if (num.intValue() == 0) {
                        EGL14.eglDestroySurface(this.g, this.i);
                        this.i = EGL14.EGL_NO_SURFACE;
                        a.remove(this.e);
                    }
                }
            }
        }
        if (this.j != 0) {
            int[] iArr = new int[]{this.j};
            ayv.b("glDeleteFramebuffers");
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            ayv.a("glDeleteFramebuffers");
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(this.h);
        String valueOf3 = String.valueOf(this.i);
        int i = this.j;
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 31) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("RenderTarget(");
        stringBuilder.append(valueOf);
        valueOf = ", ";
        stringBuilder.append(valueOf);
        stringBuilder.append(valueOf2);
        stringBuilder.append(valueOf);
        stringBuilder.append(valueOf3);
        stringBuilder.append(valueOf);
        stringBuilder.append(i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private static void a(Object obj) {
        Integer num = (Integer) b.get(obj);
        if (num != null) {
            b.put(obj, Integer.valueOf(num.intValue() + 1));
        } else {
            b.put(obj, Integer.valueOf(1));
        }
    }

    private static EGLConfig a(EGLDisplay eGLDisplay, int i) {
        i = i != 1 ? 64 : 0;
        int[] iArr = new int[]{12352, i | 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] <= 0) {
            return null;
        }
        return eGLConfigArr[0];
    }

    private zkd(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, EGLSurface eGLSurface, int i, boolean z, boolean z2) {
        this.g = eGLDisplay;
        this.f = eGLConfig;
        this.h = eGLContext;
        this.i = eGLSurface;
        this.j = i;
        this.k = z;
        this.l = z2;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) {
        i = i != 1 ? 3 : 2;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, i, 12344}, 0);
        zkd.a("eglCreateContext");
        if (!amqq.a(eglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            return eglCreateContext;
        }
        String valueOf = String.valueOf(zkd.f());
        String str = "EGL Error: Bad context: ";
        throw new RuntimeException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }

    private static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            String toHexString = Integer.toHexString(eglGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(toHexString).length());
            stringBuilder.append("Error executing ");
            stringBuilder.append(str);
            stringBuilder.append("! EGL error = 0x");
            stringBuilder.append(toHexString);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static String f() {
        return GLUtils.getEGLErrorString(EGL14.eglGetError());
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap = new HashMap();
    }
}
