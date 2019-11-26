package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.livecreation.ui.view.Circle;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;

/* renamed from: acsx */
public final class acsx implements AnimatorUpdateListener {
    private final /* synthetic */ WaitingIndicatorView a;

    public acsx(WaitingIndicatorView waitingIndicatorView) {
        this.a = waitingIndicatorView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Circle circle = this.a.b;
        circle.b = floatValue;
        circle.invalidate();
    }
}
