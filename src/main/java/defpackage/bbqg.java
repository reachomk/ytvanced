package defpackage;

/* renamed from: bbqg */
final class bbqg implements bblv, bbnc {
    private final bblv a;
    private bbnc b;

    bbqg(bblv bblv) {
        this.a = bblv;
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

    public final void a_(Throwable th) {
        this.a.a_(th);
    }

    public final void bL_() {
        this.a.bL_();
    }
}
