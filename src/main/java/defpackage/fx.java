package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.floatingactionbutton.ExtendedFloatingActionButton;

/* renamed from: fx */
public final class fx extends AnimatorListenerAdapter {
    private boolean a;
    private final /* synthetic */ gb b = null;
    private final /* synthetic */ ExtendedFloatingActionButton c;

    public fx(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.c = extendedFloatingActionButton;
    }

    public final void onAnimationStart(Animator animator) {
        ExtendedFloatingActionButton.c();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.b = 1;
        extendedFloatingActionButton.c = animator;
        this.a = false;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.b = 0;
        extendedFloatingActionButton.c = null;
        if (!this.a) {
            ExtendedFloatingActionButton.c();
        }
    }
}
