package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.ads.player.ui.SkipAdButton;

/* renamed from: vzh */
final class vzh extends AnimatorListenerAdapter {
    private final /* synthetic */ SkipAdButton a;

    vzh(SkipAdButton skipAdButton) {
        this.a = skipAdButton;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.f.setVisibility(8);
    }
}
