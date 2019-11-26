package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: fbm */
public final class fbm extends AnimatorListenerAdapter {
    private final /* synthetic */ View a;

    public fbm(View view) {
        this.a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        if (view instanceof fbo) {
            ((fbo) view).a();
        }
    }
}
