package defpackage;

import android.os.RemoteException;

/* renamed from: mwc */
final class mwc implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ mvs b;

    mwc(mvs mvs, boolean z) {
        this.b = mvs;
        this.a = z;
    }

    public final void run() {
        mvs mvs = this.b;
        if (mvs.y != null && mvs.d()) {
            try {
                this.b.y.a(this.a);
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
