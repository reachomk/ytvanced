package defpackage;

import android.graphics.Rect;
import java.util.List;

/* renamed from: lok */
public final class lok extends lkn {
    public final List a;
    public final loj b;
    public float c;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect j = new Rect();
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;

    public lok(List list, loj loj) {
        this.a = list;
        this.b = loj;
        this.c = Float.NaN;
    }

    public final lok a() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                int i2 = (size - i) - 1;
                lom lom = (lom) this.a.remove(i);
                this.a.add(i, (lom) this.a.remove(i2));
                this.a.add(i2, lom);
            }
            ((lom) this.a.get(i)).b = 1.0f - ((lom) this.a.get(i)).b;
        }
        float f = this.c;
        if (f != Float.NaN) {
            this.c = 1.0f - f;
        }
        return this;
    }

    public final void a(float f) {
        if (this.c != f) {
            this.c = f;
            b();
        }
    }

    public final void f() {
        for (lom lom : this.a) {
            lom.a.f();
        }
    }

    public final void g() {
        for (lom lom : this.a) {
            lom.a.g();
        }
    }

    public final Rect h() {
        return this.d;
    }

    public final Rect i() {
        return this.e;
    }

    public final Rect j() {
        return this.f;
    }

    public final Rect k() {
        return this.g;
    }

    public final Rect l() {
        return this.j;
    }

    public final float m() {
        return this.k;
    }

    public final float n() {
        return this.l;
    }

    public final float o() {
        return this.m;
    }

    public final float p() {
        return this.n;
    }

    public final float q() {
        return this.p;
    }

    public final float r() {
        return this.o;
    }

    public final void b_(int i, int i2) {
        for (lom lom : this.a) {
            lom.a.b_(i, i2);
        }
        b();
    }

    private static void a(Rect rect, Rect rect2, int i) {
        rect2.set(rect);
        if (i != 0) {
            rect2.offset(0, i);
        }
    }

    private final void b() {
        int i;
        float f = this.c;
        for (i = 1; i < this.a.size(); i++) {
            if (f <= ((lom) this.a.get(i)).b) {
                i--;
                break;
            }
        }
        i = 0;
        lom lom = (lom) this.a.get(i);
        lom lom2 = (lom) this.a.get(i + 1);
        lla lla = lom.a;
        lla lla2 = lom2.a;
        float f2 = this.c;
        f = lom.b;
        f2 = (f2 - f) / (lom2.b - f);
        int s = lla2.s();
        lok.a(lla.h(), this.h, s);
        fpl.a(this.d, this.h, lla2.h(), f2);
        lok.a(lla.i(), this.h, s);
        fpl.a(this.e, this.h, lla2.i(), f2);
        lok.a(lla.j(), this.h, s);
        fpl.a(this.f, this.h, lla2.j(), f2);
        fpl.a(this.g, lla.k(), lla2.k(), f2);
        fpl.a(this.j, lla.l(), lla2.l(), f2);
        f = lla.m();
        this.k = f + ((lla2.m() - f) * f2);
        f = lla.n();
        this.l = f + ((lla2.n() - f) * f2);
        f = lla.o();
        this.m = f + ((lla2.o() - f) * f2);
        f = lla.p();
        this.n = f + ((lla2.p() - f) * f2);
        f = lla.q();
        this.p = f + ((lla2.q() - f) * f2);
        f = lla.r();
        this.o = f + ((lla2.r() - f) * f2);
        t();
    }
}
