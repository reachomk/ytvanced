package defpackage;

/* renamed from: aenn */
final class aenn extends aenx {
    private final String a;
    private final int b;
    private final String c;

    aenn(String str, int i, String str2) {
        if (str != null) {
            this.a = str;
            this.b = i;
            if (str2 != null) {
                this.c = str2;
                return;
            }
            throw new NullPointerException("Null xtags");
        }
        throw new NullPointerException("Null videoId");
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(str2).length());
        stringBuilder.append("FormatKey{videoId=");
        stringBuilder.append(str);
        stringBuilder.append(", itag=");
        stringBuilder.append(i);
        stringBuilder.append(", xtags=");
        stringBuilder.append(str2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aenx) {
            aenx aenx = (aenx) obj;
            return this.a.equals(aenx.a()) && this.b == aenx.b() && this.c.equals(aenx.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }
}
