package defpackage;

/* renamed from: rza */
final class rza implements Runnable {
    private final /* synthetic */ ryi a;
    private final /* synthetic */ rzb b;

    rza(rzb rzb, ryi ryi) {
        this.b = rzb;
        this.a = ryi;
    }

    public final void run() {
        synchronized (this.b.a) {
            ryg ryg = this.b.b;
            if (ryg != null) {
                ryg.a(this.a.d());
            }
        }
    }
}
