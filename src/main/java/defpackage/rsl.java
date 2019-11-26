package defpackage;

/* renamed from: rsl */
public final class rsl extends pur {
    private final /* synthetic */ rql b;

    public rsl(rql rql, puh puh) {
        this.b = rql;
        super(puh);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp, ryl ryl) {
        rre rre = (rre) psp;
        rsk rsk = new rsk(ryl);
        try {
            Object obj = this.a;
            rqy rqy = rre.a;
            rqy.a.b();
            pzr.a(obj, (Object) "Invalid null listener key");
            synchronized (rqy.e) {
                rrb rrb = (rrb) rqy.e.remove(obj);
                if (rrb != null) {
                    rrb.a();
                    ((rqw) rqy.a.a()).a(rrj.a(rrb, rsk));
                }
            }
        } catch (RuntimeException e) {
            ryl.b(e);
        }
    }
}
