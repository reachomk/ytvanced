package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: aeex */
public final class aeex {
    private static final long b = TimeUnit.SECONDS.toMicros(5);
    public final afhg a;

    public aeex(afhg afhg) {
        this.a = (afhg) amqw.a((Object) afhg);
    }

    public static oqg a(ofm ofm) {
        return new oqg(ofm, -1, null);
    }

    public static ofj a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return null;
        }
        double d = (double) j2;
        double d2 = (double) j;
        Double.isNaN(d2);
        Double.isNaN(d);
        d2 /= d;
        long j3 = b;
        double d3 = (double) j3;
        Double.isNaN(d3);
        long j4 = (long) (d2 * d3);
        double d4 = (double) j3;
        Double.isNaN(d);
        Double.isNaN(d4);
        int ceil = (int) Math.ceil(d / d4);
        int[] iArr = new int[ceil];
        long[] jArr = new long[ceil];
        long[] jArr2 = new long[ceil];
        long[] jArr3 = new long[ceil];
        for (int i = 0; i < ceil; i++) {
            iArr[i] = (int) Math.min(j4, j);
            long j5 = (long) i;
            jArr[i] = j5 * j4;
            jArr2[i] = Math.min(j2, b);
            jArr3[i] = j5 * b;
            j -= (long) iArr[i];
            j2 -= jArr2[i];
        }
        return new ofj(iArr, jArr, jArr2, jArr3);
    }

    public static void a(ovi ovi) {
        try {
            ovi.a();
        } catch (IOException unused) {
        }
    }
}
