package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;

/* renamed from: kyq */
public final class kyq implements AnimatorListener {
    public View a;
    public int b;
    private boolean c;
    private final /* synthetic */ SwipeToContainerFrameLayout d;

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.c = false;
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        if (view != null && !this.c) {
            view.setVisibility(8);
            SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.d;
            int i = this.b;
            swipeToContainerFrameLayout.d = i;
            this.a = null;
            kyn kyn = swipeToContainerFrameLayout.g;
            if (kyn == null) {
                return;
            }
            if (i == 1) {
                kyn.a(swipeToContainerFrameLayout.e);
            } else {
                kyn.c();
            }
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.c = true;
    }

    public /* synthetic */ kyq(SwipeToContainerFrameLayout swipeToContainerFrameLayout) {
        this.d = swipeToContainerFrameLayout;
    }
}
