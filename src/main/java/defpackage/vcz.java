package defpackage;

/* renamed from: vcz */
final /* synthetic */ class vcz implements bcvk {
    private final vcw a;

    vcz(vcw vcw) {
        this.a = vcw;
    }

    public final void a(Object obj) {
        vcw vcw = this.a;
        ahkn ahkn = (ahkn) obj;
        xak.a();
        int ordinal = ahkn.a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 7 && ordinal == 8) {
                vcw.f = true;
                aakj aakj = ahkn.b;
                if (vcw.d == null) {
                    aaga a = aakj != null ? vmv.a(aakj) : null;
                    vcw.a();
                    vcw.e = a;
                    vcw.a(vcw.a(aakj));
                    vcw.f = true;
                    vdb vdb = vcw.d;
                    if (vdb != null) {
                        vdb.a();
                    }
                }
            }
            return;
        }
        vcw.a();
    }
}
