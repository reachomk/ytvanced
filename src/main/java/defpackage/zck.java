package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.widget.ImageView;
import com.google.android.libraries.youtube.conversation.ui.TypingIndicatorView;

/* renamed from: zck */
public final class zck implements AnimatorListener {
    private final /* synthetic */ TypingIndicatorView a;

    public zck(TypingIndicatorView typingIndicatorView) {
        this.a = typingIndicatorView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        for (ImageView imageView : this.a.a) {
            st.a(imageView.getDrawable(), -12417548);
            imageView.invalidate();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        for (ImageView imageView : this.a.a) {
            st.a(imageView.getDrawable(), -4473925);
            imageView.invalidate();
        }
    }
}
