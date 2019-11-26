package defpackage;

/* renamed from: bbdn */
final class bbdn implements bbej {
    private final /* synthetic */ bbde a;

    public final void a() {
    }

    public final void a(bavx bavx) {
        amqw.b(this.a.v.get(), (Object) "Channel must have been shut down");
    }

    public final void a(boolean z) {
        bbde bbde = this.a;
        bbde.N.a(bbde.t, z);
    }

    public final void b() {
        amqw.b(this.a.v.get(), (Object) "Channel must have been shut down");
        bbde bbde = this.a;
        bbde.x = true;
        bbde.a(false);
        this.a.e();
        this.a.k();
    }

    /* synthetic */ bbdn(bbde bbde) {
        this.a = bbde;
    }
}
