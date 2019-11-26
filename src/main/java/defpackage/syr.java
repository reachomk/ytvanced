package defpackage;

/* renamed from: syr */
public final class syr implements csv {
    private final float a;

    public syr(float f) {
        this.a = f;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = (int) (((float) ((i3 - i2) + 1)) * this.a);
        return i >= i2 - i4 && i <= i3 + i4;
    }

    public final boolean b(int i, int i2, int i3) {
        int i4 = (int) (((float) ((i3 - i2) + 1)) * this.a);
        return i < i2 - i4 || i > i3 + i4;
    }
}
