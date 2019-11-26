package defpackage;

/* renamed from: mwu */
final /* synthetic */ class mwu implements Runnable {
    private final mwo a;
    private final int b;

    mwu(mwo mwo, int i) {
        this.a = mwo;
        this.b = i;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.a(this.b);
    }
}
