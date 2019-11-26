package defpackage;

import android.os.RemoteException;

/* renamed from: mwh */
final class mwh implements Runnable {
    private final /* synthetic */ mvs a;

    mwh(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.v != null && mvs.d()) {
            try {
                this.a.v.c();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
