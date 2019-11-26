package defpackage;

import android.graphics.Rect;

/* renamed from: lph */
final class lph extends lpp {
    public lph(lpi lpi, lla lla) {
        super(lpi, lla);
        a();
    }

    public final float m() {
        return 1.0f;
    }

    public final float n() {
        return 0.0f;
    }

    public final float o() {
        return 1.0f;
    }

    public final float p() {
        return 0.0f;
    }

    public final float r() {
        return 1.0f;
    }

    public final void a() {
        Rect h = this.b.h();
        Rect i = this.a.i();
        Rect i2 = this.b.i();
        Rect k = this.a.k();
        Rect j = this.b.j();
        fpl.a(this.c, i, i2, 0.2352941f);
        fpl.a(this.g, k, j, 0.2352941f);
        this.g.top = this.c.bottom;
        this.e.set(this.g);
        fpe.a(((float) h.width()) / ((float) h.height()), this.c, this.d);
    }
}
