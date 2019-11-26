package defpackage;

/* renamed from: amwq */
final class amwq extends amul {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    amwq(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        amqw.a(i, this.c);
        return this.a[(i + i) + this.b];
    }

    public final int size() {
        return this.c;
    }
}
