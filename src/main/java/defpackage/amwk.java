package defpackage;

/* renamed from: amwk */
final class amwk extends amug {
    public static final amwk a = new amwk();
    private final transient Object b;
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient amwk f;

    private amwk() {
        this.b = null;
        this.c = new Object[0];
        this.d = 0;
        this.e = 0;
        this.f = this;
    }

    /* Access modifiers changed, original: final */
    public final boolean j() {
        return false;
    }

    amwk(Object[] objArr, int i) {
        this.c = objArr;
        this.e = i;
        this.d = 0;
        int a = i >= 2 ? amuw.a(i) : 0;
        this.b = amwm.a(objArr, i, a, 0);
        Object a2 = amwm.a(objArr, i, a, 1);
        amwk amug = new amug();
        amug.b = a2;
        amug.c = objArr;
        amug.d = 1;
        amug.e = i;
        amug.f = this;
        this.f = amug;
    }

    public final int size() {
        return this.e;
    }

    public final amug b() {
        return this.f;
    }

    public final Object get(Object obj) {
        return amwm.a(this.b, this.c, this.e, this.d, obj);
    }

    /* Access modifiers changed, original: final */
    public final amuw g() {
        return new amwl(this, this.c, this.d, this.e);
    }

    /* Access modifiers changed, original: final */
    public final amuw i() {
        return new amwn(this, new amwq(this.c, this.d, this.e));
    }

    public final /* bridge */ /* synthetic */ amsp a() {
        return this.f;
    }
}
