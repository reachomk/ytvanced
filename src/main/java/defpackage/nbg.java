package defpackage;

/* renamed from: nbg */
final /* synthetic */ class nbg implements Runnable {
    private final nbd a;
    private final boolean b;

    nbg(nbd nbd, boolean z) {
        this.a = nbd;
        this.b = z;
    }

    public final void run() {
        nbd nbd = this.a;
        nbd.a.b(this.b);
    }
}
