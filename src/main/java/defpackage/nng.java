package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: nng */
public abstract class nng extends nnj {
    private final nnd[] a = new nnd[1];
    private int[] b;
    private int[] c;
    private nnd d;
    private int e;
    private long f;

    public nng(nne... nneArr) {
        this.a[0] = nneArr[0].aP_();
    }

    public abstract void a(long j, long j2, boolean z);

    public abstract boolean a(nmx nmx);

    public abstract void b(long j);

    /* Access modifiers changed, original: protected */
    public long c(long j) {
        return j;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        nnd[] nndArr;
        int i = 0;
        int i2 = 1;
        while (true) {
            nndArr = this.a;
            if (i >= nndArr.length) {
                break;
            }
            i2 &= nndArr[i].b();
            i++;
        }
        if (i2 == 0) {
            return false;
        }
        int length;
        int[] iArr;
        i = 0;
        i2 = 0;
        while (true) {
            nndArr = this.a;
            length = nndArr.length;
            if (i >= length) {
                break;
            }
            i2 += nndArr[i].c();
            i++;
        }
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            nnd nnd = this.a[i3];
            int c = nnd.c();
            long j2 = j;
            int i5 = 0;
            while (i5 < c) {
                nmx a = nnd.a(i5);
                try {
                    if (a(a)) {
                        iArr2[i4] = i3;
                        iArr3[i4] = i5;
                        i4++;
                        if (j2 != -1) {
                            iArr = iArr2;
                            long j3 = a.e;
                            if (j3 == -1) {
                                j2 = -1;
                            } else if (j3 != -2) {
                                j2 = Math.max(j2, j3);
                            }
                            i5++;
                            iArr2 = iArr;
                        }
                    }
                    iArr = iArr2;
                    i5++;
                    iArr2 = iArr;
                } catch (nmq e) {
                    throw new nlq(e);
                }
            }
            i3++;
            j = j2;
        }
        iArr = iArr2;
        this.f = j;
        this.b = Arrays.copyOf(iArr, i4);
        this.c = Arrays.copyOf(iArr3, i4);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, long j, boolean z) {
        j = c(j);
        this.d = this.a[this.b[i]];
        i = this.c[i];
        this.e = i;
        this.d.a(i, j);
        b(j);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j) {
        j = c(j);
        this.d.a(j);
        d(j);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, long j2) {
        j = c(j);
        a(d(j), j2, this.d.b(this.e, j));
    }

    /* Access modifiers changed, original: protected */
    public long g() {
        return this.d.e();
    }

    /* Access modifiers changed, original: protected|final */
    public final long f() {
        return this.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        nnd nnd = this.d;
        if (nnd != null) {
            nng.a(nnd);
            return;
        }
        for (nnd a : this.a) {
            nng.a(a);
        }
    }

    /* Access modifiers changed, original: protected */
    public void l() {
        this.d.c(this.e);
        this.d = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void s() {
        for (nnd f : this.a) {
            f.f();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return this.c.length;
    }

    /* Access modifiers changed, original: protected|final */
    public final nmx a(int i) {
        return this.a[this.b[i]].a(this.c[i]);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(long j, nmz nmz, nnb nnb) {
        return this.d.a(this.e, j, nmz, nnb);
    }

    private final long d(long j) {
        long b = this.d.b(this.e);
        if (b == Long.MIN_VALUE) {
            return j;
        }
        b(b);
        return b;
    }

    private static void a(nnd nnd) {
        try {
            nnd.d();
        } catch (IOException e) {
            throw new nlq(e);
        }
    }
}
