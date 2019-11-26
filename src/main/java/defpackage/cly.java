package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: cly */
final class cly {
    private long a;
    private int[] b;

    cly() {
    }

    public final void a(YogaEdge yogaEdge, int i) {
        int c = c(0);
        int i2 = c + 1;
        a(i2, yogaEdge.j);
        a(0, i2);
        if (i != 0) {
            int[] iArr = this.b;
            if (iArr == null) {
                this.b = new int[Math.max(2, i2)];
            } else {
                i2 = iArr.length;
                if (c >= i2) {
                    this.b = new int[(i2 + i2)];
                    System.arraycopy(iArr, 0, this.b, 0, i2);
                }
            }
            this.b[c] = i;
        }
    }

    private final int c(int i) {
        return (int) ((this.a >> (i << 2)) & 15);
    }

    private final void a(int i, int i2) {
        i <<= 2;
        long j = this.a & ((15 << i) ^ -1);
        this.a = j;
        this.a = (((long) i2) << i) | j;
    }

    public final int a() {
        return c(0);
    }

    public final YogaEdge a(int i) {
        return YogaEdge.a(c(i + 1));
    }

    public final int b(int i) {
        int[] iArr = this.b;
        return (iArr == null || iArr.length <= i) ? 0 : iArr[i];
    }
}
