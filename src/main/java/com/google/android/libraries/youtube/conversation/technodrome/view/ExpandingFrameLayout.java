package com.google.android.libraries.youtube.conversation.technodrome.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ExpandingFrameLayout extends FrameLayout {
    public float a;

    public ExpandingFrameLayout(Context context) {
        this(context, null);
    }

    public ExpandingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 1.0f;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), (int) (((float) childAt.getMeasuredHeight()) * this.a));
        }
    }
}
