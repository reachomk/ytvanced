package defpackage;

/* renamed from: vcg */
public final class vcg implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    private vcg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
    }

    public static vcg a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        return new vcg(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6);
    }

    public static vfj a(xsc xsc, xua xua, vfn vfn, bcaa bcaa, veq veq, ahlm ahlm) {
        vfl vfl = new vfl(xsc, xua, vfn);
        vfl.e = bcaa;
        vfl.f = ahlm;
        vfl.d = (veq) amqw.a((Object) veq);
        return (vfj) baqd.a(new vfj(vfl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vcg.a((xsc) this.a.get(), (xua) this.b.get(), (vfn) this.c.get(), this.d, (veq) this.e.get(), (ahlm) this.f.get());
    }
}
