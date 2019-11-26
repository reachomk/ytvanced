package defpackage;

/* renamed from: ixq */
final /* synthetic */ class ixq implements Runnable {
    private final ixp a;

    ixq(ixp ixp) {
        this.a = ixp;
    }

    public final void run() {
        ixp ixp = this.a;
        bbio bbio = ixp.w;
        if (bbio != null) {
            bbio.a();
            ixp.w = null;
        }
    }
}
