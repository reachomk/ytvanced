package defpackage;

/* renamed from: mxy */
final /* synthetic */ class mxy implements Runnable {
    private final mxn a;
    private final boolean b;

    mxy(mxn mxn, boolean z) {
        this.a = mxn;
        this.b = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.c.g(this.b);
    }
}
