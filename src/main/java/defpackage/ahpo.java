package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ahpo */
final class ahpo implements Runnable {
    private final /* synthetic */ ahpm a;

    ahpo(ahpm ahpm) {
        this.a = ahpm;
    }

    public final void run() {
        synchronized (this.a.a) {
            if (this.a.c) {
                Looper.prepare();
                this.a.d = new Handler();
                Looper.loop();
                return;
            }
        }
    }
}
