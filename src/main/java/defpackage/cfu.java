package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cfu */
public final class cfu {
    private final List a = new ArrayList();
    private final Map b = new HashMap();

    public final synchronized void a(List list) {
        ArrayList arrayList = new ArrayList(this.a);
        this.a.clear();
        this.a.addAll(list);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<cft> list = (List) this.b.get(str);
            if (list != null) {
                for (cft cft : list) {
                    if (cft.a(cls, cls2)) {
                        arrayList.add(cft.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<cft> list = (List) this.b.get(str);
            if (list != null) {
                for (cft cft : list) {
                    if (cft.a(cls, cls2) && !arrayList.contains(cft.a)) {
                        arrayList.add(cft.a);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void a(String str, bsp bsp, Class cls, Class cls2) {
        a(str).add(new cft(cls, cls2, bsp));
    }

    public final synchronized void b(String str, bsp bsp, Class cls, Class cls2) {
        a(str).add(0, new cft(cls, cls2, bsp));
    }

    private final synchronized List a(String str) {
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        List list = (List) this.b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.b.put(str, arrayList);
        return arrayList;
    }
}
