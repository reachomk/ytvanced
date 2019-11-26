package defpackage;

import android.os.RemoteException;

@qlp
/* renamed from: qkb */
public final class qkb implements dhb, dhd {
    public final qjm a;

    public qkb(qjm qjm) {
        this.a = qjm;
    }

    public final void a(dfi dfi) {
        String.valueOf(dfi).length();
        rlj.a();
        if (qmh.b()) {
            try {
                this.a.a(qkg.a(dfi));
                return;
            } catch (RemoteException e) {
                qml.c("#007 Could not call remote method.", e);
                return;
            }
        }
        qml.c("#008 Must be called on the main UI thread.", null);
        qmh.a.post(new qke(this, dfi));
    }

    public final void b(dfi dfi) {
        String.valueOf(dfi).length();
        rlj.a();
        if (qmh.b()) {
            try {
                this.a.a(qkg.a(dfi));
                return;
            } catch (RemoteException e) {
                qml.c("#007 Could not call remote method.", e);
                return;
            }
        }
        qml.c("#008 Must be called on the main UI thread.", null);
        qmh.a.post(new qkd(this, dfi));
    }
}
