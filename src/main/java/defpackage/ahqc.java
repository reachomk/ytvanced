package defpackage;

import android.opengl.Matrix;
import java.util.Arrays;

/* renamed from: ahqc */
public final class ahqc extends ahor {
    public static final float a = ahsl.a(25.0f);
    public static final float b = ahsl.a(3.0f);
    private static final float h = ahsl.a(9.0f);
    public final ahne[] c;
    public final ahnd e;
    public float f;
    public float g;
    private final ahne i;
    private final ahmo j = new ahmo();
    private final ahou k;
    private final float[] m;
    private final ahqf n;
    private final ahpt o;
    private float p;
    private float[] q;
    private boolean r;

    public ahqc(bcaa bcaa, int[] iArr, float f, ahpn ahpn, ahqf ahqf) {
        amqw.a(true);
        this.g = f;
        this.n = ahqf;
        ahpn ahpn2 = (ahpn) ahpn.clone();
        this.k = new ahou(ahpn2, this.g, 1.0f);
        this.e = new ahnd(new ahou(ahpn2, this.g, a));
        ahsm a = ahsm.a(1.0f, 1.0f, ahsm.c);
        int length = iArr.length;
        this.c = new ahne[length];
        this.q = new float[length];
        this.m = new float[length];
        int i = 0;
        this.q[0] = 1.0f;
        for (length = 0; length < iArr.length; length++) {
            this.c[length] = new ahne(a, (ahpn) ahpn.clone(), ahne.a(ahne.b(iArr[length]), a.f), bcaa);
        }
        a(this.q);
        ahsm a2 = ahsm.a(ahsl.a(1.0f), h, ahsm.c);
        this.i = new ahne(a2, (ahpn) ahpn.clone(), ahne.a(new float[]{1.0f, 1.0f, 1.0f, 1.0f}, a2.f), bcaa);
        this.i.b((-this.g) / 2.0f, 0.0f, 0.0f);
        this.o = new ahpt(this.i, 1.0f, 0.0f);
        ahne[] ahneArr = this.c;
        int length2 = ahneArr.length;
        while (i < length2) {
            this.e.a(ahneArr[i]);
            i++;
        }
        a(this.e);
        a(this.i);
    }

    public final void a(boolean z) {
        this.e.a(z);
    }

    public final boolean c() {
        return !f() && this.e.b;
    }

    public final void a(float[] fArr) {
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2;
        }
        double d = (double) f;
        if (d < 1.01d && d > 0.99d) {
            d();
            this.q = fArr;
            e();
            return;
        }
        String valueOf = String.valueOf(Arrays.toString(fArr));
        String str = "Invalid sized widths!";
        xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }

    public final void d(ahnj ahnj) {
        if (!f()) {
            boolean c = c();
            if (this.r && !c) {
                this.n.a();
            }
            this.r = c;
            this.j.a(c, ahnj.b);
            this.p = ((h - b) * this.j.a()) + b;
            this.o.a(c ^ 1, ahnj.b);
            int i = 0;
            if (c) {
                float b = this.k.a(ahnj).b();
                this.f = b;
                a(b);
                this.n.b(this.f);
            }
            while (true) {
                ahne[] ahneArr = this.c;
                if (i >= ahneArr.length) {
                    break;
                }
                ahneArr[i].a(this.q[i] * this.g, this.p, 1.0f);
                i++;
            }
        }
        super.d(ahnj);
    }

    public final void e(ahnj ahnj) {
        if (this.e.b) {
            this.n.a(this.k.a(ahnj).b());
        }
    }

    public final void a(float f) {
        ahne ahne = this.i;
        float f2 = this.g;
        ahpn ahpn = ahne.a;
        Matrix.setIdentityM(ahpn.c, 0);
        Matrix.translateM(ahpn.c, 0, f2 * f, 0.0f, 0.0f);
        ahpn.d();
    }

    public final void d() {
        int i = 0;
        while (true) {
            ahne[] ahneArr = this.c;
            if (i < ahneArr.length) {
                ahneArr[i].b(-this.m[i], 0.0f, 0.0f);
                i++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        int i = 0;
        float f = 0.0f;
        while (true) {
            ahne[] ahneArr = this.c;
            if (i < ahneArr.length) {
                float f2 = (((this.q[i] / 2.0f) + f) - 8.0f) * this.g;
                this.m[i] = f2;
                ahneArr[i].b(f2, 0.0f, 0.0f);
                f += this.q[i];
                i++;
            } else {
                return;
            }
        }
    }
}
