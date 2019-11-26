package defpackage;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: acr */
public final class acr {
    public static Interpolator a(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2);
        }
        return new aco(f, f2);
    }

    public static Interpolator a(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new aco(f, f2, f3, f4);
    }
}
