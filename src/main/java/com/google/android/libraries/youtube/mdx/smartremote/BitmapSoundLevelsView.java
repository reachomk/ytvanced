package com.google.android.libraries.youtube.mdx.smartremote;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.adwf;
import defpackage.xwe;

public class BitmapSoundLevelsView extends View {
    public int a;
    private final Paint b;
    private final int c;
    private int d;
    private Bitmap e;
    private Bitmap f;
    private final Rect g;
    private final Matrix h;
    private adwf i;

    public BitmapSoundLevelsView(Context context) {
        this(context, null);
    }

    public BitmapSoundLevelsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BitmapSoundLevelsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Paint();
        this.h = new Matrix();
        this.i = new adwf(this);
        this.e = BitmapFactory.decodeResource(context.getResources(), R.drawable.voice_input_sound_level_circle);
        Bitmap bitmap = this.e;
        this.c = bitmap != null ? bitmap.getWidth() : 0;
        this.g = new Rect();
        this.b.setFilterBitmap(true);
        this.b.setColorFilter(new PorterDuffColorFilter(xwe.a(context, R.attr.ytTouchResponse, 0), Mode.SRC_IN));
        setEnabled(false);
    }

    public final void setEnabled(boolean z) {
        if (z != isEnabled()) {
            super.setEnabled(z);
            a();
        }
    }

    private final void a() {
        if (isEnabled()) {
            b();
        } else {
            c();
        }
    }

    private final synchronized void b() {
        adwf adwf = this.i;
        adwf.a = true;
        adwf.sendEmptyMessage(0);
    }

    private final synchronized void c() {
        adwf adwf = this.i;
        adwf.a = false;
        adwf.removeMessages(0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        c();
        super.onDetachedFromWindow();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            a();
        } else {
            c();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            Bitmap bitmap = this.e;
            if (bitmap != null) {
                this.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        if (isEnabled()) {
            int i = this.a;
            int i2 = this.d;
            if (i > i2) {
                this.d = i2 + ((i - i2) / 4);
            } else {
                this.d = (int) (((float) i2) * 0.95f);
            }
            if (this.e != null) {
                i = getWidth();
                i2 = this.c;
                i = (((i - i2) * this.d) / 100) + i2;
                i2 = (getWidth() - i) / 2;
                Bitmap bitmap = this.e;
                Bitmap bitmap2 = this.f;
                if (i2 == 0 && bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.h, null);
                    return;
                }
                i += i2;
                this.g.set(i2, i2, i, i);
                canvas.drawBitmap(bitmap, null, this.g, this.b);
            }
        }
    }
}
