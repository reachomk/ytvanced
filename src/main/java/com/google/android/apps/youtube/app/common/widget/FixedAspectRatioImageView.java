package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import defpackage.aocf;
import defpackage.fpu;

public class FixedAspectRatioImageView extends ImageView {
    private float a;

    public FixedAspectRatioImageView(Context context) {
        this(context, null);
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fpu.a);
            try {
                this.a = obtainStyledAttributes.getFraction(0, 1, 1, this.a);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (this.a <= 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 0) {
            if (mode2 != 0) {
                float f = this.a;
                StringBuilder stringBuilder = new StringBuilder(155);
                stringBuilder.append("Aspect ratio not preserved in onMeasure: aspect ratio=");
                stringBuilder.append(f);
                stringBuilder.append(", width=");
                stringBuilder.append(size);
                stringBuilder.append(", widthMode=0, height=");
                stringBuilder.append(size2);
                stringBuilder.append(", heightMode=");
                stringBuilder.append(mode2);
                Log.w("FixedAspectRatioImageView", stringBuilder.toString());
            }
            super.onMeasure(i, i2);
        }
        i = Math.round(((float) size) / this.a);
        if (mode2 == aocf.UNSET_ENUM_VALUE) {
            size2 = Math.min(i, size2);
        } else if (mode2 != 1073741824) {
            size2 = i;
        }
        setMeasuredDimension(size, size2);
    }
}
