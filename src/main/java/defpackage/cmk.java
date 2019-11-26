package defpackage;

/* renamed from: cmk */
public final class cmk {
    public static String a(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder(str.length() + 4);
        stringBuilder.append(str);
        stringBuilder.append('!');
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}
