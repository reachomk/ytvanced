package defpackage;

import android.util.Log;

/* renamed from: skj */
public final class skj extends sxd {
    public final void a(int i, String str, Throwable th) {
        i = i + -1 != 1 ? 6 : 5;
        String stackTraceString = Log.getStackTraceString(th);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(stackTraceString).length());
        stringBuilder.append(str);
        stringBuilder.append(10);
        stringBuilder.append(stackTraceString);
        Log.println(i, "ElementsErrorLogger", stringBuilder.toString());
    }

    public final void b(int i, String str, Throwable th) {
        String a = azsk.a(i);
        String stackTraceString = Log.getStackTraceString(th);
        int length = String.valueOf(a).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str).length()) + String.valueOf(stackTraceString).length());
        stringBuilder.append(a);
        stringBuilder.append(" : ");
        stringBuilder.append(str);
        stringBuilder.append(10);
        stringBuilder.append(stackTraceString);
        Log.println(6, "ElementsErrorLogger", stringBuilder.toString());
    }
}
