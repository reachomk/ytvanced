package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: eg */
public final class eg extends LayoutParams {
    public int a = 1;
    public Interpolator b;

    public eg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eo.b);
        this.a = obtainStyledAttributes.getInt(eo.c, 0);
        if (obtainStyledAttributes.hasValue(eo.d)) {
            this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(eo.d, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public eg() {
        super(-1, -2);
    }

    public eg(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public eg(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public eg(LayoutParams layoutParams) {
        super(layoutParams);
    }
}
