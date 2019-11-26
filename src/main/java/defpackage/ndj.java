package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: ndj */
public final /* synthetic */ class ndj implements Runnable {
    private final ndi a;
    private final Bundle b;

    public ndj(ndi ndi, Bundle bundle) {
        this.a = ndi;
        this.b = bundle;
    }

    public final void run() {
        ndi ndi = this.a;
        try {
            ndi.h.a(this.b);
        } catch (RemoteException unused) {
            ammj.b("Problem showing fullscreen view.", new Object[0]);
        }
    }
}
