package com.google.android.apps.youtube.app.common.tutorial;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import defpackage.evu;
import defpackage.evw;
import defpackage.ewe;

public class ClingView extends View {
    public View a;
    public View b;
    public evw c;
    public OnGlobalLayoutListener d = new evu(this);
    private Paint e;
    private Paint f;
    private Paint g;
    private Bitmap h;
    private Canvas i;
    private int j;
    private int[] k;

    public ClingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ewe.a);
        int resourceId = obtainStyledAttributes.getResourceId(ewe.b, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(ewe.c, 0);
        obtainStyledAttributes.recycle();
        int color = resourceId != 0 ? context.getResources().getColor(resourceId) : -872405934;
        this.e = new Paint();
        this.e.setStyle(Style.FILL);
        this.e.setColor(color);
        this.f = new Paint();
        this.f.setStyle(Style.FILL);
        this.f.setColor(-1);
        this.f.setAntiAlias(true);
        this.f.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.g = new Paint(2);
        this.k = new int[2];
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        view = this.a;
        if (view != null) {
            view.sendAccessibilityEvent(2048);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.b != null) {
            int i;
            int max;
            Rect a = a();
            Bitmap bitmap = this.h;
            if (bitmap == null) {
                int i2 = a.right - a.left;
                i = a.bottom - a.top;
                max = Math.max(i2, i);
                if (i2 > 0 && i > 0) {
                    this.h = Bitmap.createBitmap(max, max, Config.ARGB_8888);
                    bitmap = this.h;
                } else {
                    bitmap = null;
                }
            }
            int i3 = a.top;
            i = a.bottom;
            max = a.left;
            int i4 = a.right;
            if (bitmap == null) {
                Canvas canvas2 = canvas;
            } else {
                if (this.i == null) {
                    this.i = new Canvas(bitmap);
                }
                bitmap.eraseColor(0);
                i3 -= (bitmap.getHeight() - (a.bottom - a.top)) / 2;
                int height = bitmap.getHeight() + i3;
                max -= (bitmap.getWidth() - (a.right - a.left)) / 2;
                i4 = max + bitmap.getWidth();
                i = Math.max(bitmap.getHeight(), bitmap.getWidth());
                this.i.drawRect(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight(), this.e);
                this.i.drawCircle((float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2), (float) (i / 2), this.f);
                canvas.drawBitmap(bitmap, (float) max, (float) i3, this.g);
                i = height;
            }
            float f = (float) i3;
            Canvas canvas3 = canvas;
            canvas3.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), f, this.e);
            float f2 = (float) max;
            float f3 = f;
            canvas3.drawRect(0.0f, f3, f2, (float) getMeasuredHeight(), this.e);
            float f4 = (float) i4;
            canvas3.drawRect(f4, f3, (float) getMeasuredWidth(), (float) getMeasuredHeight(), this.e);
            canvas3.drawRect(f2, (float) i, f4, (float) getMeasuredHeight(), this.e);
            evw evw = this.c;
            if (evw != null) {
                a.left = max;
                a.right = i4;
                a.top = i3;
                a.bottom = i;
                evw.a(a);
            }
        }
    }

    public final Rect a() {
        int[] iArr;
        View view = this.b;
        if (view != null) {
            iArr = new int[2];
            view.getLocationInWindow(iArr);
            getLocationInWindow(this.k);
            int i = iArr[0];
            int[] iArr2 = this.k;
            iArr[0] = i - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
        } else {
            iArr = null;
        }
        if (iArr == null) {
            return new Rect();
        }
        int i2 = iArr[0];
        int i3 = this.j;
        return new Rect(i2 - i3, iArr[1] - i3, (i2 + this.b.getWidth()) + this.j, (iArr[1] + this.b.getHeight()) + this.j);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
        }
        b();
    }

    private final void b() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        this.i = null;
    }
}
