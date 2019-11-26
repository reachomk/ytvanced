package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* renamed from: art */
final class art {
    public static final int[] a = new int[]{-16842910};
    public static final int[] b = new int[]{16842908};
    public static final int[] c = new int[]{16842919};
    public static final int[] d = new int[]{16842912};
    public static final int[] e = new int[0];
    private static final ThreadLocal f = new ThreadLocal();
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        arz a = arz.a(context, null, iArr);
        try {
            i = a.e(0);
            return i;
        } finally {
            a.a();
        }
    }

    public static ColorStateList b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        arz a = arz.a(context, null, iArr);
        try {
            ColorStateList f = a.f(0);
            return f;
        } finally {
            a.a();
        }
    }

    public static int c(Context context, int i) {
        ColorStateList b = art.b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(a, b.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int a = art.a(context, i);
        return sc.c(a, Math.round(((float) Color.alpha(a)) * f));
    }
}
