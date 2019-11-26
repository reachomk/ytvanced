package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: ucw */
public final class ucw {
    public static File a(Context context) {
        Object substring;
        uhy.a((Object) context);
        File cacheDir = context.getCacheDir();
        String d = ucv.d(context);
        if (d != null) {
            d = d.replaceAll("[^a-zA-Z0-9\\._]", "_");
            substring = d.substring(0, Math.min(32, d.length()));
        } else {
            substring = "";
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(substring).length() + 11);
        stringBuilder.append(substring);
        stringBuilder.append("_primes_mhd");
        return new File(cacheDir, stringBuilder.toString());
    }
}
