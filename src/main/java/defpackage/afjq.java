package defpackage;

/* renamed from: afjq */
public final class afjq implements owt {
    private final xsc a;
    private final afia b;
    private final int c;
    private int d;
    private long e;
    private long f;

    public afjq(xsc xsc, afia afia, int i) {
        this.a = xsc;
        this.b = afia;
        this.c = i;
    }

    public final void a(ovi ovi, ovm ovm, boolean z) {
    }

    public final synchronized void b(ovi ovi, ovm ovm, boolean z) {
        if (this.d == 0) {
            this.e = this.a.b();
        }
        this.d++;
    }

    public final synchronized void a(ovi ovi, ovm ovm, boolean z, int i) {
        this.f += (long) i;
    }

    public final synchronized void c(ovi ovi, ovm ovm, boolean z) {
        amqw.b(this.d > 0);
        long b = this.a.b();
        int i = (int) (b - this.e);
        if (i > 0) {
            long j = this.f;
            if (j >= 16384) {
                afia afia = this.b;
                afin afin = new afin(this.c, i, j);
                for (afid a : afia.a) {
                    a.a(afin);
                }
            }
        }
        i = this.d - 1;
        this.d = i;
        if (i > 0) {
            this.e = b;
        }
        this.f = 0;
    }
}
