package defpackage;

/* renamed from: amhs */
final class amhs extends azzk {
    private final String a;
    private final String b;
    private long c = -1;
    private long d;
    private long e;
    private final /* synthetic */ amhm f;

    public amhs(amhm amhm, String str, String str2) {
        this.f = amhm;
        this.a = str;
        this.b = str2;
    }

    public final void a() {
        this.e = System.currentTimeMillis();
    }

    public final void a(azzh azzh) {
        azyl g;
        long currentTimeMillis = System.currentTimeMillis();
        double d = Double.NaN;
        long j = 0;
        if (this.c != -1) {
            g = azzh.g();
            long d2 = g != null ? g.d() : 0;
            long j2 = d2 - this.c;
            if (j2 != 0) {
                long a = g != null ? g.a() : 0;
                if (a != -1) {
                    double d3 = (double) (a - d2);
                    d = (double) j2;
                    Double.isNaN(d3);
                    Double.isNaN(d);
                    d3 /= d;
                    d = (double) (currentTimeMillis - this.d);
                    Double.isNaN(d);
                    d = (d3 * d) / 1000.0d;
                }
            }
        }
        double d4 = d;
        if (this.c == -1) {
            g = azzh.g();
            if (g != null) {
                j = g.d();
            }
            this.c = j;
            this.d = currentTimeMillis;
        }
        this.f.a(this.a, this.b, azzh, d4);
    }

    public final void b(azzh azzh) {
        d(azzh);
    }

    public final void c(azzh azzh) {
        d(azzh);
    }

    private final void d(azzh azzh) {
        double d;
        azyl g = azzh.g();
        double currentTimeMillis = (double) (System.currentTimeMillis() - this.e);
        Double.isNaN(currentTimeMillis);
        currentTimeMillis /= 1000.0d;
        if (g != null) {
            d = (double) g.d();
            Double.isNaN(d);
            d /= 1048576.0d;
        } else {
            d = 0.0d;
        }
        StringBuilder stringBuilder = new StringBuilder(101);
        stringBuilder.append("Transferred ");
        stringBuilder.append(d);
        stringBuilder.append("MB in ");
        stringBuilder.append(currentTimeMillis);
        stringBuilder.append("s (");
        stringBuilder.append((d * 8.0d) / currentTimeMillis);
        stringBuilder.append(" MBit/s)");
        xtl.e(stringBuilder.toString());
    }
}
