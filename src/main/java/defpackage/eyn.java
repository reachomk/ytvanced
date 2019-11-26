package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.common.ui.HeightTransitionLayout;

/* renamed from: eyn */
final class eyn extends AnimatorListenerAdapter {
    private final /* synthetic */ HeightTransitionLayout a;

    eyn(HeightTransitionLayout heightTransitionLayout) {
        this.a = heightTransitionLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a(-1);
    }
}
