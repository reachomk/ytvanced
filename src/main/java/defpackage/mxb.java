package defpackage;

/* renamed from: mxb */
final /* synthetic */ class mxb implements Runnable {
    private final mwo a;
    private final boolean b;

    mxb(mwo mwo, boolean z) {
        this.a = mwo;
        this.b = z;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.b(this.b);
    }
}
