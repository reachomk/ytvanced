package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;

/* renamed from: gfw */
final class gfw implements AnimatorListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ gfz b;
    private final /* synthetic */ boolean c;

    gfw(View view, gfz gfz, boolean z) {
        this.a = view;
        this.b = gfz;
        this.c = z;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.b.b();
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.c) {
            this.a.setVisibility(8);
        }
        this.b.c();
    }
}
