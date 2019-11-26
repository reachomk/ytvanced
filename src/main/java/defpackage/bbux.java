package defpackage;

/* renamed from: bbux */
final class bbux implements bbmo, bbnc {
    private final bbmo a;
    private bbnc b;

    bbux(bbmo bbmo) {
        this.a = bbmo;
    }

    public final void b_(Object obj) {
    }

    public final void a(bbnc bbnc) {
        this.b = bbnc;
        this.a.a((bbnc) this);
    }

    public final void a(Throwable th) {
        this.a.a(th);
    }

    public final void a() {
        this.a.a();
    }

    public final void bK_() {
        this.b.bK_();
    }

    public final boolean c() {
        return this.b.c();
    }
}
