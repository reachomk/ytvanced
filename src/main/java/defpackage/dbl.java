package defpackage;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;

/* renamed from: dbl */
final class dbl implements cpr {
    private final /* synthetic */ cpq a;
    private final /* synthetic */ dbj b;

    dbl(dbj dbj, cpq cpq) {
        this.b = dbj;
        this.a = cpq;
    }

    public final void a() {
        RecyclerView recyclerView = this.b.c.u;
        int e = RecyclerView.e(this.a);
        if (e != -1) {
            dad dad = this.b.c;
            SystemClock.uptimeMillis();
            cyl cyl = (cyl) dad.b.get(e);
            coj e2 = cyl.e().e();
            if (e2 != null && cyl.i() == 0) {
                abe.a(dad.u, new dbq(e2));
                cyl.f.set(2);
            }
            this.a.A = null;
        }
    }
}
