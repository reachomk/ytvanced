package defpackage;

/* renamed from: acnn */
final /* synthetic */ class acnn implements acau {
    private final acnc a;
    private final boolean b;

    acnn(acnc acnc, boolean z) {
        this.a = acnc;
        this.b = z;
    }

    public final void a(int i) {
        acnc acnc = this.a;
        boolean z = this.b;
        if (!(i == 0 || i == 2)) {
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("Error stopping capture: ");
            stringBuilder.append(i);
            xtl.c(stringBuilder.toString());
        }
        acnc.aj.b(new acns(acnc, z));
    }
}
