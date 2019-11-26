package defpackage;

import java.util.concurrent.Executor;

/* renamed from: anir */
final class anir extends anit {
    private final anij b;
    private final /* synthetic */ anis c;

    public anir(anis anis, anij anij, Executor executor) {
        this.c = anis;
        super(anis, executor);
        this.b = (anij) amqw.a((Object) anij);
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        return this.b.toString();
    }

    /* Access modifiers changed, original: final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.c.a((anjv) obj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object b() {
        this.a = false;
        return (anjv) amqw.a(this.b.a(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.b);
    }
}
