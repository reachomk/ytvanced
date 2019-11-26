package defpackage;

/* renamed from: afnu */
public final class afnu implements afnw {
    private final afnw a;
    private final aftm b;

    public afnu(xsc xsc, afnw afnw) {
        this.a = (afnw) amqw.a((Object) afnw);
        this.b = new aftm(xsc);
    }

    public final /* synthetic */ Object a(Object obj) {
        bqd bqd = (bqd) obj;
        return new afmc((byte[]) this.a.a(bqd), this.b.a((String) bqp.a(bqd).g.get("cache-control")));
    }
}
