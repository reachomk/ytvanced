package defpackage;

import android.util.Log;

@qlp
/* renamed from: qml */
public final class qml {
    public static void a(String str) {
        Log.e("Ads", str);
    }

    public static void a(String str, Throwable th) {
        Log.e("Ads", str, th);
    }

    public static void b(String str) {
        Log.w("Ads", str);
    }

    public static void b(String str, Throwable th) {
        Log.w("Ads", str, th);
    }

    private static String c(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append(str);
        stringBuilder.append(" @");
        stringBuilder.append(lineNumber);
        return stringBuilder.toString();
    }

    public static void c(String str, Throwable th) {
        if (th == null) {
            qml.b(qml.c(str));
        } else {
            qml.b(qml.c(str), th);
        }
    }
}
