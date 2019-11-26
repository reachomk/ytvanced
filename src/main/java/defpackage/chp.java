package defpackage;

import java.util.concurrent.Executor;

/* renamed from: chp */
final class chp implements Executor {
    chp() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
