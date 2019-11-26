package defpackage;

/* renamed from: ndr */
final /* synthetic */ class ndr implements Runnable {
    private final ndp a;
    private final int b;

    ndr(ndp ndp, int i) {
        this.a = ndp;
        this.b = i;
    }

    public final void run() {
        ndp ndp = this.a;
        ndp.a.a.h.a(this.b);
    }
}
