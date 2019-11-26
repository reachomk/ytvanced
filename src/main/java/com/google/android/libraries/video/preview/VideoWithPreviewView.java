package com.google.android.libraries.video.preview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import defpackage.uhy;
import defpackage.und;
import defpackage.unf;

public class VideoWithPreviewView extends unf {
    public und a;
    private final Point l = new Point();

    public VideoWithPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final float e() {
        return 1.0f;
    }

    public final void b() {
        requestLayout();
    }

    public final void c() {
        requestLayout();
    }

    public final void d() {
        f();
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (width != 0.0f && height != 0.0f) {
            Matrix matrix = new Matrix();
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.setRotate((float) this.g, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            matrix.mapRect(rectF);
            matrix.postScale(width / rectF.width(), height / rectF.height(), f, f2);
            this.b.setTransform(matrix);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        uhy.a(MeasureSpec.getMode(i) == 1073741824);
        this.l.x = MeasureSpec.getSize(i);
        Point point = this.l;
        point.y = (int) ((((float) point.x) / this.e) + 0.5f);
        i = this.l.y;
        i2 = this.f;
        if (i > i2) {
            point = this.l;
            point.y = i2;
            point.x = (int) ((((float) point.y) * this.e) + 0.5f);
        }
        und und = this.a;
        if (und != null) {
            und.a(this.l);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(this.l.x, 1073741824), MeasureSpec.makeMeasureSpec(this.l.y, 1073741824));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            f();
        }
    }
}
