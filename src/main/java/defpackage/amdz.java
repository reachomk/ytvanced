package defpackage;

/* renamed from: amdz */
public final class amdz extends anxo implements anzf {
    private amdz() {
        super(amea.U);
    }

    public final amdz a(String str) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (str != null) {
            amea.a |= 1;
            amea.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz b(String str) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (str != null) {
            amea.a |= 2;
            amea.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz a(long j) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        amea.a |= 4;
        amea.e = j;
        return this;
    }

    public final amdz a(ameo ameo) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (ameo != null) {
            amea.f = ameo;
            amea.a |= 8;
            return this;
        }
        throw new NullPointerException();
    }

    public final String a() {
        return ((amea) this.instance).g;
    }

    public final amdz c(String str) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (str != null) {
            amea.a |= 16;
            amea.g = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final amec b() {
        amec amec = ((amea) this.instance).m;
        return amec == null ? amec.g : amec;
    }

    public final amdz a(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.m = amec;
            amea.a |= 4096;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz a(amdl amdl) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amdl != null) {
            amea.n = amdl;
            amea.a |= 8192;
            return this;
        }
        throw new NullPointerException();
    }

    public final amec c() {
        amec amec = ((amea) this.instance).o;
        return amec == null ? amec.g : amec;
    }

    public final amdz b(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.o = amec;
            amea.a |= 16384;
            return this;
        }
        throw new NullPointerException();
    }

    public final boolean d() {
        return (((amea) this.instance).a & 262144) != 0;
    }

    public final amec e() {
        amec amec = ((amea) this.instance).s;
        return amec == null ? amec.g : amec;
    }

    public final amdz c(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.s = amec;
            amea.a |= 262144;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz a(ameb ameb) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        amea.s = (amec) ((anxl) ameb.build());
        amea.a |= 262144;
        return this;
    }

    public final amdz d(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.t = amec;
            amea.a |= 524288;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz e(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.u = amec;
            amea.a |= 1048576;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz f(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.v = amec;
            amea.a |= 2097152;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz g(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.w = amec;
            amea.a |= 4194304;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz f() {
        copyOnWrite();
        amea amea = (amea) this.instance;
        amea.a |= 33554432;
        amea.C = true;
        return this;
    }

    public final amdz d(String str) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (str != null) {
            amea.a |= 268435456;
            amea.F = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz e(String str) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (str != null) {
            amea.a |= 536870912;
            amea.G = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz h(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.I = amec;
            amea.a |= aocf.UNSET_ENUM_VALUE;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz i(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.J = amec;
            amea.b |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz j(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.K = amec;
            amea.b |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final boolean g() {
        return ((amea) this.instance).L;
    }

    public final boolean h() {
        return ((amea) this.instance).M;
    }

    public final amdz a(boolean z) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        amea.b |= 8;
        amea.M = z;
        return this;
    }

    public final amdz k(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.N = amec;
            amea.b |= 16;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz l(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.O = amec;
            amea.b |= 32;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz f(String str) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (str != null) {
            amea.b |= 64;
            amea.P = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz m(amec amec) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amec != null) {
            amea.Q = amec;
            amea.b |= 128;
            return this;
        }
        throw new NullPointerException();
    }

    public final amdz a(amdr amdr) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        if (amdr != null) {
            amea.S = amdr;
            amea.b |= 512;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ amdz(byte b) {
        super(amea.U);
    }

    public final amdz a(int i) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        amea.a |= 32;
        amea.h = i - 1;
        return this;
    }

    public final amdz b(int i) {
        copyOnWrite();
        amea amea = (amea) this.instance;
        amea.a |= 1073741824;
        amea.H = i - 1;
        return this;
    }
}
