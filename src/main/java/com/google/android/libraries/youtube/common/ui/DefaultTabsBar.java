package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.amqw;
import defpackage.biw;
import defpackage.wwy;
import defpackage.xmr;
import defpackage.xoe;
import defpackage.xpp;
import defpackage.xss;

public class DefaultTabsBar extends xmr implements biw {
    private LayoutInflater a;
    private int b;
    public Rect c;
    public Paint d;
    public int e;
    public xoe f;
    private int g;
    private int h;
    private int i;
    private float j;
    private int k;
    private int l;
    private ColorStateList m;

    public DefaultTabsBar(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(int i) {
    }

    public DefaultTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public DefaultTabsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        this.a = LayoutInflater.from(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wwy.y);
        this.k = obtainStyledAttributes.getDimensionPixelSize(wwy.C, xss.a(displayMetrics, 48));
        a(obtainStyledAttributes.getColorStateList(wwy.A));
        this.l = obtainStyledAttributes.getDimensionPixelSize(wwy.B, xss.a(displayMetrics, 2));
        int color = obtainStyledAttributes.getColor(1, resources.getColor(17170443));
        this.b = obtainStyledAttributes.getResourceId(wwy.D, R.layout.tabs_bar_text_tab);
        this.g = obtainStyledAttributes.getResourceId(wwy.E, R.id.text);
        this.h = obtainStyledAttributes.getResourceId(wwy.z, R.layout.tabs_bar_image_tab);
        obtainStyledAttributes.recycle();
        this.c = new Rect();
        this.d = new Paint();
        this.d.setStyle(Style.FILL);
        this.d.setColor(color);
        setFillViewport(true);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, boolean z) {
        if (i >= 0 && i < b()) {
            View c = c(i);
            if (c != null) {
                c.setActivated(z);
                c.setSelected(z);
                xpp.a(c, false, this.e, this.f);
            }
        }
    }

    public final void a() {
        super.a();
        this.i = 0;
        this.j = 0.0f;
    }

    public final View a(View view) {
        view = super.a(view);
        if (b() == 1) {
            b(0, false);
            a(this.t, 0.0f, false);
        }
        return view;
    }

    public final View a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        View inflate = this.a.inflate(this.b, this.s, false);
        View view = (TextView) inflate.findViewById(this.g);
        ColorStateList colorStateList = this.m;
        if (colorStateList != null) {
            a(view, colorStateList);
        }
        view.setText(charSequence);
        inflate.setContentDescription(charSequence2);
        xpp.a(inflate, z, this.e, this.f);
        return a(inflate);
    }

    public final View a(CharSequence charSequence, CharSequence charSequence2) {
        return a(charSequence, charSequence2, false);
    }

    public final View a(int i, boolean z, CharSequence charSequence) {
        View view = (ImageView) this.a.inflate(this.h, this.s, false);
        view.setImageResource(i);
        ColorStateList colorStateList = this.m;
        if (colorStateList != null) {
            a(view, colorStateList);
        }
        view.setContentDescription(charSequence);
        View a = a(view);
        xpp.a(view, z, this.e, this.f);
        return a;
    }

    public final void a(int i, float f, boolean z) {
        this.i = i;
        this.j = f;
        invalidate(this.c);
        if (z) {
            View c = c(i);
            if (c != null) {
                int left = c.getLeft() + ((int) (((float) c.getWidth()) * f));
                if (i != 0) {
                    i = this.k;
                } else {
                    i = (int) (((float) this.k) * f);
                }
                scrollTo(left - i, 0);
            }
        }
    }

    public final void a(ColorStateList colorStateList) {
        this.m = (ColorStateList) amqw.a((Object) colorStateList);
        for (int i = 0; i < b(); i++) {
            View c = c(i);
            View findViewById = c.findViewById(this.g);
            if (findViewById == null) {
                findViewById = c.findViewById(R.id.image);
            }
            a(findViewById, this.m);
        }
    }

    public void a(View view, ColorStateList colorStateList) {
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(colorStateList);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i4 -= i2;
        this.c.set(0, i4 - this.l, i3 - i, i4);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.s && b() != 0) {
            int i;
            view = c(this.i);
            int left = view.getLeft();
            int right = view.getRight();
            if (abe.g(this) == 1) {
                i = this.i - 1;
            } else {
                i = this.i + 1;
            }
            if (this.j > 0.0f && i >= 0 && i < b()) {
                View c = c(i);
                left += Math.round(((float) (c.getLeft() - left)) * this.j);
                right += Math.round(((float) (c.getRight() - right)) * this.j);
            }
            canvas.drawRect((float) left, (float) this.c.top, (float) right, (float) this.c.bottom, this.d);
        }
        return drawChild;
    }

    public final void a(int i, float f, int i2) {
        a(i, f, true);
    }

    public final void b(int i) {
        b(i, false);
    }
}
