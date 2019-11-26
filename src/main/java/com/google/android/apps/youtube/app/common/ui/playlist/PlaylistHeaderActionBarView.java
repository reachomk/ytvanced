package com.google.android.apps.youtube.app.common.ui.playlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import defpackage.abe;
import defpackage.aocf;
import defpackage.fli;
import defpackage.flk;
import defpackage.flq;
import defpackage.xss;

public class PlaylistHeaderActionBarView extends ViewGroup {
    private static final fli a = new fli(0, 0);
    private boolean b;
    private View c;
    private int d;
    private int e;

    public PlaylistHeaderActionBarView(Context context) {
        super(context);
        a(context, null);
    }

    public PlaylistHeaderActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public PlaylistHeaderActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public PlaylistHeaderActionBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        this.d = xss.a(getResources().getDisplayMetrics(), 8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, flq.a);
        this.e = obtainStyledAttributes.getResourceId(flq.b, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null && view.getId() == this.e) {
            this.c = view;
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view != null && view.getId() == this.e) {
            this.c = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        i2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        i = (MeasureSpec.getSize(i) - i2) - paddingRight;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i, aocf.UNSET_ENUM_VALUE);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        fli a = a(this.c, makeMeasureSpec, makeMeasureSpec2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.c) {
                fli a2 = a(childAt, makeMeasureSpec, makeMeasureSpec2);
                i4 += a2.a;
                i3 = Math.max(i3, a2.b);
            }
        }
        View view = this.c;
        if (view == null || view.getVisibility() == 8 || i >= a.a + i4) {
            i3 = Math.max(i3, a.b);
            this.b = false;
        } else {
            i3 = (i3 + this.d) + a.b;
            this.b = true;
        }
        setMeasuredDimension(Math.min(i, i4 + a.a) + (i2 + paddingRight), i3 + (paddingTop + paddingBottom));
    }

    private final fli a(View view, int i, int i2) {
        if (view == null || view.getVisibility() == 8) {
            return a;
        }
        measureChildWithMargins(view, i, 0, i2, 0);
        flk flk = (flk) view.getLayoutParams();
        int i3 = 0;
        i2 = view.getMeasuredWidth() + (flk != null ? flk.leftMargin + flk.rightMargin : 0);
        int measuredHeight = view.getMeasuredHeight();
        if (flk != null) {
            i3 = flk.topMargin + flk.bottomMargin;
        }
        return new fli(i2, measuredHeight + i3);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        i4 = (i4 - i2) - getPaddingBottom();
        i3 = (i3 - i) - getPaddingRight();
        i2 = 0;
        Object obj = 1;
        if (abe.g(this) != 1) {
            obj = null;
        }
        View view = this.c;
        if (!(view == null || view.getVisibility() == 8 || !this.b)) {
            flk flk = (flk) this.c.getLayoutParams();
            i4 -= flk.bottomMargin;
            measuredHeight = i4 - this.c.getMeasuredHeight();
            i5 = (measuredHeight - flk.topMargin) - this.d;
            if (obj != null) {
                i = i3 - flk.rightMargin;
                measuredWidth = i - this.c.getMeasuredWidth();
            } else {
                measuredWidth = paddingLeft + flk.leftMargin;
                i = this.c.getMeasuredWidth() + measuredWidth;
            }
            this.c.layout(measuredWidth, measuredHeight, i, i4);
            i4 = i5;
        }
        while (i2 < getChildCount()) {
            view = getChildAt(i2);
            if (!(view.getVisibility() == 8 || (view == this.c && this.b))) {
                int measuredWidth2;
                flk flk2 = (flk) view.getLayoutParams();
                i5 = view.getMeasuredHeight();
                measuredWidth = (((((i4 - paddingTop) - i5) / 2) + paddingTop) + flk2.topMargin) - flk2.bottomMargin;
                i5 += measuredWidth;
                if (obj != null) {
                    i3 -= flk2.rightMargin;
                    measuredWidth2 = i3 - view.getMeasuredWidth();
                    int i6 = measuredWidth2 - flk2.leftMargin;
                    measuredHeight = paddingLeft;
                    paddingLeft = i3;
                    i3 = i6;
                } else {
                    measuredWidth2 = flk2.leftMargin + paddingLeft;
                    paddingLeft = view.getMeasuredWidth() + measuredWidth2;
                    measuredHeight = flk2.rightMargin + paddingLeft;
                }
                view.layout(measuredWidth2, measuredWidth, paddingLeft, i5);
                paddingLeft = measuredHeight;
            }
            i2++;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof flk;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new flk();
    }
}
