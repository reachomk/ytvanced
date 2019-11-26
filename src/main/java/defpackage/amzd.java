package defpackage;

/* renamed from: amzd */
enum amzd {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    public static amzd a(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
        stringBuilder.append("invalid tag type: ");
        stringBuilder.append(valueOf);
        throw new AssertionError(stringBuilder.toString());
    }
}
