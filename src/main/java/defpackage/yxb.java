package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.conversation.technodrome.view.ChatInlineFixedVideoView;

/* renamed from: yxb */
final /* synthetic */ class yxb implements AnimatorUpdateListener {
    private final ywz a;

    yxb(ywz ywz) {
        this.a = ywz;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ywz ywz = this.a;
        ywz.c.a.x = ChatInlineFixedVideoView.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), ywz.a.x, ywz.b.x);
        ywz.c.a.y = ChatInlineFixedVideoView.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), ywz.a.y, ywz.b.y);
        ywz.c.b();
    }
}
