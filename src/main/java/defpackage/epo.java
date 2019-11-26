package defpackage;

/* renamed from: epo */
public final class epo {
    public static void a(aknh aknh, aknh aknh2, aknh aknh3, zyw zyw) {
        if (aknh instanceof akpk) {
            akpk akpk = (akpk) aknh;
            apxn a = zyw.a();
            boolean z = true;
            if (!(a == null || (a.a & 16) == 0)) {
                aulu aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if ((aulu.k & 256) != 0) {
                    aulu aulu2 = a.e;
                    if (aulu2 == null) {
                        aulu2 = aulu.bw;
                    }
                    z = aulu2.bs;
                }
            }
            if (akpk.isEmpty() && !aknh2.isEmpty()) {
                Object c = aknh2.c(0);
                if (!((c instanceof apaj) || (c instanceof ajsg) || (c instanceof auah) || (c instanceof aptr) || (c instanceof aynn) || (c instanceof aynd) || (c instanceof ayxb) || (c instanceof ajst) || (c instanceof ajsn) || (c instanceof arut) || (c instanceof ajzj) || (c instanceof ajry) || (c instanceof argn) || (c instanceof axcs) || (c instanceof axsh) || (c instanceof axsr) || (c instanceof ajwc) || (c instanceof auwl) || (c instanceof aqco) || (((c instanceof akda) && !z) || (c instanceof aknq) || (c instanceof aptw) || fod.a(c)))) {
                    akpk.add(epq.a(8));
                }
            }
        }
        if (aknh3 != null && !aknh2.isEmpty()) {
            Object c2 = aknh2.c(aknh2.d() - 1);
            if ((c2 instanceof ajzo) || (c2 instanceof ajzl)) {
                akpk akpk2;
                if (aknh3 instanceof akpk) {
                    akpk2 = (akpk) aknh3;
                } else if (aknh3 instanceof akoh) {
                    akoh akoh = (akoh) aknh3;
                    aknh = new akpk();
                    akoh.a(aknh);
                    akpk2 = aknh;
                } else {
                    akpk2 = null;
                }
                if (akpk2 != null) {
                    akpk2.add(epq.a(16));
                }
            }
        }
    }
}
