package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.livecreation.ui.view.Circle;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;

/* renamed from: acsy */
public final class acsy implements AnimatorUpdateListener {
    private final /* synthetic */ float a;
    private final /* synthetic */ WaitingIndicatorView b;

    public acsy(WaitingIndicatorView waitingIndicatorView, float f) {
        this.b = waitingIndicatorView;
        this.a = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Circle circle = this.b.b;
        circle.a = (this.a + floatValue) % 360.0f;
        circle.b = 360.0f - floatValue;
        circle.invalidate();
    }
}
