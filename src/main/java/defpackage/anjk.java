package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: anjk */
final class anjk implements Runnable {
    private final Future a;
    private final anjg b;

    anjk(Future future, anjg anjg) {
        this.a = future;
        this.b = anjg;
    }

    public final void run() {
        try {
            this.b.a(anjf.a(this.a));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Error | RuntimeException e2) {
            this.b.a(e2);
        }
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a(this.b);
        return a.toString();
    }
}
