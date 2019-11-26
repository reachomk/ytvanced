package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: eyu */
final class eyu extends AccelerateDecelerateInterpolator {
    private final DecelerateInterpolator a = new DecelerateInterpolator(0.8f);

    eyu() {
    }

    public final float getInterpolation(float f) {
        return super.getInterpolation(this.a.getInterpolation(f));
    }
}
