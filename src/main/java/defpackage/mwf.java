package defpackage;

import android.os.RemoteException;

/* renamed from: mwf */
final class mwf implements Runnable {
    private final /* synthetic */ mvs a;

    mwf(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.v != null && mvs.d()) {
            try {
                this.a.v.a();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
