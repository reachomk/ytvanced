package defpackage;

/* renamed from: ndu */
final /* synthetic */ class ndu implements Runnable {
    private final ndp a;
    private final boolean b;

    ndu(ndp ndp, boolean z) {
        this.a = ndp;
        this.b = z;
    }

    public final void run() {
        ndp ndp = this.a;
        ndp.a.a.h.l_(this.b);
    }
}
