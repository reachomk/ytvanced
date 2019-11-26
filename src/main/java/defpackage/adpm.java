package defpackage;

/* renamed from: adpm */
final /* synthetic */ class adpm implements bcvk {
    private final adpg a;

    adpm(adpg adpg) {
        this.a = adpg;
    }

    public final void a(Object obj) {
        adpg adpg = this.a;
        aajq[] aajqArr = ((aetv) obj).e;
        boolean z = true;
        boolean z2 = false;
        if (aajqArr != null) {
            boolean z3 = false;
            for (aajq aajq : aajqArr) {
                int i = aajq.a;
                if (i >= 720) {
                    z2 = true;
                    break;
                }
                if (i >= 480) {
                    z3 = true;
                }
            }
            z = z3;
        } else {
            z = false;
        }
        adit s = adpg.a.k.s();
        s.b(z2);
        s.c(z);
        s.a(adpg.a.i.a());
        adpg.a.l.e_(s.a());
    }
}
