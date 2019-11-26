package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;

/* renamed from: acta */
public final class acta extends AnimatorListenerAdapter {
    private final /* synthetic */ WaitingIndicatorView a;

    public acta(WaitingIndicatorView waitingIndicatorView) {
        this.a = waitingIndicatorView;
    }

    public final void onAnimationStart(Animator animator) {
        WaitingIndicatorView waitingIndicatorView = this.a;
        if (waitingIndicatorView.e) {
            if (waitingIndicatorView.f) {
                waitingIndicatorView.c.setText(String.format("%d", new Object[]{Integer.valueOf(waitingIndicatorView.g)}));
                this.a.c.setVisibility(0);
            }
            waitingIndicatorView = this.a;
            waitingIndicatorView.g--;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        WaitingIndicatorView waitingIndicatorView = this.a;
        if (waitingIndicatorView.f) {
            waitingIndicatorView.c.setVisibility(8);
        }
        waitingIndicatorView = this.a;
        if (!waitingIndicatorView.e || waitingIndicatorView.g > 0) {
            animator.start();
            return;
        }
        actc actc = waitingIndicatorView.d;
        if (actc != null) {
            actc.af();
        }
    }
}
