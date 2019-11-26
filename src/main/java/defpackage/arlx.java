package defpackage;

/* renamed from: arlx */
public final class arlx extends anxq implements anzf {
    private arlx() {
        super(arlv.E);
    }

    public final arlx a(int i) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        arlv.a |= 1;
        arlv.c = i;
        return this;
    }

    public final arlx a(String str) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        if (str != null) {
            arlv.a |= 2;
            arlv.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final arlx b(String str) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        if (str != null) {
            arlv.a |= 16;
            arlv.e = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final arlx b(int i) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        arlv.a |= 32;
        arlv.f = i;
        return this;
    }

    public final arlx c(int i) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        arlv.a |= 128;
        arlv.i = i;
        return this;
    }

    public final arlx d(int i) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        arlv.a |= 256;
        arlv.j = i;
        return this;
    }

    public final arlx a(arma arma) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        arlv.l = (armb) ((anxl) arma.build());
        arlv.a |= 1024;
        return this;
    }

    public final arlx b(arma arma) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        arlv.m = (armb) ((anxl) arma.build());
        arlv.a |= 2048;
        return this;
    }

    public final arlx a(long j) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        arlv.a |= 4096;
        arlv.n = j;
        return this;
    }

    public final arlx b(long j) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        arlv.a |= 8192;
        arlv.o = j;
        return this;
    }

    public final arlx c(String str) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        if (str != null) {
            arlv.a |= 4194304;
            arlv.r = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ arlx(byte b) {
        super(arlv.E);
    }

    public final arlx e(int i) {
        copyOnWrite();
        arlv arlv = (arlv) this.instance;
        arlv.a |= 1048576;
        arlv.q = i - 1;
        return this;
    }
}
