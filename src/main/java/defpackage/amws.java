package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: amws */
public final class amws {
    public static HashSet a() {
        return new HashSet();
    }

    public static Set b() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    static int a(Set set) {
        int i = 0;
        for (Object next : set) {
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    static boolean a(Set set, Iterator it) {
        int i = 0;
        while (it.hasNext()) {
            i |= set.remove(it.next());
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    static boolean a(Set set, Collection collection) {
        amqw.a((Object) collection);
        if (collection instanceof amwb) {
            collection = ((amwb) collection).a();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return amws.a(set, collection.iterator());
        }
        return amve.a(set.iterator(), collection);
    }
}
