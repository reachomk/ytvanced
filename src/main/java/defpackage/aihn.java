package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;

/* renamed from: aihn */
public final class aihn implements AnimatorUpdateListener {
    public final ValueAnimator a;
    public boolean b = false;
    public final int c;
    public final int d;
    public final /* synthetic */ TimeBar e;

    public aihn(TimeBar timeBar, int i, int i2) {
        this.e = timeBar;
        this.c = i2;
        this.d = i;
        this.a = ValueAnimator.ofFloat(new float[]{(float) i, (float) i2});
        this.a.setDuration(100);
        this.a.addUpdateListener(this);
    }

    public final float a() {
        if (!this.e.isEnabled()) {
            return 0.0f;
        }
        return Math.min((float) this.c, Math.max((float) this.d, ((Float) this.a.getAnimatedValue()).floatValue()));
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.e.invalidate();
    }
}
