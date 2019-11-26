package defpackage;

import android.graphics.Rect;

/* renamed from: lkv */
public final class lkv extends lkn implements lkz {
    private final lla a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private boolean g;
    private int h;
    private int j;

    public lkv(lla lla) {
        this.a = (lla) amqw.a((Object) lla);
        this.a.a(this);
        a();
    }

    public final void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            a();
        }
    }

    public final Rect h() {
        return this.b;
    }

    public final Rect i() {
        return this.c;
    }

    public final Rect j() {
        return this.d;
    }

    public final Rect k() {
        return this.e;
    }

    public final Rect l() {
        return this.f;
    }

    public final float m() {
        return this.a.m();
    }

    public final float n() {
        return this.a.n();
    }

    public final float o() {
        return this.a.o();
    }

    public final float p() {
        return this.a.p();
    }

    public final float q() {
        return this.a.q();
    }

    public final float r() {
        return this.a.r();
    }

    public final void f() {
        this.a.f();
    }

    public final void g() {
        this.a.g();
    }

    public final void b_(int i, int i2) {
        if (this.h != i || this.j != i2) {
            this.h = i;
            this.j = i2;
            this.a.b(this);
            this.a.b_(i, i2);
            this.a.a(this);
            a();
        }
    }

    public final void a(lla lla) {
        if (this.a == lla) {
            a();
        }
    }

    private final void a() {
        a(this.a.h(), this.b);
        a(this.a.i(), this.c);
        a(this.a.j(), this.d);
        a(this.a.k(), this.e);
        a(this.a.l(), this.f);
        t();
    }

    private final void a(Rect rect, Rect rect2) {
        int i;
        int i2;
        if (this.g) {
            i = this.h - rect.right;
        } else {
            i = rect.left;
        }
        int i3 = rect.top;
        if (this.g) {
            i2 = this.h - rect.left;
        } else {
            i2 = rect.right;
        }
        rect2.set(i, i3, i2, rect.bottom);
        rect2.set(rect2);
        if (rect2.width() < 0) {
            rect2.right = rect2.left;
        }
        if (rect2.height() < 0) {
            rect2.bottom = rect2.top;
        }
    }

    public static lla b(lla lla) {
        return lla instanceof lkv ? lkv.b(((lkv) lla).a) : lla;
    }
}
