package com.google.android.apps.youtube.app.player.overlay.fullscreenengagement;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.youtube.R;
import defpackage.ijf;
import defpackage.ijg;
import defpackage.th;

public class MetadataHighlightsColumnLayout extends ConstraintLayout implements ijg {
    private final int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public MetadataHighlightsColumnLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.metadata_highlights_column_margin);
        a(context.obtainStyledAttributes(attributeSet, ijf.a, 0, 0));
    }

    public final void a(int i) {
        if (this.e != i) {
            this.e = i;
            a(getContext().obtainStyledAttributes(this.e, ijf.a));
            requestLayout();
        }
    }

    private final void a(TypedArray typedArray) {
        this.b = typedArray.getInteger(ijf.d, 1);
        this.d = th.a(typedArray.getInteger(ijf.b, 1), 1, this.b);
        this.c = typedArray.getDimensionPixelSize(ijf.c, 0);
        typedArray.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        i = MeasureSpec.getSize(i);
        int marginStart = ((MarginLayoutParams) getLayoutParams()).getMarginStart();
        int marginEnd = ((MarginLayoutParams) getLayoutParams()).getMarginEnd();
        int i3 = this.b;
        int i4 = this.a;
        i = (((i + (marginStart + marginEnd)) - ((i3 - 1) * i4)) - this.c) / i3;
        marginStart = this.d;
        super.onMeasure(MeasureSpec.makeMeasureSpec((i * marginStart) + ((marginStart - 1) * i4), 1073741824), i2);
    }
}
