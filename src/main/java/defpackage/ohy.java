package defpackage;

/* renamed from: ohy */
final class ohy {
    public final ohx a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ohy(ohx ohx, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        oxz.a(length == length2);
        length = jArr.length;
        oxz.a(length == length2);
        int length3 = iArr2.length;
        if (length3 != length2) {
            z = false;
        }
        oxz.a(z);
        this.a = ohx;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length;
        if (length3 > 0) {
            length3--;
            iArr2[length3] = iArr2[length3] | 536870912;
        }
    }

    public final int a(long j) {
        for (int a = ozp.a(this.f, j, false); a >= 0; a--) {
            if ((this.g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int a = ozp.a(this.f, j, true, false); a < this.f.length; a++) {
            if ((this.g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
