package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.youtube.R;

/* renamed from: lpu */
public final class lpu extends AnimatorListenerAdapter {
    public final int a;
    public Animator b;
    public lqq c;
    public final /* synthetic */ NextGenWatchContainerLayout d;

    public lpu(NextGenWatchContainerLayout nextGenWatchContainerLayout) {
        this.d = nextGenWatchContainerLayout;
        this.a = nextGenWatchContainerLayout.getResources().getInteger(R.integer.next_gen_watch_transition_animation_duration_ms);
    }

    public final boolean a() {
        Animator animator = this.b;
        return animator != null && animator.isRunning();
    }

    public final void onAnimationEnd(Animator animator) {
        lqq lqq = this.c;
        if (lqq != null) {
            lqq.a();
        }
        b();
        this.d.a();
    }

    public final void onAnimationCancel(Animator animator) {
        b();
        this.d.a();
    }

    public final void b() {
        this.c = null;
        this.b = null;
    }
}
