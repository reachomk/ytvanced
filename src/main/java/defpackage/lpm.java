package defpackage;

import android.view.View;

/* renamed from: lpm */
final class lpm extends lpp {
    private final int h;

    public lpm(View view, lla lla, lla lla2) {
        super(lla, lla2);
        this.h = fpf.a(view.getContext());
        a();
    }

    public final int s() {
        return this.h;
    }

    public final float n() {
        return this.a.n();
    }

    public final float q() {
        return this.a.q();
    }

    public final void a() {
        this.d.set(this.b.h());
        this.c.set(this.b.i());
        this.e.set(this.a.j());
        this.f.set(this.a.l());
        this.g.set(this.a.k());
        this.e.offset(0, this.c.bottom - this.e.top);
        this.g.offset(0, this.c.bottom - this.g.top);
        this.f.offset(0, this.c.bottom - this.f.top);
        if (this.a.q() > 0.0f) {
            this.e.set(this.a.j());
            this.e.offset(this.a.l().width(), 0);
        }
    }
}
