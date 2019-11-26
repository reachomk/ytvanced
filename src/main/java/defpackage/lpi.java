package defpackage;

import android.graphics.Rect;
import java.util.Iterator;

/* renamed from: lpi */
final class lpi extends lpp {
    private final zl h = new zl();

    public lpi(lla lla, lla lla2) {
        super(lla, lla2);
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
        return 0.0f;
    }

    public final void a(lkz lkz) {
        this.h.add(lkz);
    }

    public final void b(lkz lkz) {
        this.h.remove(lkz);
    }

    public final void a() {
        Rect h = this.b.h();
        Rect i = this.a.i();
        Rect i2 = this.b.i();
        Rect k = this.a.k();
        Rect j = this.b.j();
        this.g.set(k);
        k = this.g;
        k.top = k.bottom - fpl.a(i.bottom - i.top, i2.bottom - i2.top, 0.22500001f);
        this.e.set(j.left, this.g.top, j.right, this.g.top + j.height());
        this.c.set(this.g);
        fpe.a(((float) h.width()) / ((float) h.height()), this.c, this.d);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((lkz) it.next()).a(this);
        }
    }
}
