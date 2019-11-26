package defpackage;

/* renamed from: mxr */
final /* synthetic */ class mxr implements Runnable {
    private final mxn a;
    private final String b;
    private final boolean c;

    mxr(mxn mxn, String str, boolean z) {
        this.a = mxn;
        this.b = str;
        this.c = z;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.a(this.b, this.c);
    }
}
