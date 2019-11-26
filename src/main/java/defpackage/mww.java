package defpackage;

/* renamed from: mww */
final /* synthetic */ class mww implements Runnable {
    private final mwo a;
    private final int b;

    mww(mwo mwo, int i) {
        this.a = mwo;
        this.b = i;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.b(this.b);
    }
}
