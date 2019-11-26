package defpackage;

import android.os.RemoteException;

/* renamed from: ndl */
public final /* synthetic */ class ndl implements Runnable {
    private final ndi a;
    private final int b;
    private final String c;
    private final long d;

    public ndl(ndi ndi, int i, String str, long j) {
        this.a = ndi;
        this.b = i;
        this.c = str;
        this.d = j;
    }

    public final void run() {
        ndi ndi = this.a;
        int i = this.b;
        String str = this.c;
        long j = this.d;
        try {
            myz myz = ndi.k;
            if (myz != null) {
                myz.a(i);
            }
            ndi.h.a(i, str, j);
        } catch (RemoteException unused) {
            ammj.b("Problem sending playback event to client.", new Object[0]);
        }
    }
}
