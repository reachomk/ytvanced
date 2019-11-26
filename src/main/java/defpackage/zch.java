package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.conversation.ui.StickyPlayerContainer;

/* renamed from: zch */
final class zch extends AnimatorListenerAdapter {
    private final /* synthetic */ zcf a;

    zch(zcf zcf) {
        this.a = zcf;
    }

    public final void onAnimationEnd(Animator animator) {
        zcf zcf = this.a;
        zcf.c = false;
        StickyPlayerContainer stickyPlayerContainer = zcf.d;
        if (stickyPlayerContainer.e) {
            stickyPlayerContainer.e = false;
            zcg zcg = stickyPlayerContainer.c;
            if (zcg != null) {
                zcg.k();
            }
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.c = false;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.c = true;
    }
}
