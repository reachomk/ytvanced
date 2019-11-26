package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: abt */
final class abt implements AnimatorUpdateListener {
    private final /* synthetic */ abu a;

    abt(abu abu) {
        this.a = abu;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a();
    }
}
