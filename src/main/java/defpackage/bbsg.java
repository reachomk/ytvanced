package defpackage;

/* renamed from: bbsg */
final class bbsg implements bbmd, bbnc {
    private final bbmd a;
    private final bbny b;
    private bbnc c;

    bbsg(bbmd bbmd, bbny bbny) {
        this.a = bbmd;
        this.b = bbny;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.c, bbnc)) {
            this.c = bbnc;
            this.a.a(this);
        }
    }

    public final void d_(Object obj) {
        this.a.d_(obj);
    }

    public final void a_(Throwable th) {
        try {
            if (this.b.a(th)) {
                this.a.bL_();
            } else {
                this.a.a_(th);
            }
        } catch (Throwable th2) {
            bbnm.a(th2);
            this.a.a_(new bbnf(th, th2));
        }
    }

    public final void bL_() {
        this.a.bL_();
    }

    public final void bK_() {
        this.c.bK_();
    }

    public final boolean c() {
        return this.c.c();
    }
}
