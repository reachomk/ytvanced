package com.google.android.apps.youtube.app.red.presenter;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.aocf;
import defpackage.xss;
import java.util.HashMap;

public class CompactYpcOfferModuleView extends ViewGroup {
    public TextView a;
    public TextView b;
    public TextView c;
    private HashMap d;
    private int e;

    public CompactYpcOfferModuleView(Context context) {
        super(context);
        a();
    }

    public CompactYpcOfferModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public CompactYpcOfferModuleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public CompactYpcOfferModuleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }

    private final void a() {
        inflate(getContext(), R.layout.compact_ypc_offer_module, this);
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.subtitle);
        this.c = (TextView) findViewById(R.id.button);
        this.e = xss.a(getResources().getDisplayMetrics(), 8);
        this.d = new HashMap();
    }

    private final void a(View view, int i, int i2, int i3, int i4) {
        if (!this.d.containsKey(view)) {
            this.d.put(view, new Rect());
        }
        ((Rect) this.d.get(view)).set(i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        TextView textView;
        int measuredHeight;
        int i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int size = (MeasureSpec.getSize(i) - paddingLeft) - paddingRight;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size, aocf.UNSET_ENUM_VALUE);
        int i4 = 0;
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        this.d.clear();
        if (this.a.getVisibility() != 8) {
            this.a.measure(makeMeasureSpec, makeMeasureSpec2);
            textView = this.a;
            a(textView, paddingLeft, paddingTop, paddingLeft + textView.getMeasuredWidth(), paddingTop + this.a.getMeasuredHeight());
            measuredHeight = this.a.getMeasuredHeight() + paddingTop;
            i4 = Math.max(0, this.a.getMeasuredWidth());
            i3 = measuredHeight;
        } else {
            i3 = paddingTop;
        }
        if (this.b.getVisibility() != 8) {
            this.b.measure(makeMeasureSpec, makeMeasureSpec2);
            textView = this.b;
            a(textView, paddingLeft, i3, paddingLeft + textView.getMeasuredWidth(), i3 + this.b.getMeasuredHeight());
            i3 += this.b.getMeasuredHeight();
            i4 = Math.max(i4, this.b.getMeasuredWidth());
        }
        makeMeasureSpec = i3;
        if (this.c.getVisibility() != 8) {
            int measuredWidth;
            this.c.measure(makeMeasureSpec2, makeMeasureSpec2);
            measuredHeight = this.c.getMeasuredWidth();
            int i5 = this.e;
            if ((i4 + measuredHeight) + i5 < size) {
                measuredWidth = (paddingLeft + size) - this.c.getMeasuredWidth();
            } else {
                paddingTop = i5 + makeMeasureSpec;
                measuredWidth = paddingLeft;
            }
            textView = this.c;
            a(textView, measuredWidth, paddingTop, measuredWidth + textView.getMeasuredWidth(), paddingTop + this.c.getMeasuredHeight());
            if (this.c.getMeasuredHeight() + paddingTop > makeMeasureSpec) {
                makeMeasureSpec = paddingTop + this.c.getMeasuredHeight();
            }
        }
        setMeasuredDimension((size + paddingLeft) + paddingRight, makeMeasureSpec + paddingBottom);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i3 -= i;
        for (i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                int i5;
                int i6;
                Rect rect = (Rect) this.d.get(childAt);
                if (abe.g(this) == 1) {
                    i5 = i3 - rect.right;
                    i6 = i3 - rect.left;
                } else {
                    i5 = rect.left;
                    i6 = rect.right;
                }
                childAt.layout(i5, rect.top, i6, rect.bottom);
            }
        }
    }
}
