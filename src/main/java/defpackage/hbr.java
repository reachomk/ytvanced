package defpackage;

/* renamed from: hbr */
final /* synthetic */ class hbr implements bcvk {
    private final hbm a;

    hbr(hbm hbm) {
        this.a = hbm;
    }

    public final void a(Object obj) {
        aphv aphv;
        hbm hbm = this.a;
        int i = hbm.f ^ 1;
        hbm.f = i;
        apxu apxu = null;
        if (i != 0) {
            aphv = hbm.e;
            if ((aphv.a & 512) != 0) {
                apxu = aphv.h;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
        }
        if (!hbm.f) {
            aphv = hbm.e;
            if ((aphv.a & 16384) != 0) {
                apxu = aphv.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
        }
        hbm.c.a(apxu, hbm.c());
    }
}
