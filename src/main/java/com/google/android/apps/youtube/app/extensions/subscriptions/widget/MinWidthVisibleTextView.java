package com.google.android.apps.youtube.app.extensions.subscriptions.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

public class MinWidthVisibleTextView extends YouTubeTextView {
    private int a = getVisibility();

    public MinWidthVisibleTextView(Context context) {
        super(context);
    }

    public MinWidthVisibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MinWidthVisibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onMeasure(int i, int i2) {
        if (getVisibility() == 8 || (getVisibility() == 4 && this.a == 4)) {
            super.onMeasure(i, i2);
            return;
        }
        if ((MeasureSpec.getMode(i) != 0 ? MeasureSpec.getSize(i) : Integer.MAX_VALUE) >= getMinimumWidth()) {
            int visibility = getVisibility();
            int i3 = this.a;
            if (visibility != i3) {
                a(i3, false);
            }
            super.onMeasure(i, i2);
            return;
        }
        if (getVisibility() != 4) {
            a(4, false);
        }
        setMeasuredDimension(0, 0);
    }

    public final void setVisibility(int i) {
        a(i, true);
    }

    private final void a(int i, boolean z) {
        if (z) {
            this.a = i;
        }
        super.setVisibility(i);
    }
}
