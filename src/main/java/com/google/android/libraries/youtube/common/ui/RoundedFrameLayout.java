package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import defpackage.wwy;
import defpackage.xss;
import java.util.Arrays;

public class RoundedFrameLayout extends FrameLayout {
    private int a;
    private RectF b;
    private Path c;
    private float[] d;

    public RoundedFrameLayout(Context context) {
        super(context);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wwy.o);
        this.b = new RectF();
        this.a = obtainStyledAttributes.getDimensionPixelSize(wwy.p, xss.a(displayMetrics, 16));
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0) {
            this.b.set(0.0f, 0.0f, (float) i, (float) i2);
            Path path = this.c;
            if (path == null) {
                this.c = new Path();
            } else {
                path.reset();
            }
            if (this.d == null) {
                this.d = new float[8];
            }
            Arrays.fill(this.d, 0, 8, (float) this.a);
            this.c.addRoundRect(this.b, this.d, Direction.CW);
            this.c.close();
        }
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.c);
        super.draw(canvas);
        canvas.restore();
    }
}
