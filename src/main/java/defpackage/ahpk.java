package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* renamed from: ahpk */
public final class ahpk extends ahrn {
    private final ahsr a;
    private final ahsm b;
    private final ahsm c;
    private final bcaa d;
    private final ahpn e;
    private final float[] f;
    private final int g;
    private float h;
    private ahsq i;
    private float j;

    ahpk(ahsm ahsm, ahsm ahsm2, ahsr ahsr, int i, ahpn ahpn, bcaa bcaa, ahsq ahsq) {
        this.b = (ahsm) amqw.a((Object) ahsm);
        this.c = (ahsm) amqw.a((Object) ahsm2);
        this.a = (ahsr) amqw.a((Object) ahsr);
        this.d = bcaa;
        this.g = i;
        this.e = ahpn;
        this.f = new float[16];
        this.h = 1.0f;
        this.i = ahsq;
    }

    public final void a(boolean z, ahnj ahnj) {
    }

    public final void b() {
    }

    public final boolean f(ahnj ahnj) {
        return false;
    }

    ahpk(ahsm ahsm, ahsr ahsr, int i, ahpn ahpn, bcaa bcaa, ahsq ahsq) {
        this(ahsm, ahsm, ahsr, i, ahpn, bcaa, ahsq);
    }

    public final void a(ahsq ahsq) {
        this.i = ahsq;
    }

    public final void d(ahnj ahnj) {
        if (this.i.a() && !this.i.b()) {
            this.j = (float) Math.random();
        }
        this.a.a();
    }

    public final void a(ahse ahse) {
        ahww ahww = (ahww) this.d.get();
        ahww.c();
        int i = this.g;
        if (i != 1) {
            if (i != 2) {
                GLES20.glUniform2f(ahww.e, 1.0f, 1.0f);
                GLES20.glUniform2f(ahww.f, 0.0f, 0.0f);
            } else if (ahse.a() == 0 || ahse.a() == 1) {
                GLES20.glUniform2f(ahww.e, 0.5f, 1.0f);
                GLES20.glUniform2f(ahww.f, 0.0f, 0.0f);
            } else {
                GLES20.glUniform2f(ahww.e, 0.5f, 1.0f);
                GLES20.glUniform2f(ahww.f, 0.5f, 0.0f);
            }
        } else if (ahse.a() == 0 || ahse.a() == 1) {
            GLES20.glUniform2f(ahww.e, 1.0f, 0.5f);
            GLES20.glUniform2f(ahww.f, 0.0f, 0.5f);
        } else {
            GLES20.glUniform2f(ahww.e, 1.0f, 0.5f);
            GLES20.glUniform2f(ahww.f, 0.0f, 0.0f);
        }
        ahww.a();
        GLES20.glUniformMatrix4fv(ahww.g, 1, false, this.a.g(), 0);
        this.a.c();
        ahww.b.a(this.a);
        float f = this.j;
        ahsq ahsq = this.i;
        ahww.d.a(f, ahsq.a, ahsq.b);
        Matrix.multiplyMM(this.f, 0, ahse.c, 0, this.e.a, 0);
        GLES20.glUniform1f(ahww.i, this.h);
        GLES20.glUniform1f(ahww.a, 1.0f);
        ahww.a(this.f);
        ahww.d();
        if (ahse.a() == 2) {
            ahww.a(this.c);
        } else {
            ahww.a(this.b);
        }
        ahww.b();
        ahsl.b();
    }

    public final void a(float f) {
        this.h = 1.0f - f;
    }

    public final void b(float f, float f2, float f3) {
        this.e.b(f, f2, f3);
    }

    public final void bd_() {
        ahsm ahsm = this.b;
        if (ahsm != null) {
            ahsm.a();
        }
        ahsm = this.c;
        if (ahsm != null && ahsm != this.b) {
            ahsm.a();
        }
    }
}
