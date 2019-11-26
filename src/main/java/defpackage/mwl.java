package defpackage;

import android.os.RemoteException;

/* renamed from: mwl */
final class mwl implements Runnable {
    private final /* synthetic */ mvs a;

    mwl(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.w != null && mvs.d()) {
            try {
                this.a.w.c();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
