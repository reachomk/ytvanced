package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBar;

/* renamed from: emi */
public final class emi extends emp {
    public final /* synthetic */ InlineTimeBar a;

    public emi(InlineTimeBar inlineTimeBar) {
        this.a = inlineTimeBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
        if (b() == 0.0f) {
            this.a.b();
        }
    }
}
