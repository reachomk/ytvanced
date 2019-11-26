package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup.LayoutParams;

/* renamed from: amjy */
final class amjy extends AnimatorListenerAdapter {
    private final /* synthetic */ LayoutParams a;
    private final /* synthetic */ int b;
    private final /* synthetic */ amjw c;

    amjy(amjw amjw, LayoutParams layoutParams, int i) {
        this.c = amjw;
        this.a = layoutParams;
        this.b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.b.setAlpha(1.0f);
        this.c.b.setTranslationX(0.0f);
        this.a.height = this.b;
        this.c.b.setLayoutParams(this.a);
    }
}
