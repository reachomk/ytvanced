package defpackage;

import android.view.animation.Interpolator;

/* renamed from: adr */
final class adr implements Interpolator {
    adr() {
    }

    public final float getInterpolation(float f) {
        f -= 4.0f;
        return ((((f * f) * f) * f) * f) + 1.0f;
    }
}
