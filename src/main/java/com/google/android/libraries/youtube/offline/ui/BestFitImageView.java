package com.google.android.libraries.youtube.offline.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import defpackage.xtl;

public class BestFitImageView extends ImageView {
    public BestFitImageView(Context context) {
        super(context);
        super.setScaleType(ScaleType.MATRIX);
    }

    public BestFitImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setScaleType(ScaleType.MATRIX);
    }

    public BestFitImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ScaleType.MATRIX);
    }

    public BestFitImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        super.setScaleType(ScaleType.MATRIX);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        a();
        return frame;
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    public final void setScaleType(ScaleType scaleType) {
        xtl.c("setScaleType() is not supported for BestFitImageView");
    }

    public final void setScaleX(float f) {
        xtl.c("setScaleX()  is not supported for BestFitImageView");
    }

    public final void setScaleY(float f) {
        xtl.c("setScaleY() is not supported for BestFitImageView");
    }

    private final void a() {
        if (getDrawable() != null) {
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            Matrix matrix = new Matrix(getMatrix());
            float f = intrinsicWidth * height > width * intrinsicHeight ? ((float) height) / ((float) intrinsicHeight) : ((float) width) / ((float) intrinsicWidth);
            matrix.setScale(f, f);
            setImageMatrix(matrix);
        }
    }
}
