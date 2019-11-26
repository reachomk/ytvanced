package defpackage;

import java.util.List;

/* renamed from: otu */
public final class otu extends oty {
    public final ott a;
    public ouk b;
    private final long f;
    private final long g;
    private final long h;
    private final float i;
    private final long j;
    private final oye k;
    private final nzw[] l;
    private final int[] m;
    private final int[] n;
    private float o = 1.0f;
    private int p;
    private int q;
    private long r;

    public final void a() {
        this.r = -9223372036854775807L;
    }

    public final Object d() {
        return null;
    }

    public final void a(float f) {
        this.o = f;
    }

    public final void a(long j, long j2, long j3, List list) {
        j = this.k.a();
        this.b.a(this.l, this.n);
        if (this.q == 0) {
            this.q = 1;
            this.p = a(j, this.n);
            return;
        }
        int i = this.p;
        int a = a(j, this.n);
        this.p = a;
        if (a != i) {
            if (!b(i, j)) {
                nzw a2 = a(i);
                int i2 = a(this.p).e;
                int i3 = a2.e;
                if (i2 > i3) {
                    if (j3 == -9223372036854775807L || j3 > this.f) {
                        j3 = this.f;
                    } else {
                        j3 = (long) (((float) j3) * this.i);
                    }
                    if (j2 < j3) {
                        this.p = i;
                    }
                }
                if (i2 < i3 && j2 >= this.g) {
                    this.p = i;
                }
            }
            if (this.p != i) {
                this.q = 3;
            }
        }
    }

    public final int b() {
        return this.p;
    }

    public final int c() {
        return this.q;
    }

    public final int a(long j, List list) {
        long a = this.k.a();
        long j2 = this.r;
        if (j2 != -9223372036854775807L && a - j2 < this.j) {
            return list.size();
        }
        this.r = a;
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long b = ozp.b(((oqr) list.get(size - 1)).j - j, this.o);
        long j3 = this.h;
        if (b >= j3) {
            nzw a2 = a(a(a, this.m));
            while (i < size) {
                oqr oqr = (oqr) list.get(i);
                nzw nzw = oqr.g;
                if (ozp.b(oqr.j - j, this.o) >= j3 && nzw.e < a2.e) {
                    int i2 = nzw.o;
                    if (i2 != -1 && i2 < 720) {
                        int i3 = nzw.n;
                        if (i3 != -1 && i3 < 1280 && i2 < a2.o) {
                            return i;
                        }
                    }
                }
                i++;
            }
        }
        return size;
    }

    private final int a(long j, int[] iArr) {
        long a = this.a.a();
        int i = 0;
        int i2 = 0;
        while (i < this.d) {
            if (j == Long.MIN_VALUE || !b(i, j)) {
                if (((long) Math.round(((float) iArr[i]) * this.o)) <= a) {
                    return i;
                }
                i2 = i;
            }
            i++;
        }
        return i2;
    }

    public static void a(long[][][] jArr, int i, long[][] jArr2, int[] iArr) {
        long j = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= r4) {
                break;
            }
            long[] jArr3 = jArr[i2][i];
            long j2 = jArr2[i2][iArr[i2]];
            jArr3[1] = j2;
            j += j2;
            i2++;
        }
        for (long[][] jArr4 : jArr) {
            jArr4[i][0] = j;
        }
    }

    /* synthetic */ otu(opx opx, int[] iArr, ott ott, long j, long j2, long j3, float f, long j4, oye oye) {
        super(opx, iArr);
        this.a = ott;
        this.f = j * 1000;
        this.g = j2 * 1000;
        this.h = j3 * 1000;
        this.i = f;
        this.j = j4;
        this.k = oye;
        int i = 0;
        this.q = 0;
        this.r = -9223372036854775807L;
        this.b = ouk.b;
        int i2 = this.d;
        this.l = new nzw[i2];
        this.m = new int[i2];
        this.n = new int[i2];
        while (i < this.d) {
            nzw a = a(i);
            this.l[i] = a;
            this.m[i] = a.e;
            i++;
        }
    }
}
