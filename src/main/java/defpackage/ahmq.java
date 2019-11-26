package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahmq */
public abstract class ahmq extends ahqd implements ahnc, ahps, ahpy {
    public final ahpn a;
    public boolean b;
    public float c = 1.0f;
    public float d = 1.0f;
    public ahnf e;
    public final ahsm f;
    public ahou g;
    public boolean h;
    private final bcaa i;
    private final float[] j = new float[16];
    private final float[] k = new float[16];
    private final String m = getClass().getSimpleName();
    private final float n = 1.0f;
    private boolean o = true;
    private boolean p;
    private List q;
    private List r;

    public ahmq(ahsm ahsm, ahpn ahpn, bcaa bcaa) {
        this.f = (ahsm) amqw.a((Object) ahsm);
        this.a = (ahpn) amqw.a((Object) ahpn);
        this.i = (bcaa) amqw.a((Object) bcaa);
    }

    /* Access modifiers changed, original: protected */
    public boolean c() {
        throw null;
    }

    public abstract void d();

    public final void a(ahmr ahmr) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(ahmr);
    }

    public final void b(ahmr ahmr) {
        if (this.r == null) {
            this.r = new ArrayList();
        }
        this.r.add(ahmr);
    }

    public void bd_() {
        String valueOf = String.valueOf(this.m);
        String str = "Shutting down renderer on ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        ahsm ahsm = this.f;
        if (ahsm != null) {
            ahsm.a();
        }
    }

    public final void b(float f, float f2, float f3) {
        this.a.b(f, f2, f3);
    }

    public final void a(float f, float f2, float f3) {
        ahpn ahpn = this.a;
        Matrix.setIdentityM(ahpn.d, 0);
        Matrix.scaleM(ahpn.d, 0, f, f2, f3);
        ahpn.e();
    }

    public final void b() {
        this.p = true;
    }

    public void d(ahnj ahnj) {
        if (!f() && this.o) {
            List<ahmr> list = this.q;
            if (list != null) {
                for (ahmr ahmr : list) {
                    boolean z = true;
                    if (!(this.b || this.h)) {
                        z = false;
                    }
                    ahmr.a(z, ahnj.b);
                }
            }
            list = this.r;
            if (list != null) {
                for (ahmr ahmr2 : list) {
                    ahmr2.a(this.h, ahnj.b);
                }
            }
        }
    }

    public void a(ahse ahse) {
        if (this.p) {
            Matrix.setIdentityM(this.k, 0);
            ahse = new ahse(this.k, ahse.b, ahse.d, ahse.e, ahse.f);
        }
        ahwe ahwe = (ahwe) this.i.get();
        ahwe.c();
        ahwe.a();
        boolean c = c();
        if (c) {
            GLES20.glEnable(3042);
        }
        Matrix.multiplyMM(this.j, 0, ahse.c, 0, this.a.a, 0);
        ahwe.a(this.j);
        GLES20.glUniform1f(ahwe.a, this.c);
        d();
        ahwe.a(this.f);
        ahwe.b();
        if (c) {
            GLES20.glDisable(3042);
        }
        ahsl.b();
    }

    public void e(ahnj ahnj) {
        if (this.b) {
            ahnf ahnf = this.e;
            if (ahnf != null) {
                ahnf.a();
            }
        }
    }

    public boolean f(ahnj ahnj) {
        amqw.a((Object) ahnj);
        if (this.o && !f()) {
            ahou ahou = this.g;
            if (ahou != null && ahou.a(ahnj).a()) {
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z, ahnj ahnj) {
        this.b = z;
    }

    public final void a(float f) {
        this.c = f;
    }

    public final void a(boolean z) {
        this.o = z;
        if (z) {
            this.c = this.n;
        } else {
            this.c = this.d;
        }
    }
}
