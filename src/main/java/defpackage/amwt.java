package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: amwt */
final class amwt {
    public static Collection a(Collection collection, Object obj) {
        return new amxc(collection, obj);
    }

    static Set a(Set set, Object obj) {
        return new amxh(set, obj);
    }

    public static SortedSet a(SortedSet sortedSet, Object obj) {
        return new amxk(sortedSet, obj);
    }

    public static List a(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return new amxi(list, obj);
        }
        return new amxb(list, obj);
    }

    public static Collection b(Collection collection, Object obj) {
        if (collection instanceof SortedSet) {
            return amwt.a((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return amwt.a((Set) collection, obj);
        }
        if (collection instanceof List) {
            return amwt.a((List) collection, obj);
        }
        return amwt.a(collection, obj);
    }
}
