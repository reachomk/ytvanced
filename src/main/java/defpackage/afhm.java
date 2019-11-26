package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: afhm */
final class afhm implements Runnable {
    private final /* synthetic */ afhn a;

    afhm(afhn afhn) {
        this.a = afhn;
    }

    public final void run() {
        Looper.prepare();
        this.a.d = new Handler();
        afhn afhn = this.a;
        if (!afhn.b.registerListener(afhn, afhn.c, afhn.a, this.a.d)) {
            this.a.c = null;
        }
        Looper.loop();
    }
}
