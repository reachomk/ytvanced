package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: agh */
final class agh extends agj {
    private final ObjectAnimator a;
    private final boolean b;

    agh(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        numberOfFrames = !z ? numberOfFrames - 1 : 0;
        agg agg = new agg(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, numberOfFrames});
        ofInt.setAutoCancel(true);
        ofInt.setDuration((long) agg.a);
        ofInt.setInterpolator(agg);
        this.b = z2;
        this.a = ofInt;
    }

    public final boolean c() {
        return this.b;
    }

    public final void a() {
        this.a.start();
    }

    public final void d() {
        this.a.reverse();
    }

    public final void b() {
        this.a.cancel();
    }
}
