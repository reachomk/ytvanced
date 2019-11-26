package defpackage;

import android.graphics.Color;

/* renamed from: sc */
public final class sc {
    private static final ThreadLocal a = new ThreadLocal();

    private static float a(float f, float f2) {
        if (f >= 0.0f) {
            return f <= f2 ? f : f2;
        } else {
            f = 0.0f;
        }
    }

    public static int a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, sc.a(Color.red(i), alpha2, Color.red(i2), alpha, i3), sc.a(Color.green(i), alpha2, Color.green(i2), alpha, i3), sc.a(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    private static int a(int i, int i2, int i3, int i4, int i5) {
        return i5 != 0 ? (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255) : 0;
    }

    private static double a(int i) {
        double[] dArr = (double[]) a.get();
        if (dArr == null) {
            dArr = new double[3];
            a.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d;
            double d2 = (double) red;
            Double.isNaN(d2);
            d2 /= 255.0d;
            d2 = d2 >= 0.04045d ? Math.pow((d2 + 0.055d) / 1.055d, 2.4d) : d2 / 12.92d;
            double d3 = (double) green;
            Double.isNaN(d3);
            d3 /= 255.0d;
            if (d3 >= 0.04045d) {
                d3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                d = 12.92d;
            } else {
                d = 12.92d;
                d3 /= 12.92d;
            }
            double d4 = (double) blue;
            Double.isNaN(d4);
            d4 /= 255.0d;
            d4 = d4 >= 0.04045d ? Math.pow((d4 + 0.055d) / 1.055d, 2.4d) : d4 / d;
            dArr[0] = (((0.4124d * d2) + (0.3576d * d3)) + (0.1805d * d4)) * 100.0d;
            dArr[1] = (((0.2126d * d2) + (0.7152d * d3)) + (0.0722d * d4)) * 100.0d;
            dArr[2] = (((d2 * 0.0193d) + (d3 * 0.1192d)) + (d4 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static double b(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = sc.a(i, i2);
            }
            double a = sc.a(i) + 0.05d;
            double a2 = sc.a(i2) + 0.05d;
            return Math.max(a, a2) / Math.min(a, a2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("background can not be translucent: #");
        stringBuilder.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int a(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (sc.b(sc.c(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                double b = sc.b(sc.c(i, i6), i2);
                if (b >= d) {
                    i3 = i6;
                }
                if (b < d) {
                    i4 = i6;
                }
            }
            return i3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("background can not be translucent: #");
        stringBuilder.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f = ((float) i) / 255.0f;
        float f2 = ((float) i2) / 255.0f;
        float f3 = ((float) i3) / 255.0f;
        float max = Math.max(f, Math.max(f2, f3));
        float min = Math.min(f, Math.min(f2, f3));
        float f4 = max - min;
        float f5 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f ? ((f2 - f3) / f4) % 6.0f : max != f2 ? ((f - f2) / f4) + 4.0f : ((f3 - f) / f4) + 2.0f;
            f2 = f4 / (1.0f - Math.abs((f5 + f5) - 4.0f));
        }
        f = (f * 60.0f) % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        fArr[0] = sc.a(f, 360.0f);
        fArr[1] = sc.a(f2, 1.0f);
        fArr[2] = sc.a(f5, 1.0f);
    }

    public static void a(int i, float[] fArr) {
        sc.a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static int c(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
