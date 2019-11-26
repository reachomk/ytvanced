package defpackage;

/* renamed from: mxe */
final /* synthetic */ class mxe implements Runnable {
    private final mxd a;
    private final int b;
    private final int c;

    mxe(mxd mxd, int i, int i2) {
        this.a = mxd;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        mxd mxd = this.a;
        mxd.a.a(this.b, this.c);
    }
}
