package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: alai */
public final class alai {
    private static final SparseArray a = new alal();

    public static void a(Activity activity) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivity(intent);
    }

    public static boolean a(int[] iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(Context context, int i) {
        xru.a(i, a.size());
        for (String a : (String[]) a.get(i)) {
            if (ra.a(context, a) != 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] a(int i) {
        xru.a(i, a.size());
        return (String[]) a.get(i);
    }

    public static void a(SharedPreferences sharedPreferences, String[] strArr) {
        Editor edit = sharedPreferences.edit();
        String str = "permissions_requested";
        Set stringSet = sharedPreferences.getStringSet(str, null);
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        if (stringSet != null) {
            hashSet.addAll(stringSet);
        }
        edit.putStringSet(str, hashSet);
        edit.apply();
    }

    public static boolean a(Activity activity, SharedPreferences sharedPreferences, String[] strArr) {
        Set stringSet = sharedPreferences.getStringSet("permissions_requested", null);
        if (stringSet != null) {
            for (String str : strArr) {
                if (activity.checkSelfPermission(str) != 0 && stringSet.contains(str) && !activity.shouldShowRequestPermissionRationale(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(SharedPreferences sharedPreferences, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        Set stringSet = sharedPreferences.getStringSet("permissions_requested", null);
        if (stringSet == null || stringSet.isEmpty()) {
            return true;
        }
        return stringSet.containsAll(new HashSet(Arrays.asList(strArr))) ^ 1;
    }
}
