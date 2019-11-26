package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.vr.ndk.base.DaydreamApi;

/* renamed from: ahxt */
public final class ahxt {
    private static final ComponentName a;
    private static final ComponentName b;

    private static PackageInfo a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    static boolean a(Context context) {
        return (context == null || ahxt.a(context, "com.oculus.horizon") == null) ? false : true;
    }

    private static void a(aizy aizy, Intent intent) {
        if (aizy != null && intent != null && !TextUtils.isEmpty(aizy.k())) {
            nkn nkn = (nkn) nkm.x.createBuilder();
            nkn.a(aizy.l());
            nkn.c(aizy.c() ^ 1);
            nkn.a(aizy.n());
            if (!TextUtils.isEmpty(aizy.k())) {
                nkn.a(aizy.k());
            }
            if (!TextUtils.isEmpty(aizy.m())) {
                nkn.b(aizy.m());
            }
            intent.putExtra("playback_start_descriptor_proto", ((nkm) ((anxl) nkn.build())).toByteArray());
            intent.setData(!TextUtils.isEmpty(aizy.k()) ? xvt.a(aizy.k(), aizy.m(), aizy.l(), aizy.n() / 1000, "https") : null);
        }
    }

    static {
        String str = "com.google.android.apps.youtube.vr.activities.YouTubeVrActivity";
        a = new ComponentName("com.google.android.apps.youtube.vr", str);
        b = new ComponentName("com.google.android.apps.youtube.vr.oculus", str);
    }

    public static boolean a(Context context, int i) {
        int i2 = i - 1;
        String str = null;
        if (i != 0) {
            if (i2 == 1) {
                str = "com.google.android.apps.youtube.vr";
            } else if (i2 == 2) {
                str = "com.google.android.apps.youtube.vr.oculus";
            }
            if (!TextUtils.isEmpty(str)) {
                PackageInfo a = ahxt.a(context, str);
                return a != null && ((long) a.versionCode) > 10199000;
            }
        }
        throw null;
    }

    static Intent b(Context context, int i) {
        int i2 = i - 1;
        if (i != 0) {
            String str = "android.intent.action.VIEW";
            if (i2 == 1) {
                return new Intent(str).setData(Uri.parse("market://details?id=com.google.android.apps.youtube.vr")).putExtra("overlay", true).putExtra("callerId", context.getPackageName());
            } else if (i2 != 2) {
                return null;
            } else {
                return new Intent(str).setData(Uri.parse("https://www.oculus.com/experiences/gear-vr/1458129140982015/"));
            }
        }
        throw null;
    }

    static boolean c(Context context, int i) {
        if (context == null || i == 0) {
            return false;
        }
        i--;
        if (i != 1) {
            return i != 2 ? false : ahxt.a(context);
        } else {
            return DaydreamApi.isDaydreamReadyPlatform(context);
        }
    }

    public static void a(Context context, int i, DaydreamApi daydreamApi, aizy aizy) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 1) {
                if (i2 == 2 && context != null) {
                    Intent addFlags = new Intent().setComponent(b).addFlags(335609856);
                    ahxt.a(aizy, addFlags);
                    context.startActivity(addFlags);
                }
            } else if (daydreamApi != null) {
                Intent action = DaydreamApi.createVrIntent(a).setAction("android.intent.action.VIEW");
                ahxt.a(aizy, action);
                daydreamApi.launchInVr(action);
            }
            if (aizy != null) {
                aizy.b();
                return;
            }
            return;
        }
        throw null;
    }
}
