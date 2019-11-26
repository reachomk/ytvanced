package defpackage;

/* renamed from: nbf */
final /* synthetic */ class nbf implements Runnable {
    private final nbd a;
    private final boolean b;

    nbf(nbd nbd, boolean z) {
        this.a = nbd;
        this.b = z;
    }

    public final void run() {
        nbd nbd = this.a;
        nbd.a.a(this.b);
    }
}
