package defpackage;

/* renamed from: aetx */
final class aetx extends aeuz {
    private final long a;
    private final long b;

    aetx(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* Access modifiers changed, original: final */
    public final long a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final long b() {
        return this.b;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(80);
        stringBuilder.append("MediaTimeRange{beginTimeMs=");
        stringBuilder.append(j);
        stringBuilder.append(", endTimeMs=");
        stringBuilder.append(j2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeuz) {
            aeuz aeuz = (aeuz) obj;
            return this.a == aeuz.a() && this.b == aeuz.b();
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }
}
