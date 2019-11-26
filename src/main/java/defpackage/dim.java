package defpackage;

import android.util.Log;
import java.util.Map;

/* renamed from: dim */
public final class dim {
    public static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    static void a(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    public static String a(String str, Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("?");
        for (String str2 : map.keySet()) {
            String str3 = (String) map.get(str2);
            stringBuilder.append(str2);
            stringBuilder.append("=");
            stringBuilder.append(str3);
            stringBuilder.append("&");
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1) == '&') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }
}
