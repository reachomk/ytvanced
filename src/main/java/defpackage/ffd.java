package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;

/* renamed from: ffd */
final class ffd implements AnimationListener {
    private final /* synthetic */ ffa a;

    ffd(ffa ffa) {
        this.a = ffa;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        TextView textView = this.a.a;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
