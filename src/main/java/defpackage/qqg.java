package defpackage;

import android.util.Log;

/* renamed from: qqg */
final class qqg implements Runnable {
    private final /* synthetic */ qqe a;

    qqg(qqe qqe) {
        this.a = qqe;
    }

    public final void run() {
        if (this.a.a != null) {
            qqe qqe = this.a;
            qqb qqb = qqe.c;
            qqb.a--;
            try {
                qqe.a.a();
            } catch (Exception unused) {
                Log.e("DGProcessor", "Error while closing handle.");
            }
            qqe = this.a;
            qqe.a = null;
            qqe.c.a();
        }
    }
}
