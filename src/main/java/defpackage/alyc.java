package defpackage;

import java.util.List;

/* renamed from: alyc */
public final class alyc {
    public static atst a(List list, String str) {
        if (list.isEmpty()) {
            return alyc.a(str, null);
        }
        atss atss = (atss) atst.q.createBuilder();
        for (alya alya : list) {
            atss.a(alyc.b(alya.b, alya.c));
        }
        return (atst) ((anxl) atss.build());
    }

    public static atst a(String str, String str2) {
        atss atss = (atss) atst.q.createBuilder();
        atss.a(alyc.b(str, str2));
        return (atst) ((anxl) atss.build());
    }

    private static attd b(String str, String str2) {
        attc attc = (attc) attd.e.createBuilder();
        if (str2 != null) {
            attc.b(str2);
        }
        if (str != null) {
            attc.a(str);
        }
        return (attd) ((anxl) attc.build());
    }
}
