package defpackage;

/* renamed from: afgo */
final class afgo implements Runnable {
    private final /* synthetic */ afgp a;

    afgo(afgp afgp) {
        this.a = afgp;
    }

    public final void run() {
        afgp afgp = this.a;
        if (afgp.k) {
            Runnable runnable = afgp.f;
            if (runnable != null && afgp.g != null) {
                runnable.run();
                this.a.g.postDelayed(this, 2000);
            }
        }
    }
}
