package defpackage;

import java.util.List;

/* renamed from: anwj */
final class anwj implements anzt {
    private final anwf a;
    private int b;
    private int c;
    private int d = 0;

    public static anwj a(anwf anwf) {
        anwj anwj = anwf.d;
        return anwj == null ? new anwj(anwf) : anwj;
    }

    private anwj(anwf anwf) {
        this.a = (anwf) anxw.a((Object) anwf, "input");
        this.a.d = this;
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
        return (i == 0 || i == this.c) ? Integer.MAX_VALUE : aobj.b(i);
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        if (!this.a.u()) {
            int i = this.b;
            if (i != this.c) {
                return this.a.b(i);
            }
        }
        return false;
    }

    private final void a(int i) {
        if (aobj.a(this.b) != i) {
            throw anyg.f();
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

    public final Object a(Class cls, anxa anxa) {
        a(2);
        return c(anzs.a.a(cls), anxa);
    }

    public final Object a(anzz anzz, anxa anxa) {
        a(2);
        return c(anzz, anxa);
    }

    public final Object b(Class cls, anxa anxa) {
        a(3);
        return d(anzs.a.a(cls), anxa);
    }

    public final Object b(anzz anzz, anxa anxa) {
        a(3);
        return d(anzz, anxa);
    }

    private final Object c(anzz anzz, anxa anxa) {
        int n = this.a.n();
        anwf anwf = this.a;
        if (anwf.a < anwf.b) {
            n = anwf.c(n);
            Object a = anzz.a();
            anwf anwf2 = this.a;
            anwf2.a++;
            anzz.a(a, this, anxa);
            anzz.c(a);
            this.a.a(0);
            anwf anwf3 = this.a;
            anwf3.a--;
            anwf3.d(n);
            return a;
        }
        throw anyg.g();
    }

    private final Object d(anzz anzz, anxa anxa) {
        int i = this.c;
        Object a = aobj.a(aobj.b(this.b), 4);
        this.c = a;
        try {
            a = anzz.a();
            anzz.a(a, this, anxa);
            anzz.c(a);
            if (this.b == this.c) {
                return a;
            }
            throw anyg.i();
        } finally {
            this.c = i;
        }
    }

    public final anvu n() {
        a(2);
        return this.a.l();
    }

    public final int o() {
        a(0);
        return this.a.n();
    }

    public final int p() {
        a(0);
        return this.a.o();
    }

    public final int q() {
        a(5);
        return this.a.p();
    }

    public final long r() {
        a(1);
        return this.a.q();
    }

    public final int s() {
        a(0);
        return this.a.r();
    }

    public final long t() {
        a(0);
        return this.a.s();
    }

    public final void a(List list) {
        int a;
        int v;
        if (list instanceof anwt) {
            anwt anwt = (anwt) list;
            a = aobj.a(this.b);
            if (a == 1) {
                do {
                    anwt.a(this.a.b());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                a = this.a.n();
                anwj.b(a);
                v = this.a.v() + a;
                do {
                    anwt.a(this.a.b());
                } while (this.a.v() < v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 1) {
            do {
                list.add(Double.valueOf(this.a.b()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            a = this.a.n();
            anwj.b(a);
            v = this.a.v() + a;
            do {
                list.add(Double.valueOf(this.a.b()));
            } while (this.a.v() < v);
        } else {
            throw anyg.f();
        }
    }

    public final void b(List list) {
        if (list instanceof anxk) {
            anxk anxk = (anxk) list;
            int a = aobj.a(this.b);
            if (a == 2) {
                a = this.a.n();
                anwj.c(a);
                int v = this.a.v() + a;
                do {
                    anxk.a(this.a.c());
                } while (this.a.v() < v);
                return;
            } else if (a == 5) {
                do {
                    anxk.a(this.a.c());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else {
                throw anyg.f();
            }
        }
        int a2 = aobj.a(this.b);
        if (a2 == 2) {
            a2 = this.a.n();
            anwj.c(a2);
            int v2 = this.a.v() + a2;
            do {
                list.add(Float.valueOf(this.a.c()));
            } while (this.a.v() < v2);
        } else if (a2 == 5) {
            do {
                list.add(Float.valueOf(this.a.c()));
                if (this.a.u()) {
                    break;
                }
                a2 = this.a.a();
            } while (a2 == this.b);
            this.d = a2;
        } else {
            throw anyg.f();
        }
    }

    public final void c(List list) {
        int a;
        int v;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.b);
            if (a == 0) {
                do {
                    anys.a(this.a.d());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                v = this.a.v() + this.a.n();
                do {
                    anys.a(this.a.d());
                } while (this.a.v() < v);
                d(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 0) {
            do {
                list.add(Long.valueOf(this.a.d()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            v = this.a.v() + this.a.n();
            do {
                list.add(Long.valueOf(this.a.d()));
            } while (this.a.v() < v);
            d(v);
        } else {
            throw anyg.f();
        }
    }

    public final void d(List list) {
        int a;
        int v;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.b);
            if (a == 0) {
                do {
                    anys.a(this.a.e());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                v = this.a.v() + this.a.n();
                do {
                    anys.a(this.a.e());
                } while (this.a.v() < v);
                d(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 0) {
            do {
                list.add(Long.valueOf(this.a.e()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            v = this.a.v() + this.a.n();
            do {
                list.add(Long.valueOf(this.a.e()));
            } while (this.a.v() < v);
            d(v);
        } else {
            throw anyg.f();
        }
    }

    public final void e(List list) {
        int a;
        int v;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.b);
            if (a == 0) {
                do {
                    anxt.d(this.a.f());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                v = this.a.v() + this.a.n();
                do {
                    anxt.d(this.a.f());
                } while (this.a.v() < v);
                d(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 0) {
            do {
                list.add(Integer.valueOf(this.a.f()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            v = this.a.v() + this.a.n();
            do {
                list.add(Integer.valueOf(this.a.f()));
            } while (this.a.v() < v);
            d(v);
        } else {
            throw anyg.f();
        }
    }

    public final void f(List list) {
        int a;
        int v;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.b);
            if (a == 1) {
                do {
                    anys.a(this.a.g());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                a = this.a.n();
                anwj.b(a);
                v = this.a.v() + a;
                do {
                    anys.a(this.a.g());
                } while (this.a.v() < v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 1) {
            do {
                list.add(Long.valueOf(this.a.g()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            a = this.a.n();
            anwj.b(a);
            v = this.a.v() + a;
            do {
                list.add(Long.valueOf(this.a.g()));
            } while (this.a.v() < v);
        } else {
            throw anyg.f();
        }
    }

    public final void g(List list) {
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            int a = aobj.a(this.b);
            if (a == 2) {
                a = this.a.n();
                anwj.c(a);
                int v = this.a.v() + a;
                do {
                    anxt.d(this.a.h());
                } while (this.a.v() < v);
                return;
            } else if (a == 5) {
                do {
                    anxt.d(this.a.h());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else {
                throw anyg.f();
            }
        }
        int a2 = aobj.a(this.b);
        if (a2 == 2) {
            a2 = this.a.n();
            anwj.c(a2);
            int v2 = this.a.v() + a2;
            do {
                list.add(Integer.valueOf(this.a.h()));
            } while (this.a.v() < v2);
        } else if (a2 == 5) {
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.u()) {
                    break;
                }
                a2 = this.a.a();
            } while (a2 == this.b);
            this.d = a2;
        } else {
            throw anyg.f();
        }
    }

    public final void h(List list) {
        int a;
        int v;
        if (list instanceof anvs) {
            anvs anvs = (anvs) list;
            a = aobj.a(this.b);
            if (a == 0) {
                do {
                    anvs.a(this.a.i());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                v = this.a.v() + this.a.n();
                do {
                    anvs.a(this.a.i());
                } while (this.a.v() < v);
                d(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 0) {
            do {
                list.add(Boolean.valueOf(this.a.i()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            v = this.a.v() + this.a.n();
            do {
                list.add(Boolean.valueOf(this.a.i()));
            } while (this.a.v() < v);
            d(v);
        } else {
            throw anyg.f();
        }
    }

    public final void i(List list) {
        a(list, false);
    }

    public final void j(List list) {
        a(list, true);
    }

    private final void a(List list, boolean z) {
        if (aobj.a(this.b) != 2) {
            throw anyg.f();
        } else if ((list instanceof anyo) && !z) {
            int a;
            anyo anyo = (anyo) list;
            do {
                anyo.a(n());
                if (this.a.u()) {
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
                if (this.a.u()) {
                    break;
                }
                a2 = this.a.a();
            } while (a2 == this.b);
            this.d = a2;
        }
    }

    public final void a(List list, anzz anzz, anxa anxa) {
        if (aobj.a(this.b) == 2) {
            int a;
            int i = this.b;
            do {
                list.add(c(anzz, anxa));
                if (!this.a.u() && this.d == 0) {
                    a = this.a.a();
                } else {
                    return;
                }
            } while (a == i);
            this.d = a;
            return;
        }
        throw anyg.f();
    }

    public final void b(List list, anzz anzz, anxa anxa) {
        if (aobj.a(this.b) == 3) {
            int a;
            int i = this.b;
            do {
                list.add(d(anzz, anxa));
                if (!this.a.u() && this.d == 0) {
                    a = this.a.a();
                } else {
                    return;
                }
            } while (a == i);
            this.d = a;
            return;
        }
        throw anyg.f();
    }

    public final void k(List list) {
        if (aobj.a(this.b) == 2) {
            int a;
            do {
                list.add(n());
                if (!this.a.u()) {
                    a = this.a.a();
                } else {
                    return;
                }
            } while (a == this.b);
            this.d = a;
            return;
        }
        throw anyg.f();
    }

    public final void l(List list) {
        int a;
        int v;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.b);
            if (a == 0) {
                do {
                    anxt.d(this.a.n());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                v = this.a.v() + this.a.n();
                do {
                    anxt.d(this.a.n());
                } while (this.a.v() < v);
                d(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 0) {
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            v = this.a.v() + this.a.n();
            do {
                list.add(Integer.valueOf(this.a.n()));
            } while (this.a.v() < v);
            d(v);
        } else {
            throw anyg.f();
        }
    }

    public final void m(List list) {
        int a;
        int v;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.b);
            if (a == 0) {
                do {
                    anxt.d(this.a.o());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                v = this.a.v() + this.a.n();
                do {
                    anxt.d(this.a.o());
                } while (this.a.v() < v);
                d(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 0) {
            do {
                list.add(Integer.valueOf(this.a.o()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            v = this.a.v() + this.a.n();
            do {
                list.add(Integer.valueOf(this.a.o()));
            } while (this.a.v() < v);
            d(v);
        } else {
            throw anyg.f();
        }
    }

    public final void n(List list) {
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            int a = aobj.a(this.b);
            if (a == 2) {
                a = this.a.n();
                anwj.c(a);
                int v = this.a.v() + a;
                do {
                    anxt.d(this.a.p());
                } while (this.a.v() < v);
                return;
            } else if (a == 5) {
                do {
                    anxt.d(this.a.p());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else {
                throw anyg.f();
            }
        }
        int a2 = aobj.a(this.b);
        if (a2 == 2) {
            a2 = this.a.n();
            anwj.c(a2);
            int v2 = this.a.v() + a2;
            do {
                list.add(Integer.valueOf(this.a.p()));
            } while (this.a.v() < v2);
        } else if (a2 == 5) {
            do {
                list.add(Integer.valueOf(this.a.p()));
                if (this.a.u()) {
                    break;
                }
                a2 = this.a.a();
            } while (a2 == this.b);
            this.d = a2;
        } else {
            throw anyg.f();
        }
    }

    public final void o(List list) {
        int a;
        int v;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.b);
            if (a == 1) {
                do {
                    anys.a(this.a.q());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                a = this.a.n();
                anwj.b(a);
                v = this.a.v() + a;
                do {
                    anys.a(this.a.q());
                } while (this.a.v() < v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 1) {
            do {
                list.add(Long.valueOf(this.a.q()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            a = this.a.n();
            anwj.b(a);
            v = this.a.v() + a;
            do {
                list.add(Long.valueOf(this.a.q()));
            } while (this.a.v() < v);
        } else {
            throw anyg.f();
        }
    }

    public final void p(List list) {
        int a;
        int v;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.b);
            if (a == 0) {
                do {
                    anxt.d(this.a.r());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                v = this.a.v() + this.a.n();
                do {
                    anxt.d(this.a.r());
                } while (this.a.v() < v);
                d(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 0) {
            do {
                list.add(Integer.valueOf(this.a.r()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            v = this.a.v() + this.a.n();
            do {
                list.add(Integer.valueOf(this.a.r()));
            } while (this.a.v() < v);
            d(v);
        } else {
            throw anyg.f();
        }
    }

    public final void q(List list) {
        int a;
        int v;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.b);
            if (a == 0) {
                do {
                    anys.a(this.a.s());
                    if (this.a.u()) {
                        break;
                    }
                    a = this.a.a();
                } while (a == this.b);
                this.d = a;
                return;
            } else if (a == 2) {
                v = this.a.v() + this.a.n();
                do {
                    anys.a(this.a.s());
                } while (this.a.v() < v);
                d(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.b);
        if (a == 0) {
            do {
                list.add(Long.valueOf(this.a.s()));
                if (this.a.u()) {
                    break;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a == 2) {
            v = this.a.v() + this.a.n();
            do {
                list.add(Long.valueOf(this.a.s()));
            } while (this.a.v() < v);
            d(v);
        } else {
            throw anyg.f();
        }
    }

    private static void b(int i) {
        if ((i & 7) != 0) {
            throw anyg.i();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:19:0x0053, code skipped:
            if (c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Missing block: B:22:0x005b, code skipped:
            throw new defpackage.anyg(r6);
     */
    public final void a(java.util.Map r8, defpackage.anyv r9, defpackage.anxa r10) {
        /*
        r7 = this;
        r0 = 2;
        r7.a(r0);
        r1 = r7.a;
        r1 = r1.n();
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
        r5 = r5.u();	 Catch:{ all -> 0x0065 }
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
        r4 = r7.c();	 Catch:{ anyf -> 0x004f }
        if (r4 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0014;
    L_0x0034:
        r4 = new anyg;	 Catch:{ anyf -> 0x004f }
        r4.<init>(r6);	 Catch:{ anyf -> 0x004f }
        throw r4;	 Catch:{ anyf -> 0x004f }
    L_0x003a:
        r4 = r9.c;	 Catch:{ anyf -> 0x004f }
        r5 = r9.d;	 Catch:{ anyf -> 0x004f }
        r5 = r5.getClass();	 Catch:{ anyf -> 0x004f }
        r3 = r7.a(r4, r5, r10);	 Catch:{ anyf -> 0x004f }
        goto L_0x0014;
    L_0x0047:
        r4 = r9.a;	 Catch:{ anyf -> 0x004f }
        r5 = 0;
        r2 = r7.a(r4, r5, r5);	 Catch:{ anyf -> 0x004f }
        goto L_0x0014;
    L_0x004f:
        r4 = r7.c();	 Catch:{ all -> 0x0065 }
        if (r4 == 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0014;
    L_0x0056:
        r8 = new anyg;	 Catch:{ all -> 0x0065 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwj.a(java.util.Map, anyv, anxa):void");
    }

    private final Object a(aobm aobm, Class cls, anxa anxa) {
        switch (aobm.ordinal()) {
            case 0:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(g());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Integer.valueOf(h());
            case 5:
                return Long.valueOf(i());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return m();
            case 10:
                return a(cls, anxa);
            case 11:
                return n();
            case 12:
                return Integer.valueOf(o());
            case 13:
                return Integer.valueOf(p());
            case 14:
                return Integer.valueOf(q());
            case 15:
                return Long.valueOf(r());
            case 16:
                return Integer.valueOf(s());
            case 17:
                return Long.valueOf(t());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void c(int i) {
        if ((i & 3) != 0) {
            throw anyg.i();
        }
    }

    private final void d(int i) {
        if (this.a.v() != i) {
            throw anyg.a();
        }
    }
}
