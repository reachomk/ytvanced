package defpackage;

/* renamed from: mxw */
final /* synthetic */ class mxw implements Runnable {
    private final mxn a;
    private final boolean b;

    mxw(mxn mxn, boolean z) {
        this.a = mxn;
        this.b = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.b.d(this.b);
    }
}
