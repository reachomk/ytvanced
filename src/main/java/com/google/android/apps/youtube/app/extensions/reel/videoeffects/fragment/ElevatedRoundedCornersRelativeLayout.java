package com.google.android.apps.youtube.app.extensions.reel.videoeffects.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import defpackage.amqw;
import defpackage.gat;

public final class ElevatedRoundedCornersRelativeLayout extends RelativeLayout {
    private final Paint a;
    private final Path b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private CornerPathEffect h;

    public ElevatedRoundedCornersRelativeLayout(Context context) {
        this(context, null);
    }

    public ElevatedRoundedCornersRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ElevatedRoundedCornersRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint();
        this.b = new Path();
        amqw.a(getBackground(), (Object) "Background color is required");
        Resources resources = context.getResources();
        this.c = resources.getDimensionPixelSize(R.dimen.dynamic_sticker_shadow_radius);
        this.d = resources.getDimensionPixelSize(R.dimen.dynamic_sticker_shadow_x_offset);
        this.e = resources.getDimensionPixelSize(R.dimen.dynamic_sticker_shadow_y_offset);
        this.f = resources.getColor(R.color.dynamic_sticker_shadow_color);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, gat.b, 0, 0);
        try {
            this.a.setColor(((ColorDrawable) getBackground()).getColor());
            setBackgroundColor(0);
            setPadding((getPaddingLeft() + this.c) - this.d, (getPaddingTop() + this.c) - this.e, (getPaddingRight() + this.c) + this.d, (getPaddingBottom() + this.c) + this.e);
            float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
            if (dimension > 0.0f) {
                this.h = new CornerPathEffect(dimension);
            }
            this.g = obtainStyledAttributes.getBoolean(1, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        CornerPathEffect cornerPathEffect = this.h;
        if (cornerPathEffect != null) {
            this.a.setPathEffect(cornerPathEffect);
            this.a.setAntiAlias(true);
        } else {
            this.a.setAntiAlias(false);
        }
        if (this.g) {
            this.a.setShadowLayer((float) this.c, (float) this.d, (float) this.e, this.f);
        } else {
            this.a.clearShadowLayer();
        }
        float f = (float) (this.c - this.d);
        int width = getWidth();
        int i = this.c;
        float f2 = (float) ((width - i) - this.d);
        float f3 = (float) (i - this.e);
        float height = (float) ((getHeight() - this.c) - this.e);
        this.b.reset();
        this.b.moveTo(f, f3);
        this.b.lineTo(f2, f3);
        this.b.lineTo(f2, height);
        this.b.lineTo(f, height);
        this.b.close();
        canvas.drawPath(this.b, this.a);
    }
}
