package defpackage;

import android.os.RemoteException;

/* renamed from: mwb */
final class mwb implements Runnable {
    private final /* synthetic */ mvs a;

    mwb(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.x != null && mvs.d()) {
            try {
                this.a.x.c();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
