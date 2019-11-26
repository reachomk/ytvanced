package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;

public class AnchorableTopPeekingScrollView extends TopPeekingScrollView {
    public boolean n;
    public int o;
    public int p;

    public AnchorableTopPeekingScrollView(Context context) {
        this(context, null);
    }

    public AnchorableTopPeekingScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnchorableTopPeekingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(boolean z) {
        if (this.n && !z) {
            this.p = 0;
            a(0, this.k);
            b(0);
            z = false;
        }
        this.n = z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredHeight();
        this.o = i;
        if (this.n) {
            i2 = this.p;
            if (i2 != 0) {
                int i3 = this.k;
                i = Math.min((i2 + (i3 + i3)) - i, i3);
                a(i, i);
                if (this.j.isFinished()) {
                    a(i);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.n) {
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                i3 -= i;
                childAt.layout((i3 - childAt.getMeasuredWidth()) / 2, i2 + this.k, ((i3 - childAt.getMeasuredWidth()) / 2) + childAt.getMeasuredWidth(), i4);
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.n && super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.n && super.onTouchEvent(motionEvent);
    }
}
