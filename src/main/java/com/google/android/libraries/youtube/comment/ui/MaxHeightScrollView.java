package com.google.android.libraries.youtube.comment.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import defpackage.aocf;
import defpackage.wcn;

public class MaxHeightScrollView extends ScrollView {
    private int a;

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, wcn.a, 0, 0);
        try {
            this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i2) == aocf.UNSET_ENUM_VALUE) {
            i2 = Math.min(MeasureSpec.makeMeasureSpec(this.a, aocf.UNSET_ENUM_VALUE), i2);
        }
        super.onMeasure(i, i2);
    }
}
