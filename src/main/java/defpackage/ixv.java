package defpackage;

/* renamed from: ixv */
final /* synthetic */ class ixv implements Runnable {
    private final ixp a;
    private final int b;

    ixv(ixp ixp, int i) {
        this.a = ixp;
        this.b = i;
    }

    public final void run() {
        ixp ixp = this.a;
        ixp.d.a(this.b);
    }
}
