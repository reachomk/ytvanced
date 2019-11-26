package defpackage;

import java.util.Set;

/* renamed from: aamp */
public final class aamp {
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
    private final bcaa o;
    private final bcaa p;

    public aamp(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14, bcaa bcaa15, bcaa bcaa16) {
        bcaa bcaa17 = bcaa;
        this.a = (bcaa) aamp.a(bcaa, 1);
        bcaa17 = bcaa2;
        this.b = (bcaa) aamp.a(bcaa2, 2);
        bcaa17 = bcaa3;
        this.c = (bcaa) aamp.a(bcaa3, 3);
        bcaa17 = bcaa4;
        this.d = (bcaa) aamp.a(bcaa4, 4);
        bcaa17 = bcaa5;
        this.e = (bcaa) aamp.a(bcaa5, 5);
        bcaa17 = bcaa6;
        this.f = (bcaa) aamp.a(bcaa6, 6);
        bcaa17 = bcaa7;
        this.g = (bcaa) aamp.a(bcaa7, 7);
        bcaa17 = bcaa8;
        this.h = (bcaa) aamp.a(bcaa8, 8);
        bcaa17 = bcaa9;
        this.i = (bcaa) aamp.a(bcaa9, 9);
        bcaa17 = bcaa10;
        this.j = (bcaa) aamp.a(bcaa10, 10);
        bcaa17 = bcaa11;
        this.k = (bcaa) aamp.a(bcaa11, 11);
        bcaa17 = bcaa12;
        this.l = (bcaa) aamp.a(bcaa12, 12);
        this.m = (bcaa) aamp.a(bcaa13, 13);
        this.n = (bcaa) aamp.a(bcaa14, 14);
        this.o = (bcaa) aamp.a(bcaa15, 15);
        this.p = (bcaa) aamp.a(bcaa16, 16);
    }

    public final aamn a(amro amro) {
        return new aamn((afpd) aamp.a((afpd) this.a.get(), 1), (afqa) this.b.get(), (Set) aamp.a((Set) this.c.get(), 3), (Set) aamp.a((Set) this.d.get(), 4), (afmh) aamp.a((afmh) this.e.get(), 5), (afmg) aamp.a((afmg) this.f.get(), 6), (amqp) aamp.a((amqp) this.g.get(), 7), (amro) aamp.a(amro, 8), (zzf) aamp.a((zzf) this.h.get(), 10), (xsv) aamp.a((xsv) this.i.get(), 11), (xsc) aamp.a((xsc) this.j.get(), 12), (afpu) aamp.a((afpu) this.k.get(), 13), (zzl) aamp.a((zzl) this.l.get(), 14), (xhx) aamp.a((xhx) this.m.get(), 15), (aalx) aamp.a((aalx) this.n.get(), 16), this.o, (aftt) aamp.a((aftt) this.p.get(), 18));
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
