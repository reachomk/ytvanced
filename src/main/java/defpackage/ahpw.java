package defpackage;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: ahpw */
public final class ahpw implements Runnable {
    private final /* synthetic */ ahpx a;

    public ahpw(ahpx ahpx) {
        this.a = ahpx;
    }

    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (this.a.c == null || egl10.eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
            this.a.d = true;
            return;
        }
        try {
            this.a.c.updateTexImage();
            ahpx ahpx = this.a;
            ahpx.c.getTransformMatrix(ahpx.b);
            ahpx = this.a;
            ahpx.e = ahpx.c.getTimestamp() / 1000;
        } catch (RuntimeException e) {
            xtl.c(e.getMessage());
        }
    }
}
