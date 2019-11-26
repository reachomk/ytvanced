package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aktg */
public final class aktg {
    public aygk a;
    public arwh b = arwh.UNKNOWN;
    public String c;

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(1);
        for (auce auce : list) {
            if (auce.a == 128538449) {
                aucc aucc = (aucc) auce.b;
                int i = aucc.b;
                if (i == 2) {
                    aygk aygk = (aygk) aucc.c;
                    aktg aktg = new aktg();
                    aktg.a = aygk;
                    aktg.b = arwh.UNKNOWN;
                    aktg.c = aktm.a(aygk);
                    arrayList.add(aktg);
                } else if (i == 1) {
                    arwh a = arwh.a(((arwf) aucc.c).b);
                    if (a == null) {
                        a = arwh.UNKNOWN;
                    }
                    if (a != arwh.UNKNOWN) {
                        a = arwh.a((aucc.b == 1 ? (arwf) aucc.c : arwf.c).b);
                        if (a == null) {
                            a = arwh.UNKNOWN;
                        }
                        aodx aodx = aucc.d;
                        if (aodx == null) {
                            aodx = aodx.c;
                        }
                        aktg aktg2 = new aktg();
                        aktg2.a = null;
                        aktg2.b = a;
                        if (!(aodx == null || (aodx.a & 1) == 0)) {
                            aodv aodv = aodx.b;
                            if (aodv == null) {
                                aodv = aodv.c;
                            }
                            if ((aodv.a & 2) != 0) {
                                aodv aodv2 = aodx.b;
                                if (aodv2 == null) {
                                    aodv2 = aodv.c;
                                }
                                aktg2.c = aodv2.b;
                            }
                        }
                        arrayList.add(aktg2);
                    }
                }
            }
        }
        return arrayList;
    }
}
