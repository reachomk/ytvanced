package defpackage;

/* renamed from: acnm */
final /* synthetic */ class acnm implements Runnable {
    private final acnc a;
    private final int b;

    acnm(acnc acnc, int i) {
        this.a = acnc;
        this.b = i;
    }

    public final void run() {
        acnc acnc = this.a;
        int i = this.b;
        if (acnc.bb) {
            acnc.d(i - 1);
        }
    }
}
