package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: baqf */
public final class baqf implements baqa {
    public static final baqa a = bapz.a(Collections.emptySet());
    private final List b;
    private final List c;

    public static baqi a(int i, int i2) {
        return new baqi(i, i2);
    }

    public final /* synthetic */ Object get() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        int i = size;
        for (size = 0; size < size2; size++) {
            Collection collection = (Collection) ((bcaa) this.c.get(size)).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(bapv.c(i));
        size2 = this.b.size();
        for (i = 0; i < size2; i++) {
            hashSet.add(baqd.a(((bcaa) this.b.get(i)).get()));
        }
        size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            for (Object a : (Collection) arrayList.get(i2)) {
                hashSet.add(baqd.a(a));
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* synthetic */ baqf(List list, List list2) {
        this.b = list;
        this.c = list2;
    }
}
