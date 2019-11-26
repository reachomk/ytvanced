package defpackage;

import java.util.List;

/* renamed from: rdr */
final class rdr implements rgx {
    private final rdp a;
    private int b;
    private int c;
    private int d = 0;

    public rdr(rdp rdp) {
        this.a = (rdp) rfc.a((Object) rdp, "input");
        this.a.c = this;
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.a();
            this.b = i;
        }
        return (i == 0 || i == this.c) ? Integer.MAX_VALUE : i >>> 3;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        if (!this.a.t()) {
            int i = this.b;
            if (i != this.c) {
                return this.a.b(i);
            }
        }
        return false;
    }

    private final void a(int i) {
        if ((this.b & 7) != i) {
            throw rfk.f();
        }
    }

    public final double d() {
        a(1);
        return this.a.b();
    }

    public final float e() {
        a(5);
        return this.a.c();
    }

    public final long f() {
        a(0);
        return this.a.d();
    }

    public final long g() {
        a(0);
        return this.a.e();
    }

    public final int h() {
        a(0);
        return this.a.f();
    }

    public final long i() {
        a(1);
        return this.a.g();
    }

    public final int j() {
        a(5);
        return this.a.h();
    }

    public final boolean k() {
        a(0);
        return this.a.i();
    }

    public final String l() {
        a(2);
        return this.a.j();
    }

    public final String m() {
        a(2);
        return this.a.k();
    }

    public final Object a(Class cls, reg reg) {
        a(2);
        return c(rgw.a.a(cls), reg);
    }

    public final Object a(rha rha, reg reg) {
        a(2);
        return c(rha, reg);
    }

    public final Object b(Class cls, reg reg) {
        a(3);
        return d(rgw.a.a(cls), reg);
    }

    public final Object b(rha rha, reg reg) {
        a(3);
        return d(rha, reg);
    }

    private final Object c(rha rha, reg reg) {
        int m = this.a.m();
        rdp rdp = this.a;
        if (rdp.a < rdp.b) {
            m = rdp.c(m);
            Object a = rha.a();
            rdp rdp2 = this.a;
            rdp2.a++;
            rha.a(a, this, reg);
            rha.c(a);
            this.a.a(0);
            rdp rdp3 = this.a;
            rdp3.a--;
            rdp3.d(m);
            return a;
        }
        throw rfk.g();
    }

    private final Object d(rha rha, reg reg) {
        int i = this.c;
        Object obj = ((this.b >>> 3) << 3) | 4;
        this.c = obj;
        try {
            obj = rha.a();
            rha.a(obj, this, reg);
            rha.c(obj);
            if (this.b == this.c) {
                return obj;
            }
            throw rfk.h();
        } finally {
            this.c = i;
        }
    }

    public final rdg n() {
        a(2);
        return this.a.l();
    }

    public final int o() {
        a(0);
        return this.a.m();
    }

    public final int p() {
        a(0);
        return this.a.n();
    }

    public final int q() {
        a(5);
        return this.a.o();
    }

    public final long r() {
        a(1);
        return this.a.p();
    }

    public final int s() {
        a(0);
        return this.a.q();
    }

    public final long t() {
        a(0);
        return this.a.r();
    }

    public final void a(List list) {
        int i;
        int u;
        if (list instanceof rec) {
            rec rec = (rec) list;
            i = this.b & 7;
            if (i == 1) {
                do {
                    rec.a(this.a.b());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                i = this.a.m();
                rdr.b(i);
                u = this.a.u() + i;
                do {
                    rec.a(this.a.b());
                } while (this.a.u() < u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Double.valueOf(this.a.b()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            i = this.a.m();
            rdr.b(i);
            u = this.a.u() + i;
            do {
                list.add(Double.valueOf(this.a.b()));
            } while (this.a.u() < u);
        } else {
            throw rfk.f();
        }
    }

    public final void b(List list) {
        if (list instanceof rep) {
            rep rep = (rep) list;
            int i = this.b & 7;
            if (i == 2) {
                i = this.a.m();
                rdr.c(i);
                int u = this.a.u() + i;
                do {
                    rep.a(this.a.c());
                } while (this.a.u() < u);
                return;
            } else if (i == 5) {
                do {
                    rep.a(this.a.c());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else {
                throw rfk.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            i2 = this.a.m();
            rdr.c(i2);
            int u2 = this.a.u() + i2;
            do {
                list.add(Float.valueOf(this.a.c()));
            } while (this.a.u() < u2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.a.c()));
                if (this.a.t()) {
                    break;
                }
                i2 = this.a.a();
            } while (i2 == this.b);
            this.d = i2;
        } else {
            throw rfk.f();
        }
    }

    public final void c(List list) {
        int i;
        int u;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.b & 7;
            if (i == 0) {
                do {
                    rfw.a(this.a.d());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                u = this.a.u() + this.a.m();
                do {
                    rfw.a(this.a.d());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(this.a.d()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            u = this.a.u() + this.a.m();
            do {
                list.add(Long.valueOf(this.a.d()));
            } while (this.a.u() < u);
            d(u);
        } else {
            throw rfk.f();
        }
    }

    public final void d(List list) {
        int i;
        int u;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.b & 7;
            if (i == 0) {
                do {
                    rfw.a(this.a.e());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                u = this.a.u() + this.a.m();
                do {
                    rfw.a(this.a.e());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(this.a.e()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            u = this.a.u() + this.a.m();
            do {
                list.add(Long.valueOf(this.a.e()));
            } while (this.a.u() < u);
            d(u);
        } else {
            throw rfk.f();
        }
    }

    public final void e(List list) {
        int i;
        int u;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.b & 7;
            if (i == 0) {
                do {
                    rez.c(this.a.f());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                u = this.a.u() + this.a.m();
                do {
                    rez.c(this.a.f());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.a.f()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            u = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.f()));
            } while (this.a.u() < u);
            d(u);
        } else {
            throw rfk.f();
        }
    }

    public final void f(List list) {
        int i;
        int u;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.b & 7;
            if (i == 1) {
                do {
                    rfw.a(this.a.g());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                i = this.a.m();
                rdr.b(i);
                u = this.a.u() + i;
                do {
                    rfw.a(this.a.g());
                } while (this.a.u() < u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(this.a.g()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            i = this.a.m();
            rdr.b(i);
            u = this.a.u() + i;
            do {
                list.add(Long.valueOf(this.a.g()));
            } while (this.a.u() < u);
        } else {
            throw rfk.f();
        }
    }

    public final void g(List list) {
        if (list instanceof rez) {
            rez rez = (rez) list;
            int i = this.b & 7;
            if (i == 2) {
                i = this.a.m();
                rdr.c(i);
                int u = this.a.u() + i;
                do {
                    rez.c(this.a.h());
                } while (this.a.u() < u);
                return;
            } else if (i == 5) {
                do {
                    rez.c(this.a.h());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else {
                throw rfk.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            i2 = this.a.m();
            rdr.c(i2);
            int u2 = this.a.u() + i2;
            do {
                list.add(Integer.valueOf(this.a.h()));
            } while (this.a.u() < u2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.t()) {
                    break;
                }
                i2 = this.a.a();
            } while (i2 == this.b);
            this.d = i2;
        } else {
            throw rfk.f();
        }
    }

    public final void h(List list) {
        int i;
        int u;
        if (list instanceof rde) {
            rde rde = (rde) list;
            i = this.b & 7;
            if (i == 0) {
                do {
                    rde.a(this.a.i());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                u = this.a.u() + this.a.m();
                do {
                    rde.a(this.a.i());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(this.a.i()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            u = this.a.u() + this.a.m();
            do {
                list.add(Boolean.valueOf(this.a.i()));
            } while (this.a.u() < u);
            d(u);
        } else {
            throw rfk.f();
        }
    }

    public final void i(List list) {
        a(list, false);
    }

    public final void j(List list) {
        a(list, true);
    }

    private final void a(List list, boolean z) {
        if ((this.b & 7) != 2) {
            throw rfk.f();
        } else if ((list instanceof rfs) && !z) {
            int a;
            rfs rfs = (rfs) list;
            do {
                rfs.a(n());
                if (this.a.t()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else {
            int a2;
            do {
                Object m;
                if (z) {
                    m = m();
                } else {
                    m = l();
                }
                list.add(m);
                if (this.a.t()) {
                    break;
                }
                a2 = this.a.a();
            } while (a2 == this.b);
            this.d = a2;
        }
    }

    public final void a(List list, rha rha, reg reg) {
        int i = this.b;
        if ((i & 7) == 2) {
            int a;
            do {
                list.add(c(rha, reg));
                if (!this.a.t() && this.d == 0) {
                    a = this.a.a();
                } else {
                    return;
                }
            } while (a == i);
            this.d = a;
            return;
        }
        throw rfk.f();
    }

    public final void b(List list, rha rha, reg reg) {
        int i = this.b;
        if ((i & 7) == 3) {
            int a;
            do {
                list.add(d(rha, reg));
                if (!this.a.t() && this.d == 0) {
                    a = this.a.a();
                } else {
                    return;
                }
            } while (a == i);
            this.d = a;
            return;
        }
        throw rfk.f();
    }

    public final void k(List list) {
        if ((this.b & 7) == 2) {
            int a;
            do {
                list.add(n());
                if (!this.a.t()) {
                    a = this.a.a();
                } else {
                    return;
                }
            } while (a == this.b);
            this.d = a;
            return;
        }
        throw rfk.f();
    }

    public final void l(List list) {
        int i;
        int u;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.b & 7;
            if (i == 0) {
                do {
                    rez.c(this.a.m());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                u = this.a.u() + this.a.m();
                do {
                    rez.c(this.a.m());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.a.m()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            u = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.m()));
            } while (this.a.u() < u);
            d(u);
        } else {
            throw rfk.f();
        }
    }

    public final void m(List list) {
        int i;
        int u;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.b & 7;
            if (i == 0) {
                do {
                    rez.c(this.a.n());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                u = this.a.u() + this.a.m();
                do {
                    rez.c(this.a.n());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            u = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.n()));
            } while (this.a.u() < u);
            d(u);
        } else {
            throw rfk.f();
        }
    }

    public final void n(List list) {
        if (list instanceof rez) {
            rez rez = (rez) list;
            int i = this.b & 7;
            if (i == 2) {
                i = this.a.m();
                rdr.c(i);
                int u = this.a.u() + i;
                do {
                    rez.c(this.a.o());
                } while (this.a.u() < u);
                return;
            } else if (i == 5) {
                do {
                    rez.c(this.a.o());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else {
                throw rfk.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            i2 = this.a.m();
            rdr.c(i2);
            int u2 = this.a.u() + i2;
            do {
                list.add(Integer.valueOf(this.a.o()));
            } while (this.a.u() < u2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.a.o()));
                if (this.a.t()) {
                    break;
                }
                i2 = this.a.a();
            } while (i2 == this.b);
            this.d = i2;
        } else {
            throw rfk.f();
        }
    }

    public final void o(List list) {
        int i;
        int u;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.b & 7;
            if (i == 1) {
                do {
                    rfw.a(this.a.p());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                i = this.a.m();
                rdr.b(i);
                u = this.a.u() + i;
                do {
                    rfw.a(this.a.p());
                } while (this.a.u() < u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(this.a.p()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            i = this.a.m();
            rdr.b(i);
            u = this.a.u() + i;
            do {
                list.add(Long.valueOf(this.a.p()));
            } while (this.a.u() < u);
        } else {
            throw rfk.f();
        }
    }

    public final void p(List list) {
        int i;
        int u;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.b & 7;
            if (i == 0) {
                do {
                    rez.c(this.a.q());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                u = this.a.u() + this.a.m();
                do {
                    rez.c(this.a.q());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.a.q()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            u = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.q()));
            } while (this.a.u() < u);
            d(u);
        } else {
            throw rfk.f();
        }
    }

    public final void q(List list) {
        int i;
        int u;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.b & 7;
            if (i == 0) {
                do {
                    rfw.a(this.a.r());
                    if (this.a.t()) {
                        break;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            } else if (i == 2) {
                u = this.a.u() + this.a.m();
                do {
                    rfw.a(this.a.r());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(this.a.r()));
                if (this.a.t()) {
                    break;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
        } else if (i == 2) {
            u = this.a.u() + this.a.m();
            do {
                list.add(Long.valueOf(this.a.r()));
            } while (this.a.u() < u);
            d(u);
        } else {
            throw rfk.f();
        }
    }

    private static void b(int i) {
        if ((i & 7) != 0) {
            throw rfk.h();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:19:0x0053, code skipped:
            if (c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Missing block: B:22:0x005b, code skipped:
            throw new defpackage.rfk(r6);
     */
    public final void a(java.util.Map r8, defpackage.rfz r9, defpackage.reg r10) {
        /*
        r7 = this;
        r0 = 2;
        r7.a(r0);
        r1 = r7.a;
        r1 = r1.m();
        r2 = r7.a;
        r1 = r2.c(r1);
        r2 = r9.b;
        r3 = r9.d;
    L_0x0014:
        r4 = r7.a();	 Catch:{ all -> 0x0065 }
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 == r5) goto L_0x005c;
    L_0x001d:
        r5 = r7.a;	 Catch:{ all -> 0x0065 }
        r5 = r5.t();	 Catch:{ all -> 0x0065 }
        if (r5 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x005c;
    L_0x0026:
        r5 = 1;
        r6 = "Unable to parse map entry.";
        if (r4 == r5) goto L_0x0047;
    L_0x002b:
        if (r4 == r0) goto L_0x003a;
    L_0x002d:
        r4 = r7.c();	 Catch:{ rfj -> 0x004f }
        if (r4 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0014;
    L_0x0034:
        r4 = new rfk;	 Catch:{ rfj -> 0x004f }
        r4.<init>(r6);	 Catch:{ rfj -> 0x004f }
        throw r4;	 Catch:{ rfj -> 0x004f }
    L_0x003a:
        r4 = r9.c;	 Catch:{ rfj -> 0x004f }
        r5 = r9.d;	 Catch:{ rfj -> 0x004f }
        r5 = r5.getClass();	 Catch:{ rfj -> 0x004f }
        r3 = r7.a(r4, r5, r10);	 Catch:{ rfj -> 0x004f }
        goto L_0x0014;
    L_0x0047:
        r4 = r9.a;	 Catch:{ rfj -> 0x004f }
        r5 = 0;
        r2 = r7.a(r4, r5, r5);	 Catch:{ rfj -> 0x004f }
        goto L_0x0014;
    L_0x004f:
        r4 = r7.c();	 Catch:{ all -> 0x0065 }
        if (r4 == 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0014;
    L_0x0056:
        r8 = new rfk;	 Catch:{ all -> 0x0065 }
        r8.<init>(r6);	 Catch:{ all -> 0x0065 }
        throw r8;	 Catch:{ all -> 0x0065 }
    L_0x005c:
        r8.put(r2, r3);	 Catch:{ all -> 0x0065 }
        r8 = r7.a;
        r8.d(r1);
        return;
    L_0x0065:
        r8 = move-exception;
        r9 = r7.a;
        r9.d(r1);
        goto L_0x006d;
    L_0x006c:
        throw r8;
    L_0x006d:
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdr.a(java.util.Map, rfz, reg):void");
    }

    private final Object a(rii rii, Class cls, reg reg) {
        switch (rdu.a[rii.ordinal()]) {
            case 1:
                return Boolean.valueOf(k());
            case 2:
                return n();
            case 3:
                return Double.valueOf(d());
            case 4:
                return Integer.valueOf(p());
            case 5:
                return Integer.valueOf(j());
            case 6:
                return Long.valueOf(i());
            case 7:
                return Float.valueOf(e());
            case 8:
                return Integer.valueOf(h());
            case 9:
                return Long.valueOf(g());
            case 10:
                return a(cls, reg);
            case 11:
                return Integer.valueOf(q());
            case 12:
                return Long.valueOf(r());
            case 13:
                return Integer.valueOf(s());
            case 14:
                return Long.valueOf(t());
            case 15:
                return m();
            case 16:
                return Integer.valueOf(o());
            case 17:
                return Long.valueOf(f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void c(int i) {
        if ((i & 3) != 0) {
            throw rfk.h();
        }
    }

    private final void d(int i) {
        if (this.a.u() != i) {
            throw rfk.a();
        }
    }
}
