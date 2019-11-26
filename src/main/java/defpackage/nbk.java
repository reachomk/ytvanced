package defpackage;

/* renamed from: nbk */
final /* synthetic */ class nbk implements Runnable {
    private final nbi a;
    private final boolean b;

    nbk(nbi nbi, boolean z) {
        this.a = nbi;
        this.b = z;
    }

    public final void run() {
        nbi nbi = this.a;
        nbi.a.a(this.b);
    }
}
