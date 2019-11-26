package defpackage;

import android.view.animation.Interpolator;

/* renamed from: ugz */
final class ugz implements Interpolator {
    ugz() {
    }

    public final float getInterpolation(float f) {
        f -= 4.0f;
        return ((((f * f) * f) * f) * f) + 1.0f;
    }
}
