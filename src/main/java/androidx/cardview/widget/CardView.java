package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.aocf;
import defpackage.aug;
import defpackage.aui;
import defpackage.auk;
import defpackage.aum;
import defpackage.aun;
import defpackage.auq;

public class CardView extends FrameLayout {
    public static final auq a;
    private static final int[] i = new int[]{16842801};
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public final Rect f;
    public final Rect g;
    public final aun h;

    public CardView(Context context) {
        this(context, null);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int color;
        super(context, attributeSet, i);
        this.f = new Rect();
        this.g = new Rect();
        this.h = new aui(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aug.a, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(aug.d)) {
            colorStateList = obtainStyledAttributes.getColorStateList(aug.d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(i);
            color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i = getResources().getColor(R.color.cardview_light_background);
            } else {
                i = getResources().getColor(R.color.cardview_dark_background);
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        ColorStateList colorStateList2 = colorStateList;
        float dimension = obtainStyledAttributes.getDimension(aug.e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(aug.f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(aug.g, 0.0f);
        this.b = obtainStyledAttributes.getBoolean(aug.i, false);
        this.c = obtainStyledAttributes.getBoolean(aug.h, true);
        color = obtainStyledAttributes.getDimensionPixelSize(aug.j, 0);
        this.f.left = obtainStyledAttributes.getDimensionPixelSize(aug.l, color);
        this.f.top = obtainStyledAttributes.getDimensionPixelSize(aug.n, color);
        this.f.right = obtainStyledAttributes.getDimensionPixelSize(aug.m, color);
        this.f.bottom = obtainStyledAttributes.getDimensionPixelSize(aug.k, color);
        float f = dimension2 <= dimension3 ? dimension3 : dimension2;
        this.d = obtainStyledAttributes.getDimensionPixelSize(aug.c, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(aug.b, 0);
        obtainStyledAttributes.recycle();
        a.a(this.h, context, colorStateList2, dimension, dimension2, f);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (a instanceof aum) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == aocf.UNSET_ENUM_VALUE || mode == 1073741824) {
            i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) a.b(this.h)), MeasureSpec.getSize(i)), mode);
        }
        mode = MeasureSpec.getMode(i2);
        if (mode == aocf.UNSET_ENUM_VALUE || mode == 1073741824) {
            i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) a.c(this.h)), MeasureSpec.getSize(i2)), mode);
        }
        super.onMeasure(i, i2);
    }

    public final void setMinimumWidth(int i) {
        this.d = i;
        super.setMinimumWidth(i);
    }

    public final void setMinimumHeight(int i) {
        this.e = i;
        super.setMinimumHeight(i);
    }

    public final void a(int i) {
        a.a(this.h, ColorStateList.valueOf(i));
    }

    public final void a(float f) {
        a.a(this.h, f);
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            a = new aum();
        } else {
            a = new auk();
        }
        a.a();
    }
}
