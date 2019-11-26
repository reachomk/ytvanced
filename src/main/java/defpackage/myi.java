package defpackage;

/* renamed from: myi */
final /* synthetic */ class myi implements Runnable {
    private final mxn a;
    private final boolean b;

    myi(mxn mxn, boolean z) {
        this.a = mxn;
        this.b = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.c_(this.b);
    }
}
