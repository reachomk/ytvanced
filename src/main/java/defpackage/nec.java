package defpackage;

/* renamed from: nec */
final /* synthetic */ class nec implements Runnable {
    private final ndy a;

    nec(ndy ndy) {
        this.a = ndy;
    }

    public final void run() {
        ndy ndy = this.a;
        ndy.a.t = false;
        ndy.l();
    }
}
