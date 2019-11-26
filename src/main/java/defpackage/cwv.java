package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cwv */
final class cwv {
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    cwv() {
    }

    public final cwv a() {
        cwv a = cwz.a();
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                a.a.put(str, new ArrayList((Collection) this.a.get(str)));
            }
            for (String str2 : this.b.keySet()) {
                a.b.put(str2, new ArrayList((Collection) this.b.get(str2)));
            }
        }
        return a;
    }

    public static void a(Map map, Map map2, String str) {
        List list = (List) map2.get(str);
        List list2 = (List) map.remove(str);
        if (!(list == null || list2 == null)) {
            list2.removeAll(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            map.put(str, list2);
        }
    }
}
