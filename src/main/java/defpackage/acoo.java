package defpackage;

/* renamed from: acoo */
final /* synthetic */ class acoo implements Runnable {
    private final acol a;
    private final int b;

    acoo(acol acol, int i) {
        this.a = acol;
        this.b = i;
    }

    public final void run() {
        acol acol = this.a;
        int i = this.b;
        acnc acnc = acol.a;
        if (acnc.bb) {
            acnc.g(i - 1);
        }
    }
}
