package defpackage;

/* renamed from: bbgo */
final class bbgo implements Runnable {
    private final /* synthetic */ bbgp a;
    private final /* synthetic */ bbgl b;

    bbgo(bbgl bbgl, bbgp bbgp) {
        this.b = bbgl;
        this.a = bbgp;
    }

    public final void run() {
        this.b.b.c(this.a);
    }
}
