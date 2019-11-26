package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.conversation.ui.StickyPlayerContainer;

/* renamed from: zce */
final class zce implements AnimatorUpdateListener {
    private final /* synthetic */ zcf a;

    zce(zcf zcf) {
        this.a = zcf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.d.a.x = StickyPlayerContainer.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a.a.x, this.a.b.x);
        this.a.d.a.y = StickyPlayerContainer.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a.a.y, this.a.b.y);
        this.a.d.a();
    }
}
