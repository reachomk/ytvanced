package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wyx */
final /* synthetic */ class wyx implements Executor {
    public static final Executor a = new wyx();

    private wyx() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
