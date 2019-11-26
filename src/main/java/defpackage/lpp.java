package defpackage;

import android.graphics.Rect;

/* renamed from: lpp */
abstract class lpp extends lpn implements lkz, lla {
    public final lla a;
    public final lla b;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final Rect g = new Rect();

    public lpp(lla lla, lla lla2) {
        super(lla2);
        this.a = lla;
        this.b = lla2;
    }

    public abstract void a();

    public final Rect h() {
        return this.d;
    }

    public final Rect i() {
        return this.c;
    }

    public final Rect j() {
        return this.e;
    }

    public final Rect l() {
        return this.f;
    }

    public final Rect k() {
        return this.g;
    }

    public final void a(lla lla) {
        a();
    }
}
