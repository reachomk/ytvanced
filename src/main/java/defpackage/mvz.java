package defpackage;

import android.os.RemoteException;

/* renamed from: mvz */
final class mvz implements Runnable {
    private final /* synthetic */ mvs a;

    mvz(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.x != null && mvs.d()) {
            try {
                this.a.x.a();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
