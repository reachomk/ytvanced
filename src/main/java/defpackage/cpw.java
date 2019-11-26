package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: cpw */
public final class cpw extends Drawable implements Callback, crs {
    public Drawable a;
    public cod b;
    public boolean c;
    public int d;
    public int e;

    public final void a(int i, int i2) {
        this.d = i;
        this.e = i2;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public final void a(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null && drawable.isVisible() != z) {
            try {
                this.a.setVisible(z, z2);
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void draw(Canvas canvas) {
        if (this.a != null) {
            Rect bounds = getBounds();
            int save = canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            if (this.c) {
                canvas.clipRect(0, 0, bounds.width(), bounds.height());
            }
            this.a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void setChangingConfigurations(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        }
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : -1;
    }

    public final void setDither(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public final void setFilterBitmap(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public final boolean isStateful() {
        Drawable drawable = this.a;
        return drawable != null && drawable.isStateful();
    }

    public final boolean setState(int[] iArr) {
        Drawable drawable = this.a;
        return drawable != null && drawable.setState(iArr);
    }

    public final int[] getState() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getState() : null;
    }

    public final Drawable getCurrent() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getCurrent() : null;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        a(z, z2);
        return visible;
    }

    public final int getOpacity() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getOpacity() : -1;
    }

    public final Region getTransparentRegion() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getTransparentRegion() : null;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public final int getMinimumWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getMinimumWidth() : -1;
    }

    public final int getMinimumHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getMinimumHeight() : -1;
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        return drawable != null && drawable.getPadding(rect);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable != null && drawable.setLevel(i);
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

    public final boolean a(MotionEvent motionEvent, View view) {
        Rect bounds = getBounds();
        float x = motionEvent.getX();
        int i = bounds.left;
        float y = motionEvent.getY();
        this.a.setHotspot((float) (((int) x) - i), (float) (((int) y) - bounds.top));
        return false;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (VERSION.SDK_INT >= 21) {
            Drawable drawable = this.a;
            if (drawable != null && (drawable instanceof RippleDrawable) && motionEvent.getActionMasked() == 0 && getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }
}
