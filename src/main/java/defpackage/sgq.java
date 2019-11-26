package defpackage;

/* renamed from: sgq */
final /* synthetic */ class sgq implements Runnable {
    private final sgr a;

    sgq(sgr sgr) {
        this.a = sgr;
    }

    public final void run() {
        sgr sgr = this.a;
        sgu sgu = sgr.b;
        if (sgu != null) {
            sgu.a(sgr.a());
        }
    }
}
