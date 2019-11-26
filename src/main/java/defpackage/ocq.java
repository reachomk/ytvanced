package defpackage;

import java.util.Arrays;

/* renamed from: ocq */
public final class ocq implements oco {
    public final obq[] a;
    private final ocy b = new ocy();
    private final odc c = new odc();

    public ocq(obq... obqArr) {
        int length = obqArr.length;
        this.a = (obq[]) Arrays.copyOf(obqArr, length + 2);
        obqArr = this.a;
        obqArr[length] = this.b;
        obqArr[length + 1] = this.c;
    }

    public final oag a(oag oag) {
        ocy ocy = this.b;
        ocy.b = oag.d;
        ocy.h();
        float a = this.c.a(oag.b);
        odc odc = this.c;
        float a2 = ozp.a(oag.c, 0.1f, 8.0f);
        if (odc.e != a2) {
            odc.e = a2;
            odc.g = true;
        }
        odc.h();
        return new oag(a, a2, oag.d);
    }

    public final long a(long j) {
        odc odc = this.c;
        long j2 = odc.i;
        if (j2 >= 1024) {
            int i = odc.f;
            int i2 = odc.c;
            if (i == i2) {
                return ozp.b(j, odc.h, j2);
            }
            return ozp.b(j, odc.h * ((long) i), j2 * ((long) i2));
        }
        double d = (double) odc.d;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    public final long a() {
        return this.b.g;
    }
}
