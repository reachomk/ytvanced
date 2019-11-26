package defpackage;

/* renamed from: nbj */
final /* synthetic */ class nbj implements Runnable {
    private final nbd a;
    private final boolean b;

    nbj(nbd nbd, boolean z) {
        this.a = nbd;
        this.b = z;
    }

    public final void run() {
        nbd nbd = this.a;
        nbd.a.c(this.b);
    }
}
