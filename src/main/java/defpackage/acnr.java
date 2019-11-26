package defpackage;

/* renamed from: acnr */
final /* synthetic */ class acnr implements acav {
    private final acnc a;
    private final int b;
    private final int c;

    acnr(acnc acnc, int i, int i2) {
        this.a = acnc;
        this.b = i;
        this.c = i2;
    }

    public final void a(int i) {
        nf nfVar = this.a;
        int i2 = this.b;
        int i3 = this.c;
        if (aclo.a(nfVar)) {
            if (i != 0) {
                if (i == 7 || i == 8 || i == 11 || i == 12) {
                    StringBuilder stringBuilder = new StringBuilder(70);
                    stringBuilder.append("Communication or timeout error while preparing SpeedTest - ");
                    stringBuilder.append(i);
                    xtl.d(stringBuilder.toString());
                    nfVar.e(i2);
                    return;
                }
                StringBuilder stringBuilder2 = new StringBuilder(38);
                stringBuilder2.append("Error preparing SpeedTest: ");
                stringBuilder2.append(i);
                xtl.c(stringBuilder2.toString());
                nfVar.af();
            } else if (nfVar.bb) {
                acaj a = nfVar.aj.a();
                if (a == null) {
                    xtl.c("No ABR controller for SpeedTest");
                    nfVar.af();
                    return;
                }
                a.a(false);
                acnu acnu = new acnu(nfVar, i2, a);
                double d = (double) i3;
                Double.isNaN(d);
                a.a(i3 + ((int) (d * 0.5d)), acnu);
            }
        }
    }
}
