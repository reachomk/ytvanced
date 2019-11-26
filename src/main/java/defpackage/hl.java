package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: hl */
public final class hl {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = agb.a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    public static ColorStateList a(Context context, arz arz, int i) {
        if (arz.h(i)) {
            int f = arz.f(i, 0);
            if (f != 0) {
                ColorStateList a = agb.a(context, f);
                if (a != null) {
                    return a;
                }
            }
        }
        return arz.f(i);
    }

    public static Drawable b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable b = agb.b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(i);
    }
}
