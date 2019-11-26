package defpackage;

/* renamed from: acnv */
final /* synthetic */ class acnv implements acav {
    private final acnc a;
    private final int b;

    acnv(acnc acnc, int i) {
        this.a = acnc;
        this.b = i;
    }

    public final void a(int i) {
        acnc acnc = this.a;
        int i2 = this.b;
        if (i2 <= 0) {
            acnc.ag.e(acnc.aP);
            acnc.aa.a();
            return;
        }
        acnc.ai.postDelayed(new acnm(acnc, i2), 500);
    }
}
