package defpackage;

/* renamed from: myl */
final /* synthetic */ class myl implements Runnable {
    private final mxn a;
    private final boolean b;

    myl(mxn mxn, boolean z) {
        this.a = mxn;
        this.b = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.d.b(this.b);
    }
}
