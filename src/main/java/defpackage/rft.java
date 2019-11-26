package defpackage;

import java.util.List;

/* renamed from: rft */
final class rft extends rfr {
    private rft() {
    }

    /* Access modifiers changed, original: final */
    public final List a(Object obj, long j) {
        List c = rft.c(obj, j);
        if (c.a()) {
            return c;
        }
        int size = c.size();
        Object a = c.a(size != 0 ? size + size : 10);
        rhv.a(obj, j, a);
        return a;
    }

    /* Access modifiers changed, original: final */
    public final void b(Object obj, long j) {
        rft.c(obj, j).b();
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj, Object obj2, long j) {
        rfi c = rft.c(obj, j);
        obj2 = rft.c(obj2, j);
        int size = c.size();
        int size2 = obj2.size();
        if (size > 0 && size2 > 0) {
            if (!c.a()) {
                c = c.a(size2 + size);
            }
            c.addAll(obj2);
        }
        if (size > 0) {
            obj2 = c;
        }
        rhv.a(obj, j, obj2);
    }

    private static rfi c(Object obj, long j) {
        return (rfi) rhv.f(obj, j);
    }

    /* synthetic */ rft(byte b) {
    }
}
