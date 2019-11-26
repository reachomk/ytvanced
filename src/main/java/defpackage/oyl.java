package defpackage;

/* renamed from: oyl */
final /* synthetic */ class oyl implements Runnable {
    private final oym a;
    private final oyj b;

    oyl(oym oym, oyj oyj) {
        this.a = oym;
        this.b = oyj;
    }

    public final void run() {
        oym oym = this.a;
        oyj oyj = this.b;
        if (!oym.c) {
            oyj.a(oym.b);
        }
    }
}
