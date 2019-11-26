package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: opm */
public final class opm implements ofy {
    public final opk a = new opk();
    public boolean b;
    public long c;
    public opo d;
    private final ouw e;
    private final int f;
    private final opn g = new opn();
    private final oza h = new oza(32);
    private opp i = new opp(0, this.f);
    private opp j;
    private opp k;
    private nzw l;
    private nzw m;
    private long n;

    public opm(ouw ouw) {
        this.e = ouw;
        this.f = ouw.c();
        opp opp = this.i;
        this.j = opp;
        this.k = opp;
    }

    public final void a() {
        opk opk = this.a;
        opk.c = 0;
        opk.d = 0;
        opk.e = 0;
        opk.f = 0;
        opk.j = true;
        opk.g = Long.MIN_VALUE;
        opk.h = Long.MIN_VALUE;
        opk.i = false;
        a(this.i);
        this.i = new opp(0, this.f);
        opp opp = this.i;
        this.j = opp;
        this.k = opp;
        this.n = 0;
        this.e.b();
    }

    public final int b() {
        return this.a.a();
    }

    public final void a(int i) {
        long j;
        opp opp;
        opk opk = this.a;
        int a = opk.a() - i;
        boolean z = false;
        boolean z2 = a >= 0 && a <= opk.c - opk.f;
        oxz.a(z2);
        int i2 = opk.c - a;
        opk.c = i2;
        opk.h = Math.max(opk.g, opk.b(i2));
        if (a == 0 && opk.i) {
            z = true;
        }
        opk.i = z;
        i = opk.c;
        if (i != 0) {
            i = opk.c(i - 1);
            j = opk.a[i] + ((long) opk.b[i]);
        } else {
            j = 0;
        }
        this.n = j;
        if (j != 0) {
            opp = this.i;
            if (j != opp.a) {
                while (this.n > opp.b) {
                    opp = opp.e;
                }
                opp opp2 = opp.e;
                a(opp2);
                opp.e = new opp(opp.b, this.f);
                this.k = this.n == opp.b ? opp.e : opp;
                if (this.j == opp2) {
                    this.j = opp.e;
                    return;
                }
            }
        }
        a(this.i);
        this.i = new opp(this.n, this.f);
        opp = this.i;
        this.j = opp;
        this.k = opp;
    }

    public final boolean c() {
        return this.a.b();
    }

    public final int d() {
        return this.a.d;
    }

    public final int e() {
        opk opk = this.a;
        return opk.d + opk.f;
    }

    public final nzw f() {
        return this.a.c();
    }

    public final long g() {
        return this.a.d();
    }

    public final void h() {
        this.a.g();
        this.j = this.i;
    }

    public final void a(long j, boolean z, boolean z2) {
        b(this.a.a(j, z, z2));
    }

    public final void i() {
        b(this.a.i());
    }

    public final int j() {
        return this.a.h();
    }

    public final int a(long j, boolean z) {
        return this.a.a(j, z);
    }

    public final int a(nzy nzy, odj odj, boolean z, boolean z2, long j) {
        int a = this.a.a(nzy, odj, z, z2, this.l, this.g);
        if (a == -5) {
            this.l = nzy.a;
            return -5;
        } else if (a == -4) {
            if (!odj.isEndOfStream()) {
                if (odj.c < j) {
                    odj.addFlag(aocf.UNSET_ENUM_VALUE);
                }
                if (!odj.b()) {
                    opn opn;
                    long j2;
                    int i;
                    if (odj.c()) {
                        opn = this.g;
                        j2 = opn.b;
                        int i2 = 1;
                        this.h.a(1);
                        a(j2, this.h.a, 1);
                        j2++;
                        int i3 = 0;
                        byte b = this.h.a[0];
                        Object obj = (b & 128) == 0 ? null : 1;
                        i = b & 127;
                        odf odf = odj.a;
                        if (odf.a == null) {
                            odf.a = new byte[16];
                        }
                        a(j2, odf.a, i);
                        j2 += (long) i;
                        if (obj != null) {
                            this.h.a(2);
                            a(j2, this.h.a, 2);
                            j2 += 2;
                            i2 = this.h.e();
                        }
                        odf odf2 = odj.a;
                        int[] iArr = odf2.d;
                        if (iArr == null || iArr.length < i2) {
                            iArr = new int[i2];
                        }
                        int[] iArr2 = odf2.e;
                        if (iArr2 == null || iArr2.length < i2) {
                            iArr2 = new int[i2];
                        }
                        if (obj != null) {
                            int i4 = i2 * 6;
                            this.h.a(i4);
                            a(j2, this.h.a, i4);
                            j2 += (long) i4;
                            this.h.c(0);
                            while (i3 < i2) {
                                iArr[i3] = this.h.e();
                                iArr2[i3] = this.h.o();
                                i3++;
                            }
                        } else {
                            iArr[0] = 0;
                            iArr2[0] = opn.a - ((int) (j2 - opn.b));
                        }
                        ogb ogb = opn.c;
                        odf odf3 = odj.a;
                        byte[] bArr = ogb.b;
                        byte[] bArr2 = odf3.a;
                        int i5 = ogb.a;
                        int i6 = ogb.c;
                        i3 = ogb.d;
                        odf3.f = i2;
                        odf3.d = iArr;
                        odf3.e = iArr2;
                        odf3.b = bArr;
                        odf3.c = i5;
                        odf3.g.numSubSamples = i2;
                        odf3.g.numBytesOfClearData = iArr;
                        odf3.g.numBytesOfEncryptedData = iArr2;
                        odf3.g.key = bArr;
                        odf3.g.iv = bArr2;
                        odf3.g.mode = i5;
                        if (ozp.a >= 24) {
                            odi odi = odf3.h;
                            odi.b.set(i6, i3);
                            odi.a.setPattern(odi.b);
                        }
                        long j3 = opn.b;
                        int i7 = (int) (j2 - j3);
                        opn.b = j3 + ((long) i7);
                        opn.a -= i7;
                    }
                    odj.a(this.g.a);
                    opn = this.g;
                    j2 = opn.b;
                    ByteBuffer byteBuffer = odj.b;
                    a = opn.a;
                    a(j2);
                    while (a > 0) {
                        i = Math.min(a, (int) (this.j.b - j2));
                        opp opp = this.j;
                        byteBuffer.put(opp.d.a, opp.a(j2), i);
                        a -= i;
                        j2 += (long) i;
                        opp opp2 = this.j;
                        if (j2 == opp2.b) {
                            this.j = opp2.e;
                        }
                    }
                }
            }
            return -4;
        } else if (a == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    private final void a(long j, byte[] bArr, int i) {
        a(j);
        long j2 = j;
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.j.b - j2));
            opp opp = this.j;
            System.arraycopy(opp.d.a, opp.a(j2), bArr, i - i2, min);
            i2 -= min;
            j2 += (long) min;
            opp opp2 = this.j;
            if (j2 == opp2.b) {
                this.j = opp2.e;
            }
        }
    }

    private final void a(long j) {
        while (true) {
            opp opp = this.j;
            if (j >= opp.b) {
                this.j = opp.e;
            } else {
                return;
            }
        }
    }

    private final void b(long j) {
        if (j != -1) {
            opp opp;
            while (true) {
                opp = this.i;
                if (j < opp.b) {
                    break;
                }
                this.e.a(opp.d);
                this.i = this.i.a();
            }
            if (this.j.a < opp.a) {
                this.j = opp;
            }
        }
    }

    public final void a(nzw nzw) {
        nzw a;
        long j = this.c;
        if (nzw != null) {
            if (j != 0) {
                long j2 = nzw.m;
                if (j2 != Long.MAX_VALUE) {
                    a = nzw.a(j2 + j);
                }
            }
            a = nzw;
        } else {
            a = null;
        }
        boolean a2 = this.a.a(a);
        this.m = nzw;
        this.b = false;
        opo opo = this.d;
        if (opo != null && a2) {
            opo.i();
        }
    }

    public final int a(ofp ofp, int i, boolean z) {
        i = b(i);
        opp opp = this.k;
        int a = ofp.a(opp.d.a, opp.a(this.n), i);
        if (a != -1) {
            c(a);
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void a(oza oza, int i) {
        while (i > 0) {
            int b = b(i);
            opp opp = this.k;
            oza.a(opp.d.a, opp.a(this.n), b);
            i -= b;
            c(b);
        }
    }

    public final void a(long j, int i, int i2, int i3, ogb ogb) {
        if (this.b) {
            a(this.m);
        }
        long j2 = this.c;
        this.a.a(j + j2, i, (this.n - ((long) i2)) - ((long) i3), i2, ogb);
    }

    private final void a(opp opp) {
        if (opp.c) {
            opp opp2 = this.k;
            out[] outArr = new out[(opp2.c + (((int) (opp2.a - opp.a)) / this.f))];
            for (int i = 0; i < outArr.length; i++) {
                outArr[i] = opp.d;
                opp = opp.a();
            }
            this.e.a(outArr);
        }
    }

    private final int b(int i) {
        opp opp = this.k;
        if (!opp.c) {
            out a = this.e.a();
            opp opp2 = new opp(this.k.b, this.f);
            opp.d = a;
            opp.e = opp2;
            opp.c = true;
        }
        return Math.min(i, (int) (this.k.b - this.n));
    }

    private final void c(int i) {
        long j = this.n + ((long) i);
        this.n = j;
        opp opp = this.k;
        if (j == opp.b) {
            this.k = opp.e;
        }
    }
}
