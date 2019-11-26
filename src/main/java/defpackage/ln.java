package defpackage;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;

/* renamed from: ln */
public final class ln extends AnimationCallback {
    private final /* synthetic */ lo a;

    public ln(lo loVar) {
        this.a = loVar;
    }

    public final void onAnimationStart(Drawable drawable) {
    }

    public final void onAnimationEnd(Drawable drawable) {
        this.a.a();
    }
}
