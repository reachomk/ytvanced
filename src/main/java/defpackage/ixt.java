package defpackage;

/* renamed from: ixt */
final /* synthetic */ class ixt implements Runnable {
    private final ixp a;

    ixt(ixp ixp) {
        this.a = ixp;
    }

    public final void run() {
        ixp ixp = this.a;
        bbio bbio = ixp.w;
        if (bbio != null) {
            ((bbig) bbio).a("Reset conversation", new bawb(bavx.c));
            ixp.w = null;
        }
    }
}
