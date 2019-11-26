package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;

/* renamed from: lwo */
public final class lwo extends lwq {
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final xpu d = new xpu();
    public final /* synthetic */ WatchWhileLayout e;

    public lwo(WatchWhileLayout watchWhileLayout) {
        this.e = watchWhileLayout;
        super(watchWhileLayout);
        this.f.setFloatValues(new float[]{0.0f, 1.0f});
    }

    public final float a() {
        return 1.0f - this.f.getAnimatedFraction();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.b.set(WatchWhileLayout.a(animatedFraction, this.a.left, this.c.left), WatchWhileLayout.a(animatedFraction, this.a.top, this.c.top), WatchWhileLayout.a(animatedFraction, this.a.right, this.c.right), WatchWhileLayout.a(animatedFraction, this.a.bottom, this.c.bottom));
        this.e.g();
        lwv lwv = this.e.j;
        if (lwv != null) {
            lwv.a(a());
        }
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.e.g(1);
    }
}
