package defpackage;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: akjo */
public final class akjo implements sxu {
    public final anwy a() {
        return axbq.f;
    }

    private static void a(axbq axbq, RippleDrawable rippleDrawable, DisplayMetrics displayMetrics) {
        if (VERSION.SDK_INT >= 23) {
            int i = axbq.c;
            if (i != 0) {
                rippleDrawable.setRadius(Math.round(TypedValue.applyDimension(1, (float) i, displayMetrics)));
            }
        }
    }

    private static int a(cmg cmg, axbq axbq, int i) {
        Context context = cmg.b;
        int i2 = axbq.b;
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return ra.c(context, typedValue.resourceId);
    }
}
