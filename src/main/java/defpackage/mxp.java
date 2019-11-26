package defpackage;

/* renamed from: mxp */
final /* synthetic */ class mxp implements Runnable {
    private final mxn a;
    private final aicd b;

    mxp(mxn mxn, aicd aicd) {
        this.a = mxn;
        this.b = aicd;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.a(this.b);
    }
}
