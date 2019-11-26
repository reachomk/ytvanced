package defpackage;

/* renamed from: baem */
public final class baem implements baeu {
    private final float[] a = new float[]{0.0f, 0.0f, 0.0f, 1.0f};

    public final synchronized void a(float[] fArr) {
        System.arraycopy(this.a, 0, fArr, 0, 4);
    }

    public final synchronized void b(float[] fArr) {
        float[] fArr2 = fArr;
        synchronized (this) {
            if (fArr2.length == 16) {
                double d = (double) fArr2[0];
                Double.isNaN(d);
                double d2 = d + 1.0d;
                double d3 = (double) fArr2[5];
                double d4 = (double) fArr2[10];
                Double.isNaN(d3);
                double d5 = d2 + d3;
                Double.isNaN(d4);
                float sqrt = ((float) Math.sqrt(Math.max(0.0d, d5 + d4))) * 0.5f;
                Double.isNaN(d3);
                d2 -= d3;
                Double.isNaN(d4);
                float sqrt2 = ((float) Math.sqrt(Math.max(0.0d, d2 - d4))) * 0.5f;
                Double.isNaN(d);
                d = 1.0d - d;
                Double.isNaN(d3);
                double d6 = d + d3;
                Double.isNaN(d4);
                double d7 = d;
                float sqrt3 = ((float) Math.sqrt(Math.max(0.0d, d6 - d4))) * 0.5f;
                Double.isNaN(d3);
                d = d7 - d3;
                Double.isNaN(d4);
                float sqrt4 = ((float) Math.sqrt(Math.max(0.0d, d + d4))) * 0.5f;
                float[] fArr3 = this.a;
                if ((fArr2[6] - fArr2[9] >= 0.0f ? null : 1) != (sqrt2 >= 0.0f ? null : 1)) {
                    sqrt2 = -sqrt2;
                }
                int i = 0;
                fArr3[0] = sqrt2;
                if ((fArr2[8] - fArr2[2] >= 0.0f ? null : 1) != (sqrt3 >= 0.0f ? null : 1)) {
                    sqrt3 = -sqrt3;
                }
                fArr3[1] = sqrt3;
                int i2 = fArr2[1] - fArr2[4] >= 0.0f ? 0 : 1;
                if (sqrt4 < 0.0f) {
                    i = 1;
                }
                if (i2 != i) {
                    sqrt4 = -sqrt4;
                }
                fArr3[2] = sqrt4;
                fArr3[3] = sqrt;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
