package defpackage;

/* renamed from: ogq */
final class ogq {
    private static final long[] b = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    public int a;
    private final byte[] c = new byte[8];
    private int d;

    public final void a() {
        this.d = 0;
        this.a = 0;
    }

    public final long a(ofp ofp, boolean z, boolean z2, int i) {
        int a;
        if (this.d == 0) {
            if (!ofp.a(this.c, 0, 1, z)) {
                return -1;
            }
            a = ogq.a(this.c[0] & 255);
            this.a = a;
            if (a != -1) {
                this.d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        a = this.a;
        if (a > i) {
            this.d = 0;
            return -2;
        }
        if (a != 1) {
            ofp.b(this.c, 1, a - 1);
        }
        this.d = 0;
        return ogq.a(this.c, this.a, z2);
    }

    public static int a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = b;
            if (i2 >= jArr.length) {
                return -1;
            }
            int i3 = ((jArr[i2] & ((long) i)) > 0 ? 1 : ((jArr[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= b[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
