package defpackage;

/* renamed from: kiw */
final /* synthetic */ class kiw implements Runnable {
    private final kis a;
    private final String b;
    private final long c;
    private final long d;

    kiw(kis kis, String str, long j, long j2) {
        this.a = kis;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        kis kis = this.a;
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        fno fno = (fno) kis.a.e.get(str);
        if (fno != null) {
            double d = (double) j2;
            if (d != -1.0d) {
                double d2 = (double) j;
                Double.isNaN(d2);
                Double.isNaN(d);
                d2 /= d;
                fno.g = d2;
                if (d2 > 0.0d) {
                    fno.f = 1.0d;
                }
            }
            kis.a.a(str);
        }
    }
}
