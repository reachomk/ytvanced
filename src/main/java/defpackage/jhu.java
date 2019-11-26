package defpackage;

import android.util.Log;

/* renamed from: jhu */
final /* synthetic */ class jhu implements Runnable {
    private final jhr a;

    jhu(jhr jhr) {
        this.a = jhr;
    }

    public final void run() {
        jhr jhr = this.a;
        if (jhr.a(jhr.b, jhr.a)) {
            jhf jhf = jhr.c;
            aqj c = jhf.c.o.c(jhr.d.K_());
            if (jhf.a(c)) {
                ata ata = jhf.a;
                String str = "ItemTouchHelper";
                if (!ata.l.c(ata.p, c)) {
                    Log.e(str, "Start drag has been called but dragging is not enabled");
                } else if (c.a.getParent() != ata.p) {
                    Log.e(str, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                } else {
                    ata.b();
                    ata.h = 0.0f;
                    ata.g = 0.0f;
                    ata.a(c, 2);
                }
            }
        }
    }
}
