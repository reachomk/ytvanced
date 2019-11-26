package defpackage;

/* renamed from: bbl */
final class bbl implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ bbm b;

    bbl(bbm bbm, int i) {
        this.b = bbm;
        this.a = i;
    }

    public final void run() {
        bbs bbs = this.b.e.c.k;
        if (bbs != null) {
            bbs.a(this.a);
        }
    }
}
