package defpackage;

import android.os.RemoteException;

/* renamed from: qnr */
public final class qnr extends bbe {
    private static final pon a = new pon("MediaRouterCallback");
    private final qnq b;

    public qnr(qnq qnq) {
        this.b = (qnq) pzr.a((Object) qnq);
    }

    public final void a(bbs bbs) {
        try {
            this.b.d(bbs.c, bbs.r);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "onRouteSelected", qnq.class.getSimpleName());
        }
    }

    public final void a(bbs bbs, int i) {
        try {
            this.b.a(bbs.c, bbs.r, i);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "onRouteUnselected", qnq.class.getSimpleName());
        }
    }

    public final void a(bbb bbb, bbs bbs) {
        try {
            this.b.a(bbs.c, bbs.r);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "onRouteAdded", qnq.class.getSimpleName());
        }
    }

    public final void c(bbb bbb, bbs bbs) {
        try {
            this.b.b(bbs.c, bbs.r);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "onRouteChanged", qnq.class.getSimpleName());
        }
    }

    public final void b(bbb bbb, bbs bbs) {
        try {
            this.b.c(bbs.c, bbs.r);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "onRouteRemoved", qnq.class.getSimpleName());
        }
    }
}
