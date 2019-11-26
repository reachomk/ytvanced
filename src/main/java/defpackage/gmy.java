package defpackage;

/* renamed from: gmy */
final /* synthetic */ class gmy implements Runnable {
    private final gmp a;
    private final int b;
    private final ajzq c;
    private final apxu d;

    gmy(gmp gmp, int i, ajzq ajzq, apxu apxu) {
        this.a = gmp;
        this.b = i;
        this.c = ajzq;
        this.d = apxu;
    }

    public final void run() {
        gmp gmp = this.a;
        int i = this.b;
        ajzq ajzq = this.c;
        apxu apxu = this.d;
        apxu apxu2;
        if (i == 0) {
            apxu2 = ajzq.c;
            if (apxu2 != null) {
                gmp.a(apxu2);
            }
        } else if (i == 1) {
            apxu2 = ajzq.d;
            if (apxu2 != null) {
                gmp.a(apxu2);
            }
        } else if (i == 2 || i == 3) {
            gmp.aa.a(apxu, ajzq);
        }
    }
}
