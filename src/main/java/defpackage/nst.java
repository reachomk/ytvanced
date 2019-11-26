package defpackage;

import java.util.ArrayList;
import java.util.Stack;

/* renamed from: nst */
public final class nst implements nrc, nrq {
    private static final int a = nxf.c("qt  ");
    private final nwz b = new nwz(nwv.a);
    private final nwz c = new nwz(4);
    private final nwz d = new nwz(16);
    private final Stack e = new Stack();
    private int g;
    private int h;
    private long i;
    private int j;
    private nwz k;
    private int l;
    private int m;
    private int n;
    private nre o;
    private nsw[] p;
    private boolean q;

    public nst() {
        d();
    }

    public final boolean a() {
        return true;
    }

    public final void c() {
    }

    public final boolean a(nrb nrb) {
        return nsy.a(nrb, false);
    }

    public final void a(nre nre) {
        this.o = nre;
    }

    public final void b() {
        this.e.clear();
        this.j = 0;
        this.m = 0;
        this.n = 0;
        this.g = 0;
    }

    public final int a(nrb nrb, nrm nrm) {
        nrb nrb2 = nrb;
        nrm nrm2 = nrm;
        while (true) {
            int i = this.g;
            if (i != 0) {
                boolean z;
                int i2;
                if (i == 1) {
                    z = true;
                    if (this.j == 0) {
                        if (!nrb2.a(this.d.a, 0, 8, true)) {
                            return -1;
                        }
                        this.j = 8;
                        this.d.c(0);
                        this.i = this.d.h();
                        this.h = this.d.j();
                    }
                    if (this.i == 1) {
                        nrb2.b(this.d.a, 8, 8);
                        this.j += 8;
                        this.i = this.d.p();
                    }
                    i2 = this.h;
                    if (i2 == nsg.E || i2 == nsg.G || i2 == nsg.H || i2 == nsg.I || i2 == nsg.J || i2 == nsg.S) {
                        long j = (((nqx) nrb2).c + this.i) - ((long) this.j);
                        this.e.add(new nsf(this.h, j));
                        if (this.i == ((long) this.j)) {
                            a(j);
                        } else {
                            d();
                        }
                    } else {
                        i2 = this.h;
                        if (i2 == nsg.U || i2 == nsg.F || i2 == nsg.V || i2 == nsg.W || i2 == nsg.ao || i2 == nsg.ap || i2 == nsg.aq || i2 == nsg.T || i2 == nsg.ar || i2 == nsg.as || i2 == nsg.at || i2 == nsg.au || i2 == nsg.av || i2 == nsg.R || i2 == nsg.d || i2 == nsg.aB) {
                            nwf.b(this.j == 8);
                            if (this.i > 2147483647L) {
                                z = false;
                            }
                            nwf.b(z);
                            this.k = new nwz((int) this.i);
                            System.arraycopy(this.d.a, 0, this.k.a, 0, 8);
                            this.g = 2;
                        } else {
                            this.k = null;
                            this.g = 2;
                        }
                    }
                } else if (i != 2) {
                    nsw[] nswArr;
                    int i3;
                    int i4;
                    long j2 = Long.MAX_VALUE;
                    i = 0;
                    i2 = -1;
                    while (true) {
                        nswArr = this.p;
                        if (i >= nswArr.length) {
                            break;
                        }
                        nsw nsw = nswArr[i];
                        i3 = nsw.d;
                        ntc ntc = nsw.b;
                        if (i3 != ntc.a) {
                            long j3 = ntc.b[i3];
                            if (j3 < j2) {
                                i2 = i;
                                j2 = j3;
                            }
                        }
                        i++;
                    }
                    if (i2 == -1) {
                        i4 = -1;
                    } else {
                        nsw nsw2 = nswArr[i2];
                        nrs nrs = nsw2.c;
                        int i5 = nsw2.d;
                        long j4 = nsw2.b.b[i5];
                        long j5 = (j4 - ((nqx) nrb2).c) + ((long) this.m);
                        if (j5 >= 0 && j5 < 262144) {
                            int i6;
                            nrb2.a((int) j5);
                            this.l = nsw2.b.c[i5];
                            int i7 = nsw2.a.o;
                            int i8;
                            if (i7 == -1) {
                                while (true) {
                                    i7 = this.m;
                                    i8 = this.l;
                                    if (i7 >= i8) {
                                        break;
                                    }
                                    i7 = nrs.a(nrb2, i8 - i7, false);
                                    this.m += i7;
                                    this.n -= i7;
                                }
                                i6 = i8;
                            } else {
                                int i9;
                                byte[] bArr = this.c.a;
                                bArr[0] = (byte) 0;
                                bArr[1] = (byte) 0;
                                bArr[2] = (byte) 0;
                                i3 = 4 - i7;
                                while (true) {
                                    i8 = this.m;
                                    i9 = this.l;
                                    if (i8 >= i9) {
                                        break;
                                    }
                                    i8 = this.n;
                                    if (i8 == 0) {
                                        nrb2.b(this.c.a, i3, i7);
                                        this.c.c(0);
                                        this.n = this.c.n();
                                        this.b.c(0);
                                        nrs.a(this.b, 4);
                                        this.m += 4;
                                        this.l += i3;
                                    } else {
                                        i8 = nrs.a(nrb2, i8, false);
                                        this.m += i8;
                                        this.n -= i8;
                                    }
                                }
                                i6 = i9;
                            }
                            ntc ntc2 = nsw2.b;
                            nrs.a(ntc2.e[i5], ntc2.f[i5], i6, 0, null);
                            nsw2.d++;
                            this.m = 0;
                            this.n = 0;
                            i4 = 0;
                        } else {
                            nrm2.a = j4;
                            i4 = 1;
                        }
                    }
                    return i4;
                } else {
                    Object obj;
                    long j6 = this.i;
                    i = this.j;
                    j6 -= (long) i;
                    long j7 = ((nqx) nrb2).c + j6;
                    nwz nwz = this.k;
                    if (nwz != null) {
                        nrb2.b(nwz.a, i, (int) j6);
                        if (this.h == nsg.d) {
                            nwz nwz2 = this.k;
                            nwz2.c(8);
                            if (nwz2.j() == a) {
                                z = true;
                                break;
                            }
                            nwz2.d(4);
                            while (nwz2.b() > 0) {
                                if (nwz2.j() == a) {
                                    z = true;
                                    break;
                                }
                            }
                            z = false;
                            this.q = z;
                        } else if (!this.e.isEmpty()) {
                            ((nsf) this.e.peek()).a(new nsi(this.h, this.k));
                        }
                    } else if (j6 < 262144) {
                        nrb2.a((int) j6);
                    } else {
                        nrm2.a = j7;
                        obj = 1;
                        a(j7);
                        if (!(obj == null || this.g == 3)) {
                            return 1;
                        }
                    }
                    obj = null;
                    a(j7);
                    return 1;
                }
            } else if (((nqx) nrb2).c != 0) {
                this.g = 3;
            } else {
                d();
            }
        }
    }

    public final long b(long j) {
        long j2 = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            nsw[] nswArr = this.p;
            if (i >= nswArr.length) {
                return j2;
            }
            ntc ntc = nswArr[i].b;
            int a = nxf.a(ntc.e, j, false);
            while (a >= 0) {
                if ((ntc.f[a] & 1) != 0) {
                    break;
                }
                a--;
            }
            a = -1;
            if (a == -1) {
                a = nxf.b(ntc.e, j, false);
                while (a < ntc.e.length) {
                    if ((ntc.f[a] & 1) != 0) {
                        break;
                    }
                    a++;
                }
                a = -1;
            }
            this.p[i].d = a;
            long j3 = ntc.b[a];
            if (j3 < j2) {
                j2 = j3;
            }
            i++;
        }
    }

    private final void d() {
        this.g = 1;
        this.j = 0;
    }

    private final void a(long j) {
        while (!this.e.isEmpty() && ((nsf) this.e.peek()).a == j) {
            nsf nsf = (nsf) this.e.pop();
            if (nsf.aQ == nsg.E) {
                ArrayList arrayList = new ArrayList();
                nsi a = nsf.a(nsg.aB);
                nrj a2 = a != null ? nsh.a(a, this.q) : null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                while (i < nsf.c.size()) {
                    nsf nsf2;
                    nsf nsf3 = (nsf) nsf.c.get(i);
                    if (nsf3.aQ == nsg.G) {
                        nsx a3 = nsh.a(nsf3, nsf.a(nsg.F), -1, this.q);
                        if (a3 != null) {
                            ntc a4 = nsh.a(a3, nsf3.b(nsg.H).b(nsg.I).b(nsg.J));
                            if (a4.a != 0) {
                                nsw nsw = new nsw(a3, a4, this.o.d_(i));
                                int i2 = a4.d;
                                nmx nmx = a3.k;
                                nmx nmx2 = r13;
                                int i3 = i2 + 30;
                                nsf2 = nsf;
                                nmx nmx3 = new nmx(nmx.a, nmx.b, nmx.c, i3, nmx.e, nmx.h, nmx.i, nmx.l, nmx.m, nmx.q, nmx.r, nmx.v, nmx.w, nmx.f, nmx.g, nmx.j, nmx.k, nmx.s, nmx.t, nmx.u, nmx.o, nmx.n, nmx.p);
                                nsw.c.a(a2 != null ? nmx2.b(a2.a, a2.b) : nmx2);
                                arrayList.add(nsw);
                                long j3 = a4.b[0];
                                if (j3 < j2) {
                                    j2 = j3;
                                }
                                i++;
                                nsf = nsf2;
                            }
                        }
                    }
                    nsf2 = nsf;
                    i++;
                    nsf = nsf2;
                }
                this.p = (nsw[]) arrayList.toArray(new nsw[0]);
                this.o.a();
                this.o.a(this);
                this.e.clear();
                this.g = 3;
            } else if (!this.e.isEmpty()) {
                ((nsf) this.e.peek()).a(nsf);
            }
        }
        if (this.g != 3) {
            d();
        }
    }
}
