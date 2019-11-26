package com.google.android.apps.youtube.app.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import defpackage.eyw;

public class ResponsiveShelfLinearLayout extends LinearLayout {
    private final int a;
    private final int b;
    private final int c;

    public ResponsiveShelfLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eyw.e);
        this.a = obtainStyledAttributes.getInteger(eyw.f, 1);
        this.b = obtainStyledAttributes.getDimensionPixelSize(eyw.g, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(eyw.h, 0);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        i = MeasureSpec.getSize(i);
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            i += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        int i3 = this.a;
        super.onMeasure(MeasureSpec.makeMeasureSpec(((i - ((i3 + 1) * this.b)) - this.c) / i3, 1073741824), i2);
    }
}
