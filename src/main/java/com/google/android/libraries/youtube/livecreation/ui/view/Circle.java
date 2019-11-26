package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.acll;

public class Circle extends View {
    public float a;
    public float b;
    private final Paint c;
    private final RectF d;
    private final int e;
    private final int f;
    private final int g;

    public Circle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Theme theme = context.getTheme();
        boolean z = acll.a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, z, 0, 0);
        try {
            this.e = obtainStyledAttributes.getDimensionPixelSize(0, 100);
            z = true;
            this.f = obtainStyledAttributes.getDimensionPixelSize(1, 10);
            this.a = obtainStyledAttributes.getFloat(2, 0.0f);
            this.g = obtainStyledAttributes.getColor(4, -65536);
            this.b = obtainStyledAttributes.getFloat(3, 0.0f);
            this.c = new Paint();
            this.c.setAntiAlias(z);
            this.c.setStyle(Style.STROKE);
            this.c.setStrokeWidth((float) this.f);
            this.c.setColor(this.g);
            int i = this.f;
            float f = (float) i;
            float f2 = (float) (this.e + i);
            this.d = new RectF(f, f, f2, f2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.d, this.a, this.b, false, this.c);
    }
}
