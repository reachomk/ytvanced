package defpackage;

/* renamed from: abim */
public final class abim extends aanf {
    private final aang a;
    private final aanl b;
    private final xhv g;
    private final xmc h;
    private final bcaa i;

    public abim(aamf aamf, aamn aamn, aamd aamd, afpu afpu, xhf xhf, xhv xhv, xmc xmc, bcaa bcaa) {
        super(aamd, afpu, xhf);
        this.a = a(athy.e, aamf, abip.a, abio.a);
        this.b = a(ajvn.class, aamn, abir.a);
        this.g = (xhv) amqw.a((Object) xhv);
        this.h = (xmc) amqw.a((Object) xmc);
        this.i = bcaa;
    }

    public final anjv a(abic abic) {
        return anic.a(this.b.a(abic), abiq.a, aniv.a);
    }

    public final anjv a(aaml aaml) {
        return this.a.a(aaml);
    }

    public final abin a() {
        abin abin = new abin(this.c, this.d.c());
        abin.j = (String) this.i.get();
        return abin;
    }

    public final abic a(String str) {
        abic abic = new abic(this.c, this.d.c(), str, this.g, this.h);
        abic.j = (String) this.i.get();
        return abic;
    }
}
