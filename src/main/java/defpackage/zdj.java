package defpackage;

/* renamed from: zdj */
public final class zdj implements zdo {
    private final bcaa a;
    private final xhv b;

    public zdj(bcaa bcaa, xhv xhv) {
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (xhv) amqw.a((Object) xhv);
    }

    public final avai a() {
        asym asym;
        aavs aavs = (aavs) this.a.get();
        aavo aavo = new aavo(aavs.c, aavs.d.c(), apvo.a(this.b.k()));
        aavo.g();
        try {
            asym = (asym) ((aavs) this.a.get()).b.b(aavo);
        } catch (aanq e) {
            xtl.b("Failed to fetch mobile data plan config.", e);
            asym = null;
        }
        if (asym == null) {
            return null;
        }
        asyo asyo = asym.c;
        if (asyo == null) {
            asyo = asyo.c;
        }
        if (asyo.a != 99881742) {
            return null;
        }
        asyo asyo2 = asym.c;
        if (asyo2 == null) {
            asyo2 = asyo.c;
        }
        if (asyo2.a == 99881742) {
            return (avai) asyo2.b;
        }
        return avai.d;
    }

    public final void a(String str, long j) {
        aavs aavs = (aavs) this.a.get();
        aaml aavt = new aavt(aavs.c, aavs.d.c(), str, j);
        aavt.g();
        aavs.h.a(aavt, new zdm());
    }
}
