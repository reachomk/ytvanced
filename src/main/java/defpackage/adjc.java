package defpackage;

/* renamed from: adjc */
public final class adjc {
    public final String a;
    public final String b;

    public adjc(String str, String str2) {
        this.a = (String) amqw.a((Object) str);
        this.b = str2;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
