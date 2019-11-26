package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: aniu */
final class aniu extends anit {
    private final Callable b;
    private final /* synthetic */ anis c;

    public aniu(anis anis, Callable callable, Executor executor) {
        this.c = anis;
        super(anis, executor);
        this.b = (Callable) amqw.a((Object) callable);
    }

    /* Access modifiers changed, original: final */
    public final Object b() {
        this.a = false;
        return this.b.call();
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj) {
        this.c.a_(obj);
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        return this.b.toString();
    }
}
