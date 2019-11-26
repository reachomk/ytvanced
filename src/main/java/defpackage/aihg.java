package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: aihg */
final class aihg implements AnimatorUpdateListener {
    private final /* synthetic */ aihe a;

    aihg(aihe aihe) {
        this.a = aihe;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        aihe aihe = this.a;
        aihl aihl = aihe.h;
        if (aihl != null) {
            aihl.a(aihe);
        }
    }
}
