package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;

/* renamed from: xss */
public final class xss {
    public static int a;
    private static int b;

    @Deprecated
    public static boolean a(Context context) {
        int c = xss.c(context);
        return c == 3 || c == 4;
    }

    public static boolean b(Context context) {
        return xss.m(context) >= 600;
    }

    public static int c(Context context) {
        int m = xss.m(context.getApplicationContext());
        if (m == 0) {
            return 0;
        }
        if (m < 480) {
            return 1;
        }
        if (m >= 600) {
            return m >= 720 ? 4 : 3;
        } else {
            return 2;
        }
    }

    public static boolean d(Context context) {
        return xss.m(context) >= 720;
    }

    public static boolean e(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private static int m(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp;
    }

    public static int f(Context context) {
        amqw.a((Object) context);
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int g(Context context) {
        amqw.a((Object) context);
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static boolean h(Context context) {
        return xss.a(context, 720) || xss.a(context);
    }

    public static boolean a(Context context, int i) {
        if (b == 0) {
            DisplayMetrics i2 = xss.i(context);
            b = Math.min(i2.widthPixels, i2.heightPixels);
        }
        return b >= i;
    }

    public static DisplayMetrics i(Context context) {
        amqw.a((Object) context);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static boolean a(int i) {
        Pair a = xss.a();
        if ((a != null ? Math.min(((Integer) a.first).intValue(), ((Integer) a.second).intValue()) : 0) >= i) {
            return true;
        }
        return false;
    }

    public static Pair j(Context context) {
        DisplayMetrics i = xss.i(context);
        return Pair.create(Integer.valueOf(i.widthPixels), Integer.valueOf(i.heightPixels));
    }

    public static Pair k(Context context) {
        amqw.a((Object) context);
        Pair a = xss.a();
        return a == null ? xss.j(context) : a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    public static android.util.Pair a() {
        /*
        r0 = "sys.display-size";
        r1 = defpackage.xvh.a;
        r2 = 0;
        r3 = 1;
        r4 = 0;
        if (r1 == 0) goto L_0x0016;
    L_0x0009:
        r1 = defpackage.xvh.a;	 Catch:{ Exception -> 0x0016 }
        r5 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x0016 }
        r5[r2] = r0;	 Catch:{ Exception -> 0x0016 }
        r0 = r1.invoke(r4, r5);	 Catch:{ Exception -> 0x0016 }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x0016 }
        goto L_0x0017;
    L_0x0016:
        r0 = r4;
    L_0x0017:
        if (r0 == 0) goto L_0x003c;
    L_0x0019:
        r1 = "x";
        r0 = r0.split(r1);
        r1 = r0.length;
        r5 = 2;
        if (r1 != r5) goto L_0x003c;
    L_0x0023:
        r1 = r0[r2];	 Catch:{ NumberFormatException -> 0x003c }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x003c }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NumberFormatException -> 0x003c }
        r0 = r0[r3];	 Catch:{ NumberFormatException -> 0x003c }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x003c }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x003c }
        r0 = android.util.Pair.create(r1, r0);	 Catch:{ NumberFormatException -> 0x003c }
        return r0;
    L_0x003c:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xss.a():android.util.Pair");
    }

    public static boolean l(Context context) {
        amqw.a((Object) context);
        return context.getResources().getConfiguration().touchscreen != 1;
    }

    public static float a(DisplayMetrics displayMetrics, float f) {
        amqw.a((Object) displayMetrics);
        return f * displayMetrics.density;
    }

    public static int a(DisplayMetrics displayMetrics, int i) {
        amqw.a((Object) displayMetrics);
        double d = (double) (((float) i) * displayMetrics.density);
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    public static float b(DisplayMetrics displayMetrics, float f) {
        amqw.a((Object) displayMetrics);
        return (f / displayMetrics.density) + 0.5f;
    }

    public static int b(DisplayMetrics displayMetrics, int i) {
        amqw.a((Object) displayMetrics);
        return (int) ((((float) i) / displayMetrics.density) + 0.5f);
    }

    public static Bitmap a(Activity activity) {
        View rootView = activity.getWindow().getDecorView().getRootView();
        boolean isDrawingCacheEnabled = rootView.isDrawingCacheEnabled();
        rootView.setDrawingCacheEnabled(true);
        Bitmap drawingCache = rootView.getDrawingCache();
        if (drawingCache != null) {
            drawingCache = drawingCache.copy(Config.RGB_565, false);
        }
        if (!isDrawingCacheEnabled) {
            rootView.setDrawingCacheEnabled(false);
            rootView.destroyDrawingCache();
        }
        return drawingCache;
    }
}
