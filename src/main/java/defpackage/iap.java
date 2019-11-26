package defpackage;

/* renamed from: iap */
final class iap extends icg {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    iap(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    /* Access modifiers changed, original: final */
    public final long a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final long b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final long c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final long d() {
        return this.d;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        StringBuilder stringBuilder = new StringBuilder(174);
        stringBuilder.append("VideoTimes{currentTimeMillis=");
        stringBuilder.append(j);
        stringBuilder.append(", earliestSeekTimeMillis=");
        stringBuilder.append(j2);
        stringBuilder.append(", totalTimeMillis=");
        stringBuilder.append(j3);
        stringBuilder.append(", bufferedTimeMillis=");
        stringBuilder.append(j4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof icg) {
            icg icg = (icg) obj;
            return this.a == icg.a() && this.b == icg.b() && this.c == icg.c() && this.d == icg.d();
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        return ((int) ((j4 >>> 32) ^ j4)) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }
}
