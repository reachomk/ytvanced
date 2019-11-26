package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: agzy */
public final class agzy implements aivo {
    public String a;
    public long b;
    public long c;
    private int d;
    private long e;
    private long f = -1;
    private long g;
    private double h;
    private final xsc i;
    private final aghl j;
    private final ahab k;

    public agzy(xsc xsc, aghl aghl, ahab ahab) {
        this.i = xsc;
        this.j = aghl;
        this.k = ahab;
        this.d = -1;
    }

    public final void a(aahr aahr, long j) {
        long j2 = j;
        long j3 = this.b + j2;
        double d = (double) j3;
        double d2 = (double) this.c;
        Double.isNaN(d2);
        d2 /= 100.0d;
        Double.isNaN(d);
        int round = (int) Math.round(d / d2);
        int i = this.d;
        if (i < 0 || ((double) (round - i)) >= 1.0d || j3 - this.e >= 16777216 || j2 == aahr.c()) {
            double d3;
            long a = this.i.a();
            long j4 = this.f;
            double d4 = 0.0d;
            if (j4 < a) {
                if (j4 != -1) {
                    d3 = (double) (j2 - this.g);
                    double toMillis = (double) TimeUnit.SECONDS.toMillis(1);
                    Double.isNaN(d3);
                    Double.isNaN(toMillis);
                    d3 *= toMillis;
                    toMillis = (double) (a - this.f);
                    Double.isNaN(toMillis);
                    d3 = Math.min(d3 / toMillis, 5000000.0d);
                    toMillis = this.h;
                    if (toMillis > 0.0d) {
                        d4 = Math.min(d3, toMillis * 10.0d);
                        d3 = (0.25d * d4) + (this.h * 0.75d);
                    } else {
                        d4 = d3;
                    }
                } else {
                    d3 = 0.0d;
                }
                this.f = a;
                this.g = j2;
                this.h = d4;
            } else {
                d3 = 0.0d;
            }
            this.j.a(this.a, aahr.b(), j2);
            this.k.a(this.b + j2, d3);
            this.d = round;
            this.e = j3;
        }
    }
}
