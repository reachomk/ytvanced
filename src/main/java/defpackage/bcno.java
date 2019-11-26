package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: bcno */
final class bcno {
    public final bcow a;
    public final Executor b;
    public final Executor c;
    public final /* synthetic */ bcmw d;

    bcno(bcmw bcmw, bckz bckz, Executor executor) {
        this.d = bcmw;
        this.a = new bcow(bckz);
        if (bcmw.h) {
            this.b = executor;
            this.c = null;
            return;
        }
        this.b = new bcnv(executor);
        this.c = executor;
    }

    /* Access modifiers changed, original: final */
    public final void a(bcnw bcnw) {
        try {
            this.b.execute(new bcnl(this.d, bcnw));
        } catch (RejectedExecutionException e) {
            this.d.a(new bclu("Exception posting task to executor", e));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        a(new bcnp(this));
    }
}
