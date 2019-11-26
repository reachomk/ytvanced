package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.youtube.R;
import defpackage.ali;
import defpackage.bai;

public class MediaRouteVolumeSlider extends ali {
    private final float a;
    private boolean b;
    private Drawable c;
    private int d;
    private int e;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = bai.b(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = !isEnabled() ? (int) (this.a * 255.0f) : 255;
        this.c.setColorFilter(this.d, Mode.SRC_IN);
        this.c.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.e, Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.d, Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public final void setThumb(Drawable drawable) {
        this.c = drawable;
        super.setThumb(!this.b ? this.c : null);
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            super.setThumb(!z ? this.c : null);
        }
    }

    public final void a(int i, int i2) {
        String str = "MediaRouteVolumeSlider";
        if (this.d != i) {
            if (Color.alpha(i) != 255) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Volume slider progress and thumb color cannot be translucent: #");
                stringBuilder.append(Integer.toHexString(i));
                Log.e(str, stringBuilder.toString());
            }
            this.d = i;
        }
        if (this.e != i2) {
            if (Color.alpha(i2) != 255) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Volume slider background color cannot be translucent: #");
                stringBuilder2.append(Integer.toHexString(i2));
                Log.e(str, stringBuilder2.toString());
            }
            this.e = i2;
        }
    }
}
