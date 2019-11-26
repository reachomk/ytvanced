package defpackage;

/* renamed from: mye */
final /* synthetic */ class mye implements Runnable {
    private final mxn a;
    private final boolean b;

    mye(mxn mxn, boolean z) {
        this.a = mxn;
        this.b = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.e.f(this.b);
    }
}
