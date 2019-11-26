package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: ankb */
final class ankb implements Executor {
    public boolean a = true;
    private final /* synthetic */ Executor b;
    private final /* synthetic */ anhl c;

    ankb(Executor executor, anhl anhl) {
        this.b = executor;
        this.c = anhl;
    }

    public final void execute(Runnable runnable) {
        try {
            this.b.execute(new anke(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.a) {
                this.c.a(e);
            }
        }
    }
}
