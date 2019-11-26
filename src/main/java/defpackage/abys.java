package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: abys */
public final class abys {
    public EGLSurface a;
    public abyq b;
    public Surface c;
    private EGLContext d;

    public abys(Surface surface) {
        this.c = surface;
    }

    public final void a() {
        abyq abyq = this.b;
        if (abyq != null) {
            abyq.a(this.a);
            this.b.a();
            this.b = null;
        }
        this.a = null;
        this.c = null;
    }

    public final void a(EGLContext eGLContext) {
        boolean z = this.b == null || this.d.equals(eGLContext);
        amqw.a(z);
        try {
            if (this.b == null) {
                this.d = eGLContext;
                this.b = new abyq(eGLContext, 1);
                this.a = this.b.a(this.c);
            }
            this.b.b(this.a);
        } catch (abyw e) {
            xtl.c("EncoderInputSurface: makeCurrent failed: releasing EGLContext");
            a();
            throw e;
        }
    }
}
