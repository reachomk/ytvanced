package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.amqw;

public class SlimMetadataButtonView extends ViewGroup {
    public boolean a;
    private TextView b;
    private View c;

    public SlimMetadataButtonView(Context context) {
        super(context);
    }

    public SlimMetadataButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SlimMetadataButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SlimMetadataButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) amqw.a((TextView) findViewById(R.id.button_text));
        this.c = (View) amqw.a(findViewById(R.id.button_icon));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        setVisibility(!this.a ? 0 : 4);
        measureChild(this.c, i, i2);
        measureChild(this.b, i, i2);
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredHeight = this.b.getMeasuredHeight();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (MeasureSpec.getMode(i) == 1073741824) {
            i = MeasureSpec.getSize(i);
        } else {
            i = Math.max(this.c.getMeasuredWidth(), measuredWidth) + paddingLeft;
        }
        if (MeasureSpec.getMode(i2) == 1073741824) {
            i2 = MeasureSpec.getSize(i2);
        } else {
            i2 = (this.c.getMeasuredHeight() + measuredHeight) + paddingTop;
        }
        setMeasuredDimension(i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i3 -= i;
        int paddingLeft = getPaddingLeft();
        i = getPaddingRight();
        i2 = getPaddingTop();
        i4 = (i3 - paddingLeft) - i;
        i = ((i4 - this.c.getMeasuredWidth()) / 2) + paddingLeft;
        int measuredWidth = this.c.getMeasuredWidth() + i;
        int measuredHeight = this.c.getMeasuredHeight() + i2;
        paddingLeft += (i4 - this.b.getMeasuredWidth()) / 2;
        i4 = this.b.getMeasuredWidth() + paddingLeft;
        int measuredHeight2 = this.b.getMeasuredHeight() + measuredHeight;
        if (abe.g(this) == 1) {
            int i5 = i3 - i4;
            i4 = i3 - paddingLeft;
            paddingLeft = i5;
            int i6 = i3 - measuredWidth;
            measuredWidth = i3 - i;
            i = i6;
        }
        this.c.layout(i, i2, measuredWidth, measuredHeight);
        this.b.layout(paddingLeft, measuredHeight, i4, measuredHeight2);
    }
}
