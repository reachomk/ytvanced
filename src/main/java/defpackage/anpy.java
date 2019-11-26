package defpackage;

import java.util.concurrent.Executor;

/* renamed from: anpy */
final /* synthetic */ class anpy implements Executor {
    public static final Executor a = new anpy();

    private anpy() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
