package defpackage;

import java.util.List;

/* renamed from: ipo */
public final class ipo {
    public static ayfq a(List list) {
        return (ayfq) ipo.a(list, ipv.a);
    }

    public static ayfo b(List list) {
        return (ayfo) ipo.a(list, ipu.a);
    }

    public static Object a(Object[] objArr, ipy ipy) {
        if (objArr != null) {
            for (Object obj : objArr) {
                Object obj2 = obj2 != null ? ipy.a(obj2) : null;
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return null;
    }

    public static Object a(List list, ipy ipy) {
        if (list != null) {
            for (Object next : list) {
                Object next2;
                if (next2 != null) {
                    next2 = ipy.a(next2);
                    continue;
                } else {
                    next2 = null;
                    continue;
                }
                if (next2 != null) {
                    return next2;
                }
            }
        }
        return null;
    }
}
