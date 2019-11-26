package defpackage;

import android.util.Log;

/* renamed from: szq */
public final class szq implements szx {
    public final int a(int i, szr szr) {
        Object a = (szr.f() == null || szr.f().a() == null) ? "Empty" : amqh.a(", ").a(szr.f().a());
        String a2 = szr.a();
        String valueOf = String.valueOf(szr.b());
        String valueOf2 = String.valueOf(szr.c());
        String valueOf3 = String.valueOf(szr.d());
        int length = String.valueOf(a2).length();
        int length2 = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 95) + length2) + valueOf2.length()) + valueOf3.length()) + String.valueOf(a).length());
        stringBuilder.append("EmlLogTag: ");
        stringBuilder.append(i);
        stringBuilder.append(", Action Name: ");
        stringBuilder.append(a2);
        stringBuilder.append(", Start Time: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", End Time: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", Span Length: ");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", Template Uris: ");
        stringBuilder.append(a);
        Log.println(3, "LogcatTimeSpanLogger", stringBuilder.toString());
        return 0;
    }
}
