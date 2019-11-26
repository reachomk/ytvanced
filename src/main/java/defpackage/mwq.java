package defpackage;

/* renamed from: mwq */
final /* synthetic */ class mwq implements Runnable {
    private final mwo a;
    private final boolean b;

    mwq(mwo mwo, boolean z) {
        this.a = mwo;
        this.b = z;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.d(this.b);
    }
}
