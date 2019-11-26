package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;

/* renamed from: lwr */
public class lwr extends lwq {
    private final int a;
    private final int b;
    private final /* synthetic */ WatchWhileLayout c;

    protected lwr(WatchWhileLayout watchWhileLayout, int i, int i2) {
        this.c = watchWhileLayout;
        super(watchWhileLayout);
        this.a = i;
        this.b = i2;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, int i2, int i3) {
        if ((this.b == 0 && !this.c.e()) || (this.b == 1 && !this.c.h())) {
            return;
        }
        if (i == i2) {
            this.c.g(this.a);
            return;
        }
        this.f.setIntValues(new int[]{i, i2});
        this.f.setDuration((long) i3);
        b();
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return !this.c.f() ? 350 : 400;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.b == 0) {
            this.c.e(intValue);
        } else {
            this.c.f(intValue);
        }
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.c.g(this.a);
    }
}
