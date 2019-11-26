package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: xul */
public final class xul {
    public static final xul b = new xul();
    public boolean a;
    private volatile Boolean c;
    private volatile String d;
    private volatile Integer e;
    private volatile xwa f;

    private xul() {
    }

    public static boolean a(Context context) {
        amqw.a((Object) context);
        if (b.c == null) {
            b.c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.television"));
        }
        return b.c.booleanValue();
    }

    public static boolean a(Context context, SharedPreferences sharedPreferences) {
        amqw.a((Object) context);
        amqw.a((Object) sharedPreferences);
        String str = "";
        String str2 = "version";
        String string = sharedPreferences.getString(str2, str);
        boolean z = false;
        try {
            PackageInfo a = xul.a(context, 0);
            xul xul = b;
            if (a.firstInstallTime >= a.lastUpdateTime) {
                if (string.equals(str)) {
                    z = true;
                }
            }
            xul.a = z;
        } catch (NameNotFoundException e) {
            xtl.b("could not get package information", e);
        }
        String b = xul.b(context.getApplicationContext());
        int equals = b.equals(string) ^ 1;
        if (equals != 0) {
            sharedPreferences.edit().putString(str2, b).apply();
        }
        return equals;
    }

    public static String b(Context context) {
        amqw.a((Object) context);
        if (b.d == null) {
            String str;
            try {
                PackageInfo a = xul.a(context, 0);
                xul xul = b;
                if (a.versionName == null) {
                    str = "Unset";
                } else {
                    str = a.versionName;
                }
                xul.d = str;
            } catch (NameNotFoundException e) {
                xtl.b("could not retrieve application version name", e);
                b.d = "Unknown";
            }
            SharedPreferences a2 = xly.a(context);
            if (a2 != null) {
                String string = a2.getString("pref_override_build_type", "");
                if (!(string == null || string.isEmpty())) {
                    xul xul2 = b;
                    xul2.d = xul2.d.substring(0, b.d.lastIndexOf(45) - 1);
                    if (!"RELEASE".equals(string)) {
                        xul xul3 = b;
                        str = xul3.d;
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + string.length());
                        stringBuilder.append(str);
                        stringBuilder.append("-");
                        stringBuilder.append(string);
                        xul3.d = stringBuilder.toString();
                    }
                }
            }
        }
        return b.d;
    }

    public static int c(Context context) {
        amqw.a((Object) context);
        if (b.e == null) {
            try {
                b.e = Integer.valueOf(xul.a(context, 0).versionCode);
            } catch (NameNotFoundException e) {
                xtl.b("could not retrieve application version code", e);
                b.e = Integer.valueOf(0);
            }
        }
        return b.e.intValue();
    }

    public static PackageInfo a(Context context, int i) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
    }

    public static xwa a(Context context, PackageManager packageManager) {
        try {
            if (b.f == null) {
                b.f = new xwa(packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            }
            return b.f;
        } catch (NameNotFoundException e) {
            throw new RuntimeException("PackageManager did not find our package name!", e);
        }
    }
}
