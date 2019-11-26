package defpackage;

/* renamed from: aluc */
final class aluc extends alug {
    private final Object a;
    private final int b;

    public final Object a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID" : "STALE" : "VALID" : "UNKNOWN";
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 26) + str.length());
        stringBuilder.append("CacheEntry{value=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", state=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alug) {
            alug alug = (alug) obj;
            if (this.a.equals(alug.a())) {
                int i = this.b;
                int b = alug.b();
                if (i == 0) {
                    throw null;
                } else if (i == b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.b;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    aluc(Object obj, int i) {
        if (obj != null) {
            this.a = obj;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public final int b() {
        return this.b;
    }
}
