package defpackage;

import android.os.RemoteException;

/* renamed from: mwk */
final class mwk implements Runnable {
    private final /* synthetic */ mvs a;

    mwk(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.w != null && mvs.d()) {
            try {
                this.a.w.d();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
