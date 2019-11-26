package defpackage;

import java.util.concurrent.Executor;

/* renamed from: xks */
final class xks implements xjp {
    private final Executor a;
    private final xhj b;
    private final xle c;

    public xks(Executor executor, xhj xhj, xle xle) {
        this.a = (Executor) amqw.a((Object) executor);
        this.b = xhj;
        this.c = (xle) amqw.a((Object) xle);
    }

    public final void a(bckx bckx) {
    }

    public final boolean a() {
        return this.c.g;
    }

    public final void a(xle xle, bqh bqh) {
        if (!xle.g) {
            this.a.execute(new xkr(xle, bqh));
            xhj xhj = this.b;
            if (xhj != null) {
                xhj.a(xle, bqh);
            }
        }
    }

    public final void b() {
        this.c.h();
    }
}
