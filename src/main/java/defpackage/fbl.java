package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: fbl */
public final class fbl extends AnimatorListenerAdapter {
    private final /* synthetic */ View a;

    public fbl(View view) {
        this.a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
