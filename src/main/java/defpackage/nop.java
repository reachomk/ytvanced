package defpackage;

/* renamed from: nop */
public final class nop extends nny implements noa {
    public nmx a;
    public npv b;
    public nrq c;
    private final nnx j;
    private volatile int k;
    private volatile boolean l;

    public nop(nvo nvo, nvq nvq, nom nom, nnx nnx) {
        this(nvo, nvq, 0, nom, nnx, -1);
    }

    public nop(nvo nvo, nvq nvq, int i, nom nom, nnx nnx, int i2) {
        super(nvo, nvq, 2, i, nom, i2);
        this.j = nnx;
    }

    public final long c() {
        return (long) this.k;
    }

    public final void a(nrq nrq) {
        this.c = nrq;
    }

    public final void a(npv npv) {
        this.b = npv;
    }

    public final void a(nmx nmx) {
        this.a = nmx;
    }

    public final int a(nrb nrb, int i, boolean z) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void a(nwz nwz, int i) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void a(long j, int i, int i2, int i3, byte[] bArr) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void d() {
        this.l = true;
    }

    public final boolean e() {
        return this.l;
    }

    public final void f() {
        nvq a = nxf.a(this.g, this.k);
        nrb nqx;
        try {
            nvo nvo = this.i;
            nqx = new nqx(nvo, a.c, nvo.a(a));
            if (this.k == 0) {
                this.j.a((noa) this);
            }
            do {
                if (this.l) {
                }
                break;
            } while (this.j.a(nqx) == 0);
            this.k = (int) (nqx.c - this.g.c);
            nxf.a(this.i);
        } catch (Throwable th) {
            nxf.a(this.i);
        }
    }
}
