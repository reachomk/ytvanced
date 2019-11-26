package defpackage;

/* renamed from: awdf */
public final class awdf extends anxo implements anzf {
    private awdf() {
        super(awdg.J);
    }

    public final arhh a() {
        arhh arhh = ((awdg) this.instance).d;
        return arhh == null ? arhh.bv : arhh;
    }

    public final awdf a(arhh arhh) {
        copyOnWrite();
        awdg awdg = (awdg) this.instance;
        if (arhh != null) {
            awdg.d = arhh;
            awdg.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final awdf a(arhj arhj) {
        copyOnWrite();
        awdg awdg = (awdg) this.instance;
        awdg.d = (arhh) ((anxl) arhj.build());
        awdg.a |= 2;
        return this;
    }

    public final awdf a(aoth aoth) {
        copyOnWrite();
        awdg awdg = (awdg) this.instance;
        if (aoth != null) {
            awdg.j = aoth;
            awdg.a |= 16384;
            return this;
        }
        throw new NullPointerException();
    }

    public final awdf a(avjo avjo) {
        copyOnWrite();
        awdg awdg = (awdg) this.instance;
        if (avjo != null) {
            awdg.k = avjo;
            awdg.a |= 32768;
            return this;
        }
        throw new NullPointerException();
    }

    public final awdf a(axur axur) {
        copyOnWrite();
        awdg awdg = (awdg) this.instance;
        if (axur != null) {
            awdg.B = axur;
            awdg.b |= 1024;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ awdf(byte b) {
        super(awdg.J);
    }
}
