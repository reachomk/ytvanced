package defpackage;

/* renamed from: bbrx */
final class bbrx implements bblv, bbnc {
    private final bbmd a;
    private bbnc b;

    bbrx(bbmd bbmd) {
        this.a = bbmd;
    }

    public final void bK_() {
        this.b.bK_();
        this.b = bbnz.a;
    }

    public final boolean c() {
        return this.b.c();
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.b, bbnc)) {
            this.b = bbnc;
            this.a.a(this);
        }
    }

    public final void bL_() {
        this.b = bbnz.a;
        this.a.bL_();
    }

    public final void a_(Throwable th) {
        this.b = bbnz.a;
        this.a.a_(th);
    }
}
