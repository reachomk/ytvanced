package defpackage;

/* renamed from: bbdj */
final class bbdj implements bazj {
    public final /* synthetic */ bbde a;

    public final bazq a(batz batz) {
        baud baud = this.a.q;
        if (this.a.v.get()) {
            return this.a.t;
        }
        if (baud == null) {
            this.a.h.execute(new bbdm(this));
            return this.a.t;
        }
        bazq a = bbby.a(baud.a(), ((bbfc) batz).a.a());
        if (a == null) {
            a = this.a.t;
        }
        return a;
    }

    public final bazo a(bauw bauw, barv barv, baum baum, basr basr) {
        amqw.b(this.a.M, (Object) "retry should be enabled");
        return new bbdl(this, bauw, baum, barv, basr);
    }

    /* synthetic */ bbdj(bbde bbde) {
        this.a = bbde;
    }
}
