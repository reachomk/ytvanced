package defpackage;

import android.graphics.Rect;
import java.util.Iterator;

/* renamed from: lpo */
final class lpo extends lpp {
    private final zl h = new zl();

    public lpo(lla lla, lla lla2) {
        super(lla, lla2);
        a();
    }

    public final float r() {
        return 0.0f;
    }

    public final float n() {
        return !b() ? 0.0f : 0.85f;
    }

    public final float q() {
        return n();
    }

    public final void a(lkz lkz) {
        this.h.add(lkz);
    }

    public final void b(lkz lkz) {
        this.h.remove(lkz);
    }

    public final void a() {
        this.d.set(this.a.h());
        this.c.set(this.a.i());
        this.e.set(this.b.j());
        this.f.set(this.b.l());
        Rect rect;
        if (b()) {
            rect = this.e;
            int width = rect.width();
            rect.offset(width + width, 0);
            rect = this.f;
            width = rect.height();
            rect.offset(0, width + width);
        } else {
            rect = this.e;
            rect.offset(0, rect.height());
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((lkz) it.next()).a(this);
        }
    }

    private final boolean b() {
        return this.a.q() > 0.0f || this.b.q() > 0.0f;
    }
}
