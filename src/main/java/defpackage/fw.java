package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.floatingactionbutton.ExtendedFloatingActionButton;

/* renamed from: fw */
public final class fw extends AnimatorListenerAdapter {
    private final /* synthetic */ ExtendedFloatingActionButton a;

    public fw(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.a = extendedFloatingActionButton;
    }

    public final void onAnimationStart(Animator animator) {
        ExtendedFloatingActionButton.c();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        extendedFloatingActionButton.b = 2;
        extendedFloatingActionButton.c = animator;
    }

    public final void onAnimationEnd(Animator animator) {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        extendedFloatingActionButton.b = 0;
        extendedFloatingActionButton.c = null;
    }
}
