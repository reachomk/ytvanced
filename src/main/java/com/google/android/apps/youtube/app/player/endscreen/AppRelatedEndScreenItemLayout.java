package com.google.android.apps.youtube.app.player.endscreen;

import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import defpackage.xss;

public class AppRelatedEndScreenItemLayout extends ConstraintLayout {
    private final int a;
    private final int b;

    public AppRelatedEndScreenItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.a = resources.getInteger(R.integer.app_related_end_screen_item_number);
        this.b = resources.getDimensionPixelSize(R.dimen.related_end_screen_peek_margin);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) == 0) {
            i = xss.f(getContext());
        } else {
            i = (MeasureSpec.getSize(i) + ((MarginLayoutParams) getLayoutParams()).getMarginStart()) + ((MarginLayoutParams) getLayoutParams()).getMarginEnd();
        }
        i = (i - this.b) / this.a;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i, 1073741824);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof FixedAspectRatioRelativeLayout) {
                childAt.getLayoutParams().width = (i - getPaddingStart()) - getPaddingEnd();
            }
            measureChild(childAt, makeMeasureSpec, i2);
            int i4 = ((MarginLayoutParams) childAt.getLayoutParams()).topMargin;
            paddingTop += (childAt.getMeasuredHeight() + i4) + ((MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
        }
        super.onMeasure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
    }
}
