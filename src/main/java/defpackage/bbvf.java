package defpackage;

/* renamed from: bbvf */
final class bbvf implements bbmo, bbnc {
    private final bbmo a;
    private bbnc b;

    bbvf(bbmo bbmo) {
        this.a = bbmo;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.b, bbnc)) {
            this.b = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void bK_() {
        this.b.bK_();
    }

    public final boolean c() {
        return this.b.c();
    }

    public final void b_(Object obj) {
        this.a.b_(bbmf.a(obj));
    }

    public final void a(Throwable th) {
        this.a.b_(bbmf.a(th));
        this.a.a();
    }

    public final void a() {
        this.a.b_(bbmf.b);
        this.a.a();
    }
}
