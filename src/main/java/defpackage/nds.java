package defpackage;

/* renamed from: nds */
final /* synthetic */ class nds implements Runnable {
    private final ndp a;
    private final boolean b;

    nds(ndp ndp, boolean z) {
        this.a = ndp;
        this.b = z;
    }

    public final void run() {
        ndp ndp = this.a;
        ndp.a.a.h.b(this.b);
    }
}
