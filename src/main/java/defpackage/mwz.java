package defpackage;

/* renamed from: mwz */
final /* synthetic */ class mwz implements Runnable {
    private final mwo a;
    private final boolean b;

    mwz(mwo mwo, boolean z) {
        this.a = mwo;
        this.b = z;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.a(this.b);
    }
}
