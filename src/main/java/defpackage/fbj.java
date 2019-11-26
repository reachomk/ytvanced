package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* renamed from: fbj */
public final class fbj implements AnimatorListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ int b;
    private final /* synthetic */ BottomUiContainer c;

    public fbj(BottomUiContainer bottomUiContainer, View view, int i) {
        this.c = bottomUiContainer;
        this.a = view;
        this.b = i;
    }

    public final void onAnimationStart(Animator animator) {
        this.c.c(BottomUiContainer.a(this.a, this.b));
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.c(BottomUiContainer.a(this.a, this.b));
    }

    public final void onAnimationCancel(Animator animator) {
        this.c.c(BottomUiContainer.a(this.a, this.b));
    }

    public final void onAnimationRepeat(Animator animator) {
        this.c.c(BottomUiContainer.a(this.a, this.b));
    }
}
