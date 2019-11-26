package defpackage;

/* renamed from: bcnp */
final class bcnp implements bcnw {
    private final /* synthetic */ bcno a;

    bcnp(bcno bcno) {
        this.a = bcno;
    }

    public final void a() {
        if (this.a.d.g.compareAndSet(Integer.valueOf(1), Integer.valueOf(4))) {
            bcno bcno = this.a;
            bcow bcow = bcno.a;
            bcmw bcmw = bcno.d;
            bcow.a(bcmw, bcmw.o);
        }
    }
}
