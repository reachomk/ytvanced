package defpackage;

/* renamed from: fhd */
final /* synthetic */ class fhd implements Runnable {
    private final fhb a;
    private final int b;
    private final fhh c;

    fhd(fhb fhb, int i, fhh fhh) {
        this.a = fhb;
        this.b = i;
        this.c = fhh;
    }

    public final void run() {
        fhb fhb = this.a;
        int i = this.b;
        fhh fhh = this.c;
        if (fhb.b(i, fhh)) {
            fhb.a(i, fhh);
        }
    }
}
