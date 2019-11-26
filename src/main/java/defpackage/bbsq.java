package defpackage;

/* renamed from: bbsq */
final class bbsq extends bbpl implements bbmd {
    public static final long serialVersionUID = 7603343402964826922L;
    private bbnc b;

    bbsq(bbmo bbmo) {
        super(bbmo);
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.b, bbnc)) {
            this.b = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void d_(Object obj) {
        b(obj);
    }

    public final void a_(Throwable th) {
        if ((get() & 54) != 0) {
            bbzf.a(th);
            return;
        }
        lazySet(2);
        this.a.a(th);
    }

    public final void bL_() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.a.a();
        }
    }

    public final void bK_() {
        super.bK_();
        this.b.bK_();
    }
}
