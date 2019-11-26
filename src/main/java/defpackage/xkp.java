package defpackage;

/* renamed from: xkp */
final /* synthetic */ class xkp implements Runnable {
    private final xkq a;
    private final anko b;

    xkp(xkq xkq, anko anko) {
        this.a = xkq;
        this.b = anko;
    }

    public final void run() {
        xkq xkq = this.a;
        if (this.b.isCancelled() && xkq.a.get() != null) {
            ((bckx) xkq.a.get()).c();
        }
    }
}
