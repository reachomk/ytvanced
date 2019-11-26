package defpackage;

/* renamed from: aoat */
final class aoat extends aoar {
    aoat() {
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return false;
    }

    private static void a(Object obj, aoau aoau) {
        ((anxl) obj).unknownFields = aoau;
    }

    private static aoau g(Object obj) {
        return ((anxl) obj).unknownFields;
    }

    /* Access modifiers changed, original: final */
    public final void d(Object obj) {
        aoat.g(obj).b();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int f(Object obj) {
        return ((aoau) obj).c();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int e(Object obj) {
        aoau aoau = (aoau) obj;
        int i = aoau.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < aoau.b; i++) {
            int b = aobj.b(aoau.c[i]);
            anvu anvu = (anvu) aoau.d[i];
            int o = anwm.o(1);
            i2 += ((o + o) + anwm.h(2, b)) + anwm.c(3, anvu);
        }
        aoau.e = i2;
        return i2;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        aoau aoau = (aoau) obj;
        aoau aoau2 = (aoau) obj2;
        return !aoau2.equals(aoau.a) ? aoau.a(aoau, aoau2) : aoau;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object c(Object obj) {
        aoau g = aoat.g(obj);
        if (g != aoau.a) {
            return g;
        }
        g = aoau.a();
        aoat.a(obj, g);
        return g;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object b(Object obj) {
        return aoat.g(obj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(Object obj) {
        aoau aoau = (aoau) obj;
        aoau.b();
        return aoau;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object b() {
        return aoau.a();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void b(Object obj, int i, long j) {
        ((aoau) obj).a(aobj.a(i, 1), Long.valueOf(j));
    }
}
