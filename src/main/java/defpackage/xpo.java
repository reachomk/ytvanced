package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

/* renamed from: xpo */
public final class xpo extends xog {
    private ColorFilter a;
    private ColorStateList b;
    private Mode c;
    private int d;

    public xpo(Drawable drawable, ColorStateList colorStateList, Mode mode) {
        super(drawable);
        this.b = colorStateList;
        this.c = mode;
        xoe.a((Drawable) this, this.b, this.c);
    }

    public final boolean isStateful() {
        if (VERSION.SDK_INT >= 21) {
            return super.isStateful();
        }
        ColorStateList colorStateList = this.b;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final boolean setState(int[] iArr) {
        if (VERSION.SDK_INT >= 21) {
            return super.setState(iArr);
        }
        boolean state = super.setState(iArr);
        ColorStateList colorStateList = this.b;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.d);
            if (colorForState != this.d) {
                if (colorForState != 0) {
                    setColorFilter(colorForState, this.c);
                } else {
                    clearColorFilter();
                }
                this.d = colorForState;
                return true;
            }
        }
        if (!state) {
            return false;
        }
        return true;
    }

    private final void a() {
        xoe.a((Drawable) this, this.b, this.c);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.a = colorFilter;
    }

    public final ColorFilter getColorFilter() {
        return this.a;
    }

    public final void setTint(int i) {
        this.b = ColorStateList.valueOf(i);
        if (VERSION.SDK_INT >= 21) {
            super.setTint(i);
        } else {
            a();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        if (VERSION.SDK_INT >= 21) {
            super.setTintList(colorStateList);
        } else {
            a();
        }
    }

    public final void setTintMode(Mode mode) {
        this.c = mode;
        if (VERSION.SDK_INT >= 21) {
            super.setTintMode(mode);
        } else {
            a();
        }
    }
}
