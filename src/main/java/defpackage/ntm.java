package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ntm */
final class ntm extends ntk implements nrq {
    private ntl e;
    private int g;
    private long h;
    private boolean i;
    private final ntg j = new ntg();
    private long k = -1;
    private nts l;
    private ntq m;
    private long n;
    private long o;
    private long p;
    private long q;

    ntm() {
    }

    public final void b() {
        super.b();
        this.g = 0;
        this.h = 0;
        this.i = false;
    }

    public final int a(nrb nrb, nrm nrm) {
        long i;
        int i2;
        long j;
        int b;
        int i3;
        nth nth;
        long j2;
        nrb nrb2 = nrb;
        nrm nrm2 = nrm;
        int i4 = 16;
        int i5 = 0;
        int i6 = 1;
        if (this.p == 0) {
            long j3;
            if (this.e != null) {
                j3 = -1;
            } else {
                int i7;
                ntj ntj;
                int i8;
                StringBuilder stringBuilder;
                nqx nqx = (nqx) nrb2;
                this.n = nqx.b;
                nwz nwz = this.a;
                if (this.l == null) {
                    this.b.a(nrb2, nwz);
                    nto.a(1, nwz, false);
                    nwz.i();
                    int d = nwz.d();
                    long i9 = nwz.i();
                    nwz.k();
                    int k = nwz.k();
                    nwz.k();
                    int d2 = nwz.d();
                    double pow = Math.pow(2.0d, (double) (d2 & 15));
                    double pow2 = Math.pow(2.0d, (double) ((d2 & 240) >> 4));
                    nwz.d();
                    this.l = new nts(d, i9, k, (int) pow, (int) pow2, Arrays.copyOf(nwz.a, nwz.c));
                    nwz.a();
                }
                int i10 = 3;
                if (this.m == null) {
                    this.b.a(nrb2, nwz);
                    nto.a(3, nwz, false);
                    nwz.e((int) nwz.i()).length();
                    i = nwz.i();
                    String[] strArr = new String[((int) i)];
                    for (i7 = 0; ((long) i7) < i; i7++) {
                        String e = nwz.e((int) nwz.i());
                        strArr[i7] = e;
                        e.length();
                    }
                    if ((nwz.d() & 1) != 0) {
                        this.m = new ntq();
                        nwz.a();
                    } else {
                        throw new nnc("framing bit expected to be set");
                    }
                }
                this.b.a(nrb2, nwz);
                i2 = nwz.c;
                byte[] bArr = new byte[i2];
                System.arraycopy(nwz.a, 0, bArr, 0, i2);
                i2 = this.l.a;
                i7 = 5;
                nto.a(5, nwz, false);
                int d3 = nwz.d() + 1;
                ntj ntj2 = new ntj(nwz.a);
                ntj2.b(nwz.b << 3);
                int i11 = 0;
                while (i11 < d3) {
                    i10 = i11;
                    ntj = ntj2;
                    if (ntj.a(24) == 5653314) {
                        int i12;
                        nqx nqx2;
                        nwz nwz2;
                        i7 = ntj.a(16);
                        i4 = ntj.a(24);
                        long[] jArr = new long[i4];
                        if (ntj.a()) {
                            i12 = d3;
                            d3 = ntj.a(5) + 1;
                            i11 = 0;
                            while (i11 < jArr.length) {
                                i5 = ntj.a(nto.a(i4 - i11));
                                i8 = i11;
                                i11 = 0;
                                while (i11 < i5) {
                                    nqx2 = nqx;
                                    nwz2 = nwz;
                                    if (i8 >= jArr.length) {
                                        break;
                                    }
                                    jArr[i8] = (long) d3;
                                    i8++;
                                    i11++;
                                    nqx = nqx2;
                                    nwz = nwz2;
                                }
                                nqx2 = nqx;
                                nwz2 = nwz;
                                d3++;
                                i11 = i8;
                                nqx = nqx2;
                                nwz = nwz2;
                            }
                            nqx2 = nqx;
                            nwz2 = nwz;
                        } else {
                            boolean a = ntj.a();
                            i11 = 0;
                            while (i11 < jArr.length) {
                                if (a) {
                                    i12 = d3;
                                    if (ntj.a()) {
                                        jArr[i11] = (long) (ntj.a(5) + 1);
                                    } else {
                                        jArr[i11] = 0;
                                    }
                                } else {
                                    i12 = d3;
                                    jArr[i11] = (long) (ntj.a(5) + 1);
                                }
                                i11++;
                                d3 = i12;
                            }
                            nqx2 = nqx;
                            nwz2 = nwz;
                            i12 = d3;
                        }
                        int a2 = ntj.a(4);
                        if (a2 <= 2) {
                            if (a2 == 1 || a2 == 2) {
                                ntj.b(32);
                                ntj.b(32);
                                i8 = ntj.a(4) + 1;
                                ntj.b(1);
                                if (a2 != 1) {
                                    j = (long) (i4 * i7);
                                } else if (i7 != 0) {
                                    double d4 = (double) ((long) i4);
                                    double d5 = (double) ((long) i7);
                                    Double.isNaN(d5);
                                    j = (long) Math.floor(Math.pow(d4, 1.0d / d5));
                                } else {
                                    j = 0;
                                }
                                ntj.b((int) (j * ((long) i8)));
                            }
                            ntn ntn = new ntn();
                            i11 = i10 + 1;
                            ntj2 = ntj;
                            nqx = nqx2;
                            d3 = i12;
                            nwz = nwz2;
                            i10 = 3;
                            i4 = 16;
                            i7 = 5;
                            i6 = 1;
                            i5 = 0;
                        } else {
                            stringBuilder = new StringBuilder(53);
                            stringBuilder.append("lookup type greater than 2 not decodable: ");
                            stringBuilder.append(a2);
                            throw new nnc(stringBuilder.toString());
                        }
                    }
                    b = ntj.b();
                    StringBuilder stringBuilder2 = new StringBuilder(66);
                    stringBuilder2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                    stringBuilder2.append(b);
                    throw new nnc(stringBuilder2.toString());
                }
                i11 = ntj2.a(6) + i6;
                while (i5 < i11) {
                    if (ntj2.a(i4) == 0) {
                        i5++;
                    } else {
                        throw new nnc("placeholder of time domain transforms not zeroed out");
                    }
                }
                i5 = ntj2.a(6) + 1;
                i11 = 0;
                while (i11 < i5) {
                    d3 = ntj2.a(i4);
                    if (d3 == 0) {
                        i6 = i11;
                        i10 = 8;
                        ntj2.b(8);
                        ntj2.b(16);
                        ntj2.b(16);
                        ntj2.b(6);
                        ntj2.b(8);
                        i4 = ntj2.a(4) + 1;
                        i3 = 0;
                        while (i3 < i4) {
                            ntj2.b(i10);
                            i3++;
                            i10 = 8;
                        }
                    } else if (d3 == i6) {
                        int a3;
                        int i13;
                        d3 = ntj2.a(i7);
                        int[] iArr = new int[d3];
                        i3 = -1;
                        i4 = 0;
                        while (i4 < d3) {
                            i6 = i11;
                            i11 = ntj2.a(4);
                            iArr[i4] = i11;
                            if (i11 > i3) {
                                i3 = i11;
                            }
                            i4++;
                            i11 = i6;
                            i10 = 3;
                        }
                        int[] iArr2 = new int[(i3 + 1)];
                        i4 = 0;
                        while (i4 < iArr2.length) {
                            iArr2[i4] = ntj2.a(i10) + 1;
                            a3 = ntj2.a(2);
                            if (a3 > 0) {
                                i6 = 8;
                                ntj2.b(8);
                            } else {
                                i6 = 8;
                            }
                            i13 = i11;
                            i10 = 0;
                            for (int i14 = 1; i10 < (i14 << a3); i14 = 1) {
                                ntj2.b(i6);
                                i6 = i13;
                                i10++;
                                i6 = 8;
                            }
                            i4++;
                            i11 = i13;
                            i10 = 3;
                        }
                        i6 = i11;
                        ntj2.b(2);
                        i4 = ntj2.a(4);
                        i10 = 0;
                        a3 = 0;
                        i13 = 0;
                        while (i10 < d3) {
                            i11 = a3 + iArr2[iArr[i10]];
                            int[] iArr3 = iArr2;
                            i3 = i13;
                            while (i3 < i11) {
                                ntj2.b(i4);
                                i3++;
                            }
                            i10++;
                            i13 = i3;
                            iArr2 = iArr3;
                            a3 = i11;
                        }
                    } else {
                        stringBuilder = new StringBuilder(52);
                        stringBuilder.append("floor type greater than 1 not decodable: ");
                        stringBuilder.append(d3);
                        throw new nnc(stringBuilder.toString());
                    }
                    i11 = i6 + 1;
                    i10 = 3;
                    i4 = 16;
                    i7 = 5;
                    i6 = 1;
                }
                i10 = 6;
                i4 = 1;
                i3 = ntj2.a(6) + 1;
                i7 = 0;
                while (i7 < i3) {
                    if (ntj2.a(16) <= 2) {
                        ntj2.b(24);
                        ntj2.b(24);
                        ntj2.b(24);
                        ntj = ntj2;
                        d3 = ntj.a(i10) + i4;
                        ntj.b(8);
                        int[] iArr4 = new int[d3];
                        for (i4 = 0; i4 < d3; i4++) {
                            iArr4[i4] = ((ntj.a() ? ntj.a(5) : 0) << 3) + ntj.a(3);
                        }
                        for (i4 = 0; i4 < d3; i4++) {
                            for (i11 = 0; i11 < 8; i11++) {
                                if ((iArr4[i4] & (1 << i11)) != 0) {
                                    ntj.b(8);
                                }
                            }
                        }
                        i7++;
                        ntj2 = ntj;
                        i10 = 6;
                        i4 = 1;
                    } else {
                        throw new nnc("residueType greater than 2 is not decodable");
                    }
                }
                ntj = ntj2;
                i3 = ntj.a(i10) + 1;
                for (i10 = 0; i10 < i3; i10++) {
                    i7 = ntj.a(16);
                    if (i7 != 0) {
                        StringBuilder stringBuilder3 = new StringBuilder(52);
                        stringBuilder3.append("mapping type other than 0 not supported: ");
                        stringBuilder3.append(i7);
                        Log.e("VorbisUtil", stringBuilder3.toString());
                    } else {
                        i4 = ntj.a() ? ntj.a(4) + 1 : 1;
                        if (ntj.a()) {
                            i7 = ntj.a(8) + 1;
                            for (i8 = 0; i8 < i7; i8++) {
                                d3 = i2 - 1;
                                ntj.b(nto.a(d3));
                                ntj.b(nto.a(d3));
                            }
                        }
                        if (ntj.a(2) == 0) {
                            if (i4 > 1) {
                                for (i7 = 0; i7 < i2; i7++) {
                                    ntj.b(4);
                                }
                            }
                            for (i7 = 0; i7 < i4; i7++) {
                                ntj.b(8);
                                ntj.b(8);
                                ntj.b(8);
                            }
                        } else {
                            throw new nnc("to reserved bits must be zero after mapping coupling steps");
                        }
                    }
                }
                i2 = ntj.a(6) + 1;
                ntp[] ntpArr = new ntp[i2];
                for (i3 = 0; i3 < i2; i3++) {
                    boolean a4 = ntj.a();
                    ntj.a(16);
                    ntj.a(16);
                    ntj.a(8);
                    ntpArr[i3] = new ntp(a4);
                }
                if (ntj.a()) {
                    i2 = nto.a(ntpArr.length - 1);
                    nwz.a();
                    this.e = new ntl(this.l, bArr, ntpArr, i2);
                    this.o = nqx.c;
                    this.d.a(this);
                    j3 = -1;
                    if (this.n != -1) {
                        nrm2.a = Math.max(0, nqx.b - 8000);
                        return 1;
                    }
                }
                throw new nnc("framing bit after modes not set as expected");
            }
            if (this.n != j3) {
                ntd ntd = this.b;
                nqx nqx3 = (nqx) nrb2;
                nwf.a(nqx3.b != j3);
                ntf.a(nrb);
                ntd.a.a();
                while (true) {
                    nth = ntd.a;
                    if ((nth.b & 4) != 4 && nqx3.c < nqx3.b) {
                        ntf.a(nrb2, nth, ntd.b, false);
                        nth = ntd.a;
                        nrb2.a(nth.h + nth.i);
                    }
                }
                j2 = nth.c;
            } else {
                j2 = -1;
            }
            this.p = j2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.e.a.f);
            arrayList.add(this.e.b);
            j2 = this.n != -1 ? (this.p * 1000000) / this.e.a.b : -1;
            this.q = j2;
            nrs nrs = this.c;
            nts nts = this.e.a;
            nrs.a(nmx.a(null, "audio/vorbis", nts.c, 65025, j2, nts.a, (int) nts.b, arrayList, null));
            j = this.n;
            if (j != -1) {
                ntg ntg = this.j;
                j -= this.o;
                long j4 = this.p;
                boolean z = j > 0 && j4 > 0;
                nwf.a(z);
                ntg.c = j;
                ntg.d = j4;
                nrm2.a = this.o;
                return 1;
            }
        }
        i3 = 2;
        if (!this.i && this.k > -1) {
            ntf.a(nrb);
            ntg ntg2 = this.j;
            long j5 = this.k;
            boolean z2 = (ntg2.c == -1 || ntg2.d == 0) ? false : true;
            nwf.b(z2);
            ntf.a(nrb2, ntg2.a, ntg2.b, false);
            nth nth2 = ntg2.a;
            j5 -= nth2.c;
            if (j5 > 0 && j5 <= 72000) {
                nrb.a();
                j = -1;
                j2 = -1;
            } else {
                i2 = nth2.i + nth2.h;
                if (j5 > 0) {
                    i3 = 1;
                }
                j2 = (((nqx) nrb2).c - ((long) (i2 * i3))) + ((j5 * ntg2.c) / ntg2.d);
                j = -1;
            }
            if (j2 == j) {
                ntd ntd2 = this.b;
                j = this.k;
                ntf.a(nrb);
                ntf.a(nrb2, ntd2.a, ntd2.b, false);
                while (true) {
                    nth = ntd2.a;
                    if (nth.c >= j) {
                        break;
                    }
                    nrb2.a(nth.h + nth.i);
                    nth = ntd2.a;
                    ntd2.d = nth.c;
                    ntf.a(nrb2, nth, ntd2.b, false);
                }
                if (ntd2.d != 0) {
                    nrb.a();
                    j = ntd2.d;
                    ntd2.d = 0;
                    ntd2.c = -1;
                    this.h = j;
                    this.g = this.l.d;
                    this.i = true;
                } else {
                    throw new nnc();
                }
            }
            nrm2.a = j2;
            return 1;
        }
        if (!this.b.a(nrb2, this.a)) {
            return -1;
        }
        byte b2 = this.a.a[0];
        if ((b2 & 1) != 1) {
            int i15;
            int i16;
            ntl ntl = this.e;
            if (ntl.c[ntf.a(b2, ntl.d)].a) {
                i15 = ntl.a.e;
            } else {
                i15 = ntl.a.d;
            }
            if (this.i) {
                i16 = 4;
                i5 = (this.g + i15) / 4;
            } else {
                i16 = 4;
                i5 = 0;
            }
            long j6 = (long) i5;
            if (this.h + j6 >= this.k) {
                nwz nwz3 = this.a;
                nwz3.b(nwz3.c + i16);
                byte[] bArr2 = nwz3.a;
                b = nwz3.c;
                bArr2[b - 4] = (byte) ((int) (j6 & 255));
                bArr2[b - 3] = (byte) ((int) ((j6 >>> 8) & 255));
                bArr2[b - 2] = (byte) ((int) ((j6 >>> 16) & 255));
                bArr2[b - 1] = (byte) ((int) (255 & (j6 >>> 24)));
                i = (this.h * 1000000) / this.e.a.b;
                nrs nrs2 = this.c;
                nwz nwz4 = this.a;
                nrs2.a(nwz4, nwz4.c);
                this.c.a(i, 1, this.a.c, 0, null);
                this.k = -1;
            }
            this.i = true;
            this.h += j6;
            this.g = i15;
        }
        this.a.a();
        return 0;
    }

    public final boolean a() {
        return (this.e == null || this.n == -1) ? false : true;
    }

    public final long b(long j) {
        if (j != 0) {
            this.k = (this.e.a.b * j) / 1000000;
            long j2 = this.o;
            return Math.max(j2, (((this.n - j2) * j) / this.q) - 4000);
        }
        this.k = -1;
        return this.o;
    }
}
