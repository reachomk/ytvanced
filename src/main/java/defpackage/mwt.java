package defpackage;

/* renamed from: mwt */
final /* synthetic */ class mwt implements Runnable {
    private final mwo a;
    private final CharSequence b;

    mwt(mwo mwo, CharSequence charSequence) {
        this.a = mwo;
        this.b = charSequence;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.b(this.b);
    }
}
