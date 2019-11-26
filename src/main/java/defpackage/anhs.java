package defpackage;

import java.util.concurrent.Executor;

/* renamed from: anhs */
final class anhs {
    public static final anhs a = new anhs(null, null);
    public final Runnable b;
    public final Executor c;
    public anhs next;

    anhs(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
