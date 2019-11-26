package com.google.android.apps.youtube.app.extensions.reel.videoeffects.stickers.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.gat;

public class ColorChip extends View {
    public int a;
    public int b;
    public int c;
    public int d;
    private final Context e;
    private final int f;
    private final Paint g;

    public ColorChip(Context context) {
        this(context, null);
    }

    public ColorChip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Paint();
        this.e = context;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, gat.a, 0, 0);
        try {
            this.a = obtainStyledAttributes.getColor(0, a(R.color.text_color_white));
            this.b = obtainStyledAttributes.getColor(1, 0);
            this.c = obtainStyledAttributes.getColor(2, this.a);
            this.d = obtainStyledAttributes.getColor(3, this.b);
            this.f = a(R.color.text_color_chip_stroke_color);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final int a(int i) {
        return this.e.getResources().getColor(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            int paddingLeft = getPaddingLeft();
            int width = ((getWidth() - paddingLeft) - getPaddingRight()) / 2;
            int height = getHeight();
            this.g.setColor(this.f);
            float f = (float) (height / 2);
            float f2 = (float) (paddingLeft + width);
            float f3 = (float) width;
            canvas.drawCircle(f, f2, f3, this.g);
            this.g.setColor(this.a);
            canvas.drawCircle(f, f2, f3 - this.e.getResources().getDimension(R.dimen.text_color_chip_stroke_width), this.g);
        }
    }
}
