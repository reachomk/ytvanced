package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.google.android.youtube.R;

/* renamed from: xwe */
public final class xwe {
    public static int a(Context context, int i) {
        amqw.a((Object) context);
        xwe.a(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw xwe.b(i);
        } else if (typedValue.type >= 28 && typedValue.type <= 31) {
            return typedValue.data;
        } else {
            String str = "Type of attribute is not a color (attr = %d, type = %d)";
            if (typedValue.type == 3) {
                try {
                    return context.getResources().getColor(typedValue.resourceId);
                } catch (NotFoundException e) {
                    throw new UnsupportedOperationException(String.format(str, new Object[]{Integer.valueOf(i), Integer.valueOf(typedValue.type)}), e);
                }
            }
            throw new UnsupportedOperationException(String.format(str, new Object[]{Integer.valueOf(i), Integer.valueOf(typedValue.type)}));
        }
    }

    public static int a(Context context, int i, int i2) {
        amqw.a((Object) context);
        xwe.a(i);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return typedValue.data;
            }
            if (typedValue.type == 3) {
                try {
                    return rz.b(context.getResources(), typedValue.resourceId, context.getTheme());
                } catch (NotFoundException unused) {
                }
            }
        }
        return i2;
    }

    public static ColorStateList b(Context context, int i) {
        amqw.a((Object) context);
        xwe.a(i);
        int i2 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{i});
        try {
            i2 = obtainStyledAttributes.getColorStateList(0);
            obtainStyledAttributes.recycle();
            if (i2 != 0) {
                return i2;
            }
            throw xwe.b(i);
        } catch (NotFoundException e) {
            throw new UnsupportedOperationException(String.format("Type of attribute is not a color state list (attr = %d, value = %s)", new Object[]{Integer.valueOf(i), obtainStyledAttributes.getString(0)}), e);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001f */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:7:?, code skipped:
            r3 = defpackage.ampo.a;
     */
    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            return r3;
     */
    /* JADX WARNING: Missing block: B:9:0x0025, code skipped:
            r2.recycle();
     */
    public static defpackage.amqp c(android.content.Context r2, int r3) {
        /*
        defpackage.amqw.a(r2);
        defpackage.xwe.a(r3);
        r0 = 1;
        r0 = new int[r0];
        r1 = 0;
        r0[r1] = r3;
        r3 = 0;
        r2 = r2.obtainStyledAttributes(r3, r0);
        r3 = r2.getColorStateList(r1);	 Catch:{ NotFoundException -> 0x001f }
        r3 = defpackage.amqp.c(r3);	 Catch:{ NotFoundException -> 0x001f }
        r2.recycle();
        return r3;
    L_0x001d:
        r3 = move-exception;
        goto L_0x0025;
    L_0x001f:
        r3 = defpackage.ampo.a;	 Catch:{ all -> 0x001d }
        r2.recycle();
        return r3;
    L_0x0025:
        r2.recycle();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwe.c(android.content.Context, int):amqp");
    }

    public static Drawable d(Context context, int i) {
        amqw.a((Object) context);
        xwe.a(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw xwe.b(i);
        } else if (typedValue.type >= 28 && typedValue.type <= 31) {
            return new ColorDrawable(typedValue.data);
        } else {
            if (typedValue.type == 3) {
                try {
                    return rz.a(context.getResources(), typedValue.resourceId, context.getTheme());
                } catch (NotFoundException e) {
                    throw new UnsupportedOperationException(String.format("Type of attribute is not a reference to a drawable (attr = %d, value = %s)", new Object[]{Integer.valueOf(i), typedValue.coerceToString().toString()}), e);
                }
            }
            throw new UnsupportedOperationException(String.format("Type of attribute is not a color or a reference to a drawable (attr = %d, value = %s)", new Object[]{Integer.valueOf(i), typedValue.coerceToString().toString()}));
        }
    }

    public static amqp a(Context context) {
        amqw.a((Object) context);
        xwe.a((int) R.attr.standaloneBadgeBackground);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.standaloneBadgeBackground, typedValue, true)) {
            return ampo.a;
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return amqp.b(new ColorDrawable(typedValue.data));
        }
        if (typedValue.type != 3) {
            return ampo.a;
        }
        try {
            return amqp.c(rz.a(context.getResources(), typedValue.resourceId, context.getTheme()));
        } catch (NotFoundException unused) {
            return ampo.a;
        }
    }

    public static void a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException(String.format("Invalid attribute resource ID (%d)", new Object[]{Integer.valueOf(0)}));
        }
    }

    public static NotFoundException b(int i) {
        return new NotFoundException(String.format("Attribute not defined by theme (attr = %d)", new Object[]{Integer.valueOf(i)}));
    }
}
