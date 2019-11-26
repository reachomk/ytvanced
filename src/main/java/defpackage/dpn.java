package defpackage;

/* renamed from: dpn */
final class dpn implements Runnable {
    private final /* synthetic */ xci a;
    private final /* synthetic */ dtg b;
    private final /* synthetic */ dos c;

    dpn(dos dos, xci xci, dtg dtg) {
        this.c = dos;
        this.a = xci;
        this.b = dtg;
    }

    public final void run() {
        this.a.d(new eff());
        this.c.O.get();
        if (((zzf) this.c.ah.get()).o().i) {
            int i;
            dsf dsf = (dsf) this.c.ak.get();
            dsf.c.block();
            synchronized (dsf.b) {
                i = dsf.d;
            }
            if (i == 2) {
                ((haf) this.c.S.get()).e();
            }
        }
        aalk aalk = (aalk) this.c.P.get();
        xvw.a(aalk.b);
        aalk.e.get();
        aalk.c.get();
        ((aamv) aalk.d.get()).a();
        gze g = this.b.g();
        g.b.get();
        g.a.get();
        this.c.Q.get();
        ((afpd) this.c.R.get()).a();
        this.a.d(new efg());
    }
}
