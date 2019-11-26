package defpackage;

/* renamed from: gws */
final /* synthetic */ class gws implements Runnable {
    private final gwq a;

    gws(gwq gwq) {
        this.a = gwq;
    }

    public final void run() {
        gwq gwq = this.a;
        gwq.ag = true;
        gwq.W();
    }
}
