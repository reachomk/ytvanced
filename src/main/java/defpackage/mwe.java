package defpackage;

import android.os.RemoteException;

/* renamed from: mwe */
final class mwe implements Runnable {
    private final /* synthetic */ mvs a;

    mwe(mvs mvs) {
        this.a = mvs;
    }

    public final void run() {
        mvs mvs = this.a;
        if (mvs.v != null && mvs.d()) {
            try {
                this.a.v.b();
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
