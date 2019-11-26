package defpackage;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: bpa */
public class bpa extends ValueAnimator {
    public final Set a = new CopyOnWriteArraySet();
    private final Set b = new CopyOnWriteArraySet();

    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.b.add(animatorUpdateListener);
    }

    public final void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.b.remove(animatorUpdateListener);
    }

    public final void removeAllUpdateListeners() {
        this.b.clear();
    }

    public final void addListener(AnimatorListener animatorListener) {
        this.a.add(animatorListener);
    }

    public final void removeListener(AnimatorListener animatorListener) {
        this.a.remove(animatorListener);
    }

    public final void removeAllListeners() {
        this.a.clear();
    }

    public final void a(boolean z) {
        for (AnimatorListener animatorListener : this.a) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        for (AnimatorUpdateListener onAnimationUpdate : this.b) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }
}
