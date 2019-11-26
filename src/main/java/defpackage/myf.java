package defpackage;

/* renamed from: myf */
final /* synthetic */ class myf implements Runnable {
    private final mxn a;
    private final String b;

    myf(mxn mxn, String str) {
        this.a = mxn;
        this.b = str;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.a(this.b);
    }
}
