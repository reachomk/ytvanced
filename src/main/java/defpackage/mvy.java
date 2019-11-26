package defpackage;

import android.os.RemoteException;

/* renamed from: mvy */
final class mvy implements Runnable {
    private final /* synthetic */ mvs a;

    mvy(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.x != null && mvs.d()) {
            try {
                this.a.x.b();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
