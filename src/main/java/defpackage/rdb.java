package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: rdb */
final class rdb extends rcz {
    private final boolean a = true;
    private final byte[] b;
    private int c;
    private int d;
    private int e;
    private int f;

    public rdb(ByteBuffer byteBuffer) {
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
                return v >>> 3;
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
            int i3 = this.f;
            if (i2 != i3) {
                int i4 = i2 & 7;
                if (i4 == 0) {
                    i2 = this.d;
                    i3 = this.c;
                    if (i2 - i3 >= 10) {
                        byte[] bArr = this.b;
                        int i5 = i3;
                        i3 = 0;
                        while (i3 < 10) {
                            int i6 = i5 + 1;
                            if (bArr[i5] >= (byte) 0) {
                                this.c = i6;
                                break;
                            }
                            i3++;
                            i5 = i6;
                        }
                    }
                    while (i < 10) {
                        if (y() >= (byte) 0) {
                            return true;
                        }
                        i++;
                    }
                    throw rfk.c();
                } else if (i4 == 1) {
                    a(8);
                    return true;
                } else if (i4 == 2) {
                    a(v());
                    return true;
                } else if (i4 == 3) {
                    this.f = ((i2 >>> 3) << 3) | 4;
                    while (a() != Integer.MAX_VALUE) {
                        if (!c()) {
                            break;
                        }
                    }
                    if (this.e == this.f) {
                        this.f = i3;
                        return true;
                    }
                    throw rfk.h();
                } else if (i4 == 5) {
                    a(4);
                    return true;
                } else {
                    throw rfk.f();
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
            if (!rib.a(bArr, i, i + v)) {
                throw rfk.i();
            }
        }
        String str = new String(this.b, this.c, v, rfc.a);
        this.c += v;
        return str;
    }

    public final Object a(Class cls, reg reg) {
        c(2);
        return c(rgw.a.a(cls), reg);
    }

    public final Object a(rha rha, reg reg) {
        c(2);
        return c(rha, reg);
    }

    private final Object c(rha rha, reg reg) {
        Object v = v();
        b((int) v);
        int i = this.d;
        int i2 = this.c + v;
        this.d = i2;
        try {
            v = rha.a();
            rha.a(v, this, reg);
            rha.c(v);
            if (this.c == i2) {
                return v;
            }
            throw rfk.h();
        } finally {
            this.d = i;
        }
    }

    public final Object b(Class cls, reg reg) {
        c(3);
        return d(rgw.a.a(cls), reg);
    }

    public final Object b(rha rha, reg reg) {
        c(3);
        return d(rha, reg);
    }

    private final Object d(rha rha, reg reg) {
        int i = this.f;
        Object obj = ((this.e >>> 3) << 3) | 4;
        this.f = obj;
        try {
            obj = rha.a();
            rha.a(obj, this, reg);
            rha.c(obj);
            if (this.e == this.f) {
                return obj;
            }
            throw rfk.h();
        } finally {
            this.f = i;
        }
    }

    public final rdg n() {
        c(2);
        int v = v();
        if (v == 0) {
            return rdg.a;
        }
        rdg b;
        b(v);
        if (this.a) {
            b = rdg.b(this.b, this.c, v);
        } else {
            b = rdg.a(this.b, this.c, v);
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
        return rdp.f(v());
    }

    public final long t() {
        c(0);
        return rdp.a(w());
    }

    public final void a(List list) {
        int i;
        int i2;
        if (list instanceof rec) {
            rec rec = (rec) list;
            i = this.e & 7;
            if (i == 1) {
                do {
                    rec.a(d());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                i = v();
                d(i);
                i2 = this.c + i;
                while (this.c < i2) {
                    rec.a(Double.longBitsToDouble(C()));
                }
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 1) {
            do {
                list.add(Double.valueOf(d()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            i = v();
            d(i);
            i2 = this.c + i;
            while (this.c < i2) {
                list.add(Double.valueOf(Double.longBitsToDouble(C())));
            }
        } else {
            throw rfk.f();
        }
    }

    public final void b(List list) {
        int i;
        int i2;
        if (list instanceof rep) {
            rep rep = (rep) list;
            i = this.e & 7;
            if (i == 2) {
                i = v();
                e(i);
                i2 = this.c + i;
                while (this.c < i2) {
                    rep.a(Float.intBitsToFloat(B()));
                }
                return;
            } else if (i == 5) {
                do {
                    rep.a(e());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 2) {
            i = v();
            e(i);
            i2 = this.c + i;
            while (this.c < i2) {
                list.add(Float.valueOf(Float.intBitsToFloat(B())));
            }
        } else if (i == 5) {
            do {
                list.add(Float.valueOf(e()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else {
            throw rfk.f();
        }
    }

    public final void c(List list) {
        int i;
        int v;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.e & 7;
            if (i == 0) {
                do {
                    rfw.a(f());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                v = this.c + v();
                while (this.c < v) {
                    rfw.a(w());
                }
                f(v);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(f()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Long.valueOf(w()));
            }
            f(v);
        } else {
            throw rfk.f();
        }
    }

    public final void d(List list) {
        int i;
        int v;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.e & 7;
            if (i == 0) {
                do {
                    rfw.a(g());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                v = this.c + v();
                while (this.c < v) {
                    rfw.a(w());
                }
                f(v);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(g()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Long.valueOf(w()));
            }
            f(v);
        } else {
            throw rfk.f();
        }
    }

    public final void e(List list) {
        int i;
        int v;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.e & 7;
            if (i == 0) {
                do {
                    rez.c(h());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                v = this.c + v();
                while (this.c < v) {
                    rez.c(v());
                }
                f(v);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(h()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Integer.valueOf(v()));
            }
            f(v);
        } else {
            throw rfk.f();
        }
    }

    public final void f(List list) {
        int i;
        int i2;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.e & 7;
            if (i == 1) {
                do {
                    rfw.a(i());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                i = v();
                d(i);
                i2 = this.c + i;
                while (this.c < i2) {
                    rfw.a(C());
                }
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(i()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            i = v();
            d(i);
            i2 = this.c + i;
            while (this.c < i2) {
                list.add(Long.valueOf(C()));
            }
        } else {
            throw rfk.f();
        }
    }

    public final void g(List list) {
        int i;
        int i2;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.e & 7;
            if (i == 2) {
                i = v();
                e(i);
                i2 = this.c + i;
                while (this.c < i2) {
                    rez.c(B());
                }
                return;
            } else if (i == 5) {
                do {
                    rez.c(j());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 2) {
            i = v();
            e(i);
            i2 = this.c + i;
            while (this.c < i2) {
                list.add(Integer.valueOf(B()));
            }
        } else if (i == 5) {
            do {
                list.add(Integer.valueOf(j()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else {
            throw rfk.f();
        }
    }

    public final void h(List list) {
        int i;
        int v;
        if (list instanceof rde) {
            rde rde = (rde) list;
            i = this.e & 7;
            if (i == 0) {
                do {
                    rde.a(k());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                v = this.c + v();
                while (this.c < v) {
                    rde.a(v() != 0);
                }
                f(v);
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(k()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Boolean.valueOf(v() != 0));
            }
            f(v);
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
        if ((this.e & 7) != 2) {
            throw rfk.f();
        } else if ((list instanceof rfs) && !z) {
            int i;
            rfs rfs = (rfs) list;
            do {
                rfs.a(n());
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

    public final void a(List list, rha rha, reg reg) {
        int i = this.e;
        if ((i & 7) == 2) {
            int i2;
            do {
                list.add(c(rha, reg));
                if (!u()) {
                    i2 = this.c;
                } else {
                    return;
                }
            } while (v() == i);
            this.c = i2;
            return;
        }
        throw rfk.f();
    }

    public final void b(List list, rha rha, reg reg) {
        int i = this.e;
        if ((i & 7) == 3) {
            int i2;
            do {
                list.add(d(rha, reg));
                if (!u()) {
                    i2 = this.c;
                } else {
                    return;
                }
            } while (v() == i);
            this.c = i2;
            return;
        }
        throw rfk.f();
    }

    public final void k(List list) {
        if ((this.e & 7) == 2) {
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
        throw rfk.f();
    }

    public final void l(List list) {
        int i;
        int v;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.e & 7;
            if (i == 0) {
                do {
                    rez.c(o());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                v = this.c + v();
                while (this.c < v) {
                    rez.c(v());
                }
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(o()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Integer.valueOf(v()));
            }
        } else {
            throw rfk.f();
        }
    }

    public final void m(List list) {
        int i;
        int v;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.e & 7;
            if (i == 0) {
                do {
                    rez.c(p());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                v = this.c + v();
                while (this.c < v) {
                    rez.c(v());
                }
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(p()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Integer.valueOf(v()));
            }
        } else {
            throw rfk.f();
        }
    }

    public final void n(List list) {
        int i;
        int i2;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.e & 7;
            if (i == 2) {
                i = v();
                e(i);
                i2 = this.c + i;
                while (this.c < i2) {
                    rez.c(B());
                }
                return;
            } else if (i == 5) {
                do {
                    rez.c(q());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 2) {
            i = v();
            e(i);
            i2 = this.c + i;
            while (this.c < i2) {
                list.add(Integer.valueOf(B()));
            }
        } else if (i == 5) {
            do {
                list.add(Integer.valueOf(q()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else {
            throw rfk.f();
        }
    }

    public final void o(List list) {
        int i;
        int i2;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.e & 7;
            if (i == 1) {
                do {
                    rfw.a(r());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                i = v();
                d(i);
                i2 = this.c + i;
                while (this.c < i2) {
                    rfw.a(C());
                }
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(r()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            i = v();
            d(i);
            i2 = this.c + i;
            while (this.c < i2) {
                list.add(Long.valueOf(C()));
            }
        } else {
            throw rfk.f();
        }
    }

    public final void p(List list) {
        int i;
        int v;
        if (list instanceof rez) {
            rez rez = (rez) list;
            i = this.e & 7;
            if (i == 0) {
                do {
                    rez.c(s());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                v = this.c + v();
                while (this.c < v) {
                    rez.c(rdp.f(v()));
                }
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(s()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Integer.valueOf(rdp.f(v())));
            }
        } else {
            throw rfk.f();
        }
    }

    public final void q(List list) {
        int i;
        int v;
        if (list instanceof rfw) {
            rfw rfw = (rfw) list;
            i = this.e & 7;
            if (i == 0) {
                do {
                    rfw.a(t());
                    if (u()) {
                        break;
                    }
                    i = this.c;
                } while (v() == this.e);
                this.c = i;
                return;
            } else if (i == 2) {
                v = this.c + v();
                while (this.c < v) {
                    rfw.a(rdp.a(w()));
                }
                return;
            } else {
                throw rfk.f();
            }
        }
        i = this.e & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(t()));
                if (u()) {
                    break;
                }
                i = this.c;
            } while (v() == this.e);
            this.c = i;
        } else if (i == 2) {
            v = this.c + v();
            while (this.c < v) {
                list.add(Long.valueOf(rdp.a(w())));
            }
        } else {
            throw rfk.f();
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
            throw new defpackage.rfk(r6);
     */
    public final void a(java.util.Map r8, defpackage.rfz r9, defpackage.reg r10) {
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
        r4 = r7.c();	 Catch:{ rfj -> 0x004e }
        if (r4 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0016;
    L_0x0033:
        r4 = new rfk;	 Catch:{ rfj -> 0x004e }
        r4.<init>(r6);	 Catch:{ rfj -> 0x004e }
        throw r4;	 Catch:{ rfj -> 0x004e }
    L_0x0039:
        r4 = r9.c;	 Catch:{ rfj -> 0x004e }
        r5 = r9.d;	 Catch:{ rfj -> 0x004e }
        r5 = r5.getClass();	 Catch:{ rfj -> 0x004e }
        r3 = r7.a(r4, r5, r10);	 Catch:{ rfj -> 0x004e }
        goto L_0x0016;
    L_0x0046:
        r4 = r9.a;	 Catch:{ rfj -> 0x004e }
        r5 = 0;
        r1 = r7.a(r4, r5, r5);	 Catch:{ rfj -> 0x004e }
        goto L_0x0016;
    L_0x004e:
        r4 = r7.c();	 Catch:{ all -> 0x005b }
        if (r4 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0016;
    L_0x0055:
        r8 = new rfk;	 Catch:{ all -> 0x005b }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdb.a(java.util.Map, rfz, reg):void");
    }

    private final Object a(rii rii, Class cls, reg reg) {
        switch (rii) {
            case BOOL:
                return Boolean.valueOf(k());
            case BYTES:
                return n();
            case DOUBLE:
                return Double.valueOf(d());
            case ENUM:
                return Integer.valueOf(p());
            case FIXED32:
                return Integer.valueOf(j());
            case FIXED64:
                return Long.valueOf(i());
            case FLOAT:
                return Float.valueOf(e());
            case INT32:
                return Integer.valueOf(h());
            case INT64:
                return Long.valueOf(g());
            case MESSAGE:
                return a(cls, reg);
            case SFIXED32:
                return Integer.valueOf(q());
            case SFIXED64:
                return Long.valueOf(r());
            case SINT32:
                return Integer.valueOf(s());
            case SINT64:
                return Long.valueOf(t());
            case STRING:
                return a(true);
            case UINT32:
                return Integer.valueOf(o());
            case UINT64:
                return Long.valueOf(f());
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
                                                    throw rfk.c();
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
        throw rfk.a();
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
                                                    throw rfk.c();
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
        throw rfk.a();
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
        throw rfk.c();
    }

    private final byte y() {
        int i = this.c;
        if (i != this.d) {
            byte[] bArr = this.b;
            this.c = i + 1;
            return bArr[i];
        }
        throw rfk.a();
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
            throw rfk.a();
        }
    }

    private final void c(int i) {
        if ((this.e & 7) != i) {
            throw rfk.f();
        }
    }

    private final void d(int i) {
        b(i);
        if ((i & 7) != 0) {
            throw rfk.h();
        }
    }

    private final void e(int i) {
        b(i);
        if ((i & 3) != 0) {
            throw rfk.h();
        }
    }

    private final void f(int i) {
        if (this.c != i) {
            throw rfk.a();
        }
    }
}
