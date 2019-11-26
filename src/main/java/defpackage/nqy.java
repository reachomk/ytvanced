package defpackage;

/* renamed from: nqy */
public final class nqy implements nrq {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;

    public nqy(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = iArr.length;
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
    }

    public final boolean a() {
        return true;
    }

    public final int a(long j) {
        return nxf.a(this.e, j, true);
    }

    public final long b(long j) {
        return this.c[a(j)];
    }
}
