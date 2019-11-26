package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.xwe;

public class ActiveItemIndicatorView extends View {
    public float[] a;
    public int b;
    public int c;
    private Paint d;
    private Paint e;
    private int f;
    private int g;
    private int h;
    private float[] i;

    public ActiveItemIndicatorView(Context context) {
        super(context);
        c();
    }

    public ActiveItemIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public ActiveItemIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public ActiveItemIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c();
    }

    private final void c() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.carousel_item_indicator_size);
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.d = new Paint();
        this.d.setStrokeCap(Cap.ROUND);
        this.d.setStyle(Style.FILL_AND_STROKE);
        this.d.setStrokeWidth((float) this.f);
        this.d.setAntiAlias(true);
        this.e = new Paint();
        this.e.setStrokeCap(Cap.ROUND);
        this.e.setStyle(Style.FILL_AND_STROKE);
        this.e.setStrokeWidth((float) this.f);
        this.e.setAntiAlias(true);
        this.i = new float[2];
        a(1);
    }

    public final void a(int i) {
        if (this.h != i) {
            this.h = i;
            this.d.setColor(xwe.a(getContext(), i != 2 ? R.attr.ytStaticWhite : R.attr.ytStaticBrandRed, 0));
            this.e.setColor(xwe.a(getContext(), i != 2 ? R.attr.ytOverlayButtonInactive : R.attr.ytIconDisabled, 0));
            invalidate();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(a(), (this.f + getPaddingTop()) + getPaddingBottom());
    }

    public final int a() {
        int i = this.b;
        if (i > 0) {
            int i2 = this.f;
            int i3 = this.g;
            i = (i * (i2 + i3)) + i3;
        } else {
            i = 0;
        }
        return (i + getPaddingLeft()) + getPaddingRight();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int d = d();
        int height = getHeight() / 2;
        int i5 = 0;
        while (true) {
            float[] fArr = this.a;
            if (i5 < fArr.length) {
                fArr[i5] = (float) d;
                fArr[i5 + 1] = (float) height;
                d += this.f + this.g;
                i5 += 2;
            } else {
                b();
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        int i = this.c;
        if (i >= 0 && i < this.b) {
            canvas.drawPoints(this.a, this.e);
            canvas.drawPoints(this.i, this.d);
        }
    }

    public final void b() {
        this.i[0] = (float) (d() + (this.c * (this.f + this.g)));
        this.i[1] = (float) (getHeight() / 2);
    }

    private final int d() {
        return (getPaddingLeft() + this.g) + (this.f / 2);
    }
}
