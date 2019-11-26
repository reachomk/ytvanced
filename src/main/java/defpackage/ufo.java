package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import com.google.android.libraries.quantum.snackbar.Snackbar;

/* renamed from: ufo */
public final class ufo extends AnimatorListenerAdapter {
    private final /* synthetic */ Snackbar a;

    public ufo(Snackbar snackbar) {
        this.a = snackbar;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }

    public final void onAnimationEnd(Animator animator) {
        if (VERSION.SDK_INT < 21) {
            Snackbar snackbar = this.a;
            if (snackbar.b != 0) {
                Snackbar.a(snackbar);
            }
        }
    }
}
