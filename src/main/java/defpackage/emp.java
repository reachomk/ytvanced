package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: emp */
public abstract class emp implements AnimatorUpdateListener {
    private final ValueAnimator a = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(250);
    private float b;

    protected emp() {
        this.a.addUpdateListener(this);
        this.b = 0.0f;
    }

    public final void a(int i) {
        this.a.setDuration((long) i);
    }

    public final float b() {
        if (this.a.isRunning()) {
            return ((Float) this.a.getAnimatedValue()).floatValue();
        }
        return this.b;
    }

    public final void c() {
        this.a.cancel();
        this.b = 0.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        this.a.cancel();
        this.b = 1.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        this.a.start();
        this.b = 1.0f;
    }

    public final void f() {
        this.a.reverse();
        this.b = 0.0f;
    }
}
