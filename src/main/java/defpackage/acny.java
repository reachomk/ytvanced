package defpackage;

/* renamed from: acny */
final /* synthetic */ class acny implements acav {
    private final acnc a;
    private final int b;
    private final boolean c;
    private final int d;

    acny(acnc acnc, int i, boolean z, int i2) {
        this.a = acnc;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    public final void a(int i) {
        acnc acnc = this.a;
        int i2 = this.b;
        boolean z = this.c;
        int i3 = this.d;
        if (i != 0) {
            StringBuilder stringBuilder;
            if (i != 7) {
                if (i != 8) {
                    if (!(i == 11 || i == 12)) {
                        stringBuilder = new StringBuilder(36);
                        stringBuilder.append("Error preparing capture: ");
                        stringBuilder.append(i);
                        xtl.c(stringBuilder.toString());
                        acnc.f(i);
                        return;
                    }
                } else if (i2 > 0) {
                    acnc.ai.postDelayed(new acnj(acnc, i2, z, i3), 500);
                    return;
                } else {
                    acnc.aa.c();
                    return;
                }
            }
            stringBuilder = new StringBuilder(68);
            stringBuilder.append("Communication or timeout error while preparing capture - ");
            stringBuilder.append(i);
            xtl.d(stringBuilder.toString());
            acnc.aa.c();
            return;
        }
        acnc.ag();
    }
}
