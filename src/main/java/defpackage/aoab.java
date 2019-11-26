package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;

/* renamed from: aoab */
final class aoab {
    public static final aoar a = aoab.a(false);
    public static final aoar b = aoab.a(true);
    public static final aoar c = new aoat();
    private static final Class d;

    public static void a(Class cls) {
        if (!anxl.class.isAssignableFrom(cls)) {
            Class cls2 = d;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static void a(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Double) list.get(i)).doubleValue();
                    i3 += anwm.g();
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.a(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.a(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Float) list.get(i)).floatValue();
                    i3 += anwm.f();
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.a(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.a(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    public static void c(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += anwm.f(((Long) list.get(i)).longValue());
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void d(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += anwm.f(((Long) list.get(i)).longValue());
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void e(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += anwm.g(((Long) list.get(i)).longValue());
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void f(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Long) list.get(i)).longValue();
                    i3 += anwm.d();
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.c(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void g(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Long) list.get(i)).longValue();
                    i3 += anwm.e();
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.c(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void h(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += anwm.p(((Integer) list.get(i)).intValue());
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void i(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += anwm.q(((Integer) list.get(i)).intValue());
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void j(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += anwm.r(((Integer) list.get(i)).intValue());
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.f(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void k(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Integer) list.get(i)).intValue();
                    i3 += anwm.b();
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.g(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void l(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Integer) list.get(i)).intValue();
                    i3 += anwm.c();
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.g(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void m(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    i3 += anwm.p(((Integer) list.get(i)).intValue());
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, aobl aobl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                anwu anwu = (anwu) aobl;
                anwu.a.b(i, 2);
                int i3 = 0;
                for (i = 0; i < list.size(); i++) {
                    ((Boolean) list.get(i)).booleanValue();
                    i3 += anwm.h();
                }
                anwu.a.e(i3);
                while (i2 < list.size()) {
                    anwu.a.b(((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void a(int i, List list, aobl aobl) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof anyo) {
                anyo anyo = (anyo) list;
                while (i2 < list.size()) {
                    Object b = anyo.b(i2);
                    if (b instanceof String) {
                        ((anwu) aobl).a.a(i, (String) b);
                    } else {
                        ((anwu) aobl).a.a(i, (anvu) b);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((anwu) aobl).a.a(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void b(int i, List list, aobl aobl) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((anwu) aobl).a.a(i, (anvu) list.get(i2));
            }
        }
    }

    public static void a(int i, List list, aobl aobl, anzz anzz) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((anwu) aobl).a(i, list.get(i2), anzz);
            }
        }
    }

    public static void b(int i, List list, aobl aobl, anzz anzz) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((anwu) aobl).b(i, list.get(i2), anzz);
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
        if (list instanceof anys) {
            anys anys = (anys) list;
            i2 = 0;
            while (i < size) {
                i2 += anwm.f(anys.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += anwm.f(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int a(int i, List list) {
        return list.size() != 0 ? aoab.a(list) + (list.size() * anwm.o(i)) : 0;
    }

    static int b(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof anys) {
            anys anys = (anys) list;
            i2 = 0;
            while (i < size) {
                i2 += anwm.f(anys.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += anwm.f(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int b(int i, List list) {
        int size = list.size();
        return size != 0 ? aoab.b(list) + (size * anwm.o(i)) : 0;
    }

    static int c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof anys) {
            anys anys = (anys) list;
            i2 = 0;
            while (i < size) {
                i2 += anwm.g(anys.b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += anwm.g(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    static int c(int i, List list) {
        int size = list.size();
        return size != 0 ? aoab.c(list) + (size * anwm.o(i)) : 0;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            i2 = 0;
            while (i < size) {
                i2 += anwm.p(anxt.c(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += anwm.p(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int d(int i, List list) {
        int size = list.size();
        return size != 0 ? aoab.d(list) + (size * anwm.o(i)) : 0;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            i2 = 0;
            while (i < size) {
                i2 += anwm.p(anxt.c(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += anwm.p(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int e(int i, List list) {
        int size = list.size();
        return size != 0 ? aoab.e(list) + (size * anwm.o(i)) : 0;
    }

    static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            i2 = 0;
            while (i < size) {
                i2 += anwm.q(anxt.c(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += anwm.q(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int f(int i, List list) {
        int size = list.size();
        return size != 0 ? aoab.f(list) + (size * anwm.o(i)) : 0;
    }

    static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            i2 = 0;
            while (i < size) {
                i2 += anwm.r(anxt.c(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += anwm.r(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    static int g(int i, List list) {
        int size = list.size();
        return size != 0 ? aoab.g(list) + (size * anwm.o(i)) : 0;
    }

    static int h(List list) {
        return list.size() << 2;
    }

    static int h(int i, List list) {
        int size = list.size();
        return size != 0 ? size * anwm.h(i) : 0;
    }

    static int i(List list) {
        return list.size() << 3;
    }

    static int i(int i, List list) {
        int size = list.size();
        return size != 0 ? size * anwm.j(i) : 0;
    }

    static int j(List list) {
        return list.size();
    }

    static int j(int i, List list) {
        int size = list.size();
        return size != 0 ? size * anwm.n(i) : 0;
    }

    static int k(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = anwm.o(i) * size;
        Object b;
        int b2;
        if (list instanceof anyo) {
            anyo anyo = (anyo) list;
            while (i2 < size) {
                b = anyo.b(i2);
                if (b instanceof anvu) {
                    b2 = anwm.b((anvu) b);
                } else {
                    b2 = anwm.b((String) b);
                }
                i += b2;
                i2++;
            }
        } else {
            while (i2 < size) {
                b = list.get(i2);
                if (b instanceof anvu) {
                    b2 = anwm.b((anvu) b);
                } else {
                    b2 = anwm.b((String) b);
                }
                i += b2;
                i2++;
            }
        }
        return i;
    }

    static int a(int i, Object obj, anzz anzz) {
        if (obj instanceof anym) {
            return anwm.a(i, (anym) obj);
        }
        return anwm.o(i) + anwm.a((anze) obj, anzz);
    }

    static int a(int i, List list, anzz anzz) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = anwm.o(i) * size;
        while (i2 < size) {
            int a;
            Object obj = list.get(i2);
            if (obj instanceof anym) {
                a = anwm.a((anym) obj);
            } else {
                a = anwm.a((anze) obj, anzz);
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
        size *= anwm.o(i);
        while (i2 < list.size()) {
            size += anwm.b((anvu) list.get(i2));
            i2++;
        }
        return size;
    }

    static int b(int i, List list, anzz anzz) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        while (i2 < size) {
            i3 += anwm.b(i, (anze) list.get(i2), anzz);
            i2++;
        }
        return i3;
    }

    private static aoar a(boolean z) {
        Class cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (aoar) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    static boolean a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj != null) {
                return obj.equals(obj2) ? z : false;
            } else {
                z = false;
            }
        }
    }

    static void a(anyx anyx, Object obj, Object obj2, long j) {
        aoax.a(obj, j, anyx.a(aoax.f(obj, j), aoax.f(obj2, j)));
    }

    static void a(anxc anxc, Object obj, Object obj2) {
        anxg a = anxc.a(obj2);
        if (!a.a()) {
            anxg b = anxc.b(obj);
            for (int i = 0; i < a.a.b(); i++) {
                b.a(a.a.b(i));
            }
            for (Entry a2 : a.a.c()) {
                b.a(a2);
            }
        }
    }

    static void a(aoar aoar, Object obj, Object obj2) {
        aoar.a(obj, aoar.c(aoar.b(obj), aoar.b(obj2)));
    }

    static Object a(int i, List list, anxx anxx, Object obj, aoar aoar) {
        if (anxx != null) {
            int size;
            if (list instanceof RandomAccess) {
                size = list.size();
                Object obj2 = obj;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    if (anxx.isInRange(intValue)) {
                        if (i3 != i2) {
                            list.set(i2, Integer.valueOf(intValue));
                        }
                        i2++;
                    } else {
                        obj2 = aoab.a(i, intValue, obj2, aoar);
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
                if (!anxx.isInRange(size)) {
                    obj = aoab.a(i, size, obj, aoar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object a(int i, int i2, Object obj, aoar aoar) {
        if (obj == null) {
            obj = aoar.b();
        }
        aoar.a(obj, i, (long) i2);
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
