package defpackage;

import android.os.RemoteException;

/* renamed from: mwi */
final class mwi implements Runnable {
    private final /* synthetic */ mvs a;

    mwi(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.w != null && mvs.d()) {
            try {
                this.a.w.b();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
