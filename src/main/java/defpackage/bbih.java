package defpackage;

/* renamed from: bbih */
final class bbih extends anhl {
    private final barz a;

    bbih(barz barz) {
        this.a = barz;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        this.a.a("GrpcFuture was cancelled", null);
    }

    public final boolean a_(Object obj) {
        return super.a_(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(Throwable th) {
        return super.a(th);
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        amqo a = amql.a(this);
        a.a("clientCall", this.a);
        return a.toString();
    }
}
