package defpackage;

/* renamed from: acjc */
final class acjc {
    public int a = -1;
    public String b;
    public int c = -1;

    acjc() {
    }

    public final String toString() {
        int i = this.a;
        String str = i != 0 ? i != 1 ? "UNKNOWN" : "ERROR" : "SUCCESS";
        String str2 = this.b;
        int i2 = this.c;
        StringBuilder stringBuilder = new StringBuilder((str.length() + 50) + String.valueOf(str2).length());
        stringBuilder.append("[ status=");
        stringBuilder.append(str);
        stringBuilder.append(", statusMesg=");
        stringBuilder.append(str2);
        stringBuilder.append(", mesgStreamId=");
        stringBuilder.append(i2);
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}
