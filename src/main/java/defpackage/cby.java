package defpackage;

/* renamed from: cby */
final class cby extends cbw {
    cby() {
    }

    public final int a() {
        return 1;
    }

    public final float a(int i, int i2, int i3, int i4) {
        i = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
        i3 = 1;
        i2 = Math.max(1, Integer.highestOneBit(i));
        if (i2 >= i) {
            i3 = 0;
        }
        return 1.0f / ((float) (i2 << i3));
    }
}
