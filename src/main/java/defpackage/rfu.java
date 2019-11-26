package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rfu */
final class rfu extends rfr {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private rfu() {
    }

    /* Access modifiers changed, original: final */
    public final List a(Object obj, long j) {
        return rfu.a(obj, j, 10);
    }

    /* Access modifiers changed, original: final */
    public final void b(Object obj, long j) {
        Object e;
        List list = (List) rhv.f(obj, j);
        if (list instanceof rfs) {
            e = ((rfs) list).e();
        } else {
            if (!c.isAssignableFrom(list.getClass())) {
                if ((list instanceof rgt) && (list instanceof rfi)) {
                    rfi rfi = (rfi) list;
                    if (rfi.a()) {
                        rfi.b();
                    }
                    return;
                }
                e = Collections.unmodifiableList(list);
            }
        }
        rhv.a(obj, j, e);
    }

    private static List a(Object obj, long j, int i) {
        List c = rfu.c(obj, j);
        if (c.isEmpty()) {
            if (c instanceof rfs) {
                c = new rfp(i);
            } else if ((c instanceof rgt) && (c instanceof rfi)) {
                c = ((rfi) c).a(i);
            } else {
                c = new ArrayList(i);
            }
            rhv.a(obj, j, (Object) c);
        } else {
            ArrayList arrayList;
            if (c.isAssignableFrom(c.getClass())) {
                arrayList = new ArrayList(c.size() + i);
                arrayList.addAll(c);
                rhv.a(obj, j, (Object) arrayList);
            } else if (c instanceof rhu) {
                Object arrayList2 = new rfp(c.size() + i);
                arrayList2.addAll((rhu) c);
                rhv.a(obj, j, arrayList2);
            } else if ((c instanceof rgt) && (c instanceof rfi)) {
                rfi rfi = (rfi) c;
                if (!rfi.a()) {
                    Object a = rfi.a(c.size() + i);
                    rhv.a(obj, j, a);
                    return a;
                }
            }
            c = arrayList2;
        }
        return c;
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj, Object obj2, long j) {
        obj2 = rfu.c(obj2, j);
        List a = rfu.a(obj, j, obj2.size());
        int size = a.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            a.addAll(obj2);
        }
        if (size > 0) {
            obj2 = a;
        }
        rhv.a(obj, j, obj2);
    }

    private static List c(Object obj, long j) {
        return (List) rhv.f(obj, j);
    }

    /* synthetic */ rfu(byte b) {
    }
}
