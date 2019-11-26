package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;

/* renamed from: ios */
public final class ios extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    private final /* synthetic */ NavigationDropdownView a;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.a.f == valueAnimator) {
            this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public final void onAnimationStart(Animator animator) {
        NavigationDropdownView navigationDropdownView = this.a;
        if (navigationDropdownView.f == animator) {
            navigationDropdownView.a(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        NavigationDropdownView navigationDropdownView = this.a;
        if (navigationDropdownView.f == animator) {
            navigationDropdownView.b();
            this.a.f = null;
        }
    }

    /* synthetic */ ios(NavigationDropdownView navigationDropdownView) {
        this.a = navigationDropdownView;
    }
}
