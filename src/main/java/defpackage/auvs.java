package defpackage;

/* renamed from: auvs */
public final class auvs extends anxo implements anzf {
    private auvs() {
        super(auvp.h);
    }

    public final auvs a(arml arml) {
        copyOnWrite();
        auvp auvp = (auvp) this.instance;
        if (arml != null) {
            auvp.b = arml;
            auvp.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final auvs a(apxu apxu) {
        copyOnWrite();
        auvp auvp = (auvp) this.instance;
        if (apxu != null) {
            auvp.e = apxu;
            auvp.a |= 8;
            return this;
        }
        throw new NullPointerException();
    }

    public final auvs a(apxx apxx) {
        copyOnWrite();
        auvp auvp = (auvp) this.instance;
        auvp.e = (apxu) ((anxl) apxx.build());
        auvp.a |= 8;
        return this;
    }

    /* synthetic */ auvs(byte b) {
        super(auvp.h);
    }
}
