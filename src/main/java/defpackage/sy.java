package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: sy */
class sy extends Drawable implements Callback, sw, sz {
    public static final Mode a = Mode.SRC_IN;
    public Drawable b;
    private int c;
    private Mode d;
    private boolean e;
    private ta f;
    private boolean g;

    sy(ta taVar, Resources resources) {
        this.f = taVar;
        taVar = this.f;
        if (taVar != null) {
            ConstantState constantState = taVar.b;
            if (constantState != null) {
                a(constantState.newDrawable(resources));
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean b() {
        return true;
    }

    sy(Drawable drawable) {
        this.f = c();
        a(drawable);
    }

    public final void jumpToCurrentState() {
        this.b.jumpToCurrentState();
    }

    public final void draw(Canvas canvas) {
        this.b.draw(canvas);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final void setChangingConfigurations(int i) {
        this.b.setChangingConfigurations(i);
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        ta taVar = this.f;
        return (changingConfigurations | (taVar != null ? taVar.getChangingConfigurations() : 0)) | this.b.getChangingConfigurations();
    }

    public final void setDither(boolean z) {
        this.b.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.b.setFilterBitmap(z);
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = null;
        if (b()) {
            ta taVar = this.f;
            if (taVar != null) {
                colorStateList = taVar.c;
            }
        }
        return (colorStateList != null && colorStateList.isStateful()) || this.b.isStateful();
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.b.setState(iArr);
    }

    public final int[] getState() {
        return this.b.getState();
    }

    public final Drawable getCurrent() {
        return this.b.getCurrent();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.b.setVisible(z, z2);
    }

    public final int getOpacity() {
        return this.b.getOpacity();
    }

    public final Region getTransparentRegion() {
        return this.b.getTransparentRegion();
    }

    public final int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }

    public final int getMinimumWidth() {
        return this.b.getMinimumWidth();
    }

    public final int getMinimumHeight() {
        return this.b.getMinimumHeight();
    }

    public final boolean getPadding(Rect rect) {
        return this.b.getPadding(rect);
    }

    public final void setAutoMirrored(boolean z) {
        this.b.setAutoMirrored(z);
    }

    public final boolean isAutoMirrored() {
        return this.b.isAutoMirrored();
    }

    public final ConstantState getConstantState() {
        ta taVar = this.f;
        if (taVar == null || taVar.b == null) {
            return null;
        }
        taVar.a = getChangingConfigurations();
        return this.f;
    }

    public final Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.f = c();
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.mutate();
            }
            ta taVar = this.f;
            if (taVar != null) {
                Drawable drawable2 = this.b;
                taVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    private final ta c() {
        return new ta(this.f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onLevelChange(int i) {
        return this.b.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f.c = colorStateList;
        a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f.d = mode;
        a(getState());
    }

    private final boolean a(int[] iArr) {
        if (b()) {
            ta taVar = this.f;
            ColorStateList colorStateList = taVar.c;
            Mode mode = taVar.d;
            if (colorStateList == null || mode == null) {
                this.e = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!(this.e && colorForState == this.c && mode == this.d)) {
                    setColorFilter(colorForState, mode);
                    this.c = colorForState;
                    this.d = mode;
                    this.e = true;
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable a() {
        return this.b;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            ta taVar = this.f;
            if (taVar != null) {
                taVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
