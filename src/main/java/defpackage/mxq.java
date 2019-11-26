package defpackage;

/* renamed from: mxq */
final /* synthetic */ class mxq implements Runnable {
    private final mxn a;
    private final boolean b;

    mxq(mxn mxn, boolean z) {
        this.a = mxn;
        this.b = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.c(this.b);
    }
}
