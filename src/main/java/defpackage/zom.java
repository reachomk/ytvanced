package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: zom */
public final class zom implements AnimatorUpdateListener {
    private final /* synthetic */ ChooseFilterView a;

    public zom(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.height = intValue;
        this.a.setLayoutParams(layoutParams);
    }
}
