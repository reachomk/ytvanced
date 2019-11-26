package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.bottomsheet.BottomSheetBehavior;

/* renamed from: ez */
public final class ez implements AnimatorUpdateListener {
    private final /* synthetic */ BottomSheetBehavior a;

    public ez(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hu huVar = this.a.c;
        if (huVar != null) {
            hw hwVar = huVar.a;
            if (hwVar.k != floatValue) {
                hwVar.k = floatValue;
                huVar.d = true;
                huVar.invalidateSelf();
            }
        }
    }
}
