package defpackage;

import android.os.RemoteException;

/* renamed from: rnl */
final class rnl implements Runnable {
    private final /* synthetic */ rnm a;

    rnl(rnm rnm) {
        this.a = rnm;
    }

    public final void run() {
        rlq rlq = this.a.a;
        if (rlq != null) {
            try {
                rlq.a(1);
            } catch (RemoteException e) {
                qml.b("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
