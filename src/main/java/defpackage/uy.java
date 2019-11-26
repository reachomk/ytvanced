package defpackage;

import android.os.IBinder;

/* renamed from: uy */
final class uy implements Runnable {
    private final /* synthetic */ vd a;
    private final /* synthetic */ ut b;

    uy(ut utVar, vd vdVar) {
        this.b = utVar;
        this.a = vdVar;
    }

    public final void run() {
        IBinder a = this.a.a();
        ub ubVar = (ub) this.b.a.d.remove(a);
        if (ubVar != null) {
            a.unlinkToDeath(ubVar, 0);
        }
    }
}
