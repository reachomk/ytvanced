package defpackage;

import android.os.RemoteException;

/* renamed from: mwd */
final class mwd implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ mvs b;

    mwd(mvs mvs, long j) {
        this.b = mvs;
        this.a = j;
    }

    public final void run() {
        mvs mvs = this.b;
        if (mvs.x != null && mvs.d()) {
            try {
                this.b.x.a((int) this.a);
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
