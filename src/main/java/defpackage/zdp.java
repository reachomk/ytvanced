package defpackage;

/* renamed from: zdp */
final class zdp extends zed {
    private final Object a;
    private final long b;
    private final Long c;

    zdp(Object obj, long j, Long l) {
        if (obj != null) {
            this.a = obj;
            this.b = j;
            this.c = l;
            return;
        }
        throw new NullPointerException("Null model");
    }

    /* Access modifiers changed, original: final */
    public final Object a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final long b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final Long c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 63) + valueOf2.length());
        stringBuilder.append("ModelWrapper{model=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", timestampMs=");
        stringBuilder.append(j);
        stringBuilder.append(", expiry=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zed) {
            zed zed = (zed) obj;
            if (this.a.equals(zed.a()) && this.b == zed.b()) {
                Long l = this.c;
                if (l == null ? zed.c() == null : l.equals(zed.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        hashCode = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.c;
        return hashCode ^ (l != null ? l.hashCode() : 0);
    }
}
