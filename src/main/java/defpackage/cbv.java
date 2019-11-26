package defpackage;

/* renamed from: cbv */
final class cbv extends cbw {
    cbv() {
    }

    public final int a() {
        return 2;
    }

    public final float a(int i, int i2, int i3, int i4) {
        i = Math.min(i2 / i4, i / i3);
        if (i != 0) {
            return 1.0f / ((float) Integer.highestOneBit(i));
        }
        return 1.0f;
    }
}
