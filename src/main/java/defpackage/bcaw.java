package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bcaw */
public final class bcaw extends anxo implements anzf {
    private bcaw() {
        super(bcat.an);
    }

    public final bcaw a(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 1;
        bcat.c = j;
        return this;
    }

    public final bcaw b(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 2;
        bcat.d = j;
        return this;
    }

    public final bcaw c(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 4;
        bcat.e = j;
        return this;
    }

    public final bcaw d(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 8;
        bcat.f = j;
        return this;
    }

    public final List a() {
        return Collections.unmodifiableList(((bcat) this.instance).g);
    }

    public final int b() {
        return ((bcat) this.instance).g.size();
    }

    public final bcar a(int i) {
        return (bcar) ((bcat) this.instance).g.get(i);
    }

    public final bcaw a(int i, bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        if (bcar != null) {
            bcat.a();
            bcat.g.set(i, bcar);
            return this;
        }
        throw new NullPointerException();
    }

    public final bcaw a(Iterable iterable) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a();
        anvf.addAll(iterable, bcat.g);
        return this;
    }

    public final List c() {
        return Collections.unmodifiableList(((bcat) this.instance).h);
    }

    public final int d() {
        return ((bcat) this.instance).h.size();
    }

    public final bcar b(int i) {
        return (bcar) ((bcat) this.instance).h.get(i);
    }

    public final bcaw b(int i, bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        if (bcar != null) {
            bcat.b();
            bcat.h.set(i, bcar);
            return this;
        }
        throw new NullPointerException();
    }

    public final bcaw b(Iterable iterable) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b();
        anvf.addAll(iterable, bcat.h);
        return this;
    }

    public final List e() {
        return Collections.unmodifiableList(((bcat) this.instance).i);
    }

    public final int f() {
        return ((bcat) this.instance).i.size();
    }

    public final bcar c(int i) {
        return (bcar) ((bcat) this.instance).i.get(i);
    }

    public final bcaw c(int i, bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        if (bcar != null) {
            bcat.c();
            bcat.i.set(i, bcar);
            return this;
        }
        throw new NullPointerException();
    }

    public final bcaw c(Iterable iterable) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.c();
        anvf.addAll(iterable, bcat.i);
        return this;
    }

    public final List g() {
        return Collections.unmodifiableList(((bcat) this.instance).j);
    }

    public final int h() {
        return ((bcat) this.instance).j.size();
    }

    public final bcar d(int i) {
        return (bcar) ((bcat) this.instance).j.get(i);
    }

    public final bcaw d(int i, bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        if (bcar != null) {
            bcat.d();
            bcat.j.set(i, bcar);
            return this;
        }
        throw new NullPointerException();
    }

    public final bcaw d(Iterable iterable) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.d();
        anvf.addAll(iterable, bcat.j);
        return this;
    }

    public final List i() {
        return Collections.unmodifiableList(((bcat) this.instance).k);
    }

    public final int j() {
        return ((bcat) this.instance).k.size();
    }

    public final bcar e(int i) {
        return (bcar) ((bcat) this.instance).k.get(i);
    }

    public final bcaw e(int i, bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        if (bcar != null) {
            bcat.e();
            bcat.k.set(i, bcar);
            return this;
        }
        throw new NullPointerException();
    }

    public final bcaw e(Iterable iterable) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.e();
        anvf.addAll(iterable, bcat.k);
        return this;
    }

    public final List k() {
        return Collections.unmodifiableList(((bcat) this.instance).l);
    }

    public final int l() {
        return ((bcat) this.instance).l.size();
    }

    public final bcar f(int i) {
        return (bcar) ((bcat) this.instance).l.get(i);
    }

    public final bcaw f(int i, bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        if (bcar != null) {
            bcat.f();
            bcat.l.set(i, bcar);
            return this;
        }
        throw new NullPointerException();
    }

    public final bcaw f(Iterable iterable) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.f();
        anvf.addAll(iterable, bcat.l);
        return this;
    }

    public final bcaw a(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.m = bcar;
        bcat.a |= 16;
        return this;
    }

    public final List m() {
        return Collections.unmodifiableList(((bcat) this.instance).n);
    }

    public final int n() {
        return ((bcat) this.instance).n.size();
    }

    public final bcar g(int i) {
        return (bcar) ((bcat) this.instance).n.get(i);
    }

    public final bcaw g(int i, bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        if (bcar != null) {
            bcat.g();
            bcat.n.set(i, bcar);
            return this;
        }
        throw new NullPointerException();
    }

    public final bcaw g(Iterable iterable) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.g();
        anvf.addAll(iterable, bcat.n);
        return this;
    }

    public final bcaw h(Iterable iterable) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        if (!bcat.p.a()) {
            bcat.p = anxl.mutableCopy(bcat.p);
        }
        anvf.addAll(iterable, bcat.p);
        return this;
    }

    public final bcaw i(Iterable iterable) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        if (!bcat.q.a()) {
            bcat.q = anxl.mutableCopy(bcat.q);
        }
        anvf.addAll(iterable, bcat.q);
        return this;
    }

    public final bcaw e(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 32;
        bcat.r = j;
        return this;
    }

    public final bcaw f(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 64;
        bcat.s = j;
        return this;
    }

    public final bcaw g(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 128;
        bcat.t = j;
        return this;
    }

    public final bcaw h(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 256;
        bcat.u = j;
        return this;
    }

    public final bcaw i(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 512;
        bcat.v = j;
        return this;
    }

    public final bcaw j(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 1024;
        bcat.w = j;
        return this;
    }

    public final bcaw k(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 2048;
        bcat.x = j;
        return this;
    }

    public final bcaw l(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 4096;
        bcat.y = j;
        return this;
    }

    public final bcaw m(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 8192;
        bcat.z = j;
        return this;
    }

    public final bcaw n(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 16384;
        bcat.A = j;
        return this;
    }

    public final bcaw o(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 32768;
        bcat.B = j;
        return this;
    }

    public final bcaw p(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 65536;
        bcat.C = j;
        return this;
    }

    public final bcaw q(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 131072;
        bcat.D = j;
        return this;
    }

    public final bcaw r(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 262144;
        bcat.E = j;
        return this;
    }

    public final bcaw b(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.F = bcar;
        bcat.a |= 524288;
        return this;
    }

    public final bcaw s(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.a |= 1048576;
        bcat.G = j;
        return this;
    }

    public final bcaw c(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.H = bcar;
        bcat.a |= 2097152;
        return this;
    }

    public final bcaw d(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.I = bcar;
        bcat.a |= 4194304;
        return this;
    }

    public final bcaw e(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.J = bcar;
        bcat.a |= 8388608;
        return this;
    }

    public final bcaw f(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.K = bcar;
        bcat.a |= 16777216;
        return this;
    }

    public final bcaw g(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.L = bcar;
        bcat.a |= 33554432;
        return this;
    }

    public final bcaw h(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.M = bcar;
        bcat.a |= 67108864;
        return this;
    }

    public final bcaw i(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.N = bcar;
        bcat.a |= 134217728;
        return this;
    }

    public final bcaw j(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.O = bcar;
        bcat.a |= 268435456;
        return this;
    }

    public final bcaw k(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.P = bcar;
        bcat.a |= 536870912;
        return this;
    }

    public final bcaw l(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.Q = bcar;
        bcat.a |= 1073741824;
        return this;
    }

    public final bcaw m(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.R = bcar;
        bcat.a |= aocf.UNSET_ENUM_VALUE;
        return this;
    }

    public final bcaw n(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.S = bcar;
        bcat.b |= 1;
        return this;
    }

    public final bcaw o(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.T = bcar;
        bcat.b |= 2;
        return this;
    }

    public final bcaw t(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 4;
        bcat.U = j;
        return this;
    }

    public final bcaw u(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 8;
        bcat.V = j;
        return this;
    }

    public final bcaw v(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 16;
        bcat.W = j;
        return this;
    }

    public final bcaw w(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 32;
        bcat.X = j;
        return this;
    }

    public final bcaw x(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 64;
        bcat.Y = j;
        return this;
    }

    public final bcaw y(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 128;
        bcat.Z = j;
        return this;
    }

    public final bcaw z(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 256;
        bcat.aa = j;
        return this;
    }

    public final bcaw A(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 512;
        bcat.ab = j;
        return this;
    }

    public final bcaw B(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 1024;
        bcat.ac = j;
        return this;
    }

    public final bcaw C(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 2048;
        bcat.ad = j;
        return this;
    }

    public final bcaw D(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 4096;
        bcat.ae = j;
        return this;
    }

    public final bcaw E(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 8192;
        bcat.af = j;
        return this;
    }

    public final bcaw F(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 16384;
        bcat.ag = j;
        return this;
    }

    public final bcaw G(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 32768;
        bcat.ah = j;
        return this;
    }

    public final bcaw H(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 65536;
        bcat.ai = j;
        return this;
    }

    public final bcaw p(bcar bcar) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.aj = bcar;
        bcat.b |= 131072;
        return this;
    }

    public final bcaw I(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 262144;
        bcat.ak = j;
        return this;
    }

    public final bcaw J(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 524288;
        bcat.al = j;
        return this;
    }

    public final bcaw K(long j) {
        copyOnWrite();
        bcat bcat = (bcat) this.instance;
        bcat.b |= 1048576;
        bcat.am = j;
        return this;
    }

    /* synthetic */ bcaw(byte b) {
        super(bcat.an);
    }
}
