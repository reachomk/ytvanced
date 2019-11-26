package defpackage;

/* renamed from: agob */
final class agob extends agoi {
    private final long a;
    private final long b;

    agob(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agoi) {
            agoi agoi = (agoi) obj;
            return this.a == agoi.a() && this.b == agoi.b();
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }
}
