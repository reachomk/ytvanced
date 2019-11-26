package com.google.android.apps.youtube.app.common.ui.navigationbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.youtube.R;
import defpackage.fjp;

public class NavigationBarDividerLayout extends ViewGroup {
    public final Paint a = new Paint();
    public int b;
    public int c;
    private int d;

    public NavigationBarDividerLayout(Context context) {
        super(context);
        a(context, null, R.attr.navigationBarStyle, R.style.NavigationBarDivider);
    }

    public NavigationBarDividerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, R.attr.navigationBarStyle, R.style.NavigationBarDivider);
    }

    public NavigationBarDividerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, R.style.NavigationBarDivider);
    }

    public NavigationBarDividerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fjp.a, i, i2);
        this.c = obtainStyledAttributes.getColor(fjp.b, 0);
        this.b = Math.max(0, obtainStyledAttributes.getDimensionPixelSize(fjp.c, 0));
        obtainStyledAttributes.recycle();
        this.a.setColor(this.c);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        i = getMeasuredHeight();
        i2 = this.d;
        if (i2 != 1) {
            if (i2 == 2) {
                measuredWidth -= this.b;
            } else if (i2 == 3) {
                i -= this.b;
            }
            i2 = 0;
        } else {
            i2 = this.b;
        }
        i3 = getChildCount();
        for (int i5 = 0; i5 < i3; i5++) {
            getChildAt(i5).layout(i2, 0, measuredWidth, i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3;
        if (VERSION.SDK_INT < 23) {
            this.d = 0;
        } else if ((getWindowSystemUiVisibility() & 2) != 0) {
            this.d = 0;
        } else {
            WindowInsets rootWindowInsets = getRootWindowInsets();
            if (rootWindowInsets.getStableInsetLeft() != 0) {
                this.d = 1;
            } else if (rootWindowInsets.getStableInsetRight() != 0) {
                this.d = 2;
            } else if (rootWindowInsets.getStableInsetBottom() != 0) {
                this.d = 3;
            } else {
                this.d = 0;
            }
        }
        i = MeasureSpec.getSize(i);
        i2 = MeasureSpec.getSize(i2);
        int i4 = this.d;
        if (i4 == 1 || i4 == 2) {
            i4 = i - this.b;
        } else if (i4 != 3) {
            i4 = i;
        } else {
            i3 = i2 - this.b;
            i4 = i;
            setMeasuredDimension(i, i2);
            measureChildren(MeasureSpec.makeMeasureSpec(i4, 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        i3 = i2;
        setMeasuredDimension(i, i2);
        measureChildren(MeasureSpec.makeMeasureSpec(i4, 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        int i = this.b;
        if (i != 0) {
            int i2 = this.d;
            if (i2 == 1) {
                canvas.drawRect(0.0f, 0.0f, (float) i, (float) getHeight(), this.a);
            } else if (i2 == 2) {
                canvas.drawRect((float) (getWidth() - this.b), 0.0f, (float) getWidth(), (float) getHeight(), this.a);
            } else if (i2 == 3) {
                canvas.drawRect(0.0f, (float) (getHeight() - this.b), (float) getWidth(), (float) getHeight(), this.a);
            }
        }
    }
}
