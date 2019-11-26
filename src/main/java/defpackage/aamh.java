package defpackage;

import java.util.Set;

/* renamed from: aamh */
public final class aamh {
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

    public aamh(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14, bcaa bcaa15, bcaa bcaa16) {
        bcaa bcaa17 = bcaa;
        this.a = (bcaa) aamh.a((Object) bcaa, 1);
        bcaa17 = bcaa2;
        this.b = (bcaa) aamh.a((Object) bcaa2, 2);
        bcaa17 = bcaa3;
        this.c = (bcaa) aamh.a((Object) bcaa3, 3);
        bcaa17 = bcaa4;
        this.d = (bcaa) aamh.a((Object) bcaa4, 4);
        bcaa17 = bcaa5;
        this.e = (bcaa) aamh.a((Object) bcaa5, 5);
        bcaa17 = bcaa6;
        this.f = (bcaa) aamh.a((Object) bcaa6, 6);
        bcaa17 = bcaa7;
        this.g = (bcaa) aamh.a((Object) bcaa7, 7);
        bcaa17 = bcaa8;
        this.h = (bcaa) aamh.a((Object) bcaa8, 8);
        bcaa17 = bcaa9;
        this.i = (bcaa) aamh.a((Object) bcaa9, 9);
        bcaa17 = bcaa10;
        this.j = (bcaa) aamh.a((Object) bcaa10, 10);
        bcaa17 = bcaa11;
        this.k = (bcaa) aamh.a((Object) bcaa11, 11);
        bcaa17 = bcaa12;
        this.l = (bcaa) aamh.a((Object) bcaa12, 12);
        this.m = (bcaa) aamh.a((Object) bcaa13, 13);
        this.n = (bcaa) aamh.a((Object) bcaa14, 14);
        this.o = (bcaa) aamh.a((Object) bcaa15, 15);
        this.p = (bcaa) aamh.a((Object) bcaa16, 16);
    }

    public final aamf a(amro amro, boolean z) {
        return new aamf((afpd) aamh.a((afpd) this.a.get(), 1), (afqa) this.b.get(), (Set) aamh.a((Set) this.c.get(), 3), (Set) aamh.a((Set) this.d.get(), 4), (afmh) aamh.a((afmh) this.e.get(), 5), (afmg) aamh.a((afmg) this.f.get(), 6), (amqp) aamh.a((amqp) this.g.get(), 7), (amro) aamh.a((Object) amro, 8), z, (zzf) aamh.a((zzf) this.h.get(), 10), (xsv) aamh.a((xsv) this.i.get(), 11), (xsc) aamh.a((xsc) this.j.get(), 12), (afpu) aamh.a((afpu) this.k.get(), 13), (zzl) aamh.a((zzl) this.l.get(), 14), (xhx) aamh.a((xhx) this.m.get(), 15), (aalx) aamh.a((aalx) this.n.get(), 16), this.o, (aftt) aamh.a((aftt) this.p.get(), 18));
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
