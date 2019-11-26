package defpackage;

/* renamed from: bbqr */
final class bbqr extends bbph implements bblv {
    private final bbmo a;
    private bbnc b;

    bbqr(bbmo bbmo) {
        this.a = bbmo;
    }

    public final int a(int i) {
        return i & 2;
    }

    public final boolean b() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object bI_() {
        return null;
    }

    public final void e() {
    }

    public final void bL_() {
        this.a.a();
    }

    public final void a_(Throwable th) {
        this.a.a(th);
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
}
