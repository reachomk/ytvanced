package defpackage;

/* renamed from: nfr */
final /* synthetic */ class nfr implements Runnable {
    private final nfs a;
    private final int b;

    nfr(nfs nfs, int i) {
        this.a = nfs;
        this.b = i;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
