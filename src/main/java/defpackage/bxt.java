package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;

/* renamed from: bxt */
final class bxt extends Thread {
    private final /* synthetic */ bxu a;

    bxt(bxu bxu, Runnable runnable, String str) {
        this.a = bxu;
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(9);
        if (this.a.b) {
            StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (Throwable th) {
            this.a.a.a(th);
        }
    }
}
