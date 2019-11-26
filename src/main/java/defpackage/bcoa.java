package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: bcoa */
final class bcoa implements Executor {
    private final /* synthetic */ Executor a;
    private final /* synthetic */ bcnx b;

    bcoa(bcnx bcnx, Executor executor) {
        this.b = bcnx;
        this.a = executor;
    }

    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.i.a(e);
        }
    }
}
