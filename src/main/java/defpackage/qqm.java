package defpackage;

import android.util.Base64;

/* renamed from: qqm */
public final class qqm {
    public static String a(String str) {
        str = String.valueOf(str);
        String str2 = "ERROR : ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        return Base64.encodeToString(str.getBytes(), 11);
    }
}
