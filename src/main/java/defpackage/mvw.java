package defpackage;

import android.os.RemoteException;

/* renamed from: mvw */
final class mvw implements Runnable {
    private final /* synthetic */ amkz a;
    private final /* synthetic */ mvs b;

    mvw(mvs mvs, amkz amkz) {
        this.b = mvs;
        this.a = amkz;
    }

    public final void run() {
        mvs mvs = this.b;
        if (mvs.w != null && mvs.d()) {
            try {
                this.b.w.b(this.a.name());
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
    }
}
