package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: akiy */
final class akiy extends ImageView {
    public boolean a = false;
    public float b = 0.0f;
    public int c = 0;
    public int d = 0;
    public boolean e;

    public akiy(Context context) {
        super(context);
    }

    public final void a(Drawable drawable, boolean z, float f, int i, int i2) {
        ScaleType scaleType;
        if (i2 == 2) {
            scaleType = ScaleType.CENTER_INSIDE;
        } else if (i2 == 3) {
            scaleType = ScaleType.CENTER_CROP;
        } else if (i2 != 4) {
            scaleType = ScaleType.FIT_XY;
        } else {
            scaleType = ScaleType.CENTER;
        }
        setScaleType(scaleType);
        Drawable drawable2 = null;
        if (drawable != null) {
            if (z || f >= 0.5f) {
                if (drawable instanceof ss) {
                    drawable2 = (ss) drawable;
                } else if (drawable instanceof BitmapDrawable) {
                    drawable2 = su.a(getResources(), ((BitmapDrawable) drawable).getBitmap());
                }
                if (drawable2 != null) {
                    drawable2.a(z);
                    if (f >= 0.5f) {
                        drawable2.a(TypedValue.applyDimension(1, f, getResources().getDisplayMetrics()));
                    }
                    drawable = drawable2;
                }
            }
            if (i != 0) {
                drawable.mutate().setColorFilter(i, Mode.SRC_ATOP);
            }
            if (this.e) {
                Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), drawable});
                transitionDrawable.startTransition(getResources().getInteger(17694720));
                drawable = transitionDrawable;
            }
            super.setImageDrawable(drawable);
            return;
        }
        super.setImageDrawable(null);
    }

    public final void setImageDrawable(Drawable drawable) {
        a(drawable, this.a, this.b, this.c, this.d);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        if (this.a || this.b >= 0.5f) {
            setImageDrawable(su.a(getResources(), bitmap));
        } else {
            setImageDrawable(new BitmapDrawable(getResources(), bitmap));
        }
    }
}
