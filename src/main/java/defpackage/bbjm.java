package defpackage;

/* renamed from: bbjm */
final class bbjm extends bbjy {
    private final String a;

    bbjm(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null asString");
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 19);
        stringBuilder.append("TagValue{asString=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbjy)) {
            return false;
        }
        return this.a.equals(((bbjy) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
