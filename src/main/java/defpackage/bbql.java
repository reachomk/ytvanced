package defpackage;

/* renamed from: bbql */
final class bbql implements bblv {
    private final bblv a;
    private final /* synthetic */ bbqm b;

    bbql(bbqm bbqm, bblv bblv) {
        this.b = bbqm;
        this.a = bblv;
    }

    public final void bL_() {
        this.a.bL_();
    }

    public final void a_(Throwable th) {
        try {
            if (this.b.a.a(th)) {
                this.a.bL_();
            } else {
                this.a.a_(th);
            }
        } catch (Throwable th2) {
            bbnm.a(th2);
            this.a.a_(new bbnf(th, th2));
        }
    }

    public final void a(bbnc bbnc) {
        this.a.a(bbnc);
    }
}
