package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: iyk */
public final class iyk extends AnimatorListenerAdapter {
    private final /* synthetic */ View a;

    public iyk(View view) {
        this.a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
