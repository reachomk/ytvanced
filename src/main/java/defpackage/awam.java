package defpackage;

/* renamed from: awam */
public final class awam extends anxo implements anzf {
    private awam() {
        super(awan.s);
    }

    public final awam a(int i) {
        copyOnWrite();
        awan awan = (awan) this.instance;
        awan.a |= 4;
        awan.c = i;
        return this;
    }

    public final awam a(long j) {
        copyOnWrite();
        awan awan = (awan) this.instance;
        awan.a |= 8;
        awan.d = j;
        return this;
    }

    public final awam b(int i) {
        copyOnWrite();
        awan awan = (awan) this.instance;
        awan.a |= 16;
        awan.e = i;
        return this;
    }

    public final awam c(int i) {
        copyOnWrite();
        awan awan = (awan) this.instance;
        awan.a |= 32;
        awan.f = i;
        return this;
    }

    public final awam d(int i) {
        copyOnWrite();
        awan awan = (awan) this.instance;
        awan.a |= 64;
        awan.g = i;
        return this;
    }

    public final awam a(String str) {
        copyOnWrite();
        awan awan = (awan) this.instance;
        if (str != null) {
            awan.a |= 16384;
            awan.n = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final awam a(arkk arkk) {
        copyOnWrite();
        awan awan = (awan) this.instance;
        awan.o = (arkl) ((anxl) arkk.build());
        awan.a |= 4194304;
        return this;
    }

    /* synthetic */ awam(byte b) {
        super(awan.s);
    }
}
