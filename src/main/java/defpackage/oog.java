package defpackage;

/* renamed from: oog */
final class oog extends onp {
    private final oau b;
    private final int c;
    private final int d;
    private final int e;

    public oog(oau oau, int i) {
        super(new opv(i));
        this.b = oau;
        this.c = oau.b();
        this.d = oau.a();
        this.e = i;
        int i2 = this.c;
        if (i2 > 0) {
            oxz.b(i <= Integer.MAX_VALUE / i2, "LoopingMediaSource contains too many periods");
        }
    }

    public final int a() {
        return this.d * this.e;
    }

    public final int b() {
        return this.c * this.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(int i) {
        return i / this.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final int c(int i) {
        return i / this.d;
    }

    /* Access modifiers changed, original: protected|final */
    public final int c(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final oau d() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final int d(int i) {
        return i * this.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final int e(int i) {
        return i * this.d;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object f(int i) {
        return Integer.valueOf(i);
    }
}
