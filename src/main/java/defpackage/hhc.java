package defpackage;

/* renamed from: hhc */
final /* synthetic */ class hhc implements Runnable {
    private final hhb a;

    hhc(hhb hhb) {
        this.a = hhb;
    }

    public final void run() {
        hhb hhb = this.a;
        if (hhb.b.e()) {
            ((hpr) hhb.a.get()).a(hpr.b);
        }
        if (!hhb.c.b()) {
            hhb.c();
        }
    }
}
