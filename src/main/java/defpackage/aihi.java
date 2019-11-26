package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: aihi */
final class aihi implements AnimatorUpdateListener {
    private final /* synthetic */ aihj a;

    aihi(aihj aihj) {
        this.a = aihj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        aihe aihe = this.a.a;
        aihl aihl = aihe.h;
        if (aihl != null) {
            aihl.a(aihe);
        }
    }
}
