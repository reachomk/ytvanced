package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* renamed from: fbg */
public final /* synthetic */ class fbg implements AnimatorUpdateListener {
    private final BottomUiContainer a;
    private final View b;
    private final int c;

    public fbg(BottomUiContainer bottomUiContainer, View view, int i) {
        this.a = bottomUiContainer;
        this.b = view;
        this.c = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c(BottomUiContainer.a(this.b, this.c));
    }
}
