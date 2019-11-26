package defpackage;

/* renamed from: fhg */
final /* synthetic */ class fhg implements Runnable {
    private final fhb a;
    private final int b;
    private final fhh c;

    fhg(fhb fhb, int i, fhh fhh) {
        this.a = fhb;
        this.b = i;
        this.c = fhh;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
