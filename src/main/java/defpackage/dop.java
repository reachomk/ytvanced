package defpackage;

import android.net.Uri;

/* renamed from: dop */
final class dop implements Runnable {
    private final /* synthetic */ don a;

    dop(don don) {
        this.a = don;
    }

    public final void run() {
        if (this.a.c().f().h) {
            dtg a = this.a.a();
            xgr xgr = (xgr) a.d().get();
            if (xgr.a()) {
                xfs i = a.i();
                for (Uri a2 : xgr.b) {
                    i.a(a2);
                }
            }
        }
    }
}
