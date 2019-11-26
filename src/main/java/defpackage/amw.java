package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: amw */
final class amw extends agm {
    public boolean b = true;

    amw(Drawable drawable) {
        super(drawable);
    }

    public final boolean setState(int[] iArr) {
        return this.b ? super.setState(iArr) : false;
    }

    public final void draw(Canvas canvas) {
        if (this.b) {
            super.draw(canvas);
        }
    }

    public final void setHotspot(float f, float f2) {
        if (this.b) {
            super.setHotspot(f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.b ? super.setVisible(z, z2) : false;
    }
}
