package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cjb */
public final class cjb {
    public final cjc a;
    public final long b;
    public final long c;
    public final double d;

    public cjb(cjc cjc, long j, long j2, double d) {
        this.b = j;
        this.c = j2;
        this.d = d;
        this.a = cjc;
    }

    public cjb(cjc cjc, ByteBuffer byteBuffer) {
        if (cjc.m() == 1) {
            this.b = cio.f(byteBuffer);
            this.c = byteBuffer.getLong();
            this.d = cio.g(byteBuffer);
        } else {
            this.b = cio.a(byteBuffer);
            this.c = (long) byteBuffer.getInt();
            this.d = cio.g(byteBuffer);
        }
        this.a = cjc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cjb cjb = (cjb) obj;
            return this.c == cjb.c && this.b == cjb.b;
        }
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        double d = this.d;
        StringBuilder stringBuilder = new StringBuilder(111);
        stringBuilder.append("Entry{segmentDuration=");
        stringBuilder.append(j);
        stringBuilder.append(", mediaTime=");
        stringBuilder.append(j2);
        stringBuilder.append(", mediaRate=");
        stringBuilder.append(d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
