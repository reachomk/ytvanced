package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;

/* renamed from: ammm */
public final class ammm {
    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }

    public static String a(int i) {
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append(i / 1000);
        String str = ".";
        stringBuilder.append(str);
        stringBuilder.append((i % 1000) / 100);
        stringBuilder.append(str);
        stringBuilder.append(i % 100);
        return stringBuilder.toString();
    }

    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("com.google.android.tv");
    }

    public static boolean b(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.software.leanback");
    }

    static {
        Uri.parse("https://play.google.com/store/apps/details");
    }
}
