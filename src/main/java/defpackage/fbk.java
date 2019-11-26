package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* renamed from: fbk */
public final class fbk extends AnimatorListenerAdapter {
    private final /* synthetic */ BottomUiContainer a;

    public fbk(BottomUiContainer bottomUiContainer) {
        this.a = bottomUiContainer;
    }

    public final void onAnimationStart(Animator animator) {
        BottomUiContainer bottomUiContainer = this.a;
        bottomUiContainer.e = bottomUiContainer.d;
    }

    public final void onAnimationEnd(Animator animator) {
        a();
    }

    public final void onAnimationCancel(Animator animator) {
        a();
    }

    private final void a() {
        BottomUiContainer bottomUiContainer = this.a;
        bottomUiContainer.e = null;
        bottomUiContainer.f = null;
        bottomUiContainer.a(null, null);
    }
}
