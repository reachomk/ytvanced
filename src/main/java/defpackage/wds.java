package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* renamed from: wds */
public final class wds extends AnimatorListenerAdapter {
    private final Handler a = new Handler();
    private final View b;
    private final /* synthetic */ wdn c;

    public wds(wdn wdn, View view) {
        this.c = wdn;
        this.b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        animator = wdn.a(this.b, 0);
        if (animator != null) {
            animator.addListener(new wdq());
            Handler handler = this.a;
            animator.getClass();
            handler.post(new wdr(animator));
            this.c.b.put(this.b, animator);
        }
    }
}
