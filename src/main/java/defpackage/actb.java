package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;

/* renamed from: actb */
public final class actb extends AnimatorListenerAdapter {
    private final /* synthetic */ WaitingIndicatorView a;

    public actb(WaitingIndicatorView waitingIndicatorView) {
        this.a = waitingIndicatorView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b.setVisibility(8);
    }
}
