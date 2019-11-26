package defpackage;

import android.animation.ArgbEvaluator;

/* renamed from: vzl */
public final class vzl {
    private static final ArgbEvaluator a = new ArgbEvaluator();

    public static int a(float f, int i, int i2) {
        if (vzl.a(f, 0.0f)) {
            return i;
        }
        return !vzl.a(f, 1.0f) ? ((Integer) a.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue() : i2;
    }

    private static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.01f;
    }
}
