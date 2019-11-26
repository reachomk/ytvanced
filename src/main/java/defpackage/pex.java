package defpackage;

import android.os.Handler;

/* renamed from: pex */
abstract class pex {
    private static volatile Handler d;
    public final pgd a;
    public final Runnable b = new pfa(this);
    public volatile long c;

    pex(pgd pgd) {
        pzr.a((Object) pgd);
        this.a = pgd;
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            this.c = this.a.c.a();
            if (!d().postDelayed(this.b, j)) {
                this.a.a().d("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean b() {
        return this.c != 0;
    }

    public final void c() {
        this.c = 0;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        if (d != null) {
            return d;
        }
        Handler handler;
        synchronized (pex.class) {
            if (d == null) {
                d = new Handler(this.a.a.getMainLooper());
            }
            handler = d;
        }
        return handler;
    }
}
