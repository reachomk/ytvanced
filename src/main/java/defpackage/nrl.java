package defpackage;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: nrl */
public final class nrl {
    public final nvi a;
    public final int b;
    public final nro c = new nro();
    public final LinkedBlockingDeque d = new LinkedBlockingDeque();
    public final nrn e = new nrn();
    public final nwz f = new nwz(32);
    public long g;
    public long h;
    public nvf i;
    public int j = this.b;

    public nrl(nvi nvi) {
        this.a = nvi;
        this.b = nvi.c();
    }

    public final boolean a(nnb nnb) {
        return this.c.a(nnb, this.e);
    }

    public final void a() {
        a(this.c.b());
    }

    public final void a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            a(j);
            int i3 = (int) (j - this.g);
            int min = Math.min(i - i2, this.b - i3);
            nvf nvf = (nvf) this.d.peek();
            System.arraycopy(nvf.a, nvf.a(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
        }
    }

    public final void a(long j) {
        int i = ((int) (j - this.g)) / this.b;
        for (int i2 = 0; i2 < i; i2++) {
            this.a.a((nvf) this.d.remove());
            this.g += (long) this.b;
        }
    }

    public final int a(int i) {
        if (this.j == this.b) {
            this.j = 0;
            this.i = this.a.a();
            this.d.add(this.i);
        }
        return Math.min(i, this.b - this.j);
    }
}
