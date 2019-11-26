package defpackage;

/* renamed from: nnx */
public class nnx implements nre, nrs {
    private final nrc a;
    private boolean b;
    private noa c;
    private boolean d;
    private int e;

    public nnx(nrc nrc) {
        this.a = nrc;
    }

    public final void a(noa noa) {
        this.c = noa;
        if (this.b) {
            this.a.b();
            return;
        }
        this.a.a((nre) this);
        this.b = true;
    }

    public final int a(nrb nrb) {
        int a = this.a.a(nrb, null);
        boolean z = true;
        if (a == 1) {
            z = false;
        }
        nwf.b(z);
        return a;
    }

    public final nrs d_(int i) {
        boolean z = !this.d || i == this.e;
        nwf.b(z);
        this.d = true;
        this.e = i;
        return this;
    }

    public final void a() {
        nwf.b(this.d);
    }

    public final void a(nrq nrq) {
        this.c.a(nrq);
    }

    public final void a(npv npv) {
        this.c.a(npv);
    }

    public final void a(nmx nmx) {
        this.c.a(nmx);
    }

    public final int a(nrb nrb, int i, boolean z) {
        return this.c.a(nrb, i, z);
    }

    public final void a(nwz nwz, int i) {
        this.c.a(nwz, i);
    }

    public void a(long j, int i, int i2, int i3, byte[] bArr) {
        this.c.a(j, i, i2, i3, bArr);
    }
}
