package defpackage;

/* renamed from: bbrn */
final class bbrn implements bbmd, bbnc {
    private final bbmd a;
    private final bbns b;
    private bbnc c;

    bbrn(bbmd bbmd, bbns bbns) {
        this.a = bbmd;
        this.b = bbns;
    }

    public final void bK_() {
        this.c.bK_();
        this.c = bbnz.a;
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
        this.c = bbnz.a;
        try {
            this.b.a(obj, null);
            this.a.d_(obj);
        } catch (Throwable th) {
            bbnm.a(th);
            this.a.a_(th);
        }
    }

    public final void a_(Throwable th) {
        this.c = bbnz.a;
        try {
            this.b.a(null, th);
        } catch (Throwable th2) {
            bbnm.a(th2);
            th = new bbnf(th, th2);
        }
        this.a.a_(th);
    }

    public final void bL_() {
        this.c = bbnz.a;
        try {
            this.b.a(null, null);
            this.a.bL_();
        } catch (Throwable th) {
            bbnm.a(th);
            this.a.a_(th);
        }
    }
}
