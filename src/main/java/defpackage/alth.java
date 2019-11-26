package defpackage;

import java.util.Arrays;

/* renamed from: alth */
final class alth extends altj {
    private final int a;
    private final long b;
    private final long c;
    private final boolean d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final byte[] i;

    public final int a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final long f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final long h() {
        return this.h;
    }

    public final byte[] i() {
        return this.i;
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        boolean z = this.d;
        long j3 = this.e;
        long j4 = this.f;
        long j5 = this.g;
        long j6 = this.h;
        String arrays = Arrays.toString(this.i);
        String str = arrays;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 262);
        stringBuilder.append("VideoFormat{itag=");
        stringBuilder.append(i);
        stringBuilder.append(", lastModified=");
        stringBuilder.append(j);
        stringBuilder.append(", contentLength=");
        stringBuilder.append(j2);
        stringBuilder.append(", hasSegmentRanges=");
        stringBuilder.append(z);
        stringBuilder.append(", initStart=");
        stringBuilder.append(j3);
        stringBuilder.append(", initEnd=");
        stringBuilder.append(j4);
        stringBuilder.append(", indexStart=");
        stringBuilder.append(j5);
        stringBuilder.append(", indexEnd=");
        stringBuilder.append(j6);
        stringBuilder.append(", signature=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ alth(int i, long j, long j2, boolean z, long j3, long j4, long j5, long j6, byte[] bArr) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = bArr;
    }
}
