package defpackage;

import android.os.Build.VERSION;

/* renamed from: neb */
final /* synthetic */ class neb implements Runnable {
    private final ndy a;
    private final boolean b;

    neb(ndy ndy, boolean z) {
        this.a = ndy;
        this.b = z;
    }

    public final void run() {
        ndy ndy = this.a;
        boolean z = this.b;
        if (ndy.a.d()) {
            mtw mtw = ndy.a.D;
            mtw.h = z;
            if (mtw.f.b) {
                mtw.b.b(z);
                return;
            }
            if ((VERSION.SDK_INT < 24 || !mtw.a.a.isInMultiWindowMode()) && z) {
                mtw.c.b(2);
            } else {
                mtw.c.b();
            }
            mtw.b.a(z);
        }
    }
}
