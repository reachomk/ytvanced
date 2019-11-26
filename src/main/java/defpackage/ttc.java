package defpackage;

import android.animation.ObjectAnimator;

/* renamed from: ttc */
final class ttc {
    public static ObjectAnimator a(Object obj, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, new float[]{1.0f});
        ofFloat.setInterpolator(tsg.a);
        ofFloat.setDuration(500);
        return ofFloat;
    }

    public static ObjectAnimator b(Object obj, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, new float[]{0.0f});
        ofFloat.setInterpolator(tsg.a);
        ofFloat.setDuration(500);
        return ofFloat;
    }
}
