package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.List;

/* renamed from: wxk */
public final class wxk {
    public static final wxp a = new wxp();
    private static final Uri b = Uri.parse("https://play.google.com/store/");

    public static boolean a(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "text/html");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                if (!(activityInfo == null || activityInfo.packageName == null)) {
                    Intent intent2 = new Intent(intent);
                    intent2.setPackage(activityInfo.packageName);
                    if (intent2.resolveActivity(packageManager) != null) {
                        intent = intent2;
                    }
                }
            }
        }
        try {
            wxk.b(context, intent);
            return true;
        } catch (ActivityNotFoundException e) {
            xtl.a("Activity not found to view uri", e);
            return false;
        }
    }

    public static boolean a(Context context, Intent intent) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return (queryIntentActivities == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    public static void b(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            wxk.b(context, intent);
        } catch (ActivityNotFoundException e) {
            xtl.a("Activity not found to view uri", e);
        }
    }

    private static void b(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    private static void a(Activity activity, Intent intent, wxd wxd, wxe wxe) {
        if (wxd == null || wxe == null) {
            activity.startActivityForResult(intent, 907);
        } else {
            wxd.a(intent, 907, wxe);
        }
    }

    public static void a(Activity activity, String str, String str2, String str3, String str4, boolean z, boolean z2, List list, wxd wxd, wxe wxe) {
        String str5;
        if (str4 == null || str4.isEmpty()) {
            str4 = activity.getApplication().getPackageName();
        }
        if (str3 == null || str3.isEmpty()) {
            str3 = String.valueOf(str);
            str5 = "market://details?id=";
            str3 = str3.length() == 0 ? new String(str5) : str5.concat(str3);
            if (str2 != null) {
                str3 = String.valueOf(str3);
                StringBuilder stringBuilder = new StringBuilder((str3.length() + 10) + str2.length());
                stringBuilder.append(str3);
                stringBuilder.append("&referrer=");
                stringBuilder.append(str2);
                str3 = stringBuilder.toString();
            }
        }
        str5 = "referrer";
        String str6 = "docid";
        String str7 = "com.android.finsky.APP_DETAILS_DIALOG";
        if (list == null || list.isEmpty()) {
            amqw.a((Object) activity);
            amqw.a((Object) str);
            try {
                if (activity.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode >= 80300024) {
                    Intent intent = new Intent(str7);
                    intent.putExtra(str6, str);
                    if (str2 != null) {
                        intent.putExtra(str5, str2);
                    }
                    wxk.a(activity, intent, wxd, wxe);
                }
            } catch (NameNotFoundException unused) {
            }
            wxk.a(activity, str, str2);
            return;
        }
        for (aouh ordinal : list) {
            try {
                int ordinal2 = ordinal.ordinal();
                Intent intent2;
                if (ordinal2 == 0 || ordinal2 == 1) {
                    wxk.a(activity, str, str2);
                    return;
                } else if (ordinal2 != 2) {
                    if (ordinal2 == 3) {
                        if (!(!wxk.b(activity, list) || str3 == null || str4 == null)) {
                            intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(Uri.parse(str3));
                            intent2.putExtra("overlay", z);
                            intent2.putExtra("callerId", str4);
                            wxk.a(activity, intent2, wxd, wxe);
                            return;
                        }
                    }
                } else if (wxk.a(activity, list)) {
                    intent2 = new Intent(str7);
                    intent2.putExtra(str6, str);
                    if (str2 != null) {
                        intent2.putExtra(str5, str2);
                    }
                    if (z2) {
                        intent2.addFlags(262144);
                    }
                    wxk.a(activity, intent2, wxd, wxe);
                    return;
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static void a(Activity activity, String str, String str2, String str3, String str4) {
        String str5;
        amqw.a((Object) activity);
        Uri build = b.buildUpon().appendEncodedPath("apps").appendEncodedPath("details").appendQueryParameter("id", activity.getPackageName()).build();
        StringBuilder stringBuilder = new StringBuilder();
        String str6 = "&";
        String str7 = "";
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str7);
            str = String.valueOf(str);
            str5 = "utm_source=";
            stringBuilder.append(str.length() == 0 ? new String(str5) : str5.concat(str));
            str7 = str6;
        }
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append(str7);
            str = String.valueOf(str2);
            str5 = "utm_medium=";
            stringBuilder.append(str.length() == 0 ? new String(str5) : str5.concat(str));
            str7 = str6;
        }
        if (TextUtils.isEmpty(str2)) {
            str6 = str7;
        } else {
            stringBuilder.append(str7);
            str = String.valueOf(str3);
            str2 = "utm_campaign=";
            stringBuilder.append(str.length() == 0 ? new String(str2) : str2.concat(str));
        }
        if (!TextUtils.isEmpty(str4)) {
            stringBuilder.append(str6);
            str = String.valueOf(str4);
            str2 = "utm_term=";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            stringBuilder.append(str);
        }
        str = stringBuilder.toString();
        if (!TextUtils.isEmpty(str)) {
            build = build.buildUpon().appendQueryParameter("referrer", Uri.encode(str)).build();
        }
        Intent intent = new Intent("android.intent.action.VIEW", build);
        if (wxk.a((Context) activity, intent)) {
            try {
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    private static void a(Activity activity, String str, String str2) {
        Builder appendQueryParameter = b.buildUpon().appendEncodedPath("apps").appendEncodedPath("details").appendQueryParameter("id", str);
        if (str2 != null) {
            appendQueryParameter.appendQueryParameter("referrer", str2);
        }
        activity.startActivity(new Intent("android.intent.action.VIEW", appendQueryParameter.build()));
    }

    public static boolean a(Activity activity, List list) {
        if (list != null) {
            try {
                if (list.contains(aouh.ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY) && activity.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode >= 80300024) {
                    return true;
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean b(Activity activity, List list) {
        if (list != null) {
            try {
                if (list.contains(aouh.ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP) && activity.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode >= 80710000) {
                    return true;
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static String a(Activity activity, Intent intent) {
        if (VERSION.SDK_INT < 22) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
            if (wxk.a(uri)) {
                return uri.getHost();
            }
            return null;
        } else if (wxk.a(activity.getReferrer())) {
            return activity.getReferrer().getHost();
        } else {
            return null;
        }
    }

    private static boolean a(Uri uri) {
        return uri != null ? TextUtils.equals(uri.getScheme(), "android-app") : false;
    }

    public static void a(Context context, Intent intent, Uri uri) {
        amqw.a((Object) context);
        amqw.a((Object) intent);
        amqw.a((Object) uri);
        String str = !"https".equals(uri.getScheme()) ? "http://youtube.com/mobile" : "https://youtube.com/mobile";
        intent.putExtra("trusted_application_code_extra", PendingIntent.getActivity(context.getApplicationContext(), 0, new Intent(), 0, null));
        intent.putExtra("android.intent.extra.REFERRER", Uri.parse(str));
    }
}
