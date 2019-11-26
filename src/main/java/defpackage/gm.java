package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: gm */
abstract class gm extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    private boolean a;
    private float b;
    private float c;
    private final /* synthetic */ gc d;

    public abstract float a();

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.a) {
            hu huVar = this.d.c;
            this.b = huVar != null ? huVar.b() : 0.0f;
            this.c = a();
            this.a = true;
        }
        gc gcVar = this.d;
        float f = this.b;
        gcVar.b((float) ((int) (f + ((this.c - f) * valueAnimator.getAnimatedFraction()))));
    }

    public final void onAnimationEnd(Animator animator) {
        this.d.b((float) ((int) this.c));
        this.a = false;
    }

    /* synthetic */ gm(gc gcVar) {
        this.d = gcVar;
    }
}
