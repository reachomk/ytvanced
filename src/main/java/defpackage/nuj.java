package defpackage;

/* renamed from: nuj */
final class nuj {
    private final nrs a;

    public nuj(nrs nrs) {
        this.a = nrs;
        nrs.a(nmx.a(null, "application/eia-608", -1, -1, null));
    }

    public final void a(long j, nwz nwz) {
        while (nwz.b() > 1) {
            int d;
            int i;
            int i2 = 0;
            int i3 = 0;
            do {
                d = nwz.d();
                i3 += d;
            } while (d == 255);
            while (true) {
                d = nwz.d();
                i = i2 + d;
                if (d != 255) {
                    break;
                }
                i2 = i;
            }
            if (i3 == 4 && i >= 8) {
                i2 = nwz.b;
                i3 = nwz.d();
                d = nwz.e();
                int j2 = nwz.j();
                int d2 = nwz.d();
                nwz.c(i2);
                if (i3 == 181 && d == 49 && j2 == 1195456820 && d2 == 3) {
                    this.a.a(nwz, i);
                    this.a.a(j, 1, i, 0, null);
                }
            }
            nwz.d(i);
        }
    }
}
