package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: qbc */
public final class qbc {
    public static Boolean a;
    private static Boolean b;
    private static Boolean c;

    public static boolean a(Context context) {
        if (b == null) {
            boolean z = false;
            if (qbf.a() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean b(Context context) {
        if (qbc.a(context)) {
            if (VERSION.SDK_INT >= 24) {
                if (c == null) {
                    boolean z = qbf.b() && context.getPackageManager().hasSystemFeature("cn.google");
                    c = Boolean.valueOf(z);
                }
                if (!c.booleanValue() || qbf.c()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
