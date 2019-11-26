package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ckn */
public final class ckn {
    public boolean a;
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;
    private byte g;
    private int h;

    public ckn(ByteBuffer byteBuffer) {
        long a = cio.a(byteBuffer);
        this.b = (byte) ((int) ((-268435456 & a) >> 28));
        this.c = (byte) ((int) ((201326592 & a) >> 26));
        this.d = (byte) ((int) ((50331648 & a) >> 24));
        this.e = (byte) ((int) ((12582912 & a) >> 22));
        this.f = (byte) ((int) ((3145728 & a) >> 20));
        this.g = (byte) ((int) ((917504 & a) >> 17));
        this.a = ((65536 & a) >> 16) > 0;
        this.h = (int) (a & 65535);
    }

    public final void a(ByteBuffer byteBuffer) {
        cin.a(byteBuffer, ((((((((long) (this.b << 28)) | ((long) (this.c << 26))) | ((long) (this.d << 24))) | ((long) (this.e << 22))) | ((long) (this.f << 20))) | ((long) (this.g << 17))) | ((long) (this.a << 16))) | ((long) this.h));
    }

    public final String toString() {
        byte b = this.b;
        byte b2 = this.c;
        byte b3 = this.d;
        byte b4 = this.e;
        byte b5 = this.f;
        byte b6 = this.g;
        boolean z = this.a;
        int i = this.h;
        StringBuilder stringBuilder = new StringBuilder(147);
        stringBuilder.append("SampleFlags{reserved=");
        stringBuilder.append(b);
        stringBuilder.append(", isLeading=");
        stringBuilder.append(b2);
        stringBuilder.append(", depOn=");
        stringBuilder.append(b3);
        stringBuilder.append(", isDepOn=");
        stringBuilder.append(b4);
        stringBuilder.append(", hasRedundancy=");
        stringBuilder.append(b5);
        stringBuilder.append(", padValue=");
        stringBuilder.append(b6);
        stringBuilder.append(", isDiffSample=");
        stringBuilder.append(z);
        stringBuilder.append(", degradPrio=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ckn ckn = (ckn) obj;
            return this.c == ckn.c && this.b == ckn.b && this.h == ckn.h && this.d == ckn.d && this.f == ckn.f && this.e == ckn.e && this.a == ckn.a && this.g == ckn.g;
        }
    }

    public final int hashCode() {
        return (((((((((((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.a) * 31) + this.h;
    }
}
