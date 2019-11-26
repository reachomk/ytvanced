package defpackage;

/* renamed from: aepk */
final class aepk extends aeql {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final int e;

    aepk(long j, long j2, long j3, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = i;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        int i = this.e;
        StringBuilder stringBuilder = new StringBuilder(230);
        stringBuilder.append("MedialibPlayerTimeInfo{currentPositionMillis=");
        stringBuilder.append(j);
        stringBuilder.append(", currentUtcTimeMillis=");
        stringBuilder.append(j2);
        stringBuilder.append(", durationMillis=");
        stringBuilder.append(j3);
        stringBuilder.append(", bufferedPositionMillis=");
        stringBuilder.append(j4);
        stringBuilder.append(", liveEndToEndLatencyMillis=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeql) {
            aeql aeql = (aeql) obj;
            return this.a == aeql.a() && this.b == aeql.b() && this.c == aeql.c() && this.d == aeql.d() && this.e == aeql.e();
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        return this.e ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003);
    }
}
