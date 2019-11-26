package defpackage;

/* renamed from: azqq */
public final class azqq extends anxo implements anzf {
    private azqq() {
        super(azqr.h);
    }

    public final azpz a() {
        azpz azpz = ((azqr) this.instance).b;
        return azpz == null ? azpz.g : azpz;
    }

    public final azqq a(azpz azpz) {
        copyOnWrite();
        azqr azqr = (azqr) this.instance;
        if (azpz != null) {
            azqr.b = azpz;
            azqr.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final azqq a(azpy azpy) {
        copyOnWrite();
        azqr azqr = (azqr) this.instance;
        azqr.b = (azpz) ((anxl) azpy.build());
        azqr.a |= 1;
        return this;
    }

    public final azqq a(azlk azlk) {
        copyOnWrite();
        azqr azqr = (azqr) this.instance;
        if (azlk != null) {
            azqr.c = azlk;
            azqr.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final azqq a(boolean z) {
        copyOnWrite();
        azqr azqr = (azqr) this.instance;
        azqr.a |= 4;
        azqr.d = z;
        return this;
    }

    public final azqq b(boolean z) {
        copyOnWrite();
        azqr azqr = (azqr) this.instance;
        azqr.a |= 8;
        azqr.e = z;
        return this;
    }

    public final azqq a(anvu anvu) {
        copyOnWrite();
        azqr azqr = (azqr) this.instance;
        if (anvu != null) {
            azqr.a |= 16;
            azqr.g = anvu;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ azqq(byte b) {
        super(azqr.h);
    }
}
