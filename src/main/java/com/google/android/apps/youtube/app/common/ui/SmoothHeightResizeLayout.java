package com.google.android.apps.youtube.app.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import defpackage.amqw;

public class SmoothHeightResizeLayout extends ViewGroup {
    private boolean a;
    private float b;
    private int c;

    public SmoothHeightResizeLayout(Context context) {
        super(context);
        c();
    }

    public SmoothHeightResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public SmoothHeightResizeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public SmoothHeightResizeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c();
    }

    private final void c() {
        this.b = 1.0f;
        this.a = false;
    }

    public final void a() {
        this.a = true;
        this.c = getMeasuredHeight();
        this.b = 0.0f;
        requestLayout();
    }

    public final void b() {
        if (this.a) {
            this.a = false;
            this.b = 0.0f;
            requestLayout();
        }
    }

    public final void a(float f) {
        boolean z = true;
        amqw.b(f >= 0.0f);
        if (f > 1.0f) {
            z = false;
        }
        amqw.b(z);
        amqw.b(this.a);
        this.b = f;
        requestLayout();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        measureChildren(i, i2);
        i2 = 0;
        for (i = 0; i < getChildCount(); i++) {
            i2 = Math.max(i2, getChildAt(i).getMeasuredHeight());
        }
        i2 += paddingTop + paddingBottom;
        if (this.a) {
            i = this.c;
            setMeasuredDimension(size, i + ((int) (((float) (i2 - i)) * this.b)));
            return;
        }
        setMeasuredDimension(size, i2);
        this.c = i2;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        i = getPaddingTop();
        for (i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            i4 = childAt.getMeasuredHeight();
            if (this.a) {
                int i5 = this.c;
                if (i4 < i5) {
                    i4 = i5;
                }
            }
            getChildAt(i2).layout(paddingLeft, i, childAt.getMeasuredWidth() + paddingLeft, i4 + i);
        }
    }
}
