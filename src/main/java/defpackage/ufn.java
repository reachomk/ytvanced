package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: ufn */
public final class ufn extends AnimatorListenerAdapter {
    private final /* synthetic */ View a;

    public ufn(View view) {
        this.a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
