package defpackage;

/* renamed from: bbjk */
final class bbjk extends bbjw {
    private final String a;

    bbjk(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append("TagKey{name=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbjw)) {
            return false;
        }
        return this.a.equals(((bbjw) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
