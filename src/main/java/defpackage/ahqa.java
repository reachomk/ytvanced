package defpackage;

import android.opengl.GLES20;

/* renamed from: ahqa */
public abstract class ahqa extends ahrn {
    private static final float[] a = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    private final ahso b = new ahso(a, 3);
    private final ahsr c;
    private ahsq d;
    private float e;

    public ahqa(ahsr ahsr, ahsq ahsq) {
        this.c = (ahsr) amqw.a((Object) ahsr);
        this.d = ahsq;
    }

    public final void b() {
    }

    public abstract ahwv c();

    public final void a(ahsq ahsq) {
        this.d = ahsq;
    }

    public final void d(ahnj ahnj) {
        if (this.d.a() && !this.d.b()) {
            this.e = (float) Math.random();
        }
        this.c.a();
    }

    public final void a(ahse ahse) {
        ahwv c = c();
        if (c.c != 0) {
            this.c.c();
            c.c();
            ahse.a();
            c.a(this.c);
            float f = this.e;
            ahsq ahsq = this.d;
            c.b.a(f, ahsq.a, ahsq.b);
            c.a();
            this.b.a(c.a);
            c.d();
            GLES20.glDrawArrays(5, 0, 4);
            ahsl.b();
            GLES20.glDisableVertexAttribArray(c.a);
            ahsl.b();
            return;
        }
        xtl.c("Error drawing! Program not created.");
    }

    public final void bd_() {
        this.b.a();
    }
}
