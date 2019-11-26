package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.provider.Settings.Global;
import java.io.Closeable;

/* renamed from: bpg */
public final class bpg {
    public static final float[] a = new float[4];
    private static final PathMeasure b = new PathMeasure();
    private static final Path c = new Path();
    private static final Path d = new Path();
    private static final float e = ((float) Math.sqrt(2.0d));
    private static float f = -1.0f;

    public static int a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    public static Path a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            Path path2 = path;
            path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    public static boolean a(int i, int i2, int i3) {
        return i >= 4 ? i <= 4 ? i2 >= 4 ? i2 > 4 || i3 >= 0 : false : true : false;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float a(Matrix matrix) {
        float[] fArr = a;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        float[] fArr2 = a;
        return ((float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]))) / 2.0f;
    }

    public static void a(Path path, blk blk) {
        if (blk != null && !blk.a) {
            bpg.a(path, ((blo) blk.b).g() / 100.0f, ((blo) blk.c).g() / 100.0f, ((blo) blk.d).g() / 360.0f);
        }
    }

    public static void a(Path path, float f, float f2, float f3) {
        b.setPath(path, false);
        float length = b.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            bjd.a();
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 4.0f)) < 0.01d) {
            bjd.a();
        } else {
            f *= length;
            f2 *= length;
            f3 *= length;
            float min = Math.min(f, f2) + f3;
            f = Math.max(f, f2) + f3;
            if (min >= length && f >= length) {
                min = (float) bpd.a(min, length);
                f = (float) bpd.a(f, length);
            }
            if (min < 0.0f) {
                min = (float) bpd.a(min, length);
            }
            if (f < 0.0f) {
                f = (float) bpd.a(f, length);
            }
            if (min == f) {
                path.reset();
                bjd.a();
                return;
            }
            if (min >= f) {
                min -= length;
            }
            c.reset();
            b.getSegment(min, f, c, true);
            if (f > length) {
                d.reset();
                b.getSegment(0.0f, f % length, d, true);
                c.addPath(d);
            } else if (min < 0.0f) {
                d.reset();
                b.getSegment(min + length, length, d, true);
                c.addPath(d);
            }
            path.set(c);
            bjd.a();
        }
    }

    public static float a() {
        if (f == -1.0f) {
            f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f;
    }

    public static float a(Context context) {
        return Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }
}
