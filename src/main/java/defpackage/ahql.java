package defpackage;

/* renamed from: ahql */
final class ahql implements Runnable {
    private final /* synthetic */ float[] a;
    private final /* synthetic */ long b;
    private final /* synthetic */ ahqj c;

    ahql(ahqj ahqj, float[] fArr, long j) {
        this.c = ahqj;
        this.a = fArr;
        this.b = j;
    }

    public final void run() {
        int i;
        ahqj ahqj = this.c;
        Object obj = this.a;
        long j = this.b;
        amqw.a(obj);
        amqw.a(obj.length == 16);
        int i2 = 3;
        float[] fArr = new float[3];
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= 3) {
                break;
            }
            fArr[i3] = -obj[(i3 << 2) + 2];
            i3++;
        }
        ahrh ahrh = new ahrh(fArr, j);
        if (ahqj.e != null) {
            j = ahqj.f + 200;
            while (true) {
                long j2 = ahrh.b;
                if (j > j2) {
                    break;
                }
                ahrh ahrh2;
                byte[] a;
                long j3;
                ahrh ahrh3 = ahqj.e;
                boolean z = j <= j2 && j >= ahrh3.b;
                amqw.a(z);
                amqw.a(ahrh.b >= ahrh3.b);
                j2 = ahrh.b;
                long j4 = ahrh3.b;
                j2 -= j4;
                if (j2 != 0) {
                    float f = ((float) (j - j4)) / ((float) j2);
                    if (f < 0.0f) {
                        ahrh2 = ahrh3;
                    } else if (f <= 1.0f) {
                        float[] fArr2;
                        float[] fArr3 = ahrh3.a;
                        float[] fArr4 = ahrh.a;
                        fArr = new float[i2];
                        float a2 = ahrh.a(fArr3);
                        float a3 = ahrh.a(fArr4);
                        float a4 = ahrh.a(fArr3, fArr4) / (a2 * a3);
                        float f2 = (a4 <= 1.0f || a4 > 1.000001f) ? a4 : 1.0f;
                        float acos = (float) Math.acos((double) f2);
                        float sqrt;
                        float f3;
                        if (acos >= 1.0E-6f) {
                            double d;
                            float f4;
                            fArr2 = fArr;
                            if (((double) acos) <= 3.1415916535897956d) {
                                sqrt = (float) Math.sqrt((double) (1.0f - (f2 * f2)));
                            } else {
                                float[] fArr5;
                                float[] fArr6 = new float[i2];
                                sqrt = (a2 + a3) / 2.0f;
                                double sqrt2;
                                if (Math.abs(fArr3[0]) <= 1.0E-6f) {
                                    f3 = fArr3[i];
                                    float f5 = fArr3[1];
                                    double d2 = (double) sqrt;
                                    sqrt2 = Math.sqrt((double) ((f3 * f3) + (f5 + f5)));
                                    Double.isNaN(d2);
                                    sqrt = (float) (d2 / sqrt2);
                                    fArr6[0] = 0.0f;
                                    fArr6[1] = (-fArr3[2]) * sqrt;
                                    fArr6[2] = fArr3[1] * sqrt;
                                    fArr5 = fArr6;
                                } else {
                                    f3 = fArr3[0];
                                    float f6 = fArr3[1];
                                    fArr5 = fArr6;
                                    d = (double) sqrt;
                                    sqrt2 = Math.sqrt((double) ((f3 * f3) + (f6 + f6)));
                                    Double.isNaN(d);
                                    f4 = (float) (d / sqrt2);
                                    fArr5[0] = (-fArr3[1]) * f4;
                                    fArr5[1] = fArr3[0] * f4;
                                    fArr5[2] = 0.0f;
                                }
                                if (((double) f) > 0.5d) {
                                    f = (f + f) - 4.0f;
                                    fArr3 = fArr5;
                                } else {
                                    f += f;
                                    a3 = a2;
                                    fArr4 = fArr5;
                                }
                                acos = 1.5707964f;
                                sqrt = 1.0f;
                            }
                            double d3 = (double) sqrt;
                            sqrt = a2;
                            double d4 = (double) f;
                            Double.isNaN(d4);
                            double d5 = 1.0d - d4;
                            d4 = (double) acos;
                            Double.isNaN(d4);
                            d4 = Math.sin(d5 * d4);
                            Double.isNaN(d3);
                            f3 = ((float) (d4 / d3)) / sqrt;
                            d = Math.sin((double) (acos * f));
                            Double.isNaN(d3);
                            f4 = ((float) (d / d3)) / a3;
                            float f7 = ((1.0f - f) * sqrt) + (f * a3);
                            for (int i4 = 0; i4 < 3; i4++) {
                                fArr2[i4] = ((fArr3[i4] * f3) + (fArr4[i4] * f4)) * f7;
                            }
                        } else {
                            fArr2 = fArr;
                            for (i2 = 0; i2 < 3; i2++) {
                                sqrt = fArr4[i2];
                                f3 = fArr3[i2];
                                fArr2[i2] = ((sqrt - f3) * f) + f3;
                            }
                        }
                        ahrh2 = new ahrh(fArr2, j);
                    }
                    a = ahrh2.a();
                    j3 = ahrh2.b;
                    ahqj.f = j3;
                    ahqj.a(a, j3);
                    j += 200;
                    j3 = 200;
                    i2 = 3;
                    i = 2;
                }
                ahrh2 = ahrh;
                a = ahrh2.a();
                j3 = ahrh2.b;
                ahqj.f = j3;
                ahqj.a(a, j3);
                j += 200;
                j3 = 200;
                i2 = 3;
                i = 2;
            }
        } else {
            byte[] a5 = ahrh.a();
            long j5 = ahrh.b;
            ahqj.f = j5;
            ahqj.a(a5, j5);
        }
        ahqj.e = ahrh;
    }
}
