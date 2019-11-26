package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: amvj */
public final class amvj {
    public static ArrayList a() {
        return new ArrayList();
    }

    @SafeVarargs
    public static ArrayList a(Object... objArr) {
        amqw.a((Object) objArr);
        int length = objArr.length;
        amss.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(anhe.a((((long) length) + 5) + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList a(Iterable iterable) {
        amqw.a((Object) iterable);
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        return amvj.a(iterable.iterator());
    }

    public static ArrayList a(Iterator it) {
        Collection a = amvj.a();
        amve.a(a, it);
        return a;
    }

    public static ArrayList a(int i) {
        amss.a(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List a(List list, amqd amqd) {
        if (list instanceof RandomAccess) {
            return new amvn(list, amqd);
        }
        return new amvp(list, amqd);
    }

    public static List a(List list) {
        if (list instanceof amul) {
            return ((amul) list).i();
        }
        if (list instanceof amvl) {
            return ((amvl) list).a;
        }
        if (list instanceof RandomAccess) {
            return new amvm(list);
        }
        return new amvl(list);
    }

    public static boolean a(List list, Object obj) {
        if (obj == amqw.a((Object) list)) {
            return true;
        }
        boolean z = false;
        if (obj instanceof List) {
            List list2 = (List) obj;
            int size = list.size();
            if (size == list2.size()) {
                if (list2 instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (!amqq.a(list.get(i), list2.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
                Iterator it = list2.iterator();
                for (Object a : list) {
                    if (it.hasNext()) {
                        if (!amqq.a(a, it.next())) {
                            break;
                        }
                    }
                    break;
                }
                z = it.hasNext() ^ 1;
                return z;
            }
        }
        return false;
    }
}
