package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

/* renamed from: ajx */
public final class ajx extends Drawable {
    private final ActionBarContainer a;

    public ajx(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        Drawable drawable;
        if (actionBarContainer.e) {
            drawable = actionBarContainer.d;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        drawable = actionBarContainer.b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        actionBarContainer = this.a;
        Drawable drawable2 = actionBarContainer.c;
        if (drawable2 != null && actionBarContainer.f) {
            drawable2.draw(canvas);
        }
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        Drawable drawable;
        if (actionBarContainer.e) {
            drawable = actionBarContainer.d;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        drawable = actionBarContainer.b;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }
}
