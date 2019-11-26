package defpackage;

/* renamed from: lju */
public final class lju implements lke {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;
    private final bcaa k;
    private final bcaa l;

    public lju(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12) {
        this.a = (bcaa) lju.a(bcaa, 1);
        this.b = (bcaa) lju.a(bcaa2, 2);
        this.c = (bcaa) lju.a(bcaa3, 3);
        this.d = (bcaa) lju.a(bcaa4, 4);
        this.e = (bcaa) lju.a(bcaa5, 5);
        this.f = (bcaa) lju.a(bcaa6, 6);
        this.g = (bcaa) lju.a(bcaa7, 7);
        this.h = (bcaa) lju.a(bcaa8, 8);
        this.i = (bcaa) lju.a(bcaa9, 9);
        this.j = (bcaa) lju.a(bcaa10, 10);
        this.k = (bcaa) lju.a(bcaa11, 11);
        this.l = (bcaa) lju.a(bcaa12, 12);
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    public final /* synthetic */ lkb a(lkd lkd) {
        return new lja(this.a, (acvx) lju.a((acvx) this.b.get(), 2), (lck) lju.a((lck) this.c.get(), 3), (lci) lju.a((lci) this.d.get(), 4), (ahly) lju.a((ahly) this.e.get(), 5), (vwo) lju.a((vwo) this.f.get(), 6), (ahkx) lju.a((ahkx) this.g.get(), 7), (vrk) lju.a((vrk) this.h.get(), 8), (lkm) lju.a((lkm) this.i.get(), 9), (zyw) lju.a((zyw) this.j.get(), 10), (ajam) lju.a((ajam) this.k.get(), 11), (xci) lju.a((xci) this.l.get(), 12), (lkd) lju.a(lkd, 13));
    }
}
