package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: abyq */
public final class abyq {
    public EGLDisplay a;
    public EGLContext b;
    public boolean c;
    private EGLConfig d;

    public abyq() {
        this(null, 0);
    }

    public abyq(EGLContext eGLContext, int i) {
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        EGLConfig eGLConfig = null;
        this.d = null;
        this.c = true;
        if (this.a == EGL14.EGL_NO_DISPLAY) {
            if (eGLContext == null) {
                eGLContext = EGL14.EGL_NO_CONTEXT;
            }
            this.a = EGL14.eglGetDisplay(0);
            if (this.a != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(this.a, iArr, 0, iArr, 1)) {
                    if (this.b == EGL14.EGL_NO_CONTEXT) {
                        int[] iArr2 = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
                        if (i != 0) {
                            iArr2[10] = 12610;
                            iArr2[11] = 1;
                        }
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (EGL14.eglChooseConfig(this.a, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            eGLConfig = eGLConfigArr[0];
                        } else {
                            xtl.d("unable to find RGB8888 / 2 EGLConfig");
                        }
                        if (eGLConfig != null) {
                            eGLContext = EGL14.eglCreateContext(this.a, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
                            abyx.b("eglCreateContext");
                            this.d = eGLConfig;
                            this.b = eGLContext;
                        } else {
                            throw new abyw("Unable to find a suitable EGLConfig");
                        }
                    }
                    EGL14.eglQueryContext(this.a, this.b, 12440, new int[1], 0);
                    this.c = true;
                    return;
                }
                this.a = null;
                throw new abyw("unable to initialize EGL14");
            }
            throw new abyw("unable to get EGL14 display");
        }
        throw new abyw("EGL already set up");
    }

    public final void a() {
        if (this.a != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglMakeCurrent(this.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.a, this.b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.a);
        }
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        this.d = null;
        this.c = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            if (this.a != EGL14.EGL_NO_DISPLAY) {
                xtl.d("WARNING: EglCore was not explicitly released -- state may be leaked");
                a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final void a(EGLSurface eGLSurface) {
        EGL14.eglDestroySurface(this.a, eGLSurface);
    }

    public final EGLSurface a(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.a, this.d, obj, new int[]{12344}, 0);
            abyx.b("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw new abyw("surface was null");
        }
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 17);
        stringBuilder.append("invalid surface: ");
        stringBuilder.append(valueOf);
        throw new abyw(stringBuilder.toString());
    }

    public final void b(EGLSurface eGLSurface) {
        if (!EGL14.eglMakeCurrent(this.a, eGLSurface, eGLSurface, this.b)) {
            throw new abyw("eglMakeCurrent failed");
        }
    }

    public final boolean c(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.a, eGLSurface);
    }

    public final int a(EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.a, eGLSurface, i, iArr, 0);
        return iArr[0];
    }
}
