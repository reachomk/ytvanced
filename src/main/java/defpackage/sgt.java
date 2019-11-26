package defpackage;

/* renamed from: sgt */
final /* synthetic */ class sgt implements Runnable {
    private final sgr a;

    sgt(sgr sgr) {
        this.a = sgr;
    }

    public final void run() {
        sgr sgr = this.a;
        sgu sgu = sgr.b;
        if (sgu != null) {
            sgu.a(sgr.b());
        }
    }
}
