package defpackage;

import android.os.Handler;

/* renamed from: ajmm */
final class ajmm {
    public final Runnable a;
    public final Handler b;
    public final xsc c;
    public final zzl d;
    public long e;
    public long f;
    public boolean g;

    public ajmm(xsc xsc, zzl zzl, Handler handler, bcaa bcaa) {
        this.c = xsc;
        this.d = zzl;
        this.b = handler;
        this.a = new ajml(this, bcaa);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.b.removeCallbacks(this.a);
        this.f = 0;
        this.b.post(this.a);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.b.removeCallbacks(this.a);
    }
}
