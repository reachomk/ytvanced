package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.conversation.ui.TypingIndicatorView;

/* renamed from: zci */
public final /* synthetic */ class zci implements AnimatorUpdateListener {
    private final TypingIndicatorView a;

    public zci(TypingIndicatorView typingIndicatorView) {
        this.a = typingIndicatorView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TypingIndicatorView typingIndicatorView = this.a;
        typingIndicatorView.b = valueAnimator.getAnimatedFraction();
        typingIndicatorView.invalidate();
    }
}
