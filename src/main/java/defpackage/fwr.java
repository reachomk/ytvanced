package defpackage;

/* renamed from: fwr */
final /* synthetic */ class fwr implements Runnable {
    private final akos a;
    private final akov b;

    fwr(akos akos, akov akov) {
        this.a = akos;
        this.b = akov;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
