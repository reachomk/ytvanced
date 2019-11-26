package defpackage;

import android.os.RemoteException;

/* renamed from: ndq */
public final /* synthetic */ class ndq implements Runnable {
    private final ndi a;
    private final boolean b;

    public ndq(ndi ndi, boolean z) {
        this.a = ndi;
        this.b = z;
    }

    public final void run() {
        ndi ndi = this.a;
        try {
            ndi.h.a(this.b);
        } catch (RemoteException unused) {
            ammj.b("Cannot send fullscreen event, client disconnected.", new Object[0]);
        }
    }
}
