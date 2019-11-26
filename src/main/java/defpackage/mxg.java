package defpackage;

/* renamed from: mxg */
final /* synthetic */ class mxg implements Runnable {
    private final mxd a;
    private final int b;

    mxg(mxd mxd, int i) {
        this.a = mxd;
        this.b = i;
    }

    public final void run() {
        mxd mxd = this.a;
        mxd.a.b(this.b);
    }
}
