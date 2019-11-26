package defpackage;

/* renamed from: mwv */
final /* synthetic */ class mwv implements Runnable {
    private final mwo a;
    private final CharSequence b;

    mwv(mwo mwo, CharSequence charSequence) {
        this.a = mwo;
        this.b = charSequence;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.a(this.b);
    }
}
