package defpackage;

/* renamed from: afnr */
public final class afnr extends afnp {
    private final afnp a;
    private final aftm b;

    public afnr(xsc xsc, afnp afnp) {
        this.a = (afnp) amqw.a((Object) afnp);
        this.b = new aftm(xsc);
    }

    private final afmc c(xho xho) {
        afnp.b(xho);
        return new afmc((byte[]) this.a.a(xho.e()), this.b.a(xho.d().a("cache-control")));
    }
}
