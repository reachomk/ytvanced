package defpackage;

/* renamed from: otw */
final class otw implements ott {
    public long[][] a;
    private final oux b;
    private final float c;

    otw(oux oux, float f) {
        this.b = oux;
        this.c = f;
    }

    public final long a() {
        long max = Math.max(0, (long) (((float) this.b.a()) * this.c));
        if (this.a == null) {
            return max;
        }
        long[][] jArr;
        int i = 1;
        while (true) {
            jArr = this.a;
            if (i < jArr.length - 1 && jArr[i][0] < max) {
                i++;
            }
        }
        long[] jArr2 = jArr[i - 1];
        long[] jArr3 = jArr[i];
        long j = jArr2[0];
        long j2 = jArr3[0];
        long j3 = jArr2[1];
        return j3 + ((long) ((((float) (max - j)) / ((float) (j2 - j))) * ((float) (jArr3[1] - j3))));
    }
}
