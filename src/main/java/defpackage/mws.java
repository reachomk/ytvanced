package defpackage;

/* renamed from: mws */
final /* synthetic */ class mws implements Runnable {
    private final mwo a;
    private final boolean b;

    mws(mwo mwo, boolean z) {
        this.a = mwo;
        this.b = z;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.e(this.b);
    }
}
