package defpackage;

/* renamed from: dtp */
final class dtp implements Runnable {
    private final /* synthetic */ dtl a;

    dtp(dtl dtl) {
        this.a = dtl;
    }

    public final void run() {
        long b = ((xsc) this.a.c.get()).b();
        ((vmr) this.a.d.get()).a();
        xci xci = (xci) this.a.e.get();
        xci.d(new vpm(b));
        xci.d(new vpn());
    }
}
