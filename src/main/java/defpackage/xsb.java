package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: xsb */
public final class xsb {
    public static void a(Map map, Object obj, Object obj2) {
        Set set = (Set) map.get(obj);
        if (set == null) {
            set = new HashSet();
            map.put(obj, set);
        }
        set.add(obj2);
    }

    public static boolean b(Map map, Object obj, Object obj2) {
        if (!map.containsKey(obj) || !((Set) map.get(obj)).contains(obj2)) {
            return false;
        }
        ((Set) map.get(obj)).remove(obj2);
        return true;
    }

    public static boolean a(Map map, Object obj) {
        if (!map.containsKey(obj)) {
            return false;
        }
        Set set = (Set) map.get(obj);
        if (set != null && !set.isEmpty()) {
            return false;
        }
        map.remove(obj);
        return true;
    }

    public static Set b(Map map, Object obj) {
        if (map.containsKey(obj)) {
            return (Set) map.get(obj);
        }
        return new HashSet();
    }

    public static Object c(Map map, Object obj) {
        return map != null ? map.get(obj) : null;
    }

    public static Object c(Map map, Object obj, Object obj2) {
        Object c = xsb.c(map, obj);
        return !obj2.getClass().isInstance(c) ? obj2 : c;
    }

    public static Object a(Map map, Object obj, Class cls) {
        Object c = xsb.c(map, obj);
        if (cls.isInstance(c)) {
            return cls.cast(c);
        }
        return null;
    }

    public static Object[] a(Object[] objArr, Object... objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        objArr = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArr, length, length2);
        return objArr;
    }
}
