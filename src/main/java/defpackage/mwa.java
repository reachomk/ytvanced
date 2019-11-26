package defpackage;

import android.os.RemoteException;

/* renamed from: mwa */
final class mwa implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ mvs b;

    mwa(mvs mvs, boolean z) {
        this.b = mvs;
        this.a = z;
    }

    public final void run() {
        mvs mvs = this.b;
        if (mvs.x != null && mvs.d()) {
            try {
                this.b.x.a(this.a);
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
