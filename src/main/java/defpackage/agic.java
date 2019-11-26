package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: agic */
final class agic {
    static Collection a(List list, List list2) {
        HashMap hashMap = new HashMap();
        for (agqp agqp : list) {
            hashMap.put(agqp.a(), agqp);
        }
        for (agqp a : list2) {
            hashMap.remove(a.a());
        }
        return hashMap.values();
    }
}
