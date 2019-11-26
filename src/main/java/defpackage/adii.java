package defpackage;

/* renamed from: adii */
public final class adii extends adjd {
    public final String a;
    private final String b;
    private final String c;

    public adii(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                return;
            }
            throw new NullPointerException("Null id");
        }
        throw new NullPointerException("Null type");
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
        stringBuilder.append("SessionMember{type=");
        stringBuilder.append(str);
        stringBuilder.append(", id=");
        stringBuilder.append(str2);
        stringBuilder.append(", encryptionKey=");
        stringBuilder.append(str3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adjd) {
            adjd adjd = (adjd) obj;
            if (this.a.equals(adjd.a()) && this.b.equals(adjd.b())) {
                String str = this.c;
                if (str == null ? adjd.c() == null : str.equals(adjd.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }
}
