package defpackage;

import android.os.RemoteException;

/* renamed from: rnj */
final class rnj implements Runnable {
    private final /* synthetic */ rnk a;

    rnj(rnk rnk) {
        this.a = rnk;
    }

    public final void run() {
        rlq rlq = this.a.a.a;
        if (rlq != null) {
            try {
                rlq.a(1);
            } catch (RemoteException e) {
                qml.b("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
