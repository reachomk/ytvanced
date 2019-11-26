package defpackage;

import android.util.Log;

/* renamed from: sdf */
public final class sdf {
    public static String a(Class cls) {
        String simpleName = cls.getSimpleName();
        String str = "ccl_";
        if (simpleName.length() <= 19) {
            return simpleName.length() == 0 ? new String(str) : str.concat(simpleName);
        } else {
            simpleName = String.valueOf(simpleName.substring(0, 18));
            return simpleName.length() == 0 ? new String(str) : str.concat(simpleName);
        }
    }

    public static void a(String str, String str2) {
        String valueOf = String.valueOf(sdf.a());
        str2 = String.valueOf(str2);
        Log.e(str, str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2));
    }

    public static void a(String str, String str2, Throwable th) {
        String valueOf = String.valueOf(sdf.a());
        str2 = String.valueOf(str2);
        Log.e(str, str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2), th);
    }

    private static String a() {
        String str = saf.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 4);
        stringBuilder.append("[v");
        stringBuilder.append(str);
        stringBuilder.append("] ");
        return stringBuilder.toString();
    }
}
