package defpackage;

import android.animation.TimeInterpolator;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: eyv */
public final class eyv implements Interpolator {
    private final TimeInterpolator a;

    public eyv() {
        if (VERSION.SDK_INT < 21) {
            this.a = new eyu();
        } else {
            this.a = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
        }
    }

    public final float getInterpolation(float f) {
        return this.a.getInterpolation(f);
    }
}
