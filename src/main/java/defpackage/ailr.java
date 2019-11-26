package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: ailr */
final /* synthetic */ class ailr implements AnimatorUpdateListener {
    private final ails a;

    ailr(ails ails) {
        this.a = ails;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ails ails = this.a;
        float translationY = ails.f.getTranslationY();
        ails.d.a(ails.e(translationY), false);
        ails.a(translationY);
    }
}
