package com.google.android.apps.youtube.app.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import defpackage.amqw;

public class HeightTransitionLayout extends FrameLayout {
    public int a = 0;
    private int b = -1;

    public HeightTransitionLayout(Context context) {
        super(context);
    }

    public HeightTransitionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeightTransitionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HeightTransitionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        amqw.b(getChildCount() == 0, (Object) "HeightTransitionLayout only supports a single child.");
        super.addView(view, i, layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a = getMeasuredHeight();
        if (this.b != -1) {
            setMeasuredDimension(resolveSize(getMeasuredWidth(), i), resolveSize(this.b, i2));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (this.b != -1 && childAt != null && childAt.getHeight() < getHeight()) {
            childAt.setBottom(childAt.getTop() + getHeight());
        }
    }

    public final void a(int i) {
        this.b = i;
        requestLayout();
    }
}
