package defpackage;

/* renamed from: rhr */
final class rhr extends rhp {
    rhr() {
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return false;
    }

    private static void a(Object obj, rhs rhs) {
        ((reu) obj).zzuhr = rhs;
    }

    /* Access modifiers changed, original: final */
    public final void d(Object obj) {
        ((reu) obj).zzuhr.b();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int f(Object obj) {
        return ((rhs) obj).c();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int e(Object obj) {
        rhs rhs = (rhs) obj;
        int i = rhs.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < rhs.b; i++) {
            int i3 = rhs.c[i];
            rdg rdg = (rdg) rhs.d[i];
            int l = rdt.l(1);
            i2 += ((l + l) + rdt.g(2, i3 >>> 3)) + rdt.c(3, rdg);
        }
        rhs.e = i2;
        return i2;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        rhs rhs = (rhs) obj;
        rhs rhs2 = (rhs) obj2;
        return !rhs2.equals(rhs.a) ? rhs.a(rhs, rhs2) : rhs;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object c(Object obj) {
        rhs rhs = ((reu) obj).zzuhr;
        if (rhs != rhs.a) {
            return rhs;
        }
        rhs = rhs.a();
        rhr.a(obj, rhs);
        return rhs;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object b(Object obj) {
        return ((reu) obj).zzuhr;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(Object obj) {
        rhs rhs = (rhs) obj;
        rhs.b();
        return rhs;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object b() {
        return rhs.a();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void b(Object obj, int i, long j) {
        ((rhs) obj).a((i << 3) | 1, Long.valueOf(j));
    }
}
