package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: bcgu */
final class bcgu {
    public EGLDisplay a = EGL14.EGL_NO_DISPLAY;
    public EGLContext b = EGL14.EGL_NO_CONTEXT;
    public EGLSurface c = EGL14.EGL_NO_SURFACE;
    public Surface d;

    public bcgu(Surface surface) {
        this.d = (Surface) amqw.a((Object) surface);
        this.a = EGL14.eglGetDisplay(0);
        amrw.a(this.a.equals(EGL14.EGL_NO_DISPLAY) ^ 1, "Unable to get EGL14 display", new Object[0]);
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(this.a, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            String str = "unable to find RGB888+recordable ES2 EGL config";
            amrw.a(EGL14.eglChooseConfig(this.a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0), str, new Object[0]);
            this.b = EGL14.eglCreateContext(this.a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            bcgr.a("eglCreateContext");
            amrw.a(this.b);
            this.c = EGL14.eglCreateWindowSurface(this.a, eGLConfigArr[0], this.d, new int[]{12344}, 0);
            bcgr.a("eglCreateWindowSurface");
            amrw.a(this.c);
            return;
        }
        this.a = null;
        throw new RuntimeException("unable to initialize EGL14");
    }
}
