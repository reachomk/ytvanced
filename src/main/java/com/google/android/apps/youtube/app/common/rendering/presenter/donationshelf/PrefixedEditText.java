package com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf;

import android.content.Context;
import android.graphics.Canvas;
import android.support.design.textfield.TextInputEditText;
import android.util.AttributeSet;

public class PrefixedEditText extends TextInputEditText {
    public String a;
    public float[] b;
    public int c;
    private boolean d;
    private int e;

    public PrefixedEditText(Context context) {
        super(context);
    }

    public PrefixedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrefixedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.d && this.a != null) {
            getPaint().getTextWidths(this.a, this.b);
            float f = 0.0f;
            for (float f2 : this.b) {
                f += f2;
            }
            i = getCompoundPaddingLeft();
            this.e = i;
            double d = (double) f;
            Double.isNaN(d);
            setPadding((((int) (d + 0.5d)) + i) + this.c, getPaddingRight(), getPaddingTop(), getPaddingBottom());
            this.d = true;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String str = this.a;
        if (str != null) {
            canvas.drawText(str, (float) this.e, (float) getLineBounds(0, null), getPaint());
        }
    }
}
