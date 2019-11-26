package defpackage;

/* renamed from: myc */
final /* synthetic */ class myc implements Runnable {
    private final mxn a;
    private final boolean b;

    myc(mxn mxn, boolean z) {
        this.a = mxn;
        this.b = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.d_(this.b);
    }
}
