package defpackage;

import java.nio.ByteBuffer;

/* renamed from: smw */
public final class smw {
    public static final baov a;
    private static final sol b = smy.a;

    static void a(cmg cmg, cri cri, swz swz, bbmz bbmz, swp swp, bbmi bbmi, swk swk, sxd sxd, boolean z, boolean z2, boolean z3) {
        bbnc soi = new soi(sxd, swz, swk, swp, bbmz, z, z3);
        cri.a = soi;
        cmg cmg2 = cmg;
        bbmi bbmi2 = bbmi;
        smw.a(soi, cmg, bbmi, sxd, z2);
        bbmz bbmz2 = bbmz;
        bbmz.a(soi);
    }

    static void a(cri cri) {
        cri.a = Integer.valueOf(((Integer) cri.a).intValue() + 1);
    }

    static cma a(cmg cmg, soi soi, bbmz bbmz, bbmi bbmi, sxd sxd, syc syc, boolean z) {
        if (soi.a != bbmi) {
            soi.bK_();
        }
        if (soi.c()) {
            smw.a(soi, cmg, bbmi, sxd, z);
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
            smw.a(soi, cmg, bbmi, sxd, z);
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
            cma.a("subscription", new smx(sly.b), cmg.h);
        }
    }

    private static void a(soi soi, cmg cmg, bbmi bbmi, sxd sxd, boolean z) {
        soi.a(bbmi, bbmi.d(new smv(sxd, z)), cmg, b);
        soi.e();
    }

    static {
        anqy anqy = new anqy();
        anqy anqy2 = new anqy();
        anqy2.b(1);
        anqy2.a(0, false);
        anqy2.c(anqy2.b());
        byte[] array = anqy2.c().array();
        int length = array.length;
        anqy.a(1, length, 1);
        ByteBuffer byteBuffer = anqy.a;
        int i = anqy.b - length;
        anqy.b = i;
        byteBuffer.position(i);
        anqy.a.put(array);
        int a = baoz.a(anqy, 158796327, anqy.a(), 1);
        anqy.b(4);
        anqy.b(3, 0);
        anqy.b(2, 0);
        anqy.b(1, 0);
        anqy.b(0, a);
        anqy.c(anqy.b());
        a = baov.a(anqy.c(), new baov());
    }
}
