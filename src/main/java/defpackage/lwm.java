package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;

/* renamed from: lwm */
public final class lwm implements AnimatorUpdateListener {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final Rect e;
    private final /* synthetic */ WatchWhileLayout f;

    public lwm(WatchWhileLayout watchWhileLayout, int i, int i2, int i3, int i4) {
        this.f = watchWhileLayout;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = new Rect(watchWhileLayout.h);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction;
        WatchWhileLayout watchWhileLayout = this.f;
        if (watchWhileLayout.c > 0) {
            int i = watchWhileLayout.g;
            if (i == 1 || i == 2) {
                animatedFraction = valueAnimator.getAnimatedFraction();
                WatchWhileLayout.a(this.f.h, WatchWhileLayout.a(animatedFraction, this.e.left, this.a), WatchWhileLayout.a(animatedFraction, this.e.top, this.b), WatchWhileLayout.a(animatedFraction, this.e.width(), this.c), WatchWhileLayout.a(animatedFraction, this.e.height(), this.d));
                this.f.g();
            }
        }
        valueAnimator.cancel();
        animatedFraction = 1.0f;
        WatchWhileLayout.a(this.f.h, WatchWhileLayout.a(animatedFraction, this.e.left, this.a), WatchWhileLayout.a(animatedFraction, this.e.top, this.b), WatchWhileLayout.a(animatedFraction, this.e.width(), this.c), WatchWhileLayout.a(animatedFraction, this.e.height(), this.d));
        this.f.g();
    }
}
