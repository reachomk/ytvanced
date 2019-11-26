package defpackage;

/* renamed from: ntc */
final class ntc {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;

    ntc(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        nwf.a(length == length2);
        length = jArr.length;
        nwf.a(length == length2);
        if (iArr2.length != length2) {
            z = false;
        }
        nwf.a(z);
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.a = length;
    }
}
