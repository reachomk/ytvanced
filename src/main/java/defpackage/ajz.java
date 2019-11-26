package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: ajz */
public final class ajz extends AnimatorListenerAdapter {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public ajz(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.h = null;
        actionBarOverlayLayout.e = false;
    }

    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.h = null;
        actionBarOverlayLayout.e = false;
    }
}
