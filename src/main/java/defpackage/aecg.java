package defpackage;

/* renamed from: aecg */
final /* synthetic */ class aecg implements bcvk {
    private final aecd a;

    aecg(aecd aecd) {
        this.a = aecd;
    }

    public final void a(Object obj) {
        aecd aecd = this.a;
        ahkn ahkn = (ahkn) obj;
        aeca aeca = aecd.a;
        aeca.a(aeca.g.k().a(ahkn.a));
        aecd.a.b(6);
        int ordinal = ahkn.a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2 || ordinal == 8) {
                aecd.a.a(1);
                aakj aakj = ahkn.b;
                if (aakj != null) {
                    aecd.a.a(aakj.c());
                    return;
                }
            }
            return;
        }
        aecd.a.a(0);
        aecd.a.a(null);
    }
}
