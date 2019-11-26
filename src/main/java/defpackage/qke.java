package defpackage;

import android.os.RemoteException;

/* renamed from: qke */
final class qke implements Runnable {
    private final /* synthetic */ dfi a;
    private final /* synthetic */ qkb b;

    qke(qkb qkb, dfi dfi) {
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
