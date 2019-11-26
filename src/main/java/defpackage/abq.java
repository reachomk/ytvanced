package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: abq */
final class abq extends AnimatorListenerAdapter {
    private final /* synthetic */ abs a;
    private final /* synthetic */ View b;

    abq(abs abs, View view) {
        this.a = abs;
        this.b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.b();
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a(this.b);
    }

    public final void onAnimationStart(Animator animator) {
        this.a.a();
    }
}
