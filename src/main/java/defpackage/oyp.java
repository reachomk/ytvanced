package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: oyp */
public final class oyp {
    private static boolean a = true;

    public static void a(String str, String str2) {
        Log.w(str, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        if (a) {
            Log.w(str, str2, th);
        } else {
            Log.w(str, oyp.a(str2, th));
        }
    }

    public static void b(String str, String str2) {
        Log.e(str, str2);
    }

    public static void b(String str, String str2, Throwable th) {
        if (a) {
            Log.e(str, str2, th);
        } else {
            Log.e(str, oyp.a(str2, th));
        }
    }

    private static String a(String str, Throwable th) {
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(message).length());
        stringBuilder.append(str);
        stringBuilder.append(" - ");
        stringBuilder.append(message);
        return stringBuilder.toString();
    }
}
