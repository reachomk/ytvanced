package defpackage;

/* renamed from: aeou */
final class aeou extends aepa {
    private final long a;
    private final long b;

    aeou(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(75);
        stringBuilder.append("TimeRange{startTimeMs=");
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
        if (obj instanceof aepa) {
            aepa aepa = (aepa) obj;
            return this.a == aepa.a() && this.b == aepa.b();
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }
}
