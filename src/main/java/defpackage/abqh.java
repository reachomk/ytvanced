package defpackage;

/* renamed from: abqh */
final class abqh extends abxe {
    private final /* synthetic */ bcaa a;
    private final /* synthetic */ abqi b;
    private final /* synthetic */ abqf c;

    abqh(abqf abqf, bcaa bcaa, abqi abqi) {
        this.c = abqf;
        this.a = bcaa;
        this.b = abqi;
    }

    public final void a(boolean z) {
        abpo abpo = (abpo) this.a.get();
        if (z) {
            abpo.b(this.c.c);
        } else {
            abpo.n();
        }
        this.b.a(this.c, z);
    }
}
