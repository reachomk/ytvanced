package defpackage;

/* renamed from: rga */
public final class rga {
    static void a(rdt rdt, rfz rfz, Object obj, Object obj2) {
        rem.a(rdt, rfz.a, 1, obj);
        rem.a(rdt, rfz.c, 2, obj2);
    }

    static int a(rfz rfz, Object obj, Object obj2) {
        return rem.a(rfz.a, 1, obj) + rem.a(rfz.c, 2, obj2);
    }
}
