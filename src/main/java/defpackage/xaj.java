package defpackage;

import java.util.concurrent.Executor;

/* renamed from: xaj */
public final class xaj implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
