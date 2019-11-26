package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: otv */
public final class otv implements ouo {
    private final oux a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;
    private final float f;
    private final long g;
    private final oye h;
    private ouk i;

    public otv() {
        this(null, oye.a);
    }

    @Deprecated
    public otv(oux oux) {
        this(oux, oye.a);
    }

    @Deprecated
    private otv(oux oux, oye oye) {
        this.a = oux;
        this.b = 10000;
        this.c = 25000;
        this.d = 25000;
        this.e = 0.75f;
        this.f = 0.75f;
        this.g = 2000;
        this.h = oye;
        this.i = ouk.b;
    }

    public final oum[] a(oul[] oulArr, oux oux) {
        int i;
        int i2;
        oul[] oulArr2 = oulArr;
        oux oux2 = this.a;
        if (oux2 == null) {
            oux2 = oux;
        }
        oum[] oumArr = new oum[oulArr2.length];
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= oulArr2.length) {
                break;
            }
            int i4;
            oux oux3;
            oul oul = oulArr2[i3];
            if (oul != null) {
                int[] iArr = oul.b;
                if (iArr.length > 1) {
                    i4 = i3;
                    oux3 = oux2;
                    otu otu = new otu(oul.a, iArr, new otw(oux2, this.e), (long) this.b, (long) this.c, (long) this.d, this.f, this.g, this.h);
                    otu.b = this.i;
                    arrayList.add(otu);
                    oumArr[i4] = otu;
                } else {
                    oux3 = oux2;
                    i4 = i3;
                    oumArr[i4] = new ouf(oul.a, iArr[0], oul.c, oul.d);
                    i2 = oul.a.a(oul.b[0]).e;
                }
            } else {
                oux3 = oux2;
                i4 = i3;
            }
            i3 = i4 + 1;
            oulArr2 = oulArr;
            oux2 = oux3;
        }
        if (arrayList.size() > 1) {
            int length;
            int i5;
            int i6;
            int i7;
            long[][] jArr;
            long[][] jArr2 = new long[arrayList.size()][];
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                otu otu2 = (otu) arrayList.get(i8);
                jArr2[i8] = new long[otu2.g()];
                for (i3 = 0; i3 < otu2.g(); i3++) {
                    jArr2[i8][i3] = (long) otu2.a((otu2.g() - i3) - 1).e;
                }
            }
            double[][] dArr = new double[jArr2.length][];
            for (int i9 = 0; i9 < jArr2.length; i9++) {
                dArr[i9] = new double[jArr2[i9].length];
                i3 = 0;
                while (true) {
                    long[] jArr3 = jArr2[i9];
                    if (i3 >= jArr3.length) {
                        break;
                    }
                    dArr[i9][i3] = Math.log((double) jArr3[i3]);
                    i3++;
                }
            }
            double[][] dArr2 = new double[dArr.length][];
            for (i3 = 0; i3 < dArr.length; i3++) {
                double[] dArr3 = dArr[i3];
                length = dArr3.length - 1;
                double[] dArr4 = new double[length];
                dArr2[i3] = dArr4;
                if (dArr4.length != 0) {
                    double d = dArr3[length] - dArr3[0];
                    i5 = 0;
                    while (true) {
                        double[] dArr5 = dArr[i3];
                        if (i5 >= dArr5.length - 1) {
                            break;
                        }
                        int i10 = i5 + 1;
                        dArr2[i3][i5] = (((dArr5[i5] + dArr5[i10]) * 0.5d) - dArr5[0]) / d;
                        i5 = i10;
                    }
                }
            }
            i3 = dArr2.length;
            i5 = 0;
            length = 0;
            while (i5 < i3) {
                length += dArr2[i5].length;
                i5++;
                i = 1;
            }
            length += 3;
            long[][][] jArr4 = (long[][][]) Array.newInstance(long.class, new int[]{i3, length, 2});
            int[] iArr2 = new int[i3];
            otu.a(jArr4, i, jArr2, iArr2);
            int i11 = 2;
            while (true) {
                i6 = length - 1;
                if (i11 >= i6) {
                    break;
                }
                double d2 = Double.MAX_VALUE;
                int i12 = 0;
                for (i6 = 0; i6 < dArr.length; i6++) {
                    i5 = iArr2[i6];
                    if (i5 + 1 != dArr[i6].length) {
                        double d3 = dArr2[i6][i5];
                        if (d3 < d2) {
                            d2 = d3;
                            i12 = i6;
                        }
                    }
                }
                iArr2[i12] = iArr2[i12] + 1;
                otu.a(jArr4, i11, jArr2, iArr2);
                i11++;
            }
            for (long[][] jArr5 : jArr4) {
                long[] jArr6 = jArr5[i6];
                long[] jArr7 = jArr5[length - 2];
                long j = jArr7[0];
                jArr6[0] = j + j;
                j = jArr7[1];
                jArr6[1] = j + j;
            }
            for (i7 = 0; i7 < arrayList.size(); i7++) {
                otu otu3 = (otu) arrayList.get(i7);
                jArr5 = jArr4[i7];
                otw otw = (otw) otu3.a;
                oxz.a(jArr5.length >= 2);
                otw.a = jArr5;
            }
        }
        return oumArr;
    }
}
