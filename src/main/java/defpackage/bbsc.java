package defpackage;

/* renamed from: bbsc */
final class bbsc implements bbmd, bbnc {
    private final bbmd a;
    private final bbnv b;
    private bbnc c;

    bbsc(bbmd bbmd, bbnv bbnv) {
        this.a = bbmd;
        this.b = bbnv;
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
            this.a.d_(bbow.a(this.b.a(obj), "The mapper returned a null item"));
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
