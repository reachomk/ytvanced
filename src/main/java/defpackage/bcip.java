package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bcip */
public final class bcip {
    private static String a;

    public static String a(Context context) {
        String str = a;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        CharSequence charSequence = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            a = null;
        } else if (arrayList.size() == 1) {
            a = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(charSequence)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (!(queryIntentActivities2 == null || queryIntentActivities2.size() == 0)) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (!(intentFilter == null || intentFilter.countDataAuthorities() == 0 || intentFilter.countDataPaths() == 0)) {
                                if (resolveInfo2.activityInfo != null) {
                                    break;
                                }
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(charSequence)) {
                    a = charSequence;
                }
            }
            String str2 = "com.android.chrome";
            if (arrayList.contains(str2)) {
                a = str2;
            } else {
                str2 = "com.chrome.beta";
                if (arrayList.contains(str2)) {
                    a = str2;
                } else {
                    str2 = "com.chrome.dev";
                    if (arrayList.contains(str2)) {
                        a = str2;
                    } else {
                        str2 = "com.google.android.apps.chrome";
                        if (arrayList.contains(str2)) {
                            a = str2;
                        }
                    }
                }
            }
        }
        return a;
    }
}
