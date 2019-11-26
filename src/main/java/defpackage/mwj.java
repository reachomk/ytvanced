package defpackage;

import android.os.RemoteException;

/* renamed from: mwj */
final class mwj implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ mvs b;

    mwj(mvs mvs, String str) {
        this.b = mvs;
        this.a = str;
    }

    public final void run() {
        mvs mvs = this.b;
        if (mvs.w != null && mvs.d()) {
            try {
                this.b.w.a(this.a);
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
