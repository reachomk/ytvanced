package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.aocf;
import defpackage.joa;
import defpackage.xss;
import java.util.HashMap;

public class StandaloneCollectionBadgeView extends ViewGroup {
    private TextView a;
    private TextView b;
    private HashMap c;
    private int d;

    public StandaloneCollectionBadgeView(Context context) {
        super(context);
    }

    public StandaloneCollectionBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StandaloneCollectionBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StandaloneCollectionBadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.collection_badge_icon);
        this.b = (TextView) findViewById(R.id.collection_badge_label);
        this.c = new HashMap();
        this.d = xss.a(getResources().getDisplayMetrics(), 8);
    }

    private final void a(View view, int i, int i2) {
        if (!this.c.containsKey(view)) {
            this.c.put(view, new joa(i, i2));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredWidth;
        int max;
        int measuredWidth2;
        super.onMeasure(i, i2);
        i = getPaddingLeft();
        i2 = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int measuredWidth3 = (getMeasuredWidth() - i) - paddingRight;
        this.c.clear();
        int visibility = this.b.getVisibility();
        int i3 = 0;
        if (visibility == 0) {
            measureChild(this.b, MeasureSpec.makeMeasureSpec(measuredWidth3, aocf.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = this.b.getMeasuredHeight();
            measuredWidth = this.b.getMeasuredWidth();
            max = Math.max(0, this.b.getMeasuredWidth()) + this.d;
        } else {
            measuredHeight = 0;
            measuredWidth = 0;
            max = 0;
        }
        if (this.a.getVisibility() == 0) {
            measureChild(this.a, MeasureSpec.makeMeasureSpec(measuredWidth3 - max, aocf.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth3 = this.a.getMeasuredHeight();
            measuredWidth2 = this.a.getMeasuredWidth();
            a(this.a, i, i + measuredWidth2);
        } else {
            measuredWidth3 = 0;
            measuredWidth2 = 0;
        }
        if (visibility == 0) {
            visibility = i + measuredWidth2;
            if (this.a.getVisibility() == 0) {
                i3 = this.d;
            }
            visibility += i3;
            TextView textView = this.b;
            a(textView, visibility, textView.getMeasuredWidth() + visibility);
        }
        setMeasuredDimension(((measuredWidth + measuredWidth2) + i) + paddingRight, (Math.max(measuredHeight, measuredWidth3) + i2) + paddingBottom);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i3 -= i;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && this.c.containsKey(childAt)) {
                int i6;
                int i7;
                joa joa = (joa) this.c.get(childAt);
                if (abe.g(this) == 1) {
                    i6 = i3 - joa.b;
                    i7 = i3 - joa.a;
                } else {
                    i6 = joa.a;
                    i7 = joa.b;
                }
                childAt.layout(i6, 0, i7, i4 - i2);
            }
        }
    }
}
