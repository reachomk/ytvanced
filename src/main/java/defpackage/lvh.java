package defpackage;

import android.graphics.Rect;

/* renamed from: lvh */
final class lvh implements lkz {
    public final int a;
    public final eix b = new eix();
    public lla c;

    lvh(int i) {
        this.a = i;
    }

    /* Access modifiers changed, original: final */
    public final void b(lla lla) {
        Rect h = lla.h();
        int width = h.width();
        int height = h.height();
        if (width > 0 && height > 0) {
            this.b.a(h.width(), h.height());
        }
    }

    public final void a(lla lla) {
        b(lla);
    }
}
