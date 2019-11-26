package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import defpackage.abe;
import defpackage.wwy;
import defpackage.xss;

public class RoundedLinearLayout extends LinearLayout {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final RectF e;
    private final Path f;
    private final Paint g;
    private float[] h;

    public RoundedLinearLayout(Context context) {
        this(context, null);
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wwy.q);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(wwy.x, xss.a(displayMetrics, 16));
        this.e = new RectF();
        this.f = new Path();
        this.a = obtainStyledAttributes.getDimensionPixelSize(wwy.w, dimensionPixelSize);
        this.b = obtainStyledAttributes.getDimensionPixelSize(wwy.u, dimensionPixelSize);
        this.c = obtainStyledAttributes.getDimensionPixelSize(wwy.t, dimensionPixelSize);
        this.d = obtainStyledAttributes.getDimensionPixelSize(wwy.v, dimensionPixelSize);
        dimensionPixelSize = obtainStyledAttributes.getColor(wwy.r, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(wwy.s, 0);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize != 0 && dimensionPixelSize2 > 0) {
            this.g = new Paint();
            this.g.setColor(dimensionPixelSize);
            this.g.setStrokeWidth((float) dimensionPixelSize2);
            this.g.setStyle(Style.STROKE);
            return;
        }
        this.g = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(i, i2);
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f);
        super.draw(canvas);
        Paint paint = this.g;
        if (paint != null) {
            canvas.drawPath(this.f, paint);
        }
        canvas.restore();
    }

    public float a() {
        return (float) this.a;
    }

    public float b() {
        return (float) this.d;
    }

    public float c() {
        return (float) this.b;
    }

    public float d() {
        return (float) this.c;
    }

    public final void a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int g = abe.g(this);
            int i3 = 0;
            int i4 = g != 0 ? 0 : 1;
            this.e.set(0.0f, 0.0f, (float) i, (float) i2);
            this.f.reset();
            if (this.h == null) {
                this.h = new float[8];
            }
            if (g != 0) {
                i3 = 1;
            }
            i3 += i3;
            this.h[i3] = a();
            this.h[i3 + 1] = a();
            i4 += i4;
            this.h[i4] = c();
            this.h[i4 + 1] = c();
            i = 3;
            i3 = g != 0 ? 3 : 2;
            i3 += i3;
            this.h[i3] = d();
            this.h[i3 + 1] = d();
            if (g != 0) {
                i = 2;
            }
            i += i;
            this.h[i] = b();
            this.h[i + 1] = b();
            this.f.addRoundRect(this.e, this.h, Direction.CW);
            this.f.close();
        }
    }
}
