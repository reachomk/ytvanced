package defpackage;

/* renamed from: npw */
public final class npw {
    private final String a;
    private final String b;

    public npw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
