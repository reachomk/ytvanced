package defpackage;

import android.view.animation.Interpolator;

/* renamed from: atf */
final class atf implements Interpolator {
    atf() {
    }

    public final float getInterpolation(float f) {
        return (((f * f) * f) * f) * f;
    }
}
