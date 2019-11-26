package defpackage;

/* renamed from: ezh */
public final class ezh {
    public static String a(aygk aygk) {
        if (!(aygk == null || (aygk.a & 4) == 0)) {
            aodx aodx = aygk.d;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) != 0) {
                aodx aodx2 = aygk.d;
                if (aodx2 == null) {
                    aodx2 = aodx.c;
                }
                aodv aodv = aodx2.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                return aodv.b;
            }
        }
        return null;
    }
}
