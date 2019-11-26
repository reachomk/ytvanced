package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/* renamed from: nsr */
public class nsr implements nrc {
    private static final int a = nxf.c("seig");
    private static final byte[] b = new byte[]{(byte) -94, (byte) 57, (byte) 79, (byte) 82, (byte) 90, (byte) -101, (byte) 79, (byte) 20, (byte) -94, (byte) 68, (byte) 108, (byte) 66, (byte) 124, (byte) 100, (byte) -115, (byte) -12};
    private final int c;
    private final nsx d;
    private final SparseArray e;
    private final nwz f;
    private final nwz g;
    private final nwz h;
    private final nwz i;
    private final byte[] j;
    private final Stack k;
    private int l;
    private int m;
    private long n;
    private int o;
    private nwz p;
    private long q;
    private nsu r;
    private int s;
    private int t;
    private int u;
    private nre v;
    private boolean w;

    public nsr() {
        this((byte) 0);
    }

    /* Access modifiers changed, original: protected */
    public void a(nwz nwz) {
    }

    public final void c() {
    }

    public nsr(byte b) {
        this.d = null;
        this.c = 0;
        this.i = new nwz(16);
        this.f = new nwz(nwv.a);
        this.g = new nwz(4);
        this.h = new nwz(1);
        this.j = new byte[16];
        this.k = new Stack();
        this.e = new SparseArray();
        a();
    }

    public final boolean a(nrb nrb) {
        return nsy.a(nrb, true);
    }

    public final void a(nre nre) {
        this.v = nre;
    }

    public final void b() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((nsu) this.e.valueAt(i)).a();
        }
        this.k.clear();
        a();
    }

    public final int a(nrb nrb, nrm nrm) {
        int i;
        int i2;
        int i3;
        int size;
        int i4;
        int i5;
        nsu nsu;
        int i6;
        byte[] bArr;
        nrb nrb2 = nrb;
        while (true) {
            i = this.l;
            i2 = 2;
            long j;
            long j2;
            if (i == 0) {
                if (this.o == 0) {
                    if (!nrb2.a(this.i.a, 0, 8, true)) {
                        return -1;
                    }
                    this.o = 8;
                    this.i.c(0);
                    this.n = this.i.h();
                    this.m = this.i.j();
                }
                long j3 = this.n;
                if (j3 == 1) {
                    nrb2.b(this.i.a, 8, 8);
                    this.o += 8;
                    j3 = this.i.p();
                    this.n = j3;
                }
                long j4 = (long) this.o;
                if (j3 >= j4) {
                    nqx nqx = (nqx) nrb2;
                    j = nqx.c - j4;
                    if (this.m == nsg.N) {
                        int size2 = this.e.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            nsz nsz = ((nsu) this.e.valueAt(i7)).a;
                            nsz.c = j;
                            nsz.b = j;
                        }
                    }
                    if (this.m == nsg.k) {
                        this.r = null;
                        this.q = j + this.n;
                        if (!this.w) {
                            this.v.a(nrq.f);
                            this.w = true;
                        }
                        this.l = 2;
                    } else {
                        i3 = this.m;
                        if (i3 == nsg.E || i3 == nsg.G || i3 == nsg.H || i3 == nsg.I || i3 == nsg.J || i3 == nsg.N || i3 == nsg.O || i3 == nsg.P || i3 == nsg.S) {
                            j3 = (nqx.c + this.n) - 8;
                            this.k.add(new nsf(this.m, j3));
                            if (this.n == ((long) this.o)) {
                                a(j3);
                            } else {
                                a();
                            }
                        } else {
                            i = this.m;
                            if (i == nsg.V || i == nsg.U || i == nsg.F || i == nsg.D || i == nsg.W || i == nsg.z || i == nsg.A || i == nsg.R || i == nsg.B || i == nsg.C || i == nsg.X || i == nsg.af || i == nsg.ag || i == nsg.ak || i == nsg.ah || i == nsg.ai || i == nsg.aj || i == nsg.T || i == nsg.Q || i == nsg.aH) {
                                if (this.o == 8) {
                                    j3 = this.n;
                                    if (j3 <= 2147483647L) {
                                        this.p = new nwz((int) j3);
                                        System.arraycopy(this.i.a, 0, this.p.a, 0, 8);
                                        this.l = 1;
                                    } else {
                                        throw new nnc("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                }
                                throw new nnc("Leaf atom defines extended atom size (unsupported).");
                            } else if (this.n <= 2147483647L) {
                                this.p = null;
                                this.l = 1;
                            } else {
                                throw new nnc("Skipping atom with length > 2147483647 (unsupported).");
                            }
                        }
                    }
                }
                throw new nnc("Atom size less than header length (unsupported).");
            } else if (i != 1) {
                j2 = Long.MAX_VALUE;
                if (i != 2) {
                    if (i == 3) {
                        if (this.r != null) {
                            break;
                        }
                        SparseArray sparseArray = this.e;
                        size = sparseArray.size();
                        long j5 = Long.MAX_VALUE;
                        nsu nsu2 = null;
                        for (i4 = 0; i4 < size; i4++) {
                            nsu nsu3 = (nsu) sparseArray.valueAt(i4);
                            i5 = nsu3.e;
                            nsz nsz2 = nsu3.a;
                            if (i5 != nsz2.d) {
                                j = nsz2.b;
                                if (j < j5) {
                                    j5 = j;
                                    nsu2 = nsu3;
                                }
                            }
                        }
                        this.r = nsu2;
                        nsu = this.r;
                        if (nsu == null) {
                            i3 = (int) (this.q - ((nqx) nrb2).c);
                            if (i3 >= 0) {
                                nrb2.a(i3);
                                a();
                            } else {
                                throw new nnc("Offset to end of mdat was negative.");
                            }
                        }
                        i3 = (int) (nsu.a.b - ((nqx) nrb2).c);
                        if (i3 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i3 = 0;
                        }
                        nrb2.a(i3);
                    } else {
                        break;
                    }
                }
                i = this.e.size();
                nsu nsu4 = null;
                for (i3 = 0; i3 < i; i3++) {
                    nsz nsz3 = ((nsu) this.e.valueAt(i3)).a;
                    if (nsz3.m) {
                        long j6 = nsz3.c;
                        if (j6 < j2) {
                            nsu4 = (nsu) this.e.valueAt(i3);
                            j2 = j6;
                        }
                    }
                }
                if (nsu4 == null) {
                    this.l = 3;
                } else {
                    i = (int) (j2 - ((nqx) nrb2).c);
                    if (i >= 0) {
                        nrb2.a(i);
                        nsz nsz4 = nsu4.a;
                        nrb2.b(nsz4.l.a, 0, nsz4.k);
                        nsz4.l.c(0);
                        nsz4.m = false;
                    } else {
                        throw new nnc("Offset to encryption data was negative.");
                    }
                }
            } else {
                i3 = ((int) this.n) - this.o;
                nwz nwz = this.p;
                if (nwz != null) {
                    nrb2.b(nwz.a, 8, i3);
                    nsi nsi = new nsi(this.m, this.p);
                    j = ((nqx) nrb2).c;
                    if (!this.k.isEmpty()) {
                        ((nsf) this.k.peek()).a(nsi);
                    } else if (nsi.aQ == nsg.D) {
                        long h;
                        nwz = nsi.a;
                        nwz.c(8);
                        i5 = nsg.c(nwz.j());
                        nwz.d(4);
                        long h2 = nwz.h();
                        if (i5 == 0) {
                            j2 = nwz.h();
                            h = nwz.h();
                        } else {
                            j2 = nwz.p();
                            h = nwz.p();
                        }
                        long j7 = j + h;
                        j = j2;
                        nwz.d(2);
                        i2 = nwz.e();
                        int[] iArr = new int[i2];
                        long[] jArr = new long[i2];
                        long[] jArr2 = new long[i2];
                        long[] jArr3 = new long[i2];
                        j2 = nxf.a(j, 1000000, h2);
                        h = j;
                        i3 = 0;
                        while (i3 < i2) {
                            int j8 = nwz.j();
                            if ((aocf.UNSET_ENUM_VALUE & j8) == 0) {
                                long h3 = nwz.h();
                                iArr[i3] = j8 & Integer.MAX_VALUE;
                                jArr2[i3] = j7;
                                jArr[i3] = j2;
                                long j9 = h + h3;
                                j2 = nxf.a(j9, 1000000, h2);
                                jArr3[i3] = j2 - jArr[i3];
                                nwz.d(4);
                                j7 += (long) iArr[i3];
                                i3++;
                                h = j9;
                            } else {
                                throw new nnc("Unhandled indirect reference");
                            }
                        }
                        this.v.a(new nqy(iArr, jArr2, jArr3, jArr));
                        this.w = true;
                    } else if (nsi.aQ == nsg.aH) {
                        a(nsi.a);
                    }
                } else {
                    nrb2.a(i3);
                }
                a(((nqx) nrb2).c);
            }
        }
        nsu = this.r;
        nsz nsz5 = nsu.a;
        int[] iArr2 = nsz5.e;
        i5 = nsu.e;
        this.s = iArr2[i5];
        if (nsz5.i) {
            nwz nwz2 = nsz5.l;
            i4 = nsz5.a.a;
            nta nta = nsz5.n;
            if (nta == null) {
                nta = nsu.c.l[i4];
            }
            i4 = nta.a;
            boolean z = nsz5.j[i5];
            nwz nwz3 = this.h;
            nwz3.a[0] = (byte) ((!z ? 0 : 128) | i4);
            nwz3.c(0);
            nrs nrs = nsu.b;
            nrs.a(this.h, 1);
            nrs.a(nwz2, i4);
            if (z) {
                i3 = nwz2.e();
                nwz2.d(-2);
                i3 = (i3 * 6) + 2;
                nrs.a(nwz2, i3);
                i4 = (i4 + 1) + i3;
            } else {
                i4++;
            }
            this.t = i4;
            this.s += i4;
        } else {
            this.t = 0;
        }
        this.l = 4;
        this.u = 0;
        nsu = this.r;
        nsz5 = nsu.a;
        nsx nsx = nsu.c;
        nrs nrs2 = nsu.b;
        i = nsu.e;
        i4 = nsx.o;
        if (i4 == -1) {
            while (true) {
                int i8 = this.t;
                i4 = this.s;
                if (i8 >= i4) {
                    break;
                }
                this.t += nrs2.a(nrb2, i4 - i8, false);
            }
            i6 = i4;
        } else {
            int i9;
            byte[] bArr2 = this.g.a;
            bArr2[0] = (byte) 0;
            bArr2[1] = (byte) 0;
            bArr2[2] = (byte) 0;
            int i10 = 4 - i4;
            while (true) {
                size = this.t;
                i9 = this.s;
                if (size >= i9) {
                    break;
                }
                size = this.u;
                if (size == 0) {
                    nrb2.b(this.g.a, i10, i4);
                    this.g.c(0);
                    this.u = this.g.n();
                    this.f.c(0);
                    nrs2.a(this.f, 4);
                    this.t += 4;
                    this.s += i10;
                } else {
                    size = nrs2.a(nrb2, size, false);
                    this.t += size;
                    this.u -= size;
                }
            }
            i6 = i9;
        }
        long j10 = (nsz5.g[i] + ((long) nsz5.f[i])) * 1000;
        boolean z2 = nsz5.i;
        if (!z2) {
            i2 = 0;
        }
        int i11 = i2 | nsz5.h[i];
        i = nsz5.a.a;
        if (z2) {
            byte[] bArr3;
            nta nta2 = nsz5.n;
            if (nta2 != null) {
                bArr3 = nta2.b;
            } else {
                bArr3 = nsx.l[i].b;
            }
            bArr = bArr3;
        } else {
            bArr = null;
        }
        nrs2.a(j10, i11, i6, 0, bArr);
        nsu nsu5 = this.r;
        i = nsu5.e + 1;
        nsu5.e = i;
        if (i == nsz5.d) {
            this.r = null;
        }
        this.l = 3;
        return 0;
    }

    private final void a() {
        this.l = 0;
        this.o = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:165:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x037d  */
    private final void a(long r46) {
        /*
        r45 = this;
    L_0x0000:
        r0 = r45;
    L_0x0002:
        r1 = r0.k;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x057c;
    L_0x000a:
        r1 = r0.k;
        r1 = r1.peek();
        r1 = (defpackage.nsf) r1;
        r1 = r1.a;
        r3 = (r1 > r46 ? 1 : (r1 == r46 ? 0 : -1));
        if (r3 != 0) goto L_0x057c;
    L_0x0018:
        r1 = r0.k;
        r1 = r1.pop();
        r1 = (defpackage.nsf) r1;
        r2 = r1.aQ;
        r3 = defpackage.nsg.E;
        r4 = 8;
        r6 = 1;
        if (r2 == r3) goto L_0x0452;
    L_0x0029:
        r2 = r1.aQ;
        r3 = defpackage.nsg.N;
        if (r2 == r3) goto L_0x0043;
    L_0x002f:
        r2 = r0.k;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0002;
    L_0x0037:
        r2 = r0.k;
        r2 = r2.peek();
        r2 = (defpackage.nsf) r2;
        r2.a(r1);
        goto L_0x0002;
    L_0x0043:
        r2 = r0.e;
        r3 = r0.j;
        r7 = r1.c;
        r7 = r7.size();
        r8 = 0;
    L_0x004e:
        if (r8 >= r7) goto L_0x0440;
    L_0x0050:
        r9 = r1.c;
        r9 = r9.get(r8);
        r9 = (defpackage.nsf) r9;
        r10 = r9.aQ;
        r11 = defpackage.nsg.O;
        if (r10 != r11) goto L_0x0425;
    L_0x005e:
        r10 = defpackage.nsg.C;
        r11 = r9.b;
        r11 = r11.size();
        r12 = 0;
        r13 = 0;
    L_0x0068:
        if (r12 >= r11) goto L_0x007b;
    L_0x006a:
        r14 = r9.b;
        r14 = r14.get(r12);
        r14 = (defpackage.nsi) r14;
        r14 = r14.aQ;
        if (r14 != r10) goto L_0x0078;
    L_0x0076:
        r13 = r13 + 1;
    L_0x0078:
        r12 = r12 + 1;
        goto L_0x0068;
    L_0x007b:
        r11 = r9.c;
        r11 = r11.size();
        r12 = 0;
    L_0x0082:
        if (r12 >= r11) goto L_0x0095;
    L_0x0084:
        r14 = r9.c;
        r14 = r14.get(r12);
        r14 = (defpackage.nsf) r14;
        r14 = r14.aQ;
        if (r14 != r10) goto L_0x0092;
    L_0x0090:
        r13 = r13 + 1;
    L_0x0092:
        r12 = r12 + 1;
        goto L_0x0082;
    L_0x0095:
        if (r13 != r6) goto L_0x041d;
    L_0x0097:
        r10 = defpackage.nsg.A;
        r10 = r9.a(r10);
        r10 = r10.a;
        r10.c(r4);
        r11 = r10.j();
        r11 = defpackage.nsg.d(r11);
        r12 = r10.j();
        r12 = r2.get(r12);
        r12 = (defpackage.nsu) r12;
        if (r12 == 0) goto L_0x00fe;
    L_0x00b6:
        r13 = r11 & 1;
        if (r13 == 0) goto L_0x00c4;
    L_0x00ba:
        r13 = r10.p();
        r15 = r12.a;
        r15.b = r13;
        r15.c = r13;
    L_0x00c4:
        r13 = r12.d;
        r14 = r11 & 2;
        if (r14 == 0) goto L_0x00d1;
    L_0x00ca:
        r14 = r10.n();
        r14 = r14 + -1;
        goto L_0x00d3;
    L_0x00d1:
        r14 = r13.a;
    L_0x00d3:
        r15 = r11 & 8;
        if (r15 != 0) goto L_0x00da;
    L_0x00d7:
        r15 = r13.b;
        goto L_0x00de;
    L_0x00da:
        r15 = r10.n();
    L_0x00de:
        r16 = r11 & 16;
        if (r16 != 0) goto L_0x00e5;
    L_0x00e2:
        r5 = r13.c;
        goto L_0x00e9;
    L_0x00e5:
        r5 = r10.n();
    L_0x00e9:
        r11 = r11 & 32;
        if (r11 != 0) goto L_0x00f0;
    L_0x00ed:
        r10 = r13.d;
        goto L_0x00f4;
    L_0x00f0:
        r10 = r10.n();
    L_0x00f4:
        r11 = r12.a;
        r13 = new nsp;
        r13.<init>(r14, r15, r5, r10);
        r11.a = r13;
        goto L_0x00ff;
    L_0x00fe:
        r12 = 0;
    L_0x00ff:
        if (r12 == 0) goto L_0x0425;
    L_0x0101:
        r5 = r12.a;
        r10 = r5.o;
        r12.a();
        r13 = defpackage.nsg.z;
        r13 = r9.a(r13);
        if (r13 == 0) goto L_0x012e;
    L_0x0110:
        r10 = defpackage.nsg.z;
        r10 = r9.a(r10);
        r10 = r10.a;
        r10.c(r4);
        r11 = r10.j();
        r11 = defpackage.nsg.c(r11);
        if (r11 == r6) goto L_0x012a;
    L_0x0125:
        r10 = r10.h();
        goto L_0x012e;
    L_0x012a:
        r10 = r10.p();
    L_0x012e:
        r13 = defpackage.nsg.C;
        r13 = r9.a(r13);
        r13 = r13.a;
        r13.c(r4);
        r14 = r13.j();
        r14 = defpackage.nsg.d(r14);
        r15 = r12.c;
        r4 = r12.a;
        r6 = r4.a;
        r17 = r2;
        r2 = r13.n();
        r18 = r14 & 1;
        if (r18 == 0) goto L_0x0162;
    L_0x0151:
        r18 = r10;
        r10 = r4.b;
        r20 = r7;
        r7 = r13.j();
        r21 = r1;
        r0 = (long) r7;
        r10 = r10 + r0;
        r4.b = r10;
        goto L_0x0168;
    L_0x0162:
        r21 = r1;
        r20 = r7;
        r18 = r10;
    L_0x0168:
        r0 = r14 & 4;
        if (r0 != 0) goto L_0x016e;
    L_0x016c:
        r0 = 0;
        goto L_0x016f;
    L_0x016e:
        r0 = 1;
    L_0x016f:
        r1 = r6.d;
        if (r0 == 0) goto L_0x0177;
    L_0x0173:
        r1 = r13.n();
    L_0x0177:
        r7 = r14 & 256;
        r10 = r14 & 512;
        r11 = r14 & 1024;
        r14 = r14 & 2048;
        r22 = r1;
        r1 = r15.m;
        r23 = 0;
        if (r1 == 0) goto L_0x01a6;
    L_0x0187:
        r25 = r8;
        r8 = r1.length;
        r26 = r14;
        r14 = 1;
        if (r8 != r14) goto L_0x01aa;
    L_0x018f:
        r8 = 0;
        r27 = r1[r8];
        r1 = (r27 > r23 ? 1 : (r27 == r23 ? 0 : -1));
        if (r1 != 0) goto L_0x01aa;
    L_0x0196:
        r1 = r15.n;
        r27 = r1[r8];
        r29 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r0;
        r0 = r15.i;
        r31 = r0;
        r0 = defpackage.nxf.a(r27, r29, r31);
        goto L_0x01ad;
    L_0x01a6:
        r25 = r8;
        r26 = r14;
    L_0x01aa:
        r8 = r0;
        r0 = r23;
    L_0x01ad:
        r4.d = r2;
        r14 = r4.e;
        if (r14 != 0) goto L_0x01b4;
    L_0x01b3:
        goto L_0x01b7;
    L_0x01b4:
        r14 = r14.length;
        if (r14 >= r2) goto L_0x01d2;
    L_0x01b7:
        r14 = r2 * 125;
        r14 = r14 / 100;
        r27 = r0;
        r0 = new int[r14];
        r4.e = r0;
        r0 = new int[r14];
        r4.f = r0;
        r0 = new long[r14];
        r4.g = r0;
        r0 = new boolean[r14];
        r4.h = r0;
        r0 = new boolean[r14];
        r4.j = r0;
        goto L_0x01d4;
    L_0x01d2:
        r27 = r0;
    L_0x01d4:
        r0 = r4.e;
        r1 = r4.f;
        r14 = r4.g;
        r29 = r0;
        r0 = r4.h;
        r37 = r0;
        r36 = r1;
        r0 = r15.i;
        r15 = r15.h;
        r15 = defpackage.nsx.a;
        r38 = r14;
        r15 = 0;
        r43 = r0;
        r0 = r18;
        r18 = r43;
    L_0x01f1:
        r14 = 16;
        if (r15 < r2) goto L_0x03a9;
    L_0x01f5:
        r4.o = r0;
        r0 = defpackage.nsg.af;
        r0 = r9.a(r0);
        if (r0 == 0) goto L_0x0276;
    L_0x01ff:
        r1 = r12.c;
        r1 = r1.l;
        r2 = r5.a;
        r2 = r2.a;
        r1 = r1[r2];
        r0 = r0.a;
        r1 = r1.a;
        r2 = 8;
        r0.c(r2);
        r4 = r0.j();
        r4 = defpackage.nsg.d(r4);
        r6 = 1;
        r4 = r4 & r6;
        if (r4 != r6) goto L_0x0221;
    L_0x021e:
        r0.d(r2);
    L_0x0221:
        r2 = r0.d();
        r4 = r0.n();
        r6 = r5.d;
        if (r4 != r6) goto L_0x0255;
    L_0x022d:
        if (r2 != 0) goto L_0x0244;
    L_0x022f:
        r2 = r5.j;
        r6 = 0;
        r7 = 0;
    L_0x0233:
        if (r6 >= r4) goto L_0x0251;
    L_0x0235:
        r8 = r0.d();
        r7 = r7 + r8;
        if (r8 <= r1) goto L_0x023e;
    L_0x023c:
        r8 = 1;
        goto L_0x023f;
    L_0x023e:
        r8 = 0;
    L_0x023f:
        r2[r6] = r8;
        r6 = r6 + 1;
        goto L_0x0233;
    L_0x0244:
        if (r2 <= r1) goto L_0x0248;
    L_0x0246:
        r0 = 1;
        goto L_0x0249;
    L_0x0248:
        r0 = 0;
    L_0x0249:
        r7 = r2 * r4;
        r1 = r5.j;
        r2 = 0;
        java.util.Arrays.fill(r1, r2, r4, r0);
    L_0x0251:
        r5.a(r7);
        goto L_0x0276;
    L_0x0255:
        r0 = new nnc;
        r1 = new java.lang.StringBuilder;
        r2 = 41;
        r1.<init>(r2);
        r2 = "Length mismatch: ";
        r1.append(r2);
        r1.append(r4);
        r2 = ", ";
        r1.append(r2);
        r1.append(r6);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0276:
        r0 = defpackage.nsg.ag;
        r0 = r9.a(r0);
        if (r0 == 0) goto L_0x02c8;
    L_0x027e:
        r0 = r0.a;
        r1 = 8;
        r0.c(r1);
        r2 = r0.j();
        r4 = defpackage.nsg.d(r2);
        r6 = 1;
        r4 = r4 & r6;
        if (r4 != r6) goto L_0x0294;
    L_0x0291:
        r0.d(r1);
    L_0x0294:
        r1 = r0.n();
        if (r1 != r6) goto L_0x02af;
    L_0x029a:
        r1 = defpackage.nsg.c(r2);
        r6 = r5.c;
        if (r1 == 0) goto L_0x02a7;
    L_0x02a2:
        r0 = r0.p();
        goto L_0x02ab;
    L_0x02a7:
        r0 = r0.h();
    L_0x02ab:
        r6 = r6 + r0;
        r5.c = r6;
        goto L_0x02c8;
    L_0x02af:
        r0 = new nnc;
        r2 = new java.lang.StringBuilder;
        r3 = 40;
        r2.<init>(r3);
        r3 = "Unexpected saio entry count: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x02c8:
        r0 = defpackage.nsg.ak;
        r0 = r9.a(r0);
        if (r0 == 0) goto L_0x02d6;
    L_0x02d0:
        r0 = r0.a;
        r1 = 0;
        defpackage.nsr.a(r0, r1, r5);
    L_0x02d6:
        r0 = defpackage.nsg.ah;
        r0 = r9.a(r0);
        r1 = defpackage.nsg.ai;
        r1 = r9.a(r1);
        if (r0 != 0) goto L_0x02e6;
    L_0x02e4:
        goto L_0x0374;
    L_0x02e6:
        if (r1 == 0) goto L_0x0374;
    L_0x02e8:
        r0 = r0.a;
        r1 = r1.a;
        r2 = 8;
        r0.c(r2);
        r2 = r0.j();
        r4 = r0.j();
        r6 = a;
        if (r4 != r6) goto L_0x0374;
    L_0x02fd:
        r2 = defpackage.nsg.c(r2);
        r4 = 4;
        r6 = 1;
        if (r2 != r6) goto L_0x0308;
    L_0x0305:
        r0.d(r4);
    L_0x0308:
        r0 = r0.j();
        if (r0 != r6) goto L_0x036c;
    L_0x030e:
        r0 = 8;
        r1.c(r0);
        r0 = r1.j();
        r2 = r1.j();
        r7 = a;
        if (r2 != r7) goto L_0x0374;
    L_0x031f:
        r0 = defpackage.nsg.c(r0);
        r2 = 2;
        if (r0 != r6) goto L_0x0337;
    L_0x0326:
        r6 = r1.h();
        r0 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1));
        if (r0 == 0) goto L_0x032f;
    L_0x032e:
        goto L_0x033c;
    L_0x032f:
        r0 = new nnc;
        r1 = "Variable length decription in sgpd found (unsupported)";
        r0.<init>(r1);
        throw r0;
    L_0x0337:
        if (r0 < r2) goto L_0x033c;
    L_0x0339:
        r1.d(r4);
    L_0x033c:
        r6 = r1.h();
        r10 = 1;
        r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r0 != 0) goto L_0x0364;
    L_0x0346:
        r1.d(r2);
        r0 = r1.d();
        r2 = 1;
        if (r0 != r2) goto L_0x0374;
    L_0x0350:
        r0 = r1.d();
        r4 = new byte[r14];
        r6 = 0;
        r1.a(r4, r6, r14);
        r5.i = r2;
        r1 = new nta;
        r1.<init>(r0, r4);
        r5.n = r1;
        goto L_0x0374;
    L_0x0364:
        r0 = new nnc;
        r1 = "Entry count in sgpd != 1 (unsupported).";
        r0.<init>(r1);
        throw r0;
    L_0x036c:
        r0 = new nnc;
        r1 = "Entry count in sbgp != 1 (unsupported).";
        r0.<init>(r1);
        throw r0;
    L_0x0374:
        r0 = r9.b;
        r0 = r0.size();
        r1 = 0;
    L_0x037b:
        if (r1 >= r0) goto L_0x03a5;
    L_0x037d:
        r2 = r9.b;
        r2 = r2.get(r1);
        r2 = (defpackage.nsi) r2;
        r4 = r2.aQ;
        r6 = defpackage.nsg.aj;
        if (r4 != r6) goto L_0x03a2;
    L_0x038b:
        r2 = r2.a;
        r4 = 8;
        r2.c(r4);
        r4 = 0;
        r2.a(r3, r4, r14);
        r4 = b;
        r4 = java.util.Arrays.equals(r3, r4);
        if (r4 != 0) goto L_0x039f;
    L_0x039e:
        goto L_0x03a2;
    L_0x039f:
        defpackage.nsr.a(r2, r14, r5);
    L_0x03a2:
        r1 = r1 + 1;
        goto L_0x037b;
    L_0x03a5:
        r40 = r3;
        goto L_0x042f;
    L_0x03a9:
        if (r7 == 0) goto L_0x03b2;
    L_0x03ab:
        r30 = r13.n();
        r14 = r30;
        goto L_0x03b4;
    L_0x03b2:
        r14 = r6.b;
    L_0x03b4:
        if (r10 != 0) goto L_0x03bb;
    L_0x03b6:
        r39 = r2;
        r2 = r6.c;
        goto L_0x03c1;
    L_0x03bb:
        r39 = r2;
        r2 = r13.n();
    L_0x03c1:
        if (r15 != 0) goto L_0x03ca;
    L_0x03c3:
        if (r8 == 0) goto L_0x03ca;
    L_0x03c5:
        r40 = r3;
        r3 = r22;
        goto L_0x03d7;
    L_0x03ca:
        if (r11 != 0) goto L_0x03d1;
    L_0x03cc:
        r40 = r3;
        r3 = r6.d;
        goto L_0x03d7;
    L_0x03d1:
        r40 = r3;
        r3 = r13.j();
    L_0x03d7:
        if (r26 == 0) goto L_0x03ea;
    L_0x03d9:
        r41 = r4;
        r4 = r13.j();
        r4 = r4 * 1000;
        r42 = r5;
        r4 = (long) r4;
        r4 = r4 / r18;
        r5 = (int) r4;
        r36[r15] = r5;
        goto L_0x03f1;
    L_0x03ea:
        r41 = r4;
        r42 = r5;
        r4 = 0;
        r36[r15] = r4;
    L_0x03f1:
        r32 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r30 = r0;
        r34 = r18;
        r4 = defpackage.nxf.a(r30, r32, r34);
        r4 = r4 - r27;
        r38[r15] = r4;
        r29[r15] = r2;
        r2 = 16;
        r2 = r3 >> 16;
        r3 = 1;
        r2 = r2 & r3;
        r2 = r2 ^ r3;
        if (r2 != 0) goto L_0x040c;
    L_0x040a:
        r2 = 0;
        goto L_0x040d;
    L_0x040c:
        r2 = 1;
    L_0x040d:
        r37[r15] = r2;
        r2 = (long) r14;
        r0 = r0 + r2;
        r15 = r15 + 1;
        r2 = r39;
        r3 = r40;
        r4 = r41;
        r5 = r42;
        goto L_0x01f1;
    L_0x041d:
        r0 = new nnc;
        r1 = "Trun count in traf != 1 (unsupported).";
        r0.<init>(r1);
        throw r0;
    L_0x0425:
        r21 = r1;
        r17 = r2;
        r40 = r3;
        r20 = r7;
        r25 = r8;
    L_0x042f:
        r8 = r25 + 1;
        r0 = r45;
        r2 = r17;
        r7 = r20;
        r1 = r21;
        r3 = r40;
        r4 = 8;
        r6 = 1;
        goto L_0x004e;
    L_0x0440:
        r0 = r1.b;
        r0 = defpackage.nsr.a(r0);
        if (r0 == 0) goto L_0x0000;
    L_0x0448:
        r2 = r45;
        r1 = r2.v;
        r1.a(r0);
    L_0x044f:
        r0 = r2;
        goto L_0x0002;
    L_0x0452:
        r2 = r0;
        r0 = "Unexpected moov box.";
        r14 = 1;
        defpackage.nwf.b(r14, r0);
        r0 = r1.b;
        r0 = defpackage.nsr.a(r0);
        if (r0 == 0) goto L_0x0466;
    L_0x0461:
        r3 = r2.v;
        r3.a(r0);
    L_0x0466:
        r0 = defpackage.nsg.P;
        r0 = r1.b(r0);
        r3 = new android.util.SparseArray;
        r3.<init>();
        r4 = r0.b;
        r4 = r4.size();
        r5 = -1;
        r6 = r5;
        r5 = 0;
    L_0x047b:
        if (r5 >= r4) goto L_0x04ea;
    L_0x047d:
        r8 = r0.b;
        r8 = r8.get(r5);
        r8 = (defpackage.nsi) r8;
        r9 = r8.aQ;
        r10 = defpackage.nsg.B;
        if (r9 != r10) goto L_0x04c7;
    L_0x048b:
        r8 = r8.a;
        r9 = 12;
        r8.c(r9);
        r9 = r8.j();
        r10 = r8.n();
        r11 = r8.n();
        r12 = r8.n();
        r8 = r8.j();
        r9 = java.lang.Integer.valueOf(r9);
        r13 = new nsp;
        r10 = r10 + -1;
        r13.<init>(r10, r11, r12, r8);
        r8 = android.util.Pair.create(r9, r13);
        r9 = r8.first;
        r9 = (java.lang.Integer) r9;
        r9 = r9.intValue();
        r8 = r8.second;
        r8 = (defpackage.nsp) r8;
        r3.put(r9, r8);
    L_0x04c4:
        r8 = 8;
        goto L_0x04e7;
    L_0x04c7:
        r9 = r8.aQ;
        r10 = defpackage.nsg.Q;
        if (r9 != r10) goto L_0x04c4;
    L_0x04cd:
        r6 = r8.a;
        r8 = 8;
        r6.c(r8);
        r7 = r6.j();
        r7 = defpackage.nsg.c(r7);
        if (r7 == 0) goto L_0x04e3;
    L_0x04de:
        r6 = r6.p();
        goto L_0x04e7;
    L_0x04e3:
        r6 = r6.h();
    L_0x04e7:
        r5 = r5 + 1;
        goto L_0x047b;
    L_0x04ea:
        r0 = new android.util.SparseArray;
        r0.<init>();
        r4 = r1.c;
        r4 = r4.size();
        r5 = 0;
    L_0x04f6:
        if (r5 >= r4) goto L_0x051e;
    L_0x04f8:
        r8 = r1.c;
        r8 = r8.get(r5);
        r8 = (defpackage.nsf) r8;
        r9 = r8.aQ;
        r10 = defpackage.nsg.G;
        if (r9 != r10) goto L_0x051a;
    L_0x0506:
        r9 = defpackage.nsg.F;
        r9 = r1.a(r9);
        r10 = 0;
        r8 = defpackage.nsh.a(r8, r9, r6, r10);
        if (r8 != 0) goto L_0x0514;
    L_0x0513:
        goto L_0x051b;
    L_0x0514:
        r9 = r8.g;
        r0.put(r9, r8);
        goto L_0x051b;
    L_0x051a:
        r10 = 0;
    L_0x051b:
        r5 = r5 + 1;
        goto L_0x04f6;
    L_0x051e:
        r10 = 0;
        r1 = r0.size();
        r4 = r2.e;
        r4 = r4.size();
        if (r4 == 0) goto L_0x0539;
    L_0x052b:
        r4 = r2.e;
        r4 = r4.size();
        if (r4 != r1) goto L_0x0534;
    L_0x0533:
        goto L_0x0535;
    L_0x0534:
        r14 = 0;
    L_0x0535:
        defpackage.nwf.b(r14);
        goto L_0x0541;
    L_0x0539:
        r4 = 0;
    L_0x053a:
        if (r4 < r1) goto L_0x0561;
    L_0x053c:
        r4 = r2.v;
        r4.a();
    L_0x0541:
        if (r10 >= r1) goto L_0x044f;
    L_0x0543:
        r4 = r0.valueAt(r10);
        r4 = (defpackage.nsx) r4;
        r5 = r2.e;
        r6 = r4.g;
        r5 = r5.get(r6);
        r5 = (defpackage.nsu) r5;
        r6 = r4.g;
        r6 = r3.get(r6);
        r6 = (defpackage.nsp) r6;
        r5.a(r4, r6);
        r10 = r10 + 1;
        goto L_0x0541;
    L_0x0561:
        r5 = r2.e;
        r6 = r0.valueAt(r4);
        r6 = (defpackage.nsx) r6;
        r6 = r6.g;
        r7 = new nsu;
        r8 = r2.v;
        r8 = r8.d_(r4);
        r7.<init>(r8);
        r5.put(r6, r7);
        r4 = r4 + 1;
        goto L_0x053a;
    L_0x057c:
        r2 = r0;
        r45.a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsr.a(long):void");
    }

    private static void a(nwz nwz, int i, nsz nsz) {
        nwz.c(i + 8);
        i = nsg.d(nwz.j());
        if ((i & 1) == 0) {
            boolean z = (i & 2) != 0;
            int n = nwz.n();
            int i2 = nsz.d;
            if (n == i2) {
                Arrays.fill(nsz.j, 0, n, z);
                nsz.a(nwz.b());
                nwz.a(nsz.l.a, 0, nsz.k);
                nsz.l.c(0);
                nsz.m = false;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Length mismatch: ");
            stringBuilder.append(n);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            throw new nnc(stringBuilder.toString());
        }
        throw new nnc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static npy a(List list) {
        int size = list.size();
        npy npy = null;
        for (int i = 0; i < size; i++) {
            nsi nsi = (nsi) list.get(i);
            if (nsi.aQ == nsg.X) {
                if (npy == null) {
                    npy = new npy();
                }
                byte[] bArr = nsi.a.a;
                if (nsv.a(bArr) == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    npy.a(nsv.a(bArr), new npx("video/mp4", bArr));
                }
            }
        }
        return npy;
    }
}
