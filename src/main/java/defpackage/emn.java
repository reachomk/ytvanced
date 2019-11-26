package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBar;

/* renamed from: emn */
public final class emn extends emp {
    public final int a;
    public final int b;
    public final int c;
    public final long d = 1500;
    public final Runnable e = new emm(this);
    public final /* synthetic */ InlineTimeBar f;

    public emn(InlineTimeBar inlineTimeBar, int i, int i2, int i3) {
        this.f = inlineTimeBar;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void a() {
        this.f.removeCallbacks(this.e);
        if (b() == 1.0f) {
            d();
            return;
        }
        e();
        this.f.postInvalidate();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f.invalidate();
    }
}
