package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: fpf */
public final class fpf {
    public static void a(Activity activity, int i) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
        }
    }

    public static int a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }
}
