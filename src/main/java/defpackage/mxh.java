package defpackage;

/* renamed from: mxh */
final /* synthetic */ class mxh implements Runnable {
    private final mxd a;
    private final int b;

    mxh(mxd mxd, int i) {
        this.a = mxd;
        this.b = i;
    }

    public final void run() {
        mxd mxd = this.a;
        mxd.a.a(this.b);
    }
}
