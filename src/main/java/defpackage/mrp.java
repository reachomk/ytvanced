package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: mrp */
public final class mrp {
    public static boolean a(Context context) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/watch?v=")).setPackage(mrp.b(context)), 65536);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    public static Intent a(Context context, String str) {
        return mrp.a(context, str, null);
    }

    public static Intent a(Context context, String str, Bundle bundle) {
        str = String.valueOf(str);
        String str2 = "https://www.youtube.com/watch?v=";
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str.length() == 0 ? new String(str2) : str2.concat(str))).setPackage(mrp.b(context));
        intent.putExtra("force_fullscreen", false).putExtra("finish_on_ended", false);
        if (bundle == null) {
            bundle = new Bundle(3);
            bundle.putString("app_package", context.getPackageName());
            bundle.putString("app_version", ammm.a(context));
            bundle.putString("client_library_version", ammm.a(1902));
        }
        intent.putExtras(bundle);
        return intent;
    }

    private static String b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (ammm.b(packageManager)) {
            return "com.google.android.youtube.tv";
        }
        return !ammm.a(packageManager) ? "com.google.android.youtube" : "com.google.android.youtube.googletv";
    }
}
