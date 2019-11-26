package com.google.android.apps.youtube.app.extensions.subscriptions.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondLineHidingTextLayout extends LinearLayout {
    public SecondLineHidingTextLayout(Context context) {
        super(context);
    }

    public SecondLineHidingTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SecondLineHidingTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SecondLineHidingTextLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (getChildCount() < 2) {
            super.onMeasure(i, i2);
            return;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        super.onMeasure(i, i2);
        if ((childAt instanceof TextView) && (childAt2 instanceof TextView) && !(((TextView) childAt).getLineCount() == 1 && ((TextView) childAt2).getLineCount() == 1)) {
            childAt2.setVisibility(8);
            super.onMeasure(i, i2);
        }
    }
}
