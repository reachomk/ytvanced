package defpackage;

import java.util.Arrays;

/* renamed from: ubs */
public final class ubs {
    public static final int[] a = new int[]{5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 2147483629};
    public final int b = -1;
    public int[] c;
    public int[] d;
    private int e;
    private int f;

    public ubs() {
        a();
    }

    static int a(int i) {
        return (i + i) - (i << 8);
    }

    public final void a() {
        this.e = 0;
        int[] iArr = a;
        int i = this.e;
        this.c = new int[iArr[i]];
        this.d = new int[iArr[i]];
        Arrays.fill(this.d, this.b);
    }

    public final int a(int i, int i2) {
        boolean z = false;
        uhy.a(i2 != this.b, (Object) "Cannot add emptyValue to map");
        int d = d(i);
        int[] iArr = this.d;
        int i3 = iArr[d];
        int i4 = this.b;
        if (i3 != i4) {
            return i3;
        }
        int[] iArr2 = this.c;
        iArr2[d] = i;
        i = this.f + 1;
        this.f = i;
        iArr[d] = i2;
        if (i > (iArr2.length >> 1)) {
            i = this.e;
            int[] iArr3 = a;
            if (i < iArr3.length - 1) {
                this.e = i + 1;
                i = this.e;
                this.c = new int[iArr3[i]];
                this.d = new int[iArr3[i]];
                Arrays.fill(this.d, i4);
                i = this.f;
                i2 = iArr2.length;
                this.f = 0;
                for (d = 0; d < i2; d++) {
                    i4 = iArr[d];
                    if (i4 != this.b) {
                        a(iArr2[d], i4);
                    }
                }
                if (i == this.f) {
                    z = true;
                }
                uhy.b(z);
            } else {
                throw new IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return this.b;
    }

    public final int b(int i) {
        return this.d[d(i)];
    }

    private final int d(int i) {
        int length = this.c.length;
        int a = (ubs.a(i) & Integer.MAX_VALUE) % length;
        while (this.d[a] != this.b && this.c[a] != i) {
            a++;
            if (a >= length) {
                a = 0;
            }
        }
        return a;
    }

    public final boolean c(int i) {
        return b(i) != this.b;
    }
}
