package defpackage;

/* renamed from: get */
final /* synthetic */ class get implements Runnable {
    private final geq a;
    private final ges b;

    get(geq geq, ges ges) {
        this.a = geq;
        this.b = ges;
    }

    public final void run() {
        geq geq = this.a;
        ges ges = this.b;
        if (!geq.c) {
            geq.b = true;
            ges.ad();
        }
    }
}
