package defpackage;

/* renamed from: mya */
final /* synthetic */ class mya implements Runnable {
    private final mxn a;
    private final ajis b;

    mya(mxn mxn, ajis ajis) {
        this.a = mxn;
        this.b = ajis;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.b.a(this.b);
    }
}
