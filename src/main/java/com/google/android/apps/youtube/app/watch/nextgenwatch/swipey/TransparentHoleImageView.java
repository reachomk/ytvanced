package com.google.android.apps.youtube.app.watch.nextgenwatch.swipey;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.widget.ImageView;

public class TransparentHoleImageView extends ImageView {
    private final Rect a = new Rect();

    public TransparentHoleImageView(Context context) {
        super(context);
    }

    public TransparentHoleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TransparentHoleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TransparentHoleImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void draw(Canvas canvas) {
        if (this.a.isEmpty()) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(this.a, Op.DIFFERENCE);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final void a(Rect rect) {
        if (!this.a.equals(rect)) {
            this.a.set(rect);
            invalidate();
        }
    }
}
