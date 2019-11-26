package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: ujl */
public final class ujl {
    public Surface a;
    public EGLDisplay b;
    public EGLContext c;
    public EGLSurface d;

    public ujl(EGLContext eGLContext, Surface surface) {
        this.a = surface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.b = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                iArr = new int[1];
                if (EGL14.eglChooseConfig(this.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0)) {
                    ujl.a("Failed to choose config.");
                    if (iArr[0] > 0) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        eGLContext = EGL14.eglCreateContext(this.b, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
                        ujl.a("Failed to create context.");
                        this.c = eGLContext;
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.b, eGLConfig, surface, new int[]{12344}, 0);
                        ujl.a("Failed to create window surface.");
                        this.d = eglCreateWindowSurface;
                        return;
                    }
                    throw new RuntimeException("No configs found.");
                }
                throw new RuntimeException("Choose config failed.");
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    public final void a() {
        EGLDisplay eGLDisplay = this.b;
        EGLSurface eGLSurface = this.d;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.c);
    }

    private static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            String toHexString = Integer.toHexString(eglGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 15) + String.valueOf(toHexString).length());
            stringBuilder.append(str);
            stringBuilder.append(": EGL error: 0x");
            stringBuilder.append(toHexString);
            throw new RuntimeException(stringBuilder.toString());
        }
    }
}
