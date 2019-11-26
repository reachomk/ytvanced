package defpackage;

/* renamed from: fhf */
final /* synthetic */ class fhf implements Runnable {
    private final fhb a;
    private final int b;
    private final fhh c;

    fhf(fhb fhb, int i, fhh fhh) {
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
