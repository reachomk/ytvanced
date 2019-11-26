package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;

/* renamed from: rhc */
final class rhc {
    public static final rhp a = rhc.a(false);
    public static final rhp b = rhc.a(true);
    public static final rhp c = new rhr();
    private static final Class d;

    public static void a(Class cls) {
        if (!reu.class.isAssignableFrom(cls)) {
            Class cls2 = d;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static void a(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Double) list.get(i)).doubleValue();
                    i3 += rdt.f();
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.a(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.a(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Float) list.get(i)).floatValue();
                    i3 += rdt.e();
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.a(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.a(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    public static void c(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += rdt.d(((Long) list.get(i)).longValue());
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.a(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void d(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += rdt.d(((Long) list.get(i)).longValue());
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.a(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void e(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += rdt.e(((Long) list.get(i)).longValue());
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.b(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void f(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Long) list.get(i)).longValue();
                    i3 += rdt.c();
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.c(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void g(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Long) list.get(i)).longValue();
                    i3 += rdt.d();
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.c(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void h(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += rdt.m(((Integer) list.get(i)).intValue());
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.a(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void i(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += rdt.n(((Integer) list.get(i)).intValue());
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.b(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void j(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += rdt.o(((Integer) list.get(i)).intValue());
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.c(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void k(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Integer) list.get(i)).intValue();
                    i3 += rdt.a();
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void l(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Integer) list.get(i)).intValue();
                    i3 += rdt.b();
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void m(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += rdt.m(((Integer) list.get(i)).intValue());
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.a(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.b(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, rik rik, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                rdz rdz = (rdz) rik;
                rdz.a.a(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Boolean) list.get(i)).booleanValue();
                    i3 += rdt.g();
                }
                rdz.a.b(i3);
                while (i2 < list.size()) {
                    rdz.a.a(((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void a(int i, List list, rik rik) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof rfs) {
                rfs rfs = (rfs) list;
                while (i2 < list.size()) {
                    Object b = rfs.b(i2);
                    if (b instanceof String) {
                        ((rdz) rik).a.a(i, (String) b);
                    } else {
                        ((rdz) rik).a.a(i, (rdg) b);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((rdz) rik).a.a(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void b(int i, List list, rik rik) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((rdz) rik).a.a(i, (rdg) list.get(i2));
            }
        }
    }

    public static void a(int i, List list, rik rik, rha rha) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((rdz) rik).a(i, list.get(i2), rha);
            }
        }
    }

    public static void b(int i, List list, rik rik, rha rha) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((rdz) rik).b(i, list.get(i2), rha);
            }
        }
    }

    static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i2 = 0;
            while (i < size) {
                i2 += rdt.d(rfw.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += rdt.d(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int a(int i, List list) {
        return list.size() != 0 ? rhc.a(list) + (list.size() * rdt.l(i)) : 0;
    }

    static int b(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i2 = 0;
            while (i < size) {
                i2 += rdt.d(rfw.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += rdt.d(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int b(int i, List list) {
        int size = list.size();
        return size != 0 ? rhc.b(list) + (size * rdt.l(i)) : 0;
    }

    static int c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i2 = 0;
            while (i < size) {
                i2 += rdt.e(rfw.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += rdt.e(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int c(int i, List list) {
        int size = list.size();
        return size != 0 ? rhc.c(list) + (size * rdt.l(i)) : 0;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i2 = 0;
            while (i < size) {
                i2 += rdt.m(rez.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += rdt.m(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int d(int i, List list) {
        int size = list.size();
        return size != 0 ? rhc.d(list) + (size * rdt.l(i)) : 0;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i2 = 0;
            while (i < size) {
                i2 += rdt.m(rez.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += rdt.m(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int e(int i, List list) {
        int size = list.size();
        return size != 0 ? rhc.e(list) + (size * rdt.l(i)) : 0;
    }

    static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i2 = 0;
            while (i < size) {
                i2 += rdt.n(rez.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += rdt.n(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int f(int i, List list) {
        int size = list.size();
        return size != 0 ? rhc.f(list) + (size * rdt.l(i)) : 0;
    }

    static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i2 = 0;
            while (i < size) {
                i2 += rdt.o(rez.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += rdt.o(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int g(int i, List list) {
        int size = list.size();
        return size != 0 ? rhc.g(list) + (size * rdt.l(i)) : 0;
    }

    static int h(List list) {
        return list.size() << 2;
    }

    static int h(int i, List list) {
        int size = list.size();
        return size != 0 ? size * rdt.e(i) : 0;
    }

    static int i(List list) {
        return list.size() << 3;
    }

    static int i(int i, List list) {
        int size = list.size();
        return size != 0 ? size * rdt.g(i) : 0;
    }

    static int j(List list) {
        return list.size();
    }

    static int j(int i, List list) {
        int size = list.size();
        return size != 0 ? size * rdt.k(i) : 0;
    }

    static int k(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = rdt.l(i) * size;
        Object b;
        int b2;
        if (list instanceof rfs) {
            rfs rfs = (rfs) list;
            while (i2 < size) {
                b = rfs.b(i2);
                if (b instanceof rdg) {
                    b2 = rdt.b((rdg) b);
                } else {
                    b2 = rdt.b((String) b);
                }
                i += b2;
                i2++;
            }
        } else {
            while (i2 < size) {
                b = list.get(i2);
                if (b instanceof rdg) {
                    b2 = rdt.b((rdg) b);
                } else {
                    b2 = rdt.b((String) b);
                }
                i += b2;
                i2++;
            }
        }
        return i;
    }

    static int a(int i, Object obj, rha rha) {
        if (obj instanceof rfq) {
            return rdt.a(i, (rfq) obj);
        }
        return rdt.l(i) + rdt.a((rgh) obj, rha);
    }

    static int a(int i, List list, rha rha) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = rdt.l(i) * size;
        while (i2 < size) {
            int a;
            Object obj = list.get(i2);
            if (obj instanceof rfq) {
                a = rdt.a((rfq) obj);
            } else {
                a = rdt.a((rgh) obj, rha);
            }
            i += a;
            i2++;
        }
        return i;
    }

    static int l(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        size *= rdt.l(i);
        while (i2 < list.size()) {
            size += rdt.b((rdg) list.get(i2));
            i2++;
        }
        return size;
    }

    static int b(int i, List list, rha rha) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        while (i2 < size) {
            i3 += rdt.b(i, (rgh) list.get(i2), rha);
            i2++;
        }
        return i3;
    }

    private static rhp a(boolean z) {
        Class cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (rhp) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void a(rgb rgb, Object obj, Object obj2, long j) {
        rhv.a(obj, j, rgb.a(rhv.f(obj, j), rhv.f(obj2, j)));
    }

    static void a(rei rei, Object obj, Object obj2) {
        rem a = rei.a(obj2);
        if (!a.a()) {
            rem b = rei.b(obj);
            for (int i = 0; i < a.a.b(); i++) {
                b.a(a.a.b(i));
            }
            for (Entry a2 : a.a.c()) {
                b.a(a2);
            }
        }
    }

    static void a(rhp rhp, Object obj, Object obj2) {
        rhp.a(obj, rhp.c(rhp.b(obj), rhp.b(obj2)));
    }

    static Object a(int i, List list, rfg rfg, Object obj, rhp rhp) {
        if (rfg != null) {
            int size;
            if (list instanceof RandomAccess) {
                size = list.size();
                Object obj2 = obj;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    if (rfg.a(intValue) == null) {
                        obj2 = rhc.a(i, intValue, obj2, rhp);
                    } else {
                        if (i3 != i2) {
                            list.set(i2, Integer.valueOf(intValue));
                        }
                        i2++;
                    }
                }
                if (i2 == size) {
                    obj = obj2;
                } else {
                    list.subList(i2, size).clear();
                    return obj2;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                size = ((Integer) it.next()).intValue();
                if (rfg.a(size) == null) {
                    obj = rhc.a(i, size, obj, rhp);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object a(int i, int i2, Object obj, rhp rhp) {
        if (obj == null) {
            obj = rhp.b();
        }
        rhp.a(obj, i, (long) i2);
        return obj;
    }

    static {
        Class cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        d = cls;
    }
}
