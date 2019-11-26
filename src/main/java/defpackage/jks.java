package defpackage;

/* renamed from: jks */
final /* synthetic */ class jks implements Runnable {
    private final jkp a;
    private final String b;
    private final long c;
    private final long d;
    private final double e;

    jks(jkp jkp, String str, long j, long j2, double d) {
        this.a = jkp;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = d;
    }

    public final void run() {
        jkp jkp = this.a;
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        double d = this.e;
        fnp a = jkp.a.a(str, null);
        if (a != null) {
            if (j2 != -1) {
                double d2 = (double) j;
                double d3 = (double) j2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                a.j = d2 / d3;
            }
            a.k = d;
            jkp.a.a(a);
        }
    }
}
