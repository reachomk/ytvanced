package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;

/* renamed from: fp */
public final class fp {
    public static int a(Context context, int i) {
        TypedValue a = hi.a(context, i);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    public static int a(int i, int i2, float f) {
        return sc.a(sc.c(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }
}
