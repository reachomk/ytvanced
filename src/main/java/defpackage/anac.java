package defpackage;

/* renamed from: anac */
public final class anac extends RuntimeException {
    public static anac a(String str, String str2, int i, int i2) {
        return new anac(anac.b(str, str2, i, i2));
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public static anac a(String str, String str2, int i) {
        return new anac(anac.b(str, str2, i, i + 1));
    }

    public static anac b(String str, String str2, int i) {
        return new anac(anac.b(str, str2, i, -1));
    }

    public anac(String str) {
        super(str);
    }

    private static String b(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(": ");
        str = "...";
        if (i > 8) {
            stringBuilder.append(str);
            stringBuilder.append(str2, i - 5, i);
        } else {
            stringBuilder.append(str2, 0, i);
        }
        stringBuilder.append('[');
        stringBuilder.append(str2.substring(i, i2));
        stringBuilder.append(']');
        if (str2.length() - i2 > 8) {
            stringBuilder.append(str2, i2, i2 + 5);
            stringBuilder.append(str);
        } else {
            stringBuilder.append(str2, i2, str2.length());
        }
        return stringBuilder.toString();
    }
}
