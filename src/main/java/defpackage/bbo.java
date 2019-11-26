package defpackage;

/* renamed from: bbo */
final class bbo implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ bbm b;

    bbo(bbm bbm, int i) {
        this.b = bbm;
        this.a = i;
    }

    public final void run() {
        bbs bbs = this.b.e.c.k;
        if (bbs != null) {
            bbs.b(this.a);
        }
    }
}
