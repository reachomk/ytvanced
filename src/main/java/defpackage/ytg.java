package defpackage;

import android.animation.ValueAnimator;

/* renamed from: ytg */
final class ytg extends ValueAnimator {
    public ytg(zal zal, ynz ynz) {
        setFloatValues(new float[]{0.0f, 1.0f});
        setDuration(300);
        addUpdateListener(new ytf(zal));
        addListener(new yti(this, zal, ynz));
    }
}
