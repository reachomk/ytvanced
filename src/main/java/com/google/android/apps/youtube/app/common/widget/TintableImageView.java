package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.youtube.R;
import defpackage.xoe;
import defpackage.xuv;
import defpackage.xwe;
import java.lang.reflect.Array;

public class TintableImageView extends ImageView {
    public static final ColorStateList a = new ColorStateList((int[][]) Array.newInstance(int.class, new int[]{0, 0}), new int[0]);
    private static final int b = 2132018478;
    private xoe c;
    private ColorStateList d;
    private boolean e;

    public TintableImageView(Context context) {
        super(xuv.a(context, null, b));
        a();
    }

    public TintableImageView(Context context, AttributeSet attributeSet) {
        super(xuv.a(context, attributeSet, b), attributeSet);
        a();
    }

    public TintableImageView(Context context, AttributeSet attributeSet, int i) {
        super(xuv.a(context, attributeSet, b), attributeSet, i);
        a();
    }

    public TintableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(xuv.a(context, attributeSet, b), attributeSet, i, i2);
        a();
    }

    private final void a() {
        if (!this.e) {
            this.e = true;
            this.d = a;
            b();
        }
    }

    public final void setImageResource(int i) {
        setImageDrawable(getResources().getDrawable(i));
    }

    public final void setImageDrawable(Drawable drawable) {
        if (drawable == null || !this.e) {
            super.setImageDrawable(drawable);
            return;
        }
        if (this.c == null) {
            this.c = new xoe(getContext());
        }
        xoe xoe = this.c;
        ColorStateList colorStateList = this.d;
        if (colorStateList != a) {
            super.setImageDrawable(xoe.a(drawable, colorStateList));
            return;
        }
        if (xoe.b == null) {
            int a = xwe.a(xoe.a, R.attr.colorControlNormal, 0);
            int a2 = xwe.a(xoe.a, R.attr.colorControlActivated, 0);
            xoe.b = xoe.a(a2, a2, a2, a2, xwe.a(xoe.a, R.attr.colorControlSelected, a2), a);
        }
        super.setImageDrawable(xoe.b(drawable, xoe.b, Mode.SRC_IN));
    }

    public final void a(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            b();
        }
    }

    private final void b() {
        setImageDrawable(getDrawable());
    }
}
