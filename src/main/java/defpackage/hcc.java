package defpackage;

/* renamed from: hcc */
public final class hcc implements akvz {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final akpb f = new aknw();

    public hcc(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public final void a(Class cls) {
        if (ajwy.class.isAssignableFrom(cls)) {
            hcc.a(this.f, ajwy.class, this.a);
        }
        if (auck.class.isAssignableFrom(cls)) {
            hcc.a(this.f, auck.class, this.b);
        }
        if (aufl.class.isAssignableFrom(cls)) {
            hcc.a(this.f, aufl.class, this.c);
        }
        if (axyu.class.isAssignableFrom(cls)) {
            hcc.a(this.f, axyu.class, this.d);
        }
        if (axyr.class.isAssignableFrom(cls)) {
            hcc.a(this.f, axyr.class, this.e);
        }
    }

    private static void a(akpb akpb, Class cls, bcaa bcaa) {
        akpb.a(cls, new akpa(bcaa));
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.f;
    }
}
