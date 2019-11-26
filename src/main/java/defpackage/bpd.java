package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: bpd */
public final class bpd {
    private static PointF a = new PointF();

    public static double a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static boolean c(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static void a(bnj bnj, Path path) {
        path.reset();
        PointF pointF = bnj.b;
        path.moveTo(pointF.x, pointF.y);
        a.set(pointF.x, pointF.y);
        for (int i = 0; i < bnj.a.size(); i++) {
            bme bme = (bme) bnj.a.get(i);
            PointF pointF2 = bme.a;
            PointF pointF3 = bme.b;
            PointF pointF4 = bme.c;
            if (pointF2.equals(a) && pointF3.equals(pointF4)) {
                path.lineTo(pointF4.x, pointF4.y);
            } else {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            }
            a.set(pointF4.x, pointF4.y);
        }
        if (bnj.c) {
            path.close();
        }
    }

    static int a(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static int a(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void a(bmi bmi, int i, List list, bmi bmi2, blc blc) {
        if (bmi.c(blc.b(), i)) {
            list.add(bmi2.a(blc.b()).a((bmh) blc));
        }
    }
}
