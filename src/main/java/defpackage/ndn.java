package defpackage;

import android.os.RemoteException;

/* renamed from: ndn */
public final /* synthetic */ class ndn implements Runnable {
    private final ndi a;
    private final int b;

    public ndn(ndi ndi, int i) {
        this.a = ndi;
        this.b = i;
    }

    public final void run() {
        ndi ndi = this.a;
        try {
            ndi.h.a(this.b);
        } catch (RemoteException unused) {
            ammj.b("Problem sending error to client.", new Object[0]);
        }
    }
}
