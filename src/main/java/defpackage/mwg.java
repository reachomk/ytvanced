package defpackage;

import android.os.RemoteException;

/* renamed from: mwg */
final class mwg implements Runnable {
    private final /* synthetic */ mvs a;

    mwg(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.w != null && mvs.d()) {
            try {
                this.a.w.a();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
