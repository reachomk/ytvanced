package defpackage;

/* renamed from: bbwp */
final class bbwp implements bbmr {
    private final bbmr a;
    private final /* synthetic */ bbwq b;

    bbwp(bbwq bbwq, bbmr bbmr) {
        this.b = bbwq;
        this.a = bbmr;
    }

    public final void a(bbnc bbnc) {
        this.a.a(bbnc);
    }

    public final void d_(Object obj) {
        try {
            this.b.a.a(obj, null);
            this.a.d_(obj);
        } catch (Throwable th) {
            bbnm.a(th);
            this.a.a_(th);
        }
    }

    public final void a_(Throwable th) {
        try {
            this.b.a.a(null, th);
        } catch (Throwable th2) {
            bbnm.a(th2);
            th = new bbnf(th, th2);
        }
        this.a.a_(th);
    }
}
