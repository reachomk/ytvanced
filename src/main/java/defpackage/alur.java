package defpackage;

/* renamed from: alur */
final /* synthetic */ class alur implements anim {
    private final aluo a;
    private final Object b;

    alur(aluo aluo, Object obj) {
        this.a = aluo;
        this.b = obj;
    }

    public final anjv a(Object obj) {
        aluo aluo = this.a;
        Object obj2 = this.b;
        if (obj == null) {
            return anjf.a(null);
        }
        return aluo.a(obj2, obj);
    }
}
