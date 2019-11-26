package defpackage;

/* renamed from: amaj */
final /* synthetic */ class amaj implements Runnable {
    private final amae a;
    private final String b;
    private final String c;
    private final long d;
    private final long e;
    private final double f;

    amaj(amae amae, String str, String str2, long j, long j2, double d) {
        this.a = amae;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = d;
    }

    public final void run() {
        amae amae = this.a;
        String str = this.b;
        String str2 = this.c;
        long j = this.d;
        long j2 = this.e;
        double d = this.f;
        for (amaq a : amae.a(str)) {
            double d2 = d;
            a.a(str2, j, j2, d);
        }
    }
}
