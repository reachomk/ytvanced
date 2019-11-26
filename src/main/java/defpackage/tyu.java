package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: tyu */
final class tyu {
    static File a(Context context) {
        uhy.a((Object) context);
        File cacheDir = context.getCacheDir();
        String e = tyu.e(context);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(e).length() + 12);
        stringBuilder.append(e);
        stringBuilder.append("_primeshprof");
        return new File(cacheDir, stringBuilder.toString());
    }

    static void b(Context context) {
        File a = tyu.a(context);
        if (a.exists()) {
            a.delete();
        }
    }

    static File c(Context context) {
        uhy.a((Object) context);
        File cacheDir = context.getCacheDir();
        String e = tyu.e(context);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(e).length() + 17);
        stringBuilder.append(e);
        stringBuilder.append("_primes_mhd.hprof");
        return new File(cacheDir, stringBuilder.toString());
    }

    static void d(Context context) {
        File c = tyu.c(context);
        if (c.exists()) {
            c.delete();
        }
    }

    private static String e(Context context) {
        String d = ucv.d(context);
        if (d == null) {
            return "";
        }
        d = d.replaceAll("[^a-zA-Z0-9\\._]", "_");
        return d.substring(0, Math.min(32, d.length()));
    }
}
