package defpackage;

import android.util.Log;
import java.util.regex.Pattern;

/* renamed from: ujo */
public final class ujo {
    private static String a = "L";
    private static final int b = 19;
    private static final String c = ujo.class.getName();

    private ujo() {
    }

    public static void a(String str) {
        ujo.a(1, str, null);
    }

    public static void a(String str, Throwable th) {
        ujo.a(1, str, th);
    }

    public static void b(String str) {
        ujo.a(2, str, null);
    }

    public static void b(String str, Throwable th) {
        ujo.a(2, str, th);
    }

    public static void c(String str) {
        ujo.a(4, str, null);
    }

    static {
        Pattern.compile("");
    }

    public static void a(int i, String str, Throwable th) {
        Object stringBuilder;
        int lineNumber;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            if (!className.equals(c) && className.startsWith("com.google.android.")) {
                String substring = className.substring(b);
                String methodName = stackTraceElement.getMethodName();
                lineNumber = stackTraceElement.getLineNumber();
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(substring).length() + 13) + String.valueOf(methodName).length());
                stringBuilder2.append(substring);
                stringBuilder2.append(".");
                stringBuilder2.append(methodName);
                stringBuilder2.append(":");
                stringBuilder2.append(lineNumber);
                stringBuilder = stringBuilder2.toString();
                break;
            }
        }
        stringBuilder = "(unknown)";
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(stringBuilder).length() + 1) + String.valueOf(str).length());
        stringBuilder3.append(stringBuilder);
        stringBuilder3.append(" ");
        stringBuilder3.append(str);
        str = stringBuilder3.toString();
        i--;
        if (i == 0) {
            Log.e(a, str, th);
        } else if (i != 1) {
            if (i != 2) {
            }
        } else {
            Log.w(a, str, th);
        }
    }
}
