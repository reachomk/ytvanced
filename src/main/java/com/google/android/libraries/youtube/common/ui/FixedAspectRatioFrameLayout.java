package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import defpackage.wwy;

public class FixedAspectRatioFrameLayout extends FrameLayout {
    public float a;

    public FixedAspectRatioFrameLayout(Context context) {
        super(context);
        this.a = 1.0f;
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wwy.d);
        this.a = obtainStyledAttributes.getFraction(wwy.e, 1, 1, 1.0f);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) == 1073741824) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec((int) (((float) MeasureSpec.getSize(i)) / this.a), 1073741824));
        } else if (MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(MeasureSpec.makeMeasureSpec((int) (((float) MeasureSpec.getSize(i2)) * this.a), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
