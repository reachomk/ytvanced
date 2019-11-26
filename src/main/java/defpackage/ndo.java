package defpackage;

import android.os.RemoteException;

/* renamed from: ndo */
public final /* synthetic */ class ndo implements Runnable {
    private final ndi a;
    private final long b;

    public ndo(ndi ndi, long j) {
        this.a = ndi;
        this.b = j;
    }

    public final void run() {
        ndi ndi = this.a;
        long j = this.b;
        try {
            myz myz = ndi.k;
            if (myz != null) {
                myz.a(j);
            }
            ndi.h.a(j);
        } catch (RemoteException unused) {
            ammj.b("Problem sending playback event to client.", new Object[0]);
        }
    }
}
