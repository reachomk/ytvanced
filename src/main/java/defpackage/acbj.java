package defpackage;

/* renamed from: acbj */
final /* synthetic */ class acbj implements Runnable {
    private final acay a;
    private final acic b;

    acbj(acay acay, acic acic) {
        this.a = acay;
        this.b = acic;
    }

    public final void run() {
        acay acay = this.a;
        acic acic = this.b;
        achi achi = (achi) acay.j;
        if (achi != null && achi.f()) {
            achi.a(acic);
        }
    }
}
