package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xkq */
final class xkq implements xjp {
    public final AtomicReference a = new AtomicReference(null);
    private final anko b;
    private final xhj c;
    private final xle d;

    public xkq(anko anko, xhj xhj, xle xle) {
        this.b = (anko) amqw.a((Object) anko);
        this.d = (xle) amqw.a((Object) xle);
        this.c = xhj;
        this.b.a(new xkp(this, anko), aniv.a);
    }

    public final boolean a() {
        return this.d.g || this.b.isCancelled();
    }

    public final void a(bckx bckx) {
        this.a.set(bckx);
    }

    public final void a(xle xle, bqh bqh) {
        if (!this.b.isCancelled()) {
            Throwable th = bqh.c;
            if (th != null) {
                this.b.a(th);
            } else {
                this.b.a_(bqh);
            }
            xhj xhj = this.c;
            if (xhj != null) {
                xhj.a(xle, bqh);
            }
        }
    }

    public final void b() {
        if (!this.b.isCancelled()) {
            this.b.cancel(true);
        }
        this.d.h();
    }
}
