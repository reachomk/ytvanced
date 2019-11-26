package defpackage;

/* renamed from: aphy */
public final class aphy extends anxo implements anzf {
    private aphy() {
        super(aphv.s);
    }

    public final boolean a() {
        return ((aphv) this.instance).b;
    }

    public final aphy a(boolean z) {
        copyOnWrite();
        aphv aphv = (aphv) this.instance;
        aphv.a |= 8;
        aphv.b = z;
        return this;
    }

    public final boolean b() {
        return (((aphv) this.instance).a & 512) != 0;
    }

    public final apxu c() {
        apxu apxu = ((aphv) this.instance).h;
        return apxu == null ? apxu.d : apxu;
    }

    public final aphy a(apxu apxu) {
        copyOnWrite();
        aphv aphv = (aphv) this.instance;
        if (apxu != null) {
            aphv.h = apxu;
            aphv.a |= 512;
            return this;
        }
        throw new NullPointerException();
    }

    public final boolean d() {
        return (((aphv) this.instance).a & 16384) != 0;
    }

    public final apxu e() {
        apxu apxu = ((aphv) this.instance).m;
        return apxu == null ? apxu.d : apxu;
    }

    public final aphy b(apxu apxu) {
        copyOnWrite();
        aphv aphv = (aphv) this.instance;
        if (apxu != null) {
            aphv.m = apxu;
            aphv.a |= 16384;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aphy(byte b) {
        super(aphv.s);
    }
}
