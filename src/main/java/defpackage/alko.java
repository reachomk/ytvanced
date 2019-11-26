package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: alko */
final class alko extends AnimatorListenerAdapter {
    private final /* synthetic */ alkc a;

    alko(alkc alkc) {
        this.a = alkc;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.ai.a(alkv.REVEAL_THIRD_PARTY_NETWORK_SECTION_ANIMATION);
    }
}
