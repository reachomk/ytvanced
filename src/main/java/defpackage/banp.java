package defpackage;

import java.nio.ByteBuffer;

/* renamed from: banp */
public final class banp extends bamr {
    private int a;
    private int b;
    private boolean c;
    private int d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public final String a() {
        return "tscl";
    }

    public final int c() {
        return 20;
    }

    public final void a(ByteBuffer byteBuffer) {
        this.a = cio.d(byteBuffer);
        int d = cio.d(byteBuffer);
        this.b = (d & 192) >> 6;
        this.c = (d & 32) > 0;
        this.d = d & 31;
        this.e = cio.a(byteBuffer);
        long c = ((long) cio.c(byteBuffer)) << 32;
        if (c >= 0) {
            this.f = c + cio.a(byteBuffer);
            this.g = cio.d(byteBuffer);
            this.h = cio.c(byteBuffer);
            this.i = cio.c(byteBuffer);
            this.j = cio.d(byteBuffer);
            this.k = cio.c(byteBuffer);
            return;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        cin.c(allocate, this.a);
        cin.c(allocate, ((this.b << 6) + (!this.c ? 0 : 32)) + this.d);
        cin.a(allocate, this.e);
        long j = this.f & 281474976710655L;
        cin.b(allocate, (int) (j >> 32));
        cin.a(allocate, j & 4294967295L);
        cin.c(allocate, this.g);
        cin.b(allocate, this.h);
        cin.b(allocate, this.i);
        cin.c(allocate, this.j);
        cin.b(allocate, this.k);
        return (ByteBuffer) allocate.rewind();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            banp banp = (banp) obj;
            return this.a == banp.a && this.i == banp.i && this.k == banp.k && this.j == banp.j && this.h == banp.h && this.f == banp.f && this.g == banp.g && this.e == banp.e && this.d == banp.d && this.b == banp.b && this.c == banp.c;
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        int i3 = this.d;
        long j = this.e;
        long j2 = this.f;
        return (((((((((((((((((((i * 31) + i2) * 31) + z) * 31) + i3) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        int i3 = this.d;
        long j = this.e;
        long j2 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = this.i;
        int i7 = this.j;
        int i8 = this.k;
        StringBuilder stringBuilder = new StringBuilder(369);
        stringBuilder.append("TemporalLayerSampleGroup{temporalLayerId=");
        stringBuilder.append(i);
        stringBuilder.append(", tlprofile_space=");
        stringBuilder.append(i2);
        stringBuilder.append(", tltier_flag=");
        stringBuilder.append(z);
        stringBuilder.append(", tlprofile_idc=");
        stringBuilder.append(i3);
        stringBuilder.append(", tlprofile_compatibility_flags=");
        stringBuilder.append(j);
        stringBuilder.append(", tlconstraint_indicator_flags=");
        stringBuilder.append(j2);
        stringBuilder.append(", tllevel_idc=");
        stringBuilder.append(i4);
        stringBuilder.append(", tlMaxBitRate=");
        stringBuilder.append(i5);
        stringBuilder.append(", tlAvgBitRate=");
        stringBuilder.append(i6);
        stringBuilder.append(", tlConstantFrameRate=");
        stringBuilder.append(i7);
        stringBuilder.append(", tlAvgFrameRate=");
        stringBuilder.append(i8);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
