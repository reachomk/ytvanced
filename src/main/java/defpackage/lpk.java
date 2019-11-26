package defpackage;

import android.graphics.Rect;

/* renamed from: lpk */
final class lpk extends lpp {
    private int h;

    lpk(lla lla, lla lla2, int i) {
        super(lla, lla2);
        this.h = i;
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
        return 1.0f;
    }

    public final float q() {
        return 0.0f;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.c.set(this.a.i());
        this.g.set(this.a.k());
        this.d.set(this.a.h());
        this.f.set(this.b.l());
        this.g.top = (int) (((float) this.h) / 2.0f);
        Rect rect = this.c;
        rect.offsetTo(rect.left, this.g.top);
        rect = this.d;
        rect.offsetTo(rect.left, this.g.top);
        this.e.set(this.b.j());
        this.g.bottom = this.h;
    }

    /* Access modifiers changed, original: final */
    public final float b() {
        return (((float) this.a.i().centerY()) - (((float) this.h) / 2.0f)) / ((float) this.h);
    }

    public final void b_(int i, int i2) {
        this.h = i2;
        a();
    }
}
