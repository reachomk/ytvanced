package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.xno;
import defpackage.xpf;

public class CircularImageView extends ImageView {
    private xno a;
    private InsetDrawable b;
    private xno c;
    private float d;
    private int e;

    public CircularImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xpf.a);
        this.d = obtainStyledAttributes.getDimension(xpf.c, 0.0f);
        this.e = obtainStyledAttributes.getColor(xpf.b, -16777216);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    public final void setImageResource(int i) {
        setImageDrawable(getResources().getDrawable(i));
    }

    public final void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
    }

    public final void setImageDrawable(Drawable drawable) {
        if (drawable != null) {
            xno xno = this.a;
            if (xno == null) {
                this.a = new xno(drawable, this.d, this.e);
            } else {
                xno.a(drawable);
                invalidate();
            }
            super.setImageDrawable(this.a);
            return;
        }
        xno xno2 = this.a;
        if (xno2 != null) {
            xno2.a(null);
        }
        super.setImageDrawable(null);
    }

    public final Drawable getDrawable() {
        xno xno = this.a;
        return xno != null ? xno.a : null;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null) {
            xno xno = this.c;
            if (xno == null) {
                this.c = new xno(drawable, this.d, this.e);
            } else {
                xno.a(drawable);
            }
            a();
            invalidate();
            return;
        }
        xno xno2 = this.c;
        if (xno2 != null) {
            xno2.a(null);
        }
        super.setBackgroundDrawable(null);
    }

    private final void a() {
        if (getBackground() != null) {
            if (this.b != null) {
                Rect rect = new Rect();
                this.b.getPadding(rect);
                if (rect.left == getPaddingLeft() && rect.top == getPaddingTop() && rect.right == getPaddingRight() && rect.bottom == getPaddingBottom()) {
                    return;
                }
            }
            this.b = new InsetDrawable(this.c, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            super.setBackgroundDrawable(this.b);
        }
    }

    public final Drawable getBackground() {
        xno xno = this.c;
        return xno != null ? xno.a : null;
    }
}
