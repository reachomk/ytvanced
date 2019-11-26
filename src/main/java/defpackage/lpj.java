package defpackage;

import android.graphics.Rect;

/* renamed from: lpj */
final class lpj extends lpp {
    private boolean h;
    private int i;

    public lpj(lla lla, lla lla2, int i, int i2) {
        super(lla, lla2);
        this.i = i2;
        this.h = i > i2;
        a();
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

    /* Access modifiers changed, original: final */
    public final void a() {
        this.c.set(this.b.i());
        this.d.set(this.b.h());
        this.c.offset(0, (int) (((float) this.i) * 0.2f));
        this.d.offset(0, (int) (((float) this.i) * 0.2f));
        this.f.set(this.b.l());
        this.e.set(this.b.j());
        this.g.set(this.b.k());
        if (this.h) {
            Rect rect = this.f;
            rect.offsetTo(rect.left, this.c.bottom);
            rect = this.e;
            rect.offsetTo(rect.left, this.c.top);
            return;
        }
        this.e.offsetTo(this.c.left, this.c.bottom);
    }

    public final void b_(int i, int i2) {
        this.i = i2;
        this.h = i > i2;
        a();
    }
}
