package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;

/* renamed from: atk */
public class atk implements AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final aqj e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;

    atk(aqj aqj, int i, float f, float f2, float f3, float f4) {
        this.f = i;
        this.e = aqj;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.g.addUpdateListener(new atj(this));
        this.g.setTarget(aqj.a);
        this.g.addListener(this);
        this.m = 0.0f;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.l) {
            this.e.a(true);
        }
        this.l = true;
    }

    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }
}
