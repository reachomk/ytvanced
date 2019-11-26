package defpackage;

/* renamed from: gpr */
final /* synthetic */ class gpr implements esu {
    private final gpo a;
    private final axwa b;

    gpr(gpo gpo, axwa axwa) {
        this.a = gpo;
        this.b = axwa;
    }

    public final void a(boolean z, boolean z2) {
        gpo gpo = this.a;
        axwa axwa = this.b;
        gpo.a(z);
        gpq gpq = gpo.b;
        String a = gpq.a(axwa);
        if (a != null) {
            gps gps = (gps) gpq.a.get(a);
            if (gps != null && gps.a) {
                gps.b = z;
            }
        }
    }
}
