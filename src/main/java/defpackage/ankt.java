package defpackage;

/* renamed from: ankt */
final class ankt extends anjt {
    private final anij a;
    private final /* synthetic */ anku b;

    ankt(anku anku, anij anij) {
        this.b = anku;
        this.a = (anij) amqw.a((Object) anij);
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.b.isDone();
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        return this.a.toString();
    }

    /* Access modifiers changed, original: final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        anjv anjv = (anjv) obj;
        if (th == null) {
            this.b.a(anjv);
        } else {
            this.b.a(th);
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object b() {
        return (anjv) amqw.a(this.a.a(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.a);
    }
}
