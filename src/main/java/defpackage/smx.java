package defpackage;

/* renamed from: smx */
final class smx implements csv {
    private final int a;
    private final int b;

    smx(int i) {
        this.a = i;
        this.b = i;
    }

    public final boolean a(int i, int i2, int i3) {
        return this.a + i >= i2 && i - this.b <= i3;
    }

    public final boolean b(int i, int i2, int i3) {
        return this.a + i < i2 || i - this.b > i3;
    }
}
