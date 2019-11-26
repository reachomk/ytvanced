package defpackage;

/* renamed from: aphm */
public final class aphm extends anxo implements anzf {
    private aphm() {
        super(aphj.d);
    }

    public final aphm a(aphg aphg) {
        copyOnWrite();
        aphj aphj = (aphj) this.instance;
        if (aphg != null) {
            aphj.b = aphg;
            aphj.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final aphm a(aphf aphf) {
        copyOnWrite();
        aphj aphj = (aphj) this.instance;
        aphj.b = (aphg) ((anxl) aphf.build());
        aphj.a |= 1;
        return this;
    }

    public final aphm a(aphv aphv) {
        copyOnWrite();
        aphj aphj = (aphj) this.instance;
        if (aphv != null) {
            aphj.c = aphv;
            aphj.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aphm(byte b) {
        super(aphj.d);
    }
}
