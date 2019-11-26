package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: bchu */
public final class bchu {
    private static String a(String str, Object... objArr) {
        return objArr.length != 0 ? String.format(Locale.US, str, objArr) : str;
    }

    private static String a(String str) {
        String str2 = "cr_";
        if (str.startsWith(str2)) {
            return str;
        }
        int i = !str.startsWith("cr.") ? 0 : 3;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(str.substring(i, str.length()));
        return stringBuilder.toString();
    }

    public static void a(String str, String str2, Object... objArr) {
        bchu.a(str2, objArr);
        if (bchu.a(objArr) != null) {
            bchu.a(str);
        } else {
            bchu.a(str);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        str2 = bchu.a(str2, objArr);
        Throwable a = bchu.a(objArr);
        if (a != null) {
            Log.w(bchu.a(str), str2, a);
        } else {
            Log.w(bchu.a(str), str2);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        str2 = bchu.a(str2, objArr);
        Throwable a = bchu.a(objArr);
        if (a != null) {
            Log.e(bchu.a(str), str2, a);
        } else {
            Log.e(bchu.a(str), str2);
        }
    }

    private static Throwable a(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            Object obj = objArr[length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }
}
