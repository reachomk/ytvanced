package com.google.android.libraries.youtube.player.features.quickseek.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import defpackage.aill;
import defpackage.xss;

public class TapBloomView extends View {
    private int a;
    public int b;
    public int c;
    private int d;
    private int e;
    private int f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int j;
    private int k;
    private Paint l;

    public TapBloomView(Context context) {
        super(context);
        a(context, null);
    }

    public TapBloomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public TapBloomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public TapBloomView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int color;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aill.a);
            i = obtainStyledAttributes.getColor(aill.d, 2146365166);
            color = obtainStyledAttributes.getColor(aill.b, 16777215);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(aill.e, (int) xss.a(displayMetrics, 40.0f));
            dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(aill.c, (int) xss.a(displayMetrics, 400.0f));
            obtainStyledAttributes.recycle();
        } else {
            color = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize = 0;
        }
        this.l = new Paint();
        this.l.setStyle(Style.FILL);
        this.g = new float[3];
        this.h = new float[3];
        this.i = new float[3];
        this.a = Color.alpha(i);
        this.d = Color.alpha(color);
        Color.colorToHSV(i, this.g);
        Color.colorToHSV(color, this.h);
        this.e = dimensionPixelSize;
        this.f = dimensionPixelSize2;
        a(0.0f);
    }

    public final void a(float f) {
        int i = this.a;
        int i2 = this.d;
        float[] fArr = this.i;
        float[] fArr2 = this.g;
        float f2 = fArr2[0];
        float[] fArr3 = this.h;
        fArr[0] = f2 + ((fArr3[0] - f2) * f);
        f2 = fArr2[1];
        fArr[1] = f2 + ((fArr3[1] - f2) * f);
        float f3 = fArr2[2];
        fArr[2] = f3 + ((fArr3[2] - f3) * f);
        this.j = Color.HSVToColor(i + ((int) (((float) (i2 - i)) * f)), fArr);
        i = this.e;
        this.k = i + ((int) (((float) (this.f - i)) * f));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(Math.max(1, MeasureSpec.getSize(i)), Math.max(1, MeasureSpec.getSize(i2)));
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.l.setColor(this.j);
        canvas.drawCircle((float) this.b, (float) this.c, (float) this.k, this.l);
    }
}
