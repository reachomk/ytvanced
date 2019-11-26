package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: bcfh */
final class bcfh {
    static Map a(Map map, Set set) {
        if (map == null) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            Object obj = (String) entry.getKey();
            Object obj2 = (String) entry.getValue();
            bcgg.a(obj, (Object) "additional parameter keys cannot be null");
            bcgg.a(obj2, (Object) "additional parameter values cannot be null");
            Object[] objArr = new Object[]{obj};
            if ((set.contains(obj) ^ 1) != 0) {
                linkedHashMap.put(obj, obj2);
            } else {
                throw new IllegalArgumentException(String.format("Parameter %s is directly supported via the authorization request builder, use the builder method instead", objArr));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
