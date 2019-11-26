package defpackage;

/* renamed from: bbiw */
final class bbiw extends bbix {
    private final String a;
    private final String b;
    private final String c;

    bbiw(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 41) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("MeasureDouble{name=");
        stringBuilder.append(str);
        stringBuilder.append(", description=");
        stringBuilder.append(str2);
        stringBuilder.append(", unit=");
        stringBuilder.append(str3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbix) {
            bbix bbix = (bbix) obj;
            return this.a.equals(bbix.a()) && this.b.equals(bbix.b()) && this.c.equals(bbix.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
