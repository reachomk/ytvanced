package defpackage;

/* renamed from: myg */
final /* synthetic */ class myg implements Runnable {
    private final mxn a;
    private final aajq[] b;
    private final int c;

    myg(mxn mxn, aajq[] aajqArr, int i) {
        this.a = mxn;
        this.b = aajqArr;
        this.c = i;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.c.a(this.b, this.c, false);
    }
}
