package defpackage;

/* renamed from: ohx */
public final class ohx {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final nzw f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final ohw[] k;

    public ohx(int i, int i2, long j, long j2, long j3, nzw nzw, int i3, ohw[] ohwArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = nzw;
        this.g = i3;
        this.k = ohwArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public final ohw a(int i) {
        ohw[] ohwArr = this.k;
        return ohwArr != null ? ohwArr[i] : null;
    }
}
