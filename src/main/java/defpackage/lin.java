package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.youtube.R;

/* renamed from: lin */
public final class lin {
    public final float a;
    public final float b;
    public final int c;

    public lin(Context context, zyw zyw) {
        aulu aulu;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.flexy_default_min_metadata_view_height);
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.flexy_default_max_screen_ratio, typedValue, true);
        float f = typedValue.getFloat();
        resources.getValue(R.dimen.flexy_default_min_height_aspect_ratio, typedValue, true);
        float f2 = typedValue.getFloat();
        resources.getValue(R.dimen.flexy_default_engagement_panel_max_height_aspect_ratio, typedValue, true);
        typedValue.getFloat();
        if ((zyw.a().a & 16) != 0) {
            aulu = zyw.a().e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
        } else {
            aulu = null;
        }
        if (aulu != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            float f3 = aulu.C;
            if (f3 <= 0.0f) {
                f3 = f2;
            }
            this.a = f3;
            f3 = aulu.D;
            if (f3 <= 0.0f) {
                f3 = f;
            }
            this.b = f3;
            f3 = aulu.E;
            if (f3 > 0.0f) {
                dimensionPixelSize = xss.a(displayMetrics, (int) f3);
            }
            this.c = dimensionPixelSize;
            float f4 = aulu.J;
            return;
        }
        this.a = f2;
        this.b = f;
        this.c = dimensionPixelSize;
    }
}
