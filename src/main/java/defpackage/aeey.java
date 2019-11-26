package defpackage;

/* renamed from: aeey */
public final class aeey {
    public static String a(String str, int i, String str2, long j) {
        String a = aajy.a(i, str2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(a).length());
        stringBuilder.append(str);
        str = ".";
        stringBuilder.append(str);
        stringBuilder.append(a);
        stringBuilder.append(str);
        stringBuilder.append(j);
        return stringBuilder.toString();
    }

    public static String a(String str) {
        return str.split("\\.")[0];
    }

    public static String b(String str) {
        return str.split("\\.")[1];
    }

    public static long c(String str) {
        return Long.parseLong(str.split("\\.")[2]);
    }
}
