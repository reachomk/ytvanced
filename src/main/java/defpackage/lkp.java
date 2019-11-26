package defpackage;

import android.graphics.Rect;

/* renamed from: lkp */
public final class lkp extends lkn {
    private final lky a;
    private final lkx b = new lks(this);
    private final Rect c = new Rect();

    public lkp(lky lky) {
        this.a = lky;
    }

    public final float m() {
        return 1.0f;
    }

    public final float n() {
        return 0.0f;
    }

    public final float o() {
        return 0.0f;
    }

    public final float p() {
        return 0.0f;
    }

    public final float q() {
        return 0.0f;
    }

    public final float r() {
        return 1.0f;
    }

    public final void f() {
        this.a.a(this.b);
        t();
    }

    public final void g() {
        this.a.b(this.b);
    }

    public final Rect h() {
        return this.a.a(this.c);
    }

    public final Rect i() {
        return this.c;
    }

    public final Rect j() {
        return i;
    }

    public final Rect k() {
        return i;
    }

    public final Rect l() {
        return i;
    }

    public final void b_(int i, int i2) {
        this.c.set(0, 0, i, i2);
        t();
    }
}
