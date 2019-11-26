package defpackage;

/* renamed from: mwy */
final /* synthetic */ class mwy implements Runnable {
    private final mwo a;
    private final boolean b;

    mwy(mwo mwo, boolean z) {
        this.a = mwo;
        this.b = z;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.c(this.b);
    }
}
