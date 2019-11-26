package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: bjt */
final class bjt implements AnimatorUpdateListener {
    private final /* synthetic */ bju a;

    bjt(bju bju) {
        this.a = bju;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        bju bju = this.a;
        bnt bnt = bju.l;
        if (bnt != null) {
            bnt.a(bju.b.b());
        }
    }
}
