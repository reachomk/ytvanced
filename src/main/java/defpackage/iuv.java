package defpackage;

import android.view.View;

/* renamed from: iuv */
final /* synthetic */ class iuv implements Runnable {
    private final ius a;
    private final int b;
    private final akng c;

    iuv(ius ius, int i, akng akng) {
        this.a = ius;
        this.b = i;
        this.c = akng;
    }

    public final void run() {
        ius ius = this.a;
        int i = this.b;
        akng akng = this.c;
        aqj f = ius.a.c.f(i);
        if (f != null) {
            View view = f.a;
            if (view != null) {
                view.sendAccessibilityEvent(8);
            }
        }
        ius.a.d.j().a(akng);
    }
}
