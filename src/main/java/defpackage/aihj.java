package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import com.google.android.youtube.R;

/* renamed from: aihj */
final class aihj implements AnimatorListener {
    public final /* synthetic */ aihe a;
    private final /* synthetic */ Resources b;

    aihj(aihe aihe, Resources resources) {
        this.a = aihe;
        this.b = resources;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        aihe aihe = this.a;
        aihe.f = aihe.a;
    }

    public final void onAnimationEnd(Animator animator) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(this.a.f), Integer.valueOf(this.a.b)});
        ofObject.setDuration((long) this.b.getInteger(R.integer.accelerated_buffer_bar_fade_duration));
        ofObject.addUpdateListener(new aihi(this));
        ofObject.start();
    }

    public final void onAnimationCancel(Animator animator) {
        aihe aihe = this.a;
        aihe.f = aihe.b;
    }
}
