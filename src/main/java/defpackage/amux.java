package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: amux */
public final class amux {
    public static boolean a(List list, amqv amqv) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!amqv.a(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        amux.a(list, amqv, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        amux.a(list, amqv, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    private static void a(List list, amqv amqv, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (amqv.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    public static Object[] a(Iterable iterable, Class cls) {
        return amux.a(iterable).toArray((Object[]) Array.newInstance(cls, 0));
    }

    public static Collection a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return amvj.a(iterable.iterator());
    }

    public static Iterable a(Iterable iterable, amqv amqv) {
        amqw.a((Object) iterable);
        amqw.a((Object) amqv);
        return new amva(iterable, amqv);
    }

    public static boolean b(Iterable iterable, amqv amqv) {
        amqw.a((Object) amqv, (Object) "predicate");
        int i = 0;
        for (Object a : iterable) {
            if (amqv.a(a)) {
                if (i != -1) {
                    return true;
                }
                return false;
            }
            i++;
        }
        return false;
    }

    public static Object a(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static Object b(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return amve.a(iterable.iterator());
        }
        if (!iterable.isEmpty()) {
            return amux.a((List) iterable);
        }
        throw new NoSuchElementException();
    }

    public static Object a(List list) {
        return list.get(list.size() - 1);
    }
}
