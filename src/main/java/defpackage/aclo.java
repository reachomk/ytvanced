package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings;

/* renamed from: aclo */
public final class aclo {
    public static boolean a;

    public static boolean a(nf nfVar) {
        boolean z = false;
        if (nfVar != null) {
            Activity p = nfVar.p();
            Object obj = (p == null || !(nfVar.u() || aclo.a(p))) ? null : 1;
            Object obj2 = (nfVar.u() || nfVar.v()) ? 1 : null;
            if (!(nfVar.p || nfVar.D || !nfVar.F_())) {
                if (!a && obj != null) {
                    z = true;
                } else if (a && obj2 != null) {
                    return true;
                }
            }
        }
        return z;
    }

    public static boolean a(Activity activity) {
        return VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode();
    }

    public static void b(Activity activity) {
        activity.getWindow().setLayout(-1, -1);
    }

    public static boolean a(Context context) {
        return VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context);
    }
}
