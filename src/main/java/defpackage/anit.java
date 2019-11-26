package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: anit */
abstract class anit extends anjt {
    public boolean a = true;
    private final Executor b;
    private final /* synthetic */ anis c;

    public anit(anis anis, Executor executor) {
        this.c = anis;
        this.b = (Executor) amqw.a((Object) executor);
    }

    public abstract void a(Object obj);

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.c.isDone();
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        try {
            this.b.execute(this);
        } catch (RejectedExecutionException e) {
            if (this.a) {
                this.c.a(e);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj, Throwable th) {
        if (th == null) {
            a(obj);
        } else if (th instanceof ExecutionException) {
            this.c.a(th.getCause());
        } else if (th instanceof CancellationException) {
            this.c.cancel(false);
        } else {
            this.c.a(th);
        }
    }
}
