package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: tb */
final class tb extends sy {
    private static Method c;

    tb(Drawable drawable) {
        super(drawable);
        tb.c();
    }

    tb(ta taVar, Resources resources) {
        super(taVar, resources);
        tb.c();
    }

    public final void setHotspot(float f, float f2) {
        this.b.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.b.setHotspotBounds(i, i2, i3, i4);
    }

    public final void getOutline(Outline outline) {
        this.b.getOutline(outline);
    }

    public final Rect getDirtyBounds() {
        return this.b.getDirtyBounds();
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            super.setTintList(colorStateList);
        } else {
            this.b.setTintList(colorStateList);
        }
    }

    public final void setTint(int i) {
        if (b()) {
            super.setTint(i);
        } else {
            this.b.setTint(i);
        }
    }

    public final void setTintMode(Mode mode) {
        if (b()) {
            super.setTintMode(mode);
        } else {
            this.b.setTintMode(mode);
        }
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.b;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public final boolean isProjected() {
        if (this.b != null) {
            Method method = c;
            if (method != null) {
                try {
                    return ((Boolean) method.invoke(this.b, new Object[0])).booleanValue();
                } catch (Exception e) {
                    Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
                }
            }
        }
        return false;
    }

    private static void c() {
        if (c == null) {
            try {
                c = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
