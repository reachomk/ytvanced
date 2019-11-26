package defpackage;

import android.os.Handler;

/* renamed from: xxz */
final class xxz extends amg {
    public final xxp m;
    private final Handler n;

    public xxz(xxp xxp, Handler handler) {
        this.m = (xxp) amqw.a((Object) xxp);
        this.n = (Handler) amqw.a((Object) handler);
    }

    public final boolean a(aqj aqj, aqj aqj2, int i, int i2, int i3, int i4) {
        f(aqj);
        f(aqj2);
        return false;
    }

    public final void g(aqj aqj) {
        this.n.post(new xyc(this));
    }
}
