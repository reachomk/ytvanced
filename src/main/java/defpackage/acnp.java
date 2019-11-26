package defpackage;

/* renamed from: acnp */
final /* synthetic */ class acnp implements acav {
    private final acnc a;
    private final acaj b;
    private final int c;

    acnp(acnc acnc, acaj acaj, int i) {
        this.a = acnc;
        this.b = acaj;
        this.c = i;
    }

    public final void a(int i) {
        nf nfVar = this.a;
        acaj acaj = this.b;
        int i2 = this.c;
        if (aclo.a(nfVar)) {
            StringBuilder stringBuilder;
            if (i == 0) {
                nfVar.bh = nfVar.am.b();
                nfVar.bi = acaj.a();
                nfVar.ai.postDelayed(nfVar.aq, 3000);
            } else if (i == 2 || i == 7 || i == 8) {
                stringBuilder = new StringBuilder(68);
                stringBuilder.append("Capture pipeline not configured properly for SpeedTest - ");
                stringBuilder.append(i);
                xtl.c(stringBuilder.toString());
                nfVar.e(i2);
            } else {
                stringBuilder = new StringBuilder(37);
                stringBuilder.append("Error starting SpeedTest: ");
                stringBuilder.append(i);
                xtl.c(stringBuilder.toString());
                nfVar.af();
            }
        }
    }
}
