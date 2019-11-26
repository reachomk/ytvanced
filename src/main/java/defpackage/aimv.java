package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.player.features.storyboard.ScrubbedPreviewView;

/* renamed from: aimv */
public final class aimv extends AnimatorListenerAdapter {
    private final /* synthetic */ ScrubbedPreviewView a;

    public aimv(ScrubbedPreviewView scrubbedPreviewView) {
        this.a = scrubbedPreviewView;
    }

    public final void onAnimationStart(Animator animator) {
        xpr.a(this.a, true);
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a.getAlpha() == 0.0f) {
            xpr.a(this.a, false);
            this.a.a.setImageBitmap(null);
        }
    }
}
