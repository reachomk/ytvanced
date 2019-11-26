package defpackage;

/* renamed from: amwj */
final class amwj extends amul {
    public static final amul a = new amwj(new Object[0], 0);
    private final transient Object[] b;
    private final transient int c;

    amwj(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        return 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return false;
    }

    public final int size() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final Object[] b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    public final Object get(int i) {
        amqw.a(i, this.c);
        return this.b[i];
    }
}
