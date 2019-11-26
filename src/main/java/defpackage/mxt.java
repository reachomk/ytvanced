package defpackage;

/* renamed from: mxt */
final /* synthetic */ class mxt implements Runnable {
    private final mxn a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;

    mxt(mxn mxn, long j, long j2, long j3, long j4) {
        this.a = mxn;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.a(this.b, this.c, this.d, this.e);
    }
}
