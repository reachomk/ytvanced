package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: p */
final class p {
    public final Map a = new HashMap();
    public final Map b;

    p(Map map) {
        this.b = map;
        for (Entry entry : map.entrySet()) {
            aa aaVar = (aa) entry.getValue();
            List list = (List) this.a.get(aaVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(aaVar, list);
            }
            list.add(entry.getKey());
        }
    }

    public static void a(List list, af afVar, aa aaVar, Object obj) {
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    s sVar = (s) list.get(size);
                    try {
                        int i = sVar.a;
                        if (i == 0) {
                            sVar.b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            sVar.b.invoke(obj, new Object[]{afVar});
                        } else if (i == 2) {
                            sVar.b.invoke(obj, new Object[]{afVar, aaVar});
                        }
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                return;
            }
        }
    }
}
