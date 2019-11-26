package defpackage;

import java.util.Arrays;

/* renamed from: agqg */
public final class agqg {
    public String a;
    public int b;
    public String c;
    public int d;
    public int e;
    public byte[] f;
    public byte[] g;
    public boolean h;

    public final agqd a() {
        return new agpr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final agqg a(byte[] bArr) {
        this.f = Arrays.copyOf(bArr, bArr.length);
        return this;
    }
}
