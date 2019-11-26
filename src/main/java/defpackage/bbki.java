package defpackage;

/* renamed from: bbki */
final class bbki extends bbkq {
    private final bbks a;
    private final long b;
    private final long c;
    private final long d;

    public final bbks a() {
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

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 141);
        stringBuilder.append("MessageEvent{type=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", messageId=");
        stringBuilder.append(j);
        stringBuilder.append(", uncompressedMessageSize=");
        stringBuilder.append(j2);
        stringBuilder.append(", compressedMessageSize=");
        stringBuilder.append(j3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbkq) {
            bbkq bbkq = (bbkq) obj;
            return this.a.equals(bbkq.a()) && this.b == bbkq.b() && this.c == bbkq.c() && this.d == bbkq.d();
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        return ((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    /* synthetic */ bbki(bbks bbks, long j, long j2, long j3) {
        this.a = bbks;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
