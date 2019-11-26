package defpackage;

/* renamed from: nor */
public final class nor extends nnv {
    private final nmx m;
    private volatile int n;
    private volatile boolean o;

    public nor(nvo nvo, nvq nvq, nom nom, long j, long j2, int i, nmx nmx, int i2) {
        super(nvo, nvq, 1, nom, j, j2, i, true, i2);
        this.m = nmx;
    }

    public final npv b() {
        return null;
    }

    public final long c() {
        return (long) this.n;
    }

    public final nmx a() {
        return this.m;
    }

    public final void d() {
        this.o = true;
    }

    public final boolean e() {
        return this.o;
    }

    public final void f() {
        try {
            this.i.a(nxf.a(this.g, this.n));
            int i = 0;
            while (i != -1) {
                this.n += i;
                nra nra = this.b;
                nvo nvo = this.i;
                nrl nrl = nra.a;
                int a = nrl.a(Integer.MAX_VALUE);
                nvf nvf = nrl.i;
                int a2 = nvo.a(nvf.a, nvf.a(nrl.j), a);
                if (a2 != -1) {
                    nrl.j += a2;
                    nrl.h += (long) a2;
                    i = a2;
                } else {
                    i = -1;
                }
            }
            this.b.a(this.j, 1, this.n, 0, null);
        } finally {
            nxf.a(this.i);
        }
    }
}
