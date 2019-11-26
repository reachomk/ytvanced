package defpackage;

/* renamed from: ashn */
public final class ashn extends anxo implements anzf {
    private ashn() {
        super(ashl.O);
    }

    public final ashn a(String str) {
        copyOnWrite();
        ashl ashl = (ashl) this.instance;
        if (str != null) {
            ashl.a |= 16;
            ashl.h = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final ashn a(ashr ashr) {
        copyOnWrite();
        ashl ashl = (ashl) this.instance;
        if (ashr != null) {
            ashl.a |= 16777216;
            ashl.n = ashr.g;
            return this;
        }
        throw new NullPointerException();
    }

    public final ashn b(String str) {
        copyOnWrite();
        ashl ashl = (ashl) this.instance;
        if (str != null) {
            ashl.a |= 67108864;
            ashl.p = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ ashn(byte b) {
        super(ashl.O);
    }

    public final ashn a(int i) {
        copyOnWrite();
        ashl ashl = (ashl) this.instance;
        ashl.c |= 32;
        ashl.N = i - 1;
        return this;
    }
}
