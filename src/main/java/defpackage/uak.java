package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: uak */
abstract class uak {
    public abstract anze a(anze anze, anze anze2);

    public abstract anze a(String str, Object obj);

    public abstract String a(anze anze);

    public final List a(List list, List list2) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (anze anze : list) {
            String a = a(anze);
            for (anze anze2 : list2) {
                if (a.equals(a(anze2))) {
                    break;
                }
            }
            anze anze22 = null;
            anze anze3 = a(anze3, anze22);
            if (anze3 != null) {
                arrayList.add(anze3);
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: final */
    public final List a(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                anze a = a((String) entry.getKey(), entry.getValue());
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* synthetic */ uak() {
    }
}
