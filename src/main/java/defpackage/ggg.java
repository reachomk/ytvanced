package defpackage;

/* renamed from: ggg */
final class ggg extends ggn {
    public final String a;
    public final String b;
    public final String c;

    ggg(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                return;
            }
            throw new NullPointerException("Null codePoint");
        }
        throw new NullPointerException("Null string");
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final String b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final String c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 54) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("EmojiDescriptor{string=");
        stringBuilder.append(str);
        stringBuilder.append(", codePoint=");
        stringBuilder.append(str2);
        stringBuilder.append(", parentCodePoint=");
        stringBuilder.append(str3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggn) {
            ggn ggn = (ggn) obj;
            if (this.a.equals(ggn.a()) && this.b.equals(ggn.b())) {
                String str = this.c;
                if (str == null ? ggn.c() == null : str.equals(ggn.c())) {
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
