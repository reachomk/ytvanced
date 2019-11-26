package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: tyv */
public final class tyv {
    public static String a(String str, Object... objArr) {
        uhy.a((Object) objArr);
        return objArr.length != 0 ? String.format(Locale.US, str, objArr) : str;
    }

    private static void a(int i, String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            Log.println(i, str, tyv.a(str2, objArr));
        }
    }

    private static void a(int i, String str, Throwable th, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            if (i == 3) {
                tyv.a(str2, objArr);
            } else if (i == 4) {
                tyv.a(str2, objArr);
            } else if (i != 5) {
                Log.e(str, tyv.a(str2, objArr), th);
            } else {
                Log.w(str, tyv.a(str2, objArr), th);
            }
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        tyv.a(2, str, str2, objArr);
    }

    public static void b(String str, String str2, Object... objArr) {
        tyv.a(3, str, str2, objArr);
    }

    public static void a(String str, String str2, Throwable th, Object... objArr) {
        tyv.a(3, str, th, str2, objArr);
    }

    public static void c(String str, String str2, Object... objArr) {
        tyv.a(4, str, str2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        tyv.a(5, str, str2, objArr);
    }

    public static void b(String str, String str2, Throwable th, Object... objArr) {
        tyv.a(5, str, th, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        tyv.a(6, str, str2, objArr);
    }

    public static void c(String str, String str2, Throwable th, Object... objArr) {
        tyv.a(6, str, th, str2, objArr);
    }
}
