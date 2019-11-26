package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;

/* renamed from: acsz */
public final class acsz extends AnimatorListenerAdapter {
    private final /* synthetic */ WaitingIndicatorView a;

    public acsz(WaitingIndicatorView waitingIndicatorView) {
        this.a = waitingIndicatorView;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.b.setVisibility(0);
    }
}
