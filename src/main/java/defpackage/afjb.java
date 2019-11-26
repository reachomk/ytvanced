package defpackage;

/* renamed from: afjb */
public final class afjb implements xsc, xsd {
    private final xsc a;
    private Long b;
    private final double c;
    private final boolean d;

    public afjb(xsc xsc, double d, boolean z) {
        amqw.a((Object) xsc);
        amqw.a(d > 0.0d);
        this.a = xsc;
        this.c = 1.0d - Math.exp(Math.log(0.5d) / d);
        this.d = z;
    }

    private final synchronized void a(Long l) {
        if (l != null) {
            long longValue = l.longValue() - this.a.b();
            l = this.b;
            if (l == null) {
                this.b = Long.valueOf(longValue);
                return;
            }
            double d = 1.0d - this.c;
            double longValue2 = (double) l.longValue();
            Double.isNaN(longValue2);
            d *= longValue2;
            longValue2 = this.c;
            double d2 = (double) longValue;
            Double.isNaN(d2);
            this.b = Long.valueOf(Math.round(d + (longValue2 * d2)));
        }
    }

    public final synchronized long a() {
        if (this.b != null) {
            return this.a.b() + this.b.longValue();
        } else if (this.d) {
            return -1;
        } else {
            return this.a.a();
        }
    }

    public final long b() {
        return this.a.b();
    }

    public final long d() {
        return this.a.d();
    }

    public final long c() {
        return this.a.c();
    }

    public final void a(long j) {
        Thread.sleep(j);
    }
}
