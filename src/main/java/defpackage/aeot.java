package defpackage;

/* renamed from: aeot */
final class aeot extends aepb {
    private final long a;
    private final long b;

    aeot(long j, long j2) {
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
        StringBuilder stringBuilder = new StringBuilder(63);
        stringBuilder.append("ByteRange{start=");
        stringBuilder.append(j);
        stringBuilder.append(", end=");
        stringBuilder.append(j2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aepb) {
            aepb aepb = (aepb) obj;
            return this.a == aepb.a() && this.b == aepb.b();
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }
}
