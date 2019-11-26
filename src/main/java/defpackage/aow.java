package defpackage;

import android.view.animation.Interpolator;

/* renamed from: aow */
public final class aow implements Interpolator {
    public final float getInterpolation(float f) {
        f -= 4.0f;
        return ((((f * f) * f) * f) * f) + 1.0f;
    }
}
