package com.google.android.libraries.youtube.player.features.quickseek.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.ra;

public class CircularClipTapBloomView extends TapBloomView {
    public int a;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Path i;
    private Paint j;

    public CircularClipTapBloomView(Context context) {
        super(context);
    }

    public CircularClipTapBloomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularClipTapBloomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g = i;
        this.h = i2;
        a();
    }

    public final void a() {
        invalidate();
        int i = this.h;
        float f = ((float) i) * 1.2f;
        this.d = f;
        int i2 = this.g;
        int i3 = (int) (f - (((float) i2) * 0.5f));
        this.e = this.a == 1 ? i2 + i3 : -i3;
        this.f = i / 2;
        Path path = this.i;
        if (path == null) {
            this.i = new Path();
        } else {
            path.reset();
        }
        if (this.j == null) {
            this.j = new Paint();
            this.j.setColor(ra.c(getContext(), R.color.quick_seek_bloom_start));
        }
        this.i.setFillType(FillType.WINDING);
        this.i.addCircle((float) this.e, (float) this.f, this.d, Direction.CW);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        if (this.j != null) {
            Path path = this.i;
            if (path != null) {
                canvas.clipPath(path);
                canvas.drawCircle((float) this.e, (float) this.f, this.d, this.j);
            }
        }
        super.onDraw(canvas);
    }
}
