package defpackage;

/* renamed from: wty */
final /* synthetic */ class wty implements Runnable {
    private final wtx a;
    private final wug b;

    wty(wtx wtx, wug wug) {
        this.a = wtx;
        this.b = wug;
    }

    public final void run() {
        this.a.b.removeView(this.b.a);
    }
}
