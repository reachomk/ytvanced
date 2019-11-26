package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rzf */
final class rzf implements Executor {
    rzf() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
