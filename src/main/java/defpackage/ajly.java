package defpackage;

/* renamed from: ajly */
public final class ajly extends ajlw {
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
    private final bcaa m;
    private final bcaa n;

    public ajly(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14) {
        this.a = (bcaa) ajly.a(bcaa, 1);
        this.b = (bcaa) ajly.a(bcaa2, 2);
        this.c = (bcaa) ajly.a(bcaa3, 3);
        this.d = (bcaa) ajly.a(bcaa4, 4);
        this.e = (bcaa) ajly.a(bcaa5, 5);
        this.f = (bcaa) ajly.a(bcaa6, 6);
        this.g = (bcaa) ajly.a(bcaa7, 7);
        this.h = (bcaa) ajly.a(bcaa8, 8);
        this.i = (bcaa) ajly.a(bcaa9, 9);
        this.j = (bcaa) ajly.a(bcaa10, 10);
        this.k = (bcaa) ajly.a(bcaa11, 11);
        this.l = (bcaa) ajly.a(bcaa12, 12);
        this.m = (bcaa) ajly.a(bcaa13, 13);
        this.n = (bcaa) ajly.a(bcaa14, 14);
    }

    public final ajln a() {
        return new ajln((xsc) ajly.a((xsc) this.a.get(), 1), (aepu) ajly.a((aepu) this.b.get(), 2), (ahjg) ajly.a((ahjg) this.c.get(), 3), (ajll) ajly.a((ajll) this.d.get(), 4), (aiqf) ajly.a((aiqf) this.e.get(), 5), (airt) ajly.a((airt) this.f.get(), 6), (aajk) ajly.a((aajk) this.g.get(), 7), (xua) ajly.a((xua) this.h.get(), 8), (ajqe) ajly.a((ajqe) this.i.get(), 9), (ajlz) ajly.a((ajlz) this.j.get(), 10), (zzl) ajly.a((zzl) this.k.get(), 11), (zyw) ajly.a((zyw) this.l.get(), 12), (ajpw) ajly.a((ajpw) this.m.get(), 13), (ajme) ajly.a((ajme) this.n.get(), 14));
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
}
