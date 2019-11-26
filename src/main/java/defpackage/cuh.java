package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: cuh */
public final class cuh implements cud {
    public static cud a = new cuh();
    private static final boolean c = true;
    public Choreographer b;
    private final Handler d;

    cuh() {
        if (!c) {
            this.d = new Handler(Looper.getMainLooper());
        } else if (cro.a()) {
            this.b = Choreographer.getInstance();
            this.d = null;
        } else {
            this.d = new Handler(Looper.getMainLooper());
            this.d.post(new cuk(this));
        }
    }

    public final void a(cug cug) {
        if (!c || this.b == null) {
            this.d.postDelayed(cug.b(), 0);
            return;
        }
        this.b.postFrameCallback(cug.a());
    }

    public final void b(cug cug) {
        if (!c || this.b == null) {
            this.d.removeCallbacks(cug.b());
            return;
        }
        this.b.removeFrameCallback(cug.a());
    }
}
