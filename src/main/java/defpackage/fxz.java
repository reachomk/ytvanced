package defpackage;

/* renamed from: fxz */
final /* synthetic */ class fxz implements xar {
    private final fxx a;
    private final bblw b;

    fxz(fxx fxx, bblw bblw) {
        this.a = fxx;
        this.b = bblw;
    }

    public final void accept(Object obj) {
        fxx fxx = this.a;
        bblw bblw = this.b;
        ajrr ajrr = ((aaff) obj).a;
        if (ajrr != null) {
            arnm arnm = ajrr.frameworkUpdates;
            if (arnm != null) {
                amqp a = fxx.a(arnm);
                fxx.c(a);
                fxx.a(fxx.b(a));
            }
        }
        if (bblw != null) {
            bblw.a();
        }
    }
}
