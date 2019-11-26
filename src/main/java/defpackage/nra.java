package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: nra */
public class nra implements nrs {
    public final nrl a;
    public final nnb b = new nnb(0);
    public boolean c = true;
    public volatile long d = Long.MIN_VALUE;
    public volatile nmx e;
    private long f = Long.MIN_VALUE;

    public nra(nvi nvi) {
        this.a = new nrl(nvi);
    }

    public final void a() {
        nrl nrl = this.a;
        nro nro = nrl.c;
        nro.e = 0;
        nro.f = 0;
        nro.g = 0;
        nro.d = 0;
        nvi nvi = nrl.a;
        LinkedBlockingDeque linkedBlockingDeque = nrl.d;
        nvi.a((nvf[]) linkedBlockingDeque.toArray(new nvf[linkedBlockingDeque.size()]));
        nrl.d.clear();
        nrl.g = 0;
        nrl.h = 0;
        nrl.i = null;
        nrl.j = nrl.b;
        this.c = true;
        this.f = Long.MIN_VALUE;
        this.d = Long.MIN_VALUE;
    }

    public final int b() {
        return this.a.c.e;
    }

    public final boolean c() {
        return d() ^ 1;
    }

    public final boolean a(nnb nnb) {
        nnb nnb2 = nnb;
        if (!d()) {
            return false;
        }
        nrl nrl = this.a;
        if (nrl.c.a(nnb2, nrl.e)) {
            long j;
            int i;
            int i2;
            if (nnb.a()) {
                nrn nrn = nrl.e;
                j = nrn.a;
                nrl.a(j, nrl.f.a, 1);
                j++;
                byte b = nrl.f.a[0];
                i = b & 128;
                i2 = b & 127;
                nll nll = nnb2.a;
                if (nll.a == null) {
                    nll.a = new byte[16];
                }
                nrl.a(j, nll.a, i2);
                j += (long) i2;
                if (i != 0) {
                    nrl.a(j, nrl.f.a, 2);
                    j += 2;
                    nrl.f.c(0);
                    i2 = nrl.f.e();
                } else {
                    i2 = 1;
                }
                nll = nnb2.a;
                int[] iArr = nll.d;
                if (iArr == null || iArr.length < i2) {
                    iArr = new int[i2];
                }
                int[] iArr2 = nll.e;
                if (iArr2 == null || iArr2.length < i2) {
                    iArr2 = new int[i2];
                }
                if (i == 0) {
                    iArr[0] = 0;
                    iArr2[0] = nnb2.c - ((int) (j - nrn.a));
                } else {
                    i = i2 * 6;
                    nwz nwz = nrl.f;
                    if (nwz.c < i) {
                        nwz.a(new byte[i], i);
                    }
                    nrl.a(j, nrl.f.a, i);
                    j += (long) i;
                    nrl.f.c(0);
                    for (i = 0; i < i2; i++) {
                        iArr[i] = nrl.f.e();
                        iArr2[i] = nrl.f.n();
                    }
                }
                nll nll2 = nnb2.a;
                byte[] bArr = nrn.b;
                nll2.f = i2;
                nll2.d = iArr;
                nll2.e = iArr2;
                nll2.b = bArr;
                nll2.c = 1;
                if (nxf.a >= 16) {
                    nll2.g.set(nll2.f, nll2.d, nll2.e, nll2.b, nll2.a, nll2.c);
                }
                long j2 = nrn.a;
                int i3 = (int) (j - j2);
                nrn.a = j2 + ((long) i3);
                nnb2.c -= i3;
            }
            nnb2.a(nnb2.c);
            j = nrl.e.a;
            ByteBuffer byteBuffer = nnb2.b;
            int i4 = nnb2.c;
            while (i4 > 0) {
                nrl.a(j);
                i = (int) (j - nrl.g);
                i2 = Math.min(i4, nrl.b - i);
                nvf nvf = (nvf) nrl.d.peek();
                byteBuffer.put(nvf.a, nvf.a(i), i2);
                j += (long) i2;
                i4 -= i2;
            }
            nrl.a(nrl.c.b());
        }
        this.c = false;
        return true;
    }

    public final boolean a(long j) {
        nrl nrl = this.a;
        j = nrl.c.a(j);
        if (j == -1) {
            return false;
        }
        nrl.a(j);
        return true;
    }

    private final boolean d() {
        boolean a = this.a.a(this.b);
        if (this.c) {
            while (a && !this.b.c()) {
                this.a.a();
                a = this.a.a(this.b);
            }
        }
        if (!a) {
            return false;
        }
        long j = this.f;
        if (j == Long.MIN_VALUE || this.b.e < j) {
            return true;
        }
        return false;
    }

    public final void a(nmx nmx) {
        this.e = nmx;
    }

    public final int a(nrb nrb, int i, boolean z) {
        nrl nrl = this.a;
        i = nrl.a(i);
        nvf nvf = nrl.i;
        int a = nrb.a(nvf.a, nvf.a(nrl.j), i);
        if (a != -1) {
            nrl.j += a;
            nrl.h += (long) a;
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void a(nwz nwz, int i) {
        nrl nrl = this.a;
        while (i > 0) {
            int a = nrl.a(i);
            nvf nvf = nrl.i;
            nwz.a(nvf.a, nvf.a(nrl.j), a);
            nrl.j += a;
            nrl.h += (long) a;
            i -= a;
        }
    }

    public void a(long j, int i, int i2, int i3, byte[] bArr) {
        long j2 = j;
        this.d = Math.max(this.d, j);
        nrl nrl = this.a;
        int i4 = i2;
        nrl.c.a(j2, i, (nrl.h - ((long) i4)) - ((long) i3), i4, bArr);
    }
}
