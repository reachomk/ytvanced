package com.google.android.libraries.youtube.conversation.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.st;
import defpackage.xss;
import defpackage.zci;
import defpackage.zck;

public class TypingIndicatorView extends ViewGroup {
    public final ImageView[] a = new ImageView[3];
    public float b;
    private final int c;
    private final ValueAnimator d;
    private int e;

    public TypingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.c = xss.a(displayMetrics, 4);
        Drawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1);
        st.a(gradientDrawable, -12417548);
        for (int i = 0; i < 3; i++) {
            this.a[i] = new ImageView(context);
            addView(this.a[i]);
            this.a[i].setImageDrawable(gradientDrawable);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius((float) xss.a(displayMetrics, 16));
        gradientDrawable2.setColor(-1);
        setBackground(gradientDrawable2);
        this.d = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.d.setDuration(1200);
        this.d.addUpdateListener(new zci(this));
        this.d.addListener(new zck(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i5 = this.c;
        i4 = ((((i4 - i2) - paddingBottom) - paddingTop) - i5) / 2;
        i3 = ((((i3 - i) - paddingRight) - paddingLeft) - (i5 * 3)) / 2;
        this.e = i4;
        for (i2 = 0; i2 < 3; i2++) {
            ImageView imageView = this.a[i2];
            paddingBottom = this.c;
            i5 = ((paddingBottom + i3) * i2) + paddingLeft;
            int i6 = paddingTop + i4;
            imageView.layout(i5, i6, i5 + paddingBottom, paddingBottom + i6);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int indexOfChild = indexOfChild(view);
        int i = this.e;
        double max = (double) Math.max(0.0f, Math.min(1.0f, ((this.b * 3.0f) - (((float) indexOfChild) / 2.0f)) / 2.0f));
        Double.isNaN(max);
        max = Math.sin(max * 6.283185307179586d);
        canvas.save();
        double d = (double) i;
        Double.isNaN(d);
        canvas.translate(0.0f, (float) ((int) (-(d * max))));
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void a(boolean z) {
        if (z) {
            this.d.setRepeatCount(-1);
            if (!this.d.isStarted()) {
                this.d.start();
            }
            return;
        }
        this.d.setRepeatCount(0);
    }
}
