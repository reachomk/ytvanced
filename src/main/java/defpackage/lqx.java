package defpackage;

import android.os.Handler;

/* renamed from: lqx */
public final class lqx implements aikd, Runnable, xbz {
    private final xca a;
    private final Handler b;
    private final /* synthetic */ lqv c;

    public lqx(lqv lqv, xca xca, Handler handler) {
        this.c = lqv;
        this.a = xca;
        this.b = handler;
    }

    public final void f_(int i, int i2) {
    }

    public final void d_(int i, int i2) {
        a();
    }

    public final void e_(int i, int i2) {
        a();
    }

    public final void g_(int i, int i2) {
        a();
    }

    public final void run() {
        this.b.removeCallbacks(this);
        xca xca = this.a;
        this.c.a(xca.subList(0, xca.size()));
    }

    private final void a() {
        this.b.removeCallbacks(this);
        this.b.post(this);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a();
    }
}
