package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.Secure;

/* renamed from: xsl */
public final class xsl {
    public static int a;
    public static volatile Boolean b;
    private static String c;

    public static String a(Context context) {
        if (c == null) {
            ContentResolver contentResolver = context.getContentResolver();
            String str = "android_id";
            long a = rzt.a(contentResolver, str, 0);
            if (a != 0) {
                c = String.valueOf(a);
            } else {
                String string = Secure.getString(contentResolver, str);
                if (string != null) {
                    c = string;
                } else {
                    c = String.valueOf(a);
                }
            }
        }
        return c;
    }
}
