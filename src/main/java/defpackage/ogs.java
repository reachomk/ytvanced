package defpackage;

import android.util.Pair;

/* renamed from: ogs */
final class ogs implements ogx {
    private final long[] a;
    private final long[] b;
    private final long c;

    public ogs(long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = nyr.b(jArr2[jArr2.length - 1]);
    }

    public final boolean aS_() {
        return true;
    }

    public final long c() {
        return -1;
    }

    public final ofx a(long j) {
        Pair a = ogs.a(nyr.a(ozp.a(j, 0, this.c)), this.b, this.a);
        return new ofx(new ofz(nyr.b(((Long) a.first).longValue()), ((Long) a.second).longValue()));
    }

    public final long b(long j) {
        return nyr.b(((Long) ogs.a(j, this.a, this.b).second).longValue());
    }

    public final long b() {
        return this.c;
    }

    private static Pair a(long j, long[] jArr, long[] jArr2) {
        int a = ozp.a(jArr, j, true);
        long j2 = jArr[a];
        long j3 = jArr2[a];
        a++;
        if (a == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        double d;
        long j4 = jArr[a];
        long j5 = jArr2[a];
        if (j4 != j2) {
            d = (double) j;
            double d2 = (double) j2;
            Double.isNaN(d);
            Double.isNaN(d2);
            d -= d2;
            double d3 = (double) (j4 - j2);
            Double.isNaN(d3);
            d /= d3;
        } else {
            d = 0.0d;
        }
        Long valueOf = Long.valueOf(j);
        double d4 = (double) (j5 - j3);
        Double.isNaN(d4);
        return Pair.create(valueOf, Long.valueOf(((long) (d * d4)) + j3));
    }
}
