package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: anvq */
final class anvq extends anvn {
    private final boolean a = true;
    private final byte[] b;
    private int c;
    private int d;
    private int e;
    private int f;

    public anvq(ByteBuffer byteBuffer) {
        this.b = byteBuffer.array();
        this.c = byteBuffer.arrayOffset() + byteBuffer.position();
        this.d = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final boolean u() {
        return this.c == this.d;
    }

    public final int a() {
        if (!u()) {
            int v = v();
            this.e = v;
            if (v != this.f) {
                return aobj.b(v);
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int b() {
        return this.e;
    }

    public final boolean c() {
        int i = 0;
        if (!u()) {
            int i2 = this.e;
            if (i2 != this.f) {
                i2 = aobj.a(i2);
                if (i2 == 0) {
                    i2 = this.d;
                    int i3 = this.c;
                    if (i2 - i3 >= 10) {
                        byte[] bArr = this.b;
                        int i4 = i3;
                        i3 = 0;
                        while (i3 < 10) {
                            int i5 = i4 + 1;
                            if (bArr[i4] >= (byte) 0) {
                                this.c = i5;
                                break;
                            }
                            i3++;
                            i4 = i5;
                        }
                    }
                    while (i < 10) {
                        if (y() >= (byte) 0) {
                            return true;
                        }
                        i++;
                    }
                    throw anyg.c();
                } else if (i2 == 1) {
                    a(8);
                    return true;
                } else if (i2 == 2) {
                    a(v());
                    return true;
                } else if (i2 == 3) {
                    i2 = this.f;
                    this.f = aobj.a(aobj.b(this.e), 4);
                    while (a() != Integer.MAX_VALUE) {
                        if (!c()) {
                            break;
                        }
                    }
                    if (this.e == this.f) {
                        this.f = i2;
                        return true;
                    }
                    throw anyg.i();
                } else if (i2 == 5) {
                    a(4);
                    return true;
                } else {
                    throw anyg.f();
                }
            }
        }
        return false;
    }

    public final double d() {
        c(1);
        return Double.longBitsToDouble(A());
    }

    public final float e() {
        c(5);
        return Float.intBitsToFloat(z());
    }

    public final long f() {
        c(0);
        return w();
    }

    public final long g() {
        c(0);
        return w();
    }

    public final int h() {
        c(0);
        return v();
    }

    public final long i() {
        c(1);
        return A();
    }

    public final int j() {
        c(5);
        return z();
    }

    public final boolean k() {
        c(0);
        if (v() != 0) {
            return true;
        }
        return false;
    }

    public final String l() {
        return a(false);
    }

    public final String m() {
        return a(true);
    }

    private final String a(boolean z) {
        c(2);
        int v = v();
        if (v == 0) {
            return "";
        }
        b(v);
        if (z) {
            byte[] bArr = this.b;
            int i = this.c;
            if (!aobd.a(bArr, i, i + v)) {
                throw anyg.j();
            }
        }
        String str = new String(this.b, this.c, v, anxw.a);
        this.c += v;
        return str;
    }

    public final Object a(Class cls, anxa anxa) {
        c(2);
        return c(anzs.a.a(cls), anxa);
    }

    public final Object a(anzz anzz, anxa anxa) {
        c(2);
        return c(anzz, anxa);
    }

    private final Object c(anzz anzz, anxa anxa) {
        Object v = v();
        b((int) v);
        int i = this.d;
        int i2 = this.c + v;
        this.d = i2;
        try {
            v = anzz.a();
            anzz.a(v, this, anxa);
            anzz.c(v);
            if (this.c == i2) {
                return v;
            }
            throw anyg.i();
        } finally {
            this.d = i;
        }
    }

    public final Object b(Class cls, anxa anxa) {
        c(3);
        return d(anzs.a.a(cls), anxa);
    }

    public final Object b(anzz anzz, anxa anxa) {
        c(3);
        return d(anzz, anxa);
    }

    private final Object d(anzz anzz, anxa anxa) {
        int i = this.f;
        Object a = aobj.a(aobj.b(this.e), 4);
        this.f = a;
        try {
            a = anzz.a();
            anzz.a(a, this, anxa);
            anzz.c(a);
            if (this.e == this.f) {
                return a;
            }
            throw anyg.i();
        } finally {
            this.f = i;
        }
    }

    public final anvu n() {
        c(2);
        int v = v();
        if (v == 0) {
            return anvu.a;
        }
        anvu b;
        b(v);
        if (this.a) {
            b = anvu.b(this.b, this.c, v);
        } else {
            b = anvu.a(this.b, this.c, v);
        }
        this.c += v;
        return b;
    }

    public final int o() {
        c(0);
        return v();
    }

    public final int p() {
        c(0);
        return v();
    }

    public final int q() {
        c(5);
        return z();
    }

    public final long r() {
        c(1);
        return A();
    }

    public final int s() {
        c(0);
        return anwf.f(v());
    }

    public final long t() {
        c(0);
        return anwf.a(w());
    }

    public final void a(List list) {
        int a;
        int i;
        if (list instanceof anwt) {
            anwt anwt = (anwt) list;
            a = aobj.a(this.e);
            if (a == 1) {
                do {
                    anwt.a(d());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                a = v();
                d(a);
                i = this.c + a;
                while (this.c < i) {
                    anwt.a(Double.longBitsToDouble(C()));
                }
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 1) {
            do {
                list.add(Double.valueOf(d()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            a = v();
            d(a);
            i = this.c + a;
            while (this.c < i) {
                list.add(Double.valueOf(Double.longBitsToDouble(C())));
            }
        } else {
            throw anyg.f();
        }
    }

    public final void b(List list) {
        int a;
        int i;
        if (list instanceof anxk) {
            anxk anxk = (anxk) list;
            a = aobj.a(this.e);
            if (a == 2) {
                a = v();
                e(a);
                i = this.c + a;
                while (this.c < i) {
                    anxk.a(Float.intBitsToFloat(B()));
                }
            } else if (a == 5) {
                do {
                    anxk.a(e());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 2) {
            a = v();
            e(a);
            i = this.c + a;
            while (this.c < i) {
                list.add(Float.valueOf(Float.intBitsToFloat(B())));
            }
        } else if (a == 5) {
            do {
                list.add(Float.valueOf(e()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else {
            throw anyg.f();
        }
    }

    public final void c(List list) {
        int a;
        int v;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.e);
            if (a == 0) {
                do {
                    anys.a(f());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                v = this.c + v();
                while (this.c < v) {
                    anys.a(w());
                }
                f(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 0) {
            do {
                list.add(Long.valueOf(f()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Long.valueOf(w()));
            }
            f(v);
        } else {
            throw anyg.f();
        }
    }

    public final void d(List list) {
        int a;
        int v;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.e);
            if (a == 0) {
                do {
                    anys.a(g());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                v = this.c + v();
                while (this.c < v) {
                    anys.a(w());
                }
                f(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 0) {
            do {
                list.add(Long.valueOf(g()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Long.valueOf(w()));
            }
            f(v);
        } else {
            throw anyg.f();
        }
    }

    public final void e(List list) {
        int a;
        int v;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.e);
            if (a == 0) {
                do {
                    anxt.d(h());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                v = this.c + v();
                while (this.c < v) {
                    anxt.d(v());
                }
                f(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 0) {
            do {
                list.add(Integer.valueOf(h()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Integer.valueOf(v()));
            }
            f(v);
        } else {
            throw anyg.f();
        }
    }

    public final void f(List list) {
        int a;
        int i;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.e);
            if (a == 1) {
                do {
                    anys.a(i());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                a = v();
                d(a);
                i = this.c + a;
                while (this.c < i) {
                    anys.a(C());
                }
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 1) {
            do {
                list.add(Long.valueOf(i()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            a = v();
            d(a);
            i = this.c + a;
            while (this.c < i) {
                list.add(Long.valueOf(C()));
            }
        } else {
            throw anyg.f();
        }
    }

    public final void g(List list) {
        int a;
        int i;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.e);
            if (a == 2) {
                a = v();
                e(a);
                i = this.c + a;
                while (this.c < i) {
                    anxt.d(B());
                }
            } else if (a == 5) {
                do {
                    anxt.d(j());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 2) {
            a = v();
            e(a);
            i = this.c + a;
            while (this.c < i) {
                list.add(Integer.valueOf(B()));
            }
        } else if (a == 5) {
            do {
                list.add(Integer.valueOf(j()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else {
            throw anyg.f();
        }
    }

    public final void h(List list) {
        int a;
        int v;
        if (list instanceof anvs) {
            anvs anvs = (anvs) list;
            a = aobj.a(this.e);
            if (a == 0) {
                do {
                    anvs.a(k());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                v = this.c + v();
                while (this.c < v) {
                    anvs.a(v() != 0);
                }
                f(v);
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 0) {
            do {
                list.add(Boolean.valueOf(k()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Boolean.valueOf(v() != 0));
            }
            f(v);
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
        if (aobj.a(this.e) != 2) {
            throw anyg.f();
        } else if ((list instanceof anyo) && !z) {
            int i;
            anyo anyo = (anyo) list;
            do {
                anyo.a(n());
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else {
            int i2;
            do {
                list.add(a(z));
                if (u()) {
                    break;
                }
                i2 = this.c;
            } while (v() == this.e);
            this.c = i2;
        }
    }

    public final void a(List list, anzz anzz, anxa anxa) {
        if (aobj.a(this.e) == 2) {
            int i;
            int i2 = this.e;
            do {
                list.add(c(anzz, anxa));
                if (!u()) {
                    i = this.c;
                } else {
                    return;
                }
            } while (v() == i2);
            this.c = i;
            return;
        }
        throw anyg.f();
    }

    public final void b(List list, anzz anzz, anxa anxa) {
        if (aobj.a(this.e) == 3) {
            int i;
            int i2 = this.e;
            do {
                list.add(d(anzz, anxa));
                if (!u()) {
                    i = this.c;
                } else {
                    return;
                }
            } while (v() == i2);
            this.c = i;
            return;
        }
        throw anyg.f();
    }

    public final void k(List list) {
        if (aobj.a(this.e) == 2) {
            int i;
            do {
                list.add(n());
                if (!u()) {
                    i = this.c;
                } else {
                    return;
                }
            } while (v() == this.e);
            this.c = i;
            return;
        }
        throw anyg.f();
    }

    public final void l(List list) {
        int a;
        int v;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.e);
            if (a == 0) {
                do {
                    anxt.d(o());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                v = this.c + v();
                while (this.c < v) {
                    anxt.d(v());
                }
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 0) {
            do {
                list.add(Integer.valueOf(o()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Integer.valueOf(v()));
            }
        } else {
            throw anyg.f();
        }
    }

    public final void m(List list) {
        int a;
        int v;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.e);
            if (a == 0) {
                do {
                    anxt.d(p());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                v = this.c + v();
                while (this.c < v) {
                    anxt.d(v());
                }
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 0) {
            do {
                list.add(Integer.valueOf(p()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Integer.valueOf(v()));
            }
        } else {
            throw anyg.f();
        }
    }

    public final void n(List list) {
        int a;
        int i;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.e);
            if (a == 2) {
                a = v();
                e(a);
                i = this.c + a;
                while (this.c < i) {
                    anxt.d(B());
                }
            } else if (a == 5) {
                do {
                    anxt.d(q());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 2) {
            a = v();
            e(a);
            i = this.c + a;
            while (this.c < i) {
                list.add(Integer.valueOf(B()));
            }
        } else if (a == 5) {
            do {
                list.add(Integer.valueOf(q()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else {
            throw anyg.f();
        }
    }

    public final void o(List list) {
        int a;
        int i;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.e);
            if (a == 1) {
                do {
                    anys.a(r());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                a = v();
                d(a);
                i = this.c + a;
                while (this.c < i) {
                    anys.a(C());
                }
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 1) {
            do {
                list.add(Long.valueOf(r()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            a = v();
            d(a);
            i = this.c + a;
            while (this.c < i) {
                list.add(Long.valueOf(C()));
            }
        } else {
            throw anyg.f();
        }
    }

    public final void p(List list) {
        int a;
        int v;
        if (list instanceof anxt) {
            anxt anxt = (anxt) list;
            a = aobj.a(this.e);
            if (a == 0) {
                do {
                    anxt.d(s());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                v = this.c + v();
                while (this.c < v) {
                    anxt.d(anwf.f(v()));
                }
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 0) {
            do {
                list.add(Integer.valueOf(s()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Integer.valueOf(anwf.f(v())));
            }
        } else {
            throw anyg.f();
        }
    }

    public final void q(List list) {
        int a;
        int v;
        if (list instanceof anys) {
            anys anys = (anys) list;
            a = aobj.a(this.e);
            if (a == 0) {
                do {
                    anys.a(t());
                    if (u()) {
                        break;
                    }
                    a = this.c;
                } while (v() == this.e);
                this.c = a;
                return;
            } else if (a == 2) {
                v = this.c + v();
                while (this.c < v) {
                    anys.a(anwf.a(w()));
                }
            } else {
                throw anyg.f();
            }
        }
        a = aobj.a(this.e);
        if (a == 0) {
            do {
                list.add(Long.valueOf(t()));
                if (u()) {
                    break;
                }
                a = this.c;
            } while (v() == this.e);
            this.c = a;
        } else if (a == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Long.valueOf(anwf.a(w())));
            }
        } else {
            throw anyg.f();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004e */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|(2:21|33)(3:28|22|23)) */
    /* JADX WARNING: Missing block: B:5:0x001f, code skipped:
            r8.put(r1, r3);
     */
    /* JADX WARNING: Missing block: B:20:0x0052, code skipped:
            if (c() != false) goto L_0x0054;
     */
    /* JADX WARNING: Missing block: B:23:0x005a, code skipped:
            throw new defpackage.anyg(r6);
     */
    public final void a(java.util.Map r8, defpackage.anyv r9, defpackage.anxa r10) {
        /*
        r7 = this;
        r0 = 2;
        r7.c(r0);
        r1 = r7.v();
        r7.b(r1);
        r2 = r7.d;
        r3 = r7.c;
        r3 = r3 + r1;
        r7.d = r3;
        r1 = r9.b;	 Catch:{ all -> 0x005b }
        r3 = r9.d;	 Catch:{ all -> 0x005b }
    L_0x0016:
        r4 = r7.a();	 Catch:{ all -> 0x005b }
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 != r5) goto L_0x0025;
    L_0x001f:
        r8.put(r1, r3);	 Catch:{ all -> 0x005b }
        r7.d = r2;
        return;
    L_0x0025:
        r5 = 1;
        r6 = "Unable to parse map entry.";
        if (r4 == r5) goto L_0x0046;
    L_0x002a:
        if (r4 == r0) goto L_0x0039;
    L_0x002c:
        r4 = r7.c();	 Catch:{ anyf -> 0x004e }
        if (r4 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0016;
    L_0x0033:
        r4 = new anyg;	 Catch:{ anyf -> 0x004e }
        r4.<init>(r6);	 Catch:{ anyf -> 0x004e }
        throw r4;	 Catch:{ anyf -> 0x004e }
    L_0x0039:
        r4 = r9.c;	 Catch:{ anyf -> 0x004e }
        r5 = r9.d;	 Catch:{ anyf -> 0x004e }
        r5 = r5.getClass();	 Catch:{ anyf -> 0x004e }
        r3 = r7.a(r4, r5, r10);	 Catch:{ anyf -> 0x004e }
        goto L_0x0016;
    L_0x0046:
        r4 = r9.a;	 Catch:{ anyf -> 0x004e }
        r5 = 0;
        r1 = r7.a(r4, r5, r5);	 Catch:{ anyf -> 0x004e }
        goto L_0x0016;
    L_0x004e:
        r4 = r7.c();	 Catch:{ all -> 0x005b }
        if (r4 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0016;
    L_0x0055:
        r8 = new anyg;	 Catch:{ all -> 0x005b }
        r8.<init>(r6);	 Catch:{ all -> 0x005b }
        throw r8;	 Catch:{ all -> 0x005b }
    L_0x005b:
        r8 = move-exception;
        r7.d = r2;
        goto L_0x0060;
    L_0x005f:
        throw r8;
    L_0x0060:
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anvq.a(java.util.Map, anyv, anxa):void");
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

    private final int v() {
        int i = this.c;
        int i2 = this.d;
        if (i2 != i) {
            byte[] bArr = this.b;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.c = i3;
                return b;
            } else if (i2 - i3 < 9) {
                return (int) x();
            } else {
                i2 = i3 + 1;
                i = b ^ (bArr[i3] << 7);
                if (i >= 0) {
                    i3 = i2 + 1;
                    i ^= bArr[i2] << 14;
                    if (i < 0) {
                        i2 = i3 + 1;
                        i ^= bArr[i3] << 21;
                        if (i >= 0) {
                            i3 = i2 + 1;
                            byte b2 = bArr[i2];
                            i = (i ^ (b2 << 28)) ^ 266354560;
                            if (b2 < (byte) 0) {
                                i2 = i3 + 1;
                                if (bArr[i3] < (byte) 0) {
                                    i3 = i2 + 1;
                                    if (bArr[i2] < (byte) 0) {
                                        i2 = i3 + 1;
                                        if (bArr[i3] < (byte) 0) {
                                            i3 = i2 + 1;
                                            if (bArr[i2] < (byte) 0) {
                                                i2 = i3 + 1;
                                                if (bArr[i3] < (byte) 0) {
                                                    throw anyg.c();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i ^= -2080896;
                    } else {
                        i ^= 16256;
                    }
                    i2 = i3;
                } else {
                    i ^= -128;
                }
                this.c = i2;
                return i;
            }
        }
        throw anyg.a();
    }

    private final long w() {
        int i = this.c;
        int i2 = this.d;
        if (i2 != i) {
            byte[] bArr = this.b;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.c = i3;
                return (long) b;
            } else if (i2 - i3 < 9) {
                return x();
            } else {
                long j;
                i2 = i3 + 1;
                i = b ^ (bArr[i3] << 7);
                if (i >= 0) {
                    i3 = i2 + 1;
                    i ^= bArr[i2] << 14;
                    if (i < 0) {
                        i2 = i3 + 1;
                        i ^= bArr[i3] << 21;
                        if (i >= 0) {
                            long j2;
                            i3 = i2 + 1;
                            j = (((long) bArr[i2]) << 28) ^ ((long) i);
                            if (j < 0) {
                                long j3;
                                int i4 = i3 + 1;
                                j ^= ((long) bArr[i3]) << 35;
                                if (j >= 0) {
                                    i3 = i4 + 1;
                                    j ^= ((long) bArr[i4]) << 42;
                                    if (j < 0) {
                                        i4 = i3 + 1;
                                        j ^= ((long) bArr[i3]) << 49;
                                        if (j >= 0) {
                                            i3 = i4 + 1;
                                            j = (j ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i4 = i3 + 1;
                                                if (((long) bArr[i3]) < 0) {
                                                    throw anyg.c();
                                                }
                                                i3 = i4;
                                            }
                                        } else {
                                            j3 = -558586000294016L;
                                        }
                                    } else {
                                        j2 = 4363953127296L;
                                    }
                                } else {
                                    j3 = -34093383808L;
                                }
                                j ^= j3;
                                i3 = i4;
                            } else {
                                j2 = 266354560;
                            }
                            j ^= j2;
                        } else {
                            i ^= -2080896;
                        }
                    } else {
                        j = (long) (i ^ 16256);
                    }
                    this.c = i3;
                    return j;
                }
                i ^= -128;
                i3 = i2;
                j = (long) i;
                this.c = i3;
                return j;
            }
        }
        throw anyg.a();
    }

    private final long x() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte y = y();
            j |= ((long) (y & 127)) << i;
            if ((y & 128) == 0) {
                return j;
            }
        }
        throw anyg.c();
    }

    private final byte y() {
        int i = this.c;
        if (i != this.d) {
            byte[] bArr = this.b;
            this.c = i + 1;
            return bArr[i];
        }
        throw anyg.a();
    }

    private final int z() {
        b(4);
        return B();
    }

    private final long A() {
        b(8);
        return C();
    }

    private final int B() {
        int i = this.c;
        byte[] bArr = this.b;
        this.c = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    private final long C() {
        int i = this.c;
        byte[] bArr = this.b;
        this.c = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    private final void a(int i) {
        b(i);
        this.c += i;
    }

    private final void b(int i) {
        if (i < 0 || i > this.d - this.c) {
            throw anyg.a();
        }
    }

    private final void c(int i) {
        if (aobj.a(this.e) != i) {
            throw anyg.f();
        }
    }

    private final void d(int i) {
        b(i);
        if ((i & 7) != 0) {
            throw anyg.i();
        }
    }

    private final void e(int i) {
        b(i);
        if ((i & 3) != 0) {
            throw anyg.i();
        }
    }

    private final void f(int i) {
        if (this.c != i) {
            throw anyg.a();
        }
    }
}
