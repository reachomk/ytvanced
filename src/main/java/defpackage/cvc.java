package defpackage;

import java.util.Iterator;

/* renamed from: cvc */
public final class cvc extends cvd implements cuz {
    private final cvg e;
    private long f;

    public cvc() {
        this(null);
    }

    public cvc(cvi cvi) {
        this.f = Long.MIN_VALUE;
        this.e = new cvg();
        if (cvi != null) {
            this.e.a(cvi);
        }
    }

    public final float a(long j) {
        cvc cvc = this;
        long j2 = j;
        String str = "end";
        if (cvc.f == Long.MIN_VALUE) {
            cvc.f = j2;
            float f = cvc.a("initial").c;
            float f2 = cvc.a(str).c;
            cvg cvg = cvc.e;
            double d = (double) f;
            cvg.e = d;
            cvg.b.a = d;
            Iterator it = cvg.i.iterator();
            while (it.hasNext()) {
                ((cvh) it.next()).a();
            }
            cvf cvf = cvg.b;
            double d2 = cvf.a;
            cvg.f = d2;
            cvg.d.a = d2;
            cvf.b = 0.0d;
            cvc.e.a((double) f2);
            return f;
        }
        float f3 = cvc.a(str).c;
        cvc.e.a((double) f3);
        if (a()) {
            return f3;
        }
        double d3 = (double) (j2 - cvc.f);
        Double.isNaN(d3);
        d3 /= 1.0E9d;
        cvg cvg2 = cvc.e;
        boolean b = cvg2.b();
        if (!(b && cvg2.g)) {
            double d4;
            cvf cvf2;
            boolean z;
            Object obj;
            if (d3 > 0.064d) {
                d3 = 0.064d;
            }
            cvg2.h += d3;
            cvi cvi = cvg2.a;
            double d5 = cvi.b;
            d3 = cvi.a;
            cvf cvf3 = cvg2.b;
            double d6 = cvf3.a;
            double d7 = cvf3.b;
            cvf3 = cvg2.d;
            double d8 = cvf3.a;
            double d9 = d7;
            double d10 = d6;
            double d11 = d8;
            d8 = cvf3.b;
            while (true) {
                d4 = cvg2.h;
                if (d4 < 0.001d) {
                    break;
                }
                d4 -= 4046.848d;
                cvg2.h = d4;
                if (d4 < 0.001d) {
                    cvf2 = cvg2.c;
                    cvf2.a = d10;
                    cvf2.b = d9;
                }
                d4 = cvg2.f;
                d11 = ((d4 - d11) * d5) - (d3 * d9);
                d8 = d9 + ((d11 * 0.001d) * 0.5d);
                double d12 = ((d4 - (d10 + ((d9 * 0.001d) * 0.5d))) * d5) - (d3 * d8);
                double d13 = d9 + ((d12 * 0.001d) * 0.5d);
                double d14 = ((d4 - (d10 + ((d8 * 0.001d) * 0.5d))) * d5) - (d3 * d13);
                double d15 = d10 + (d13 * 0.001d);
                double d16 = d9 + (d14 * 0.001d);
                d8 += d13;
                d12 += d14;
                d10 += (((d9 + (d8 + d8)) + d16) * 0.16666666666666666d) * 0.001d;
                d9 += (((d11 + (d12 + d12)) + (((d4 - d15) * d5) - (d3 * d16))) * 0.16666666666666666d) * 0.001d;
                d11 = d15;
                d8 = d16;
            }
            cvf2 = cvg2.d;
            cvf2.a = d11;
            cvf2.b = d8;
            cvf2 = cvg2.b;
            cvf2.a = d10;
            cvf2.b = d9;
            if (d4 > 0.0d) {
                d4 /= 0.001d;
                cvf cvf4 = cvg2.c;
                d11 = 1.0d - d4;
                z = b;
                d8 = d5;
                cvf2.a = (d10 * d4) + (cvf4.a * d11);
                cvf2.b = (d9 * d4) + (cvf4.b * d11);
            } else {
                z = b;
                d8 = d5;
            }
            if (cvg2.b()) {
                if (d8 > 0.0d) {
                    d9 = cvg2.f;
                    cvg2.e = d9;
                    cvg2.b.a = d9;
                } else {
                    d9 = cvg2.b.a;
                    cvg2.f = d9;
                    cvg2.e = d9;
                }
                cvf cvf5 = cvg2.b;
                if (cvf5.b != 0.0d) {
                    cvf5.b = 0.0d;
                }
                z = true;
            }
            boolean z2 = false;
            if (cvg2.g) {
                cvg2.g = false;
                obj = 1;
            } else {
                obj = null;
            }
            if (z) {
                cvg2.g = true;
                z2 = true;
            }
            Iterator it2 = cvg2.i.iterator();
            while (it2.hasNext()) {
                cvh cvh = (cvh) it2.next();
                if (obj != null) {
                    cvh.c();
                }
                cvh.a();
                if (z2) {
                    cvh.b();
                }
            }
            cvc = this;
            j2 = j;
        }
        cvc.f = j2;
        return (float) cvc.e.a();
    }

    public final boolean a() {
        return this.e.b();
    }
}
