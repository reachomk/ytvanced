package defpackage;

/* renamed from: avqv */
public final class avqv extends anxo implements anzf {
    private avqv() {
        super(avqw.B);
    }

    public final avqv a(String str) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        if (str != null) {
            avqw.a |= 1;
            avqw.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final avqv a(boolean z) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        avqw.a |= 4096;
        avqw.m = z;
        return this;
    }

    public final avqv b(String str) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        if (str != null) {
            avqw.a |= 65536;
            avqw.q = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final avqv a(avsi avsi) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        if (avsi != null) {
            avqw.a |= 131072;
            avqw.r = avsi.k;
            return this;
        }
        throw new NullPointerException();
    }

    public final avqv a(int i) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        avqw.a |= 1048576;
        avqw.t = i;
        return this;
    }

    public final avqv b(boolean z) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        avqw.a |= 4194304;
        avqw.u = z;
        return this;
    }

    public final avqv b(int i) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        avqw.a |= 134217728;
        avqw.w = i;
        return this;
    }

    /* synthetic */ avqv(byte b) {
        super(avqw.B);
    }

    public final avqv c(int i) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        avqw.a |= 8;
        avqw.e = i - 1;
        return this;
    }

    public final avqv d(int i) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        if (i != 0) {
            avqw.a |= 16;
            avqw.f = i - 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final avqv e(int i) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        if (i != 0) {
            avqw.a |= 8192;
            avqw.n = i - 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final avqv f(int i) {
        copyOnWrite();
        avqw avqw = (avqw) this.instance;
        if (i != 0) {
            avqw.a |= 268435456;
            avqw.x = i - 1;
            return this;
        }
        throw new NullPointerException();
    }
}
