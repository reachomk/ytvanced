package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: ixc */
final class ixc implements abnt {
    ixc() {
    }

    public final List a(List list, List list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        if (!z) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            abnv abnv = (abnv) arrayList.get(i);
            if (hashSet.add(abnv.a)) {
                arrayList2.add(abnv);
            }
        }
        return arrayList2;
    }
}
