package defpackage;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: eyx */
public final class eyx extends bgx {
    private static void d(bhn bhn) {
        bhn.a.put("RotateTransition:rotation", Float.valueOf(bhn.b.getRotation()));
    }

    public final void a(bhn bhn) {
        eyx.d(bhn);
    }

    public final void b(bhn bhn) {
        eyx.d(bhn);
    }

    public final Animator a(ViewGroup viewGroup, bhn bhn, bhn bhn2) {
        if (bhn == null || bhn2 == null) {
            return null;
        }
        View view = bhn2.b;
        String str = "RotateTransition:rotation";
        float floatValue = ((Float) bhn.a.get(str)).floatValue();
        float floatValue2 = ((Float) bhn2.a.get(str)).floatValue();
        if (floatValue == floatValue2) {
            return null;
        }
        view.setRotation(floatValue);
        ValueAnimator ofObject = ValueAnimator.ofObject(new FloatEvaluator(), new Object[]{Float.valueOf(floatValue), Float.valueOf(floatValue2)});
        eyz eyz = new eyz(view, floatValue, floatValue2);
        ofObject.addUpdateListener(eyz);
        ofObject.addListener(eyz);
        return ofObject;
    }
}
