package defpackage;

/* renamed from: angz */
public final class angz {
    public static float a(float f, float f2, float f3) {
        amqw.a(f2 <= f3, "min (%s) must be less than or equal to max (%s)", Float.valueOf(f2), Float.valueOf(f3));
        return Math.min(Math.max(f, f2), f3);
    }
}
