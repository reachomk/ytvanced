package defpackage;

import android.os.RemoteException;

/* renamed from: ndm */
public final /* synthetic */ class ndm implements Runnable {
    private final ndi a;

    public ndm(ndi ndi) {
        this.a = ndi;
    }

    public final void run() {
        try {
            this.a.h.a();
        } catch (RemoteException unused) {
            ammj.b("Problem dismissing fullscreen view.", new Object[0]);
        }
    }
}
