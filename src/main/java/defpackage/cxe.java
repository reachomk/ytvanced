package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: cxe */
public final class cxe {
    public static cyj a(cyj cyj, Map map, cwj cwj) {
        cuj.a();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                cyj.a((String) entry.getKey(), entry.getValue());
            }
        }
        return cyj;
    }
}
