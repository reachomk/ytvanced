package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: bkk */
final class bkk extends FutureTask {
    private final /* synthetic */ bki a;

    bkk(bki bki, Callable callable) {
        this.a = bki;
        super(callable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void done() {
        if (!isCancelled()) {
            try {
                this.a.a((bkf) get());
            } catch (InterruptedException | ExecutionException e) {
                this.a.a(new bkf(e));
            }
        }
    }
}
