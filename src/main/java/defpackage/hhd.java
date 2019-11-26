package defpackage;

/* renamed from: hhd */
final /* synthetic */ class hhd implements Runnable {
    private final hhb a;

    hhd(hhb hhb) {
        this.a = hhb;
    }

    public final void run() {
        hhb hhb = this.a;
        if (hhb.b.e()) {
            ((hpr) hhb.a.get()).a(hpr.a);
        }
        if (!hhb.c.b()) {
            hhb.c();
        }
    }
}
