package defpackage;

/* renamed from: azyi */
final class azyi extends azzb {
    public azyi(azyl azyl, int i) {
        boolean z = true;
        amqw.a(i > 0, (Object) "Chunk granularity must be greater than 0.");
        long j = (long) i;
        if (j >= azyl.e()) {
            z = false;
        }
        amqw.a(z, (Object) "Chunk granularity must be smaller than the read ahead limit.");
        long d = azyl.d();
        long a = azyl.a();
        if (a < 0) {
            while (azyl.g() && azyl.d() - azyl.c() < azyl.e()) {
                azyl.a(azyl.e());
            }
            a = azyl.d();
            azyl.f();
            azyl.a(d - azyl.c());
        } else {
            long c = azyl.c() + azyl.e();
            if (c > 0 && c < a) {
                a = c;
            }
        }
        super(azyl, ((a - d) / j) * j);
    }
}
