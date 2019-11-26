package defpackage;

/* renamed from: aphf */
public final class aphf extends anxq implements anzf {
    private aphf() {
        super(aphg.s);
    }

    public final aphf a(arwe arwe) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        aphg.e = (arwf) ((anxl) arwe.build());
        aphg.a |= 16;
        return this;
    }

    public final aphf a(boolean z) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        aphg.a |= 32;
        aphg.f = z;
        return this;
    }

    public final aphf a(arml arml) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        if (arml != null) {
            aphg.g = arml;
            aphg.a |= 128;
            return this;
        }
        throw new NullPointerException();
    }

    public final boolean a() {
        return (((aphg) this.instance).a & 2048) != 0;
    }

    public final aphf a(apxu apxu) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        if (apxu != null) {
            aphg.l = apxu;
            aphg.a |= 2048;
            return this;
        }
        throw new NullPointerException();
    }

    public final aphf a(apxx apxx) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        aphg.l = (apxu) ((anxl) apxx.build());
        aphg.a |= 2048;
        return this;
    }

    public final apxu b() {
        apxu apxu = ((aphg) this.instance).m;
        return apxu == null ? apxu.d : apxu;
    }

    public final aphf b(apxu apxu) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        if (apxu != null) {
            aphg.m = apxu;
            aphg.a |= 4096;
            return this;
        }
        throw new NullPointerException();
    }

    public final aphf b(apxx apxx) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        aphg.m = (apxu) ((anxl) apxx.build());
        aphg.a |= 4096;
        return this;
    }

    public final apxu c() {
        apxu apxu = ((aphg) this.instance).n;
        return apxu == null ? apxu.d : apxu;
    }

    public final aphf c(apxu apxu) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        if (apxu != null) {
            aphg.n = apxu;
            aphg.a |= 8192;
            return this;
        }
        throw new NullPointerException();
    }

    public final anvu d() {
        return ((aphg) this.instance).r;
    }

    /* synthetic */ aphf(byte b) {
        super(aphg.s);
    }

    public final aphf a(int i) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        aphg.b = 1;
        aphg.c = Integer.valueOf(i - 1);
        return this;
    }

    public final aphf b(int i) {
        copyOnWrite();
        aphg aphg = (aphg) this.instance;
        aphg.a |= 8;
        aphg.d = 3;
        return this;
    }
}
