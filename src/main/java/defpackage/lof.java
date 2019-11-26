package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.DecelerateInterpolator;

/* renamed from: lof */
final class lof extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    public final ValueAnimator a = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public boolean b;
    private final float c;
    private final loi d;
    private final /* synthetic */ log e;

    public lof(log log, long j, float f, loi loi) {
        TimeInterpolator eyv;
        this.e = log;
        this.c = f;
        this.d = loi;
        this.a.setDuration(j);
        this.a.addListener(this);
        this.a.addUpdateListener(this);
        ValueAnimator valueAnimator = this.a;
        if (this.c <= 0.0f) {
            eyv = new eyv();
        } else {
            eyv = new DecelerateInterpolator();
        }
        valueAnimator.setInterpolator(eyv);
    }

    public final void onAnimationCancel(Animator animator) {
        a();
    }

    public final void onAnimationEnd(Animator animator) {
        a();
    }

    private final void a() {
        if (!this.b) {
            loi loi = this.d;
            if (loi != null) {
                loi.a(this.e.c);
            }
            this.e.f = null;
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.b) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.c;
            this.e.a(f + ((1.0f - f) * floatValue));
            loi loi = this.d;
            if (loi != null) {
                loi.a();
            }
        }
    }
}
