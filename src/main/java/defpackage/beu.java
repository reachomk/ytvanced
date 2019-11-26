package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: beu */
final class beu implements AnimatorListener {
    private final /* synthetic */ bet a;
    private final /* synthetic */ bes b;

    beu(bes bes, bet bet) {
        this.b = bes;
        this.a = bet;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }

    public final void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        this.a.c();
        bet bet = this.a;
        bet.a(bet.a());
        bes bes = this.b;
        if (bes.d) {
            bes.d = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.a.a(false);
            return;
        }
        bes.c += 1.0f;
    }
}
