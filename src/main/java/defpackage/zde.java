package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: zde */
public final class zde {
    public static amul a(aqpd aqpd) {
        if (aqpd.b.size() == 0) {
            return amul.g();
        }
        Collection arrayList = new ArrayList();
        for (aqov aqov : aqpd.b) {
            if ((aqov.a & 1) != 0) {
                Object obj = aqov.b;
                if (obj == null) {
                    obj = aqox.j;
                }
                arrayList.add(obj);
            }
        }
        return amul.a(arrayList);
    }

    public static amul b(aqpd aqpd) {
        if (aqpd.c.size() == 0) {
            return amul.g();
        }
        Collection arrayList = new ArrayList();
        for (aqpb aqpb : aqpd.c) {
            if ((aqpb.a & 1) != 0) {
                Object obj = aqpb.b;
                if (obj == null) {
                    obj = aqoz.t;
                }
                arrayList.add(obj);
            }
        }
        return amul.a(arrayList);
    }
}
