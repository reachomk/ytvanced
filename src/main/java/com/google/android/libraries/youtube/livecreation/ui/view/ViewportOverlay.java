package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.acll;
import defpackage.ra;

public class ViewportOverlay extends View {
    private Paint a;
    private View b;

    public ViewportOverlay(Context context) {
        super(context);
        a(context, null, 0);
    }

    public ViewportOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public ViewportOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private final void a(Context context, AttributeSet attributeSet, int i) {
        int c = ra.c(context, R.color.lc_default_viewport_overlay_color);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, acll.d, i, 0);
            try {
                c = obtainStyledAttributes.getColor(0, c);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.a = new Paint();
        this.a.setStyle(Style.FILL);
        this.a.setColor(c);
    }

    public final void a(View view) {
        this.b = view;
        postInvalidate();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        View view = this.b;
        if (view == null || view.getVisibility() != 0) {
            canvas.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), this.a);
            return;
        }
        int[] iArr = new int[2];
        this.b.getLocationInWindow(iArr);
        r1 = new int[2];
        getLocationInWindow(r1);
        iArr[0] = iArr[0] - r1[0];
        iArr[1] = iArr[1] - r1[1];
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        canvas.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) iArr[1], this.a);
        canvas.drawRect(0.0f, (float) iArr[1], (float) iArr[0], (float) getMeasuredHeight(), this.a);
        canvas.drawRect((float) (iArr[0] + width), (float) iArr[1], (float) getMeasuredWidth(), (float) getMeasuredHeight(), this.a);
        int i = iArr[0];
        canvas.drawRect((float) i, (float) (iArr[1] + height), (float) (i + width), (float) getMeasuredHeight(), this.a);
    }
}
