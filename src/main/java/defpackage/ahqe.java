package defpackage;

import java.util.Arrays;

/* renamed from: ahqe */
public final class ahqe {
    public final amrr a;
    public boolean b;
    public final float c = 0.1f;
    public final float d = 2.0f;
    public long e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final float k = 3.8f;
    public float l;
    public float m;
    public long n;
    public long o;
    public final float[] p = new float[5];
    public final float[] q = new float[5];
    public int r;
    private int s;
    private int t;
    private long u;
    private int v;

    public final void a() {
        this.b = false;
        this.f = 0.0f;
        this.h = 0.0f;
        this.g = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
    }

    public ahqe(amrr amrr) {
        this.a = amrr;
        a();
    }

    public static boolean a(float f) {
        return Math.abs(f) < 1.0E-5f;
    }

    public final void b(float f) {
        float f2 = this.h;
        float f3 = this.f + f2;
        if (f3 > f) {
            this.f = f - f2;
            if (this.l > 0.0f) {
                this.l = 0.0f;
                return;
            }
            return;
        }
        f = -f;
        if (f3 < f) {
            this.f = f - f2;
            if (this.l < 0.0f) {
                this.l = 0.0f;
            }
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        long a = this.a.a();
        float f = ((float) (a - this.u)) * 1.0E-9f;
        float f2 = (float) i3;
        double tan = Math.tan(0.8726649880409241d);
        double d = (double) i4;
        Double.isNaN(d);
        tan *= d;
        d = (double) f2;
        Double.isNaN(d);
        float atan = (float) Math.atan(tan / d);
        float f3 = (((float) (i2 - this.t)) * (-(atan + atan))) / ((float) i4);
        float f4 = (((float) (i - this.s)) * -1.74533f) / f2;
        this.f += f3;
        this.g += f4;
        if (f > 0.0f) {
            f3 = angz.a(f3 / f, -18.84956f, 18.84956f);
            f2 = angz.a(f4 / f, -18.84956f, 18.84956f);
            float[] fArr = this.p;
            int i5 = this.v;
            fArr[i5] = f3;
            this.q[i5] = f2;
            i5++;
            if (i5 >= 5) {
                i5 = 0;
            }
            this.v = i5;
            this.r = Math.min(this.r + 1, 5);
        }
        this.s = i;
        this.t = i2;
        this.u = a;
    }

    public final void a(int i, int i2) {
        this.u = this.a.a();
        this.s = i;
        this.t = i2;
        this.m = 0.0f;
        this.l = 0.0f;
        Arrays.fill(this.p, 0.0f);
        Arrays.fill(this.q, 0.0f);
        this.v = 0;
        this.r = 0;
        this.b = true;
    }
}
