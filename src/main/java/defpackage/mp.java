package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;

/* renamed from: mp */
public final class mp extends ra {
    public static void a(Activity activity, Intent intent, int i) {
        activity.startActivityForResult(intent, i, null);
    }

    public static void a(Activity activity, String[] strArr, int i) {
        if (VERSION.SDK_INT >= 23) {
            if (activity instanceof mq) {
                ((mq) activity).c_(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof mr) {
            new Handler(Looper.getMainLooper()).post(new mo(strArr, activity, i));
        }
    }

    public static boolean a(Activity activity, String str) {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
