package defpackage;

/* renamed from: myb */
final /* synthetic */ class myb implements Runnable {
    private final mxn a;
    private final boolean b;

    myb(mxn mxn, boolean z) {
        this.a = mxn;
        this.b = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.b.e(this.b);
    }
}
