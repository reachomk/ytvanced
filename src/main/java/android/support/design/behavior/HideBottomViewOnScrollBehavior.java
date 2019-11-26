package android.support.design.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aux;
import defpackage.dq;
import defpackage.et;

public class HideBottomViewOnScrollBehavior extends aux {
    public ViewPropertyAnimator a;
    private int b = 0;
    private int c = 2;

    public final boolean a(View view, int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.b = view.getMeasuredHeight() + ((MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, int i, int i2) {
        int i3 = this.c;
        ViewPropertyAnimator viewPropertyAnimator;
        if (i3 != 1 && i > 0) {
            viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.c = 1;
            a(view, this.b, 175, dq.c);
            return;
        }
        if (i3 != 2 && i < 0) {
            viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.c = 2;
            a(view, 0, 225, dq.d);
        }
    }

    private final void a(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new et(this));
    }
}
