package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;

/* renamed from: gah */
final class gah extends AnimatorListenerAdapter {
    private final FrameSequenceDrawable a;
    private final ImageView b;

    public final void onAnimationEnd(Animator animator) {
        this.b.setVisibility(4);
        this.b.setAlpha(1.0f);
        this.a.setVisible(false, true);
    }

    /* synthetic */ gah(FrameSequenceDrawable frameSequenceDrawable, ImageView imageView) {
        this.a = frameSequenceDrawable;
        this.b = imageView;
    }
}
