package defpackage;

/* renamed from: bbrp */
final class bbrp implements bbmd, bbnc {
    private final bbmd a;
    private final bbny b;
    private bbnc c;

    bbrp(bbmd bbmd, bbny bbny) {
        this.a = bbmd;
        this.b = bbny;
    }

    public final void bK_() {
        bbnc bbnc = this.c;
        this.c = bbnz.a;
        bbnc.bK_();
    }

    public final boolean c() {
        return this.c.c();
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.c, bbnc)) {
            this.c = bbnc;
            this.a.a(this);
        }
    }

    public final void d_(Object obj) {
        try {
            if (this.b.a(obj)) {
                this.a.d_(obj);
            } else {
                this.a.bL_();
            }
        } catch (Throwable th) {
            bbnm.a(th);
            this.a.a_(th);
        }
    }

    public final void a_(Throwable th) {
        this.a.a_(th);
    }

    public final void bL_() {
        this.a.bL_();
    }
}
