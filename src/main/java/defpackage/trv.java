package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: trv */
public abstract class trv {
    private static final trv a = new trr(null, Collections.emptyList());

    public abstract trs a();

    public abstract List b();

    public static trv a(trs trs, List list) {
        if (list == null) {
            throw new NullPointerException("Children iterable is null.");
        } else if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (((trv) arrayList.get(i)) != null) {
                    i = i2;
                } else {
                    throw new NullPointerException("null VeTreeNode child in children iterable.");
                }
            }
            return new trr(trs, arrayList);
        } else if (trs != null) {
            return new trr(trs, Collections.emptyList());
        } else {
            return a;
        }
    }
}
