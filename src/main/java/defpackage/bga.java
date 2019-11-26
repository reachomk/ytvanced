package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: bga */
public final class bga extends bhy {
    public bga(int i) {
        this.a = i;
    }

    public final void a(bhn bhn) {
        bhy.d(bhn);
        bhn.a.put("android:fade:transitionAlpha", Float.valueOf(bht.b(bhn.b)));
    }

    private final Animator a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        bht.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, bht.a, new float[]{f2});
        ofFloat.addListener(new bgc(view));
        a(new bgd(view));
        return ofFloat;
    }

    public final Animator a(View view, bhn bhn) {
        float a = bga.a(bhn, 0.0f);
        if (a == 1.0f) {
            a = 0.0f;
        }
        return a(view, a, 1.0f);
    }

    public final Animator b(View view, bhn bhn) {
        return a(view, bga.a(bhn, 1.0f), 0.0f);
    }

    private static float a(bhn bhn, float f) {
        if (bhn != null) {
            Float f2 = (Float) bhn.a.get("android:fade:transitionAlpha");
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return f;
    }
}
