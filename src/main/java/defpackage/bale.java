package defpackage;

import java.util.Arrays;

/* renamed from: bale */
public final class bale implements balc {
    private final int a = 2;
    private final bakx b;

    public bale(bakx bakx) {
        this.b = bakx;
    }

    public final long[] a(baky baky) {
        double e;
        double d = 0.0d;
        for (baky baky2 : this.b.d) {
            e = (double) (baky2.e() / baky2.k().b);
            if (d < e) {
                d = e;
            }
        }
        e = (double) this.a;
        Double.isNaN(e);
        int min = Math.min(((int) Math.ceil(d / e)) - 1, baky.h().size());
        if (min <= 0) {
            min = 1;
        }
        long[] jArr = new long[min];
        Arrays.fill(jArr, -1);
        int i = 0;
        jArr[0] = 1;
        long[] i2 = baky.i();
        int length = i2.length;
        long j = 0;
        int i3 = 0;
        while (i < length) {
            long j2 = i2[i];
            int i4 = ((int) ((j / baky.k().b) / ((long) this.a))) + 1;
            if (i4 >= jArr.length) {
                break;
            }
            i3++;
            jArr[i4] = (long) i3;
            j += j2;
            i++;
        }
        long j3 = (long) (i3 + 1);
        int length2 = jArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return jArr;
            }
            long j4 = jArr[length2];
            if (j4 == -1) {
                jArr[length2] = j3;
            } else {
                j3 = j4;
            }
        }
    }
}
