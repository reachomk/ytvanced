package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import defpackage.aocf;

public class BoundedLinearLayout extends LinearLayout {
    private static final int[] a = new int[]{16843039, 16843040};
    private int b = -1;
    private int c = -1;

    public BoundedLinearLayout(Context context) {
        super(context);
    }

    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public BoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public BoundedLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a, i, i2);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.c = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        i = MeasureSpec.getSize(i);
        i2 = MeasureSpec.getSize(i2);
        int i3 = this.b;
        if (i3 >= 0) {
            if (mode == aocf.UNSET_ENUM_VALUE) {
                mode = 1073741824;
            } else if (mode == 0) {
                i = i3;
                mode = 1073741824;
            }
            i = Math.min(i, i3);
        }
        i3 = this.c;
        if (i3 >= 0) {
            if (mode2 == aocf.UNSET_ENUM_VALUE) {
                mode2 = 1073741824;
            } else if (mode2 == 0) {
                i2 = i3;
                mode2 = 1073741824;
            }
            i2 = Math.min(i2, i3);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i, mode), MeasureSpec.makeMeasureSpec(i2, mode2));
    }
}
