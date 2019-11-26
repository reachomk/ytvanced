package defpackage;

/* renamed from: cie */
final class cie implements zy {
    private final cib a;
    private final cig b;
    private final zy c;

    cie(zy zyVar, cib cib, cig cig) {
        this.c = zyVar;
        this.a = cib;
        this.b = cig;
    }

    public final Object a() {
        Object a = this.c.a();
        if (a == null) {
            a = this.a.a();
        }
        if (a instanceof cid) {
            ((cid) a).h_().a(false);
        }
        return a;
    }

    public final boolean a(Object obj) {
        if (obj instanceof cid) {
            ((cid) obj).h_().a(true);
        }
        this.b.a(obj);
        return this.c.a(obj);
    }
}
