package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ahip */
public final class ahip implements acxz {
    public final /* synthetic */ Map a(Object obj) {
        ahkn ahkn = (ahkn) obj;
        HashMap hashMap = new HashMap();
        int ordinal = ahkn.a.ordinal();
        if (ordinal != 2 && ordinal != 7) {
            return null;
        }
        if (!ahkn.b.b().isEmpty()) {
            hashMap.put("docid", ahkn.b.b());
        }
        hashMap.put("cpn", ahkn.e);
        return hashMap;
    }
}
