package defpackage;

import android.os.RemoteException;

/* renamed from: qkd */
final class qkd implements Runnable {
    private final /* synthetic */ dfi a;
    private final /* synthetic */ qkb b;

    qkd(qkb qkb, dfi dfi) {
        this.b = qkb;
        this.a = dfi;
    }

    public final void run() {
        try {
            this.b.a.a(qkg.a(this.a));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }
}
