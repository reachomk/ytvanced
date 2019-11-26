package defpackage;

/* renamed from: bbuv */
final class bbuv implements bbmo, bbnc {
    private final bbmo a;
    private bbnc b;

    bbuv(bbmo bbmo) {
        this.a = bbmo;
    }

    public final void bK_() {
        this.b.bK_();
    }

    public final boolean c() {
        return this.b.c();
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.b, bbnc)) {
            this.b = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        this.a.b_(obj);
    }

    public final void a(Throwable th) {
        this.a.a(th);
    }

    public final void a() {
        this.a.a();
    }
}
