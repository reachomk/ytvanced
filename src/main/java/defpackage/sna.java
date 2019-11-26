package defpackage;

/* renamed from: sna */
public final class sna {
    public static final bdhc a = new bdhc();
    private static final sol b = snc.a;

    static void a(cmg cmg, cri cri, sns sns, bbmz bbmz, swp swp, bbmi bbmi, swk swk, sxd sxd, boolean z, boolean z2, boolean z3) {
        bbnc soi = new soi(sxd, sns, swk, swp, bbmz, z, z3);
        cri.a = soi;
        cmg cmg2 = cmg;
        bbmi bbmi2 = bbmi;
        sna.a(soi, cmg, bbmi, sxd, z2);
        bbmz bbmz2 = bbmz;
        bbmz.a(soi);
    }

    static void a(cri cri) {
        cri.a = Integer.valueOf(((Integer) cri.a).intValue() + 1);
    }

    static cma a(cmg cmg, soi soi, bbmz bbmz, bbmi bbmi, syc syc, sxd sxd, boolean z) {
        if (soi.a != bbmi) {
            soi.bK_();
        }
        if (soi.c()) {
            sna.a(soi, cmg, bbmi, sxd, z);
            bbmz.a((bbnc) soi);
        } else {
            soi.a(cmg);
        }
        cma a = soi.a();
        if (a == null) {
            syc.a(true);
            return (cza) cza.a(cmg).c();
        }
        syc.a(false);
        return a.g();
    }

    static void a(cmg cmg, soi soi, bbmz bbmz, bbmi bbmi, sxd sxd, boolean z, sly sly) {
        if (soi.c()) {
            sna.a(soi, cmg, bbmi, sxd, z);
            bbmz.a((bbnc) soi);
            if (!sly.c || soi.b()) {
                b.a(cmg);
            }
            return;
        }
        soi.a(cmg);
    }

    static void a(soi soi, bbmz bbmz) {
        if (!soi.c()) {
            bbmz.b(soi);
            soi.bK_();
        }
    }

    static void a(cmg cmg, sly sly) {
        if (sly.a) {
            cma.a("subscription", new snb(sly.b), cmg.h);
        }
    }

    private static void a(soi soi, cmg cmg, bbmi bbmi, sxd sxd, boolean z) {
        soi.a(bbmi, bbmi.d(new smz(sxd, z)), cmg, b);
        soi.e();
    }

    static {
        a.a = new bdhw();
        a.a.setExtension(bdgw.a, new bdgw());
    }
}
