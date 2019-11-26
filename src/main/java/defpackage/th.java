package defpackage;

/* renamed from: th */
public final class th {
    public static float a(float f) {
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = 1.0f;
            if (f <= 1.0f) {
                return f;
            }
        }
        return f2;
    }

    public static int a(int i, int i2, int i3) {
        return i >= i2 ? i <= i3 ? i : i3 : i2;
    }
}
