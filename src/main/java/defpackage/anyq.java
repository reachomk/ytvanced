package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: anyq */
final class anyq extends anyn {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private anyq() {
    }

    /* Access modifiers changed, original: final */
    public final List a(Object obj, long j) {
        return anyq.a(obj, j, 10);
    }

    /* Access modifiers changed, original: final */
    public final void b(Object obj, long j) {
        Object e;
        List list = (List) aoax.f(obj, j);
        if (list instanceof anyo) {
            e = ((anyo) list).e();
        } else {
            if (!c.isAssignableFrom(list.getClass())) {
                if ((list instanceof anzp) && (list instanceof anyd)) {
                    anyd anyd = (anyd) list;
                    if (anyd.a()) {
                        anyd.b();
                    }
                    return;
                }
                e = Collections.unmodifiableList(list);
            }
        }
        aoax.a(obj, j, e);
    }

    private static List a(Object obj, long j, int i) {
        List c = anyq.c(obj, j);
        if (c.isEmpty()) {
            if (c instanceof anyo) {
                c = new anyl(i);
            } else if ((c instanceof anzp) && (c instanceof anyd)) {
                c = ((anyd) c).a(i);
            } else {
                c = new ArrayList(i);
            }
            aoax.a(obj, j, (Object) c);
        } else {
            ArrayList arrayList;
            if (c.isAssignableFrom(c.getClass())) {
                arrayList = new ArrayList(c.size() + i);
                arrayList.addAll(c);
                aoax.a(obj, j, (Object) arrayList);
            } else if (c instanceof aoaw) {
                Object arrayList2 = new anyl(c.size() + i);
                arrayList2.addAll((aoaw) c);
                aoax.a(obj, j, arrayList2);
            } else if ((c instanceof anzp) && (c instanceof anyd)) {
                anyd anyd = (anyd) c;
                if (!anyd.a()) {
                    Object a = anyd.a(c.size() + i);
                    aoax.a(obj, j, a);
                    return a;
                }
            }
            c = arrayList2;
        }
        return c;
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj, Object obj2, long j) {
        obj2 = anyq.c(obj2, j);
        List a = anyq.a(obj, j, obj2.size());
        int size = a.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            a.addAll(obj2);
        }
        if (size > 0) {
            obj2 = a;
        }
        aoax.a(obj, j, obj2);
    }

    private static List c(Object obj, long j) {
        return (List) aoax.f(obj, j);
    }

    /* synthetic */ anyq(byte b) {
    }
}
