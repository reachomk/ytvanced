package com.google.android.apps.youtube.app.extensions.reel.videoeffects.stickers.text;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class VerticalSeekBar extends SeekBar {
    public VerticalSeekBar(Context context) {
        super(context);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i2, i, i4, i3);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    public final synchronized void setProgress(int i) {
        super.setProgress(i);
        super.onSizeChanged(getHeight(), getWidth(), 0, 0);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void onDraw(Canvas canvas) {
        canvas.rotate(-90.0f);
        canvas.translate((float) (-getHeight()), 0.0f);
        super.onDraw(canvas);
    }

    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 2) {
            setProgress((int) (((float) getMax()) * (1.0f - (motionEvent.getY() / ((float) getHeight())))));
            super.onSizeChanged(getHeight(), getWidth(), 0, 0);
            performClick();
        }
        return true;
    }
}
