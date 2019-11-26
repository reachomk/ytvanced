package defpackage;

/* renamed from: icb */
final /* synthetic */ class icb implements Runnable {
    private final icc a;

    icb(icc icc) {
        this.a = icc;
    }

    public final void run() {
        icc icc = this.a;
        icc.b.start();
        icc.c.postDelayed(icc.a, 2140);
    }
}
