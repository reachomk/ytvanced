package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;

/* renamed from: xoe */
public final class xoe {
    private static final xoh c = (VERSION.SDK_INT < 21 ? new xoh() : null);
    private static final int[] d = new int[]{-16842910};
    private static final int[] e = new int[]{16842908};
    private static final int[] f = new int[]{16843518};
    private static final int[] g = new int[]{16842919};
    private static final int[] h = new int[]{16842912};
    private static final int[] i = new int[]{16842913};
    private static final int[] j = new int[0];
    public final Context a;
    public ColorStateList b;
    private final TypedValue k = new TypedValue();

    public xoe(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public static Drawable a(Drawable drawable, int i, Mode mode) {
        if (drawable != null) {
            if (VERSION.SDK_INT >= 21) {
                xoe.d(drawable, i, mode);
            } else {
                xoe.c(drawable, i, mode);
            }
        }
        return drawable;
    }

    public static Drawable a(Drawable drawable, ColorStateList colorStateList, Mode mode) {
        if (drawable != null) {
            if (VERSION.SDK_INT >= 21) {
                xoe.d(drawable, colorStateList, mode);
            } else {
                xoe.c(drawable, colorStateList, mode);
            }
        }
        return drawable;
    }

    private static void c(Drawable drawable, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            drawable.setColorFilter(null);
        } else {
            xoe.c(drawable, colorStateList.getColorForState(drawable.getState(), colorStateList.getDefaultColor()), mode);
        }
    }

    private static void c(Drawable drawable, int i, Mode mode) {
        ColorFilter colorFilter = null;
        if (!(i == 0 || mode == null)) {
            colorFilter = (PorterDuffColorFilter) c.a(Integer.valueOf(xoh.a(i, mode)));
            if (colorFilter == null) {
                colorFilter = new PorterDuffColorFilter(i, mode);
                c.a(Integer.valueOf(xoh.a(i, mode)), colorFilter);
            }
        }
        drawable.setColorFilter(colorFilter);
    }

    private static void d(Drawable drawable, ColorStateList colorStateList, Mode mode) {
        drawable.setTintList(colorStateList);
        drawable.setTintMode(mode);
    }

    private static void d(Drawable drawable, int i, Mode mode) {
        drawable.setTint(i);
        drawable.setTintMode(mode);
    }

    public final ColorStateList a(int i, int i2, int i3, int i4, int i5, int i6) {
        r1 = new int[7][];
        r0 = new int[7];
        int alpha = Color.alpha(i6);
        this.a.getTheme().resolveAttribute(16842803, this.k, true);
        alpha = xnq.a(i6, Math.round(((float) alpha) * this.k.getFloat()));
        r1[0] = d;
        r0[0] = alpha;
        r1[1] = e;
        r0[1] = i;
        r1[2] = f;
        r0[2] = i2;
        r1[3] = g;
        r0[3] = i3;
        r1[4] = h;
        r0[4] = i4;
        r1[5] = i;
        r0[5] = i5;
        r1[6] = j;
        r0[6] = i6;
        return new ColorStateList(r1, r0);
    }

    public static Drawable b(Drawable drawable, ColorStateList colorStateList, Mode mode) {
        if (drawable != null) {
            drawable = drawable.mutate();
            if (drawable instanceof xpo) {
                xpo xpo = (xpo) drawable;
                xpo.setTintList(colorStateList);
                xpo.setTintMode(mode);
            } else if (VERSION.SDK_INT >= 21) {
                xoe.d(drawable, colorStateList, mode);
            } else if (colorStateList != null && !colorStateList.isStateful()) {
                xoe.c(drawable, colorStateList, mode);
            } else if (colorStateList != null) {
                return new xpo(drawable, colorStateList, mode);
            } else {
                xoe.a(drawable, null, null);
            }
        }
        return drawable;
    }

    public static Drawable b(Drawable drawable, int i, Mode mode) {
        if (drawable != null) {
            drawable = drawable.mutate();
            if (drawable instanceof xpo) {
                xpo xpo = (xpo) drawable;
                xpo.setTint(i);
                xpo.setTintMode(mode);
            } else if (VERSION.SDK_INT >= 21) {
                xoe.d(drawable, i, mode);
            } else {
                xoe.c(drawable, i, mode);
            }
        }
        return drawable;
    }

    public static Drawable a(Drawable drawable, ColorStateList colorStateList) {
        return xoe.b(drawable, colorStateList, Mode.SRC_IN);
    }

    public static Drawable a(Drawable drawable, int i) {
        return xoe.b(drawable, i, Mode.SRC_IN);
    }
}
