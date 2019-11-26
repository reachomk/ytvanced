package com.google.android.libraries.youtube.commerce.offers.presenter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.FrameLayout;
import defpackage.aocf;

public class FractionalHeightLimitingLayout extends FrameLayout {
    private final DisplayMetrics a;
    private float b;

    public FractionalHeightLimitingLayout(Context context) {
        this(context, null);
    }

    public FractionalHeightLimitingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new DisplayMetrics();
        this.b = 0.82f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(this.a);
        super.onMeasure(i, MeasureSpec.makeMeasureSpec((int) (((float) this.a.heightPixels) * this.b), aocf.UNSET_ENUM_VALUE));
    }
}
