package defpackage;

import android.os.Handler;

/* renamed from: bafm */
public final class bafm implements bafr {
    private final Runnable a;
    private final Runnable b;
    private final Handler c;

    public bafm(Runnable runnable, Runnable runnable2, Handler handler) {
        this.a = runnable;
        this.b = runnable2;
        this.c = handler;
    }

    public final void a() {
        Runnable runnable = this.a;
        if (runnable != null) {
            this.c.post(runnable);
        }
    }

    public final void b() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.c.post(runnable);
        }
    }

    public final void c() {
        Runnable runnable = this.a;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        runnable = this.b;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }
}
