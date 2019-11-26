package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.io.File;

/* renamed from: agmn */
public final class agmn {
    public static String a() {
        return !xy.c() ? "application/vnd.youtube.yt" : "video/vnd.youtube.yt";
    }

    public static boolean a(int i) {
        return i == 4 || i == 3;
    }

    public static File a(File file) {
        return agmn.a(file, ".download");
    }

    public static File b(File file) {
        return agmn.a(file, ".prog");
    }

    public static File a(File file, String str) {
        File parentFile = file.getParentFile();
        String valueOf = String.valueOf(file.getName());
        str = String.valueOf(str);
        return new File(parentFile, str.length() == 0 ? new String(valueOf) : valueOf.concat(str));
    }

    public static void a(Context context, Uri uri) {
        if (xvt.a(uri)) {
            String path = uri.getPath();
            if (path != null) {
                agmn.c(new File(path));
            }
        } else if (xvt.b(uri)) {
            context.getContentResolver().delete(uri, null, null);
        }
    }

    public static void c(File file) {
        String valueOf;
        String str;
        if (file.delete()) {
            valueOf = String.valueOf(file.getAbsolutePath());
            str = "Deleted YTB file: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.e(valueOf);
        } else {
            valueOf = String.valueOf(file.getAbsolutePath());
            str = "Failed to delete YTB file: ";
            xtl.e(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
        agmn.b(file).delete();
        agmn.a(file).delete();
    }

    public static boolean a(arvt arvt, SharedPreferences sharedPreferences) {
        avoa avoa = null;
        if (arvt == null) {
            return agmn.a(null, sharedPreferences);
        }
        if ((arvt.a & 512) != 0) {
            avoa = arvt.h;
            if (avoa == null) {
                avoa = avoa.w;
            }
        }
        return agmn.a(avoa, sharedPreferences);
    }

    private static boolean a(avoa avoa, SharedPreferences sharedPreferences) {
        if (sharedPreferences.getBoolean("override_ytb_config", false)) {
            return sharedPreferences.getBoolean("enable_ytb_offlining", false);
        }
        if (!(avoa == null || (avoa.a & 4) == 0)) {
            azqx azqx = avoa.d;
            if (azqx == null) {
                azqx = azqx.e;
            }
            if (azqx.b) {
                return true;
            }
        }
        return false;
    }
}
