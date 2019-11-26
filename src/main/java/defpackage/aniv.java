package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aniv */
public enum aniv implements Executor {
    ;

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    private aniv(String str) {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
