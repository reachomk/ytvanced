package defpackage;

/* renamed from: mjz */
final /* synthetic */ class mjz implements fjh {
    private final mjw a;

    mjz(mjw mjw) {
        this.a = mjw;
    }

    public final void a(fja fja, fiw fiw) {
        mjw mjw = this.a;
        avjh avjh = (avjh) avjf.h.createBuilder();
        Object obj = null;
        if (!((mjw.i & 8) != 0 || fja == null || fja.t() == null || fja.t().d() == null)) {
            avjh.a(fja.t().d());
            obj = 1;
        }
        int i = mjw.i & -9;
        mjw.i = i;
        if ((i & 4) != 0) {
            avjh.a(acwc.MOBILE_BACK_BUTTON.dU);
        } else if (obj == null) {
            return;
        }
        fiw.a((avjf) ((anxl) avjh.build()));
    }
}
