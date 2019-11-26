package defpackage;

/* renamed from: myj */
final /* synthetic */ class myj implements Runnable {
    private final mxn a;
    private final boolean b;

    myj(mxn mxn, boolean z) {
        this.a = mxn;
        this.b = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.h_(this.b);
    }
}
