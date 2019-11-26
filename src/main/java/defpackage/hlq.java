package defpackage;

/* renamed from: hlq */
public final class hlq implements hmj {
    private final bcaa a;
    private final hqc b;

    public hlq(bcaa bcaa, hqc hqc) {
        this.a = bcaa;
        this.b = hqc;
    }

    public final hkt a(int i, agqy agqy) {
        return this.b.a(i, agqy);
    }

    public final hkt a(agqh agqh) {
        return c().a(agqh);
    }

    public final hkt a() {
        return c().a();
    }

    public final hkt b() {
        return c().b();
    }

    private final hmj c() {
        return (hmj) this.a.get();
    }
}
