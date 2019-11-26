package defpackage;

/* renamed from: rsi */
public final class rsi extends pul {
    private final /* synthetic */ rrh b;
    private final /* synthetic */ pue c;

    public rsi(pue pue, rrh rrh, pue pue2) {
        this.b = rrh;
        this.c = pue2;
        super(pue);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp, ryl ryl) {
        rre rre = (rre) psp;
        rqn rqn = new rqn(ryl);
        rrh rrh = this.b;
        pue pue = this.c;
        synchronized (rre.a) {
            rrb rrb;
            rqy rqy = rre.a;
            rqy.a.b();
            synchronized (rqy.e) {
                rrb rrb2 = (rrb) rqy.e.get(pue.b);
                if (rrb2 == null) {
                    rrb2 = new rrb(pue);
                }
                rrb = rrb2;
                rqy.e.put(pue.b, rrb);
            }
            rqw rqw = (rqw) rqy.a.a();
            rrb.asBinder();
            rqn.asBinder();
            rqw.a(new rrj(1, rrh, null, null, rrb, rqn));
        }
    }
}
