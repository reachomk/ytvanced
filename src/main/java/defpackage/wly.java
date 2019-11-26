package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: wly */
public final class wly {
    private static final Interpolator a = acr.a(0.05f, 0.0f, 0.0f, 1.0f);
    private static final Interpolator b = acr.a(1.0f, 0.0f, 0.95f, 1.0f);

    public static Animator a(View view, int i, int i2) {
        amqw.a((Object) view);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = wly.a(view, i, i2, 300, 100, a);
        animatorArr[1] = wly.a(view, i2, i, 100, 500, b);
        animatorSet.playSequentially(animatorArr);
        return animatorSet;
    }

    private static Animator a(View view, int i, int i2, long j, long j2, Interpolator interpolator) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "backgroundColor", new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setStartDelay(j);
        ofObject.setDuration(j2);
        ofObject.setInterpolator(interpolator);
        return ofObject;
    }
}
