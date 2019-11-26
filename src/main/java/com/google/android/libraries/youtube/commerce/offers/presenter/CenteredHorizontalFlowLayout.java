package com.google.android.libraries.youtube.commerce.offers.presenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import defpackage.abe;
import defpackage.amqw;
import defpackage.aocf;
import defpackage.wmr;

public class CenteredHorizontalFlowLayout extends ViewGroup {
    private final wmr a;

    public CenteredHorizontalFlowLayout(Context context) {
        this(context, null);
    }

    public CenteredHorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new wmr();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        this.a.a(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), mode == 0 ? Integer.MAX_VALUE : size, abe.g(this), false);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                amqw.a(marginLayoutParams.height != -1, (Object) "A child view in HorizontalFlowLayout has a layoutParam.height: MATCH_PARENT which is not supported");
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), marginLayoutParams.width), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), marginLayoutParams.height));
                this.a.a(childAt);
            }
        }
        this.a.a();
        i = a(size, mode, this.a.a.width());
        wmr wmr = this.a;
        setMeasuredDimension(i, a(size2, mode2, wmr.a.height() + wmr.b));
    }

    private static int a(int i, int i2, int i3) {
        if (i2 != aocf.UNSET_ENUM_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        } else {
            return Math.min(i3, i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        wmr wmr = this.a;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        getWidth();
        wmr.a(paddingLeft, paddingTop, paddingRight, paddingBottom, getWidth(), abe.g(this), true);
        int childCount = getChildCount();
        for (i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                this.a.a(childAt);
            }
        }
        this.a.a();
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FrameLayout.LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(new LayoutParams(-2, -2));
    }
}
