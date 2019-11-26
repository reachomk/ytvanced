package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* renamed from: jvq */
final class jvq extends AnimatorListenerAdapter {
    private final /* synthetic */ jvo a;

    jvq(jvo jvo) {
        this.a = jvo;
    }

    public final void onAnimationEnd(Animator animator) {
        ImageView imageView = this.a.l;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }
}
