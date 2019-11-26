package defpackage;

/* renamed from: cjw */
public final class cjw {
    public final long a;
    public final long b;
    public final long c;

    public cjw(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        StringBuilder stringBuilder = new StringBuilder(121);
        stringBuilder.append("Entry{firstChunk=");
        stringBuilder.append(j);
        stringBuilder.append(", samplesPerChunk=");
        stringBuilder.append(j2);
        stringBuilder.append(", sampleDescriptionIndex=");
        stringBuilder.append(j3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cjw cjw = (cjw) obj;
            return this.a == cjw.a && this.c == cjw.c && this.b == cjw.b;
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }
}
