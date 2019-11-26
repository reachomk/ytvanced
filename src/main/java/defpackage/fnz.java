package defpackage;

/* renamed from: fnz */
public final class fnz {
    public static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    public static boolean b(float f, float f2) {
        return !fnz.a(f, f2) && f < f2;
    }

    public static boolean a(float f) {
        return !fnz.a(f, 1.777f) && f > 1.777f;
    }
}
