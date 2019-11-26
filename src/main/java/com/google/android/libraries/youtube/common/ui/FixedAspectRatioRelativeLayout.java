package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import defpackage.wwy;

public class FixedAspectRatioRelativeLayout extends RelativeLayout {
    public float a;
    private boolean b;
    private int c;
    private int d;

    public FixedAspectRatioRelativeLayout(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
    }

    public FixedAspectRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wwy.f);
        this.a = obtainStyledAttributes.getFraction(wwy.g, 1, 1, 1.0f);
        this.b = obtainStyledAttributes.getBoolean(wwy.h, false);
        this.c = obtainStyledAttributes.getDimensionPixelSize(wwy.j, Integer.MAX_VALUE);
        this.d = obtainStyledAttributes.getDimensionPixelSize(wwy.i, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
    }

    public final void a(int i) {
        this.c = i;
        requestLayout();
    }

    public final void b(int i) {
        this.d = i;
        requestLayout();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (this.b) {
            super.onMeasure(i, i2);
        } else if (MeasureSpec.getMode(i) == 1073741824) {
            i = Math.min(this.c, MeasureSpec.getSize(i));
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec((int) (((float) i) / this.a), 1073741824));
        } else if (MeasureSpec.getMode(i2) == 1073741824) {
            i = Math.min(this.d, MeasureSpec.getSize(i2));
            super.onMeasure(MeasureSpec.makeMeasureSpec((int) (((float) i) * this.a), 1073741824), MeasureSpec.makeMeasureSpec(i, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }
}
