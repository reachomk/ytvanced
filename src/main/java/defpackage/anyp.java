package defpackage;

import java.util.List;

/* renamed from: anyp */
final class anyp extends anyn {
    private anyp() {
    }

    /* Access modifiers changed, original: final */
    public final List a(Object obj, long j) {
        List c = anyp.c(obj, j);
        if (c.a()) {
            return c;
        }
        int size = c.size();
        Object a = c.a(size != 0 ? size + size : 10);
        aoax.a(obj, j, a);
        return a;
    }

    /* Access modifiers changed, original: final */
    public final void b(Object obj, long j) {
        anyp.c(obj, j).b();
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj, Object obj2, long j) {
        anyd c = anyp.c(obj, j);
        obj2 = anyp.c(obj2, j);
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
        aoax.a(obj, j, obj2);
    }

    private static anyd c(Object obj, long j) {
        return (anyd) aoax.f(obj, j);
    }

    /* synthetic */ anyp(byte b) {
    }
}
