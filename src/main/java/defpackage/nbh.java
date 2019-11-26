package defpackage;

/* renamed from: nbh */
final /* synthetic */ class nbh implements Runnable {
    private final nbd a;
    private final long b;

    nbh(nbd nbd, long j) {
        this.a = nbd;
        this.b = j;
    }

    public final void run() {
        nbd nbd = this.a;
        nbd.a.a(this.b);
    }
}
