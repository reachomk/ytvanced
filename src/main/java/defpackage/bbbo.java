package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: bbbo */
public final class bbbo implements bayb {
    private final Random a = new Random();
    private final long b = TimeUnit.SECONDS.toNanos(1);
    private final long c = TimeUnit.MINUTES.toNanos(2);
    private final double d = 1.6d;
    private final double e = 0.2d;
    private long f = this.b;

    public final long a() {
        long j = this.f;
        double d = (double) j;
        double d2 = this.d;
        Double.isNaN(d);
        this.f = Math.min((long) (d2 * d), this.c);
        d2 = this.e;
        double d3 = -d2;
        Double.isNaN(d);
        d3 *= d;
        Double.isNaN(d);
        d2 *= d;
        amqw.a(d2 >= d3);
        return j + ((long) ((this.a.nextDouble() * (d2 - d3)) + d3));
    }
}
