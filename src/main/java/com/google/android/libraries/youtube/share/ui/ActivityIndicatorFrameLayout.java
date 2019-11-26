package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.aleh;
import defpackage.ttb;

public class ActivityIndicatorFrameLayout extends FrameLayout {
    private final ttb a;
    private final ColorDrawable b;
    private boolean c;

    public ActivityIndicatorFrameLayout(Context context) {
        this(context, null);
    }

    public ActivityIndicatorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityIndicatorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aleh.a, i, R.style.ActivityIndicatorLinearLayout);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        i = obtainStyledAttributes.getColor(1, 0);
        float f = obtainStyledAttributes.getFloat(2, 0.0f);
        int color = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        this.a = new ttb(dimensionPixelSize, i, f);
        this.a.setCallback(this);
        this.a.setState(getDrawableState());
        this.b = new ColorDrawable(color);
    }

    public final void a() {
        this.c = true;
        this.a.start();
        invalidate();
    }

    public final void b() {
        this.c = false;
        this.a.stop();
        invalidate();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.c) {
            canvas.save();
            canvas.clipRect(this.a.getBounds());
            this.a.draw(canvas);
            canvas.restore();
            this.b.draw(canvas);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable == drawable2) {
            invalidate(drawable2.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.jumpToCurrentState();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ttb ttb = this.a;
        ttb.setBounds(0, 0, i, ttb.a);
        this.b.setBounds(0, this.a.a, i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setState(getDrawableState());
        invalidate();
    }
}
