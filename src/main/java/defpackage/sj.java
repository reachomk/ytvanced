package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.util.Log;

/* renamed from: sj */
public final class sj {
    public static final zq a = new zq(16);
    private static final sm b;

    public static String a(Resources resources, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(i));
        String str = "-";
        stringBuilder.append(str);
        stringBuilder.append(i);
        stringBuilder.append(str);
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public static Typeface a(Context context, rq rqVar, Resources resources, int i, int i2, ry ryVar, boolean z) {
        Object a;
        if (rqVar instanceof rv) {
            rv rvVar = (rv) rqVar;
            boolean z2 = z && rvVar.c == 0;
            a = yj.a(context, rvVar.a, ryVar, z2, z ? rvVar.b : -1, i2);
        } else {
            a = b.a(context, (rt) rqVar, resources, i2);
            if (a != null) {
                ryVar.b(a);
            } else {
                ryVar.a(-3);
            }
        }
        if (a != null) {
            a.a(sj.a(resources, i, i2), a);
        }
        return a;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = b.a(context, resources, i, str, i2);
        if (a != null) {
            a.a(sj.a(resources, i, i2), a);
        }
        return a;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, yp[] ypVarArr, int i) {
        return b.a(context, cancellationSignal, ypVarArr, i);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            if (VERSION.SDK_INT < 21) {
                sm smVar = b;
                long a = sm.a(typeface);
                Typeface typeface2 = null;
                rt rtVar = a != 0 ? (rt) smVar.c.get(Long.valueOf(a)) : null;
                if (rtVar != null) {
                    typeface2 = b.a(context, rtVar, context.getResources(), i);
                }
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    static {
        if (VERSION.SDK_INT >= 28) {
            b = new sn();
        } else if (VERSION.SDK_INT >= 26) {
            b = new sk();
        } else {
            if (VERSION.SDK_INT >= 24) {
                if (sl.a == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (sl.a != null) {
                    b = new sl();
                }
            }
            if (VERSION.SDK_INT >= 21) {
                b = new si();
            } else {
                b = new sm();
            }
        }
    }
}
