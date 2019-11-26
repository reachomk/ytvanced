package defpackage;

/* renamed from: akjx */
final class akjx extends akkw {
    private final String a;
    private final int b;

    akjx(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 44);
        stringBuilder.append("ImageParams{videoId=");
        stringBuilder.append(str);
        stringBuilder.append(", imageType=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akkw) {
            akkw akkw = (akkw) obj;
            String str = this.a;
            if (str == null ? akkw.a() != null : !str.equals(akkw.a())) {
                if (this.b == akkw.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str != null ? str.hashCode() : 0) ^ 1000003) * 1000003) ^ this.b;
    }
}
