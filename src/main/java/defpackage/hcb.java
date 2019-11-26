package defpackage;

/* renamed from: hcb */
public final class hcb implements akvz {
    public final hbx a;
    public final abum b;
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
    private final akpb o = new aknw();

    public hcb(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, hbx hbx, abum abum, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12) {
        this.c = bcaa;
        this.d = bcaa2;
        this.e = bcaa3;
        this.f = bcaa4;
        this.g = bcaa5;
        this.h = bcaa6;
        this.i = bcaa7;
        this.j = bcaa8;
        this.a = hbx;
        this.b = abum;
        this.k = bcaa10;
        this.l = bcaa9;
        this.m = bcaa11;
        this.n = bcaa12;
    }

    public final void a(Class cls) {
        if (ajxa.class.isAssignableFrom(cls)) {
            this.o.a(audn.class, new hca(this));
            hcb.a(this.o, auej.class, this.c);
            hcb.a(this.o, audr.class, this.d);
            hcb.a(this.o, audv.class, this.e);
            hcb.a(this.o, aued.class, this.f);
            hcb.a(this.o, augz.class, this.g);
            hcb.a(this.o, auhb.class, this.h);
            hcb.a(this.o, augv.class, this.i);
            hcb.a(this.o, audx.class, this.j);
            hcb.a(this.o, auel.class, this.l);
            hcb.a(this.o, audt.class, this.n);
            hcb.a(this.o, aufj.class, this.m);
            this.o.a(arec.class, new hcd(this));
            hcb.a(this.o, ardy.class, this.k);
        }
    }

    private static void a(akpb akpb, Class cls, bcaa bcaa) {
        akpb.a(cls, new akpa(bcaa));
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.o;
    }
}
