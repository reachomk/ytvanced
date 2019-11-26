package defpackage;

/* renamed from: abvf */
public final class abvf implements akvz {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final akpb e = new aknw();

    abvf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public final void a(Class cls) {
        if (ajxa.class.isAssignableFrom(cls)) {
            abvf.a(this.e, aued.class, this.a);
            abvf.a(this.e, audr.class, this.b);
            abvf.a(this.e, audt.class, this.c);
            abvf.a(this.e, aufj.class, this.d);
        }
    }

    private static void a(akpb akpb, Class cls, bcaa bcaa) {
        akpb.a(cls, new akpa(bcaa));
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.e;
    }
}
