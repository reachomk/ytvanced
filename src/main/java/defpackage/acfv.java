package defpackage;

/* renamed from: acfv */
final /* synthetic */ class acfv implements Runnable {
    private final acfh a;
    private final asiz b;
    private final avag c;

    acfv(acfh acfh, asiz asiz, avag avag) {
        this.a = acfh;
        this.b = asiz;
        this.c = avag;
    }

    public final void run() {
        acfh acfh = this.a;
        asiz asiz = this.b;
        acfh.a(asiz.c, this.c);
    }
}
