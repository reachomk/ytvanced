package defpackage;

/* renamed from: asfd */
public final class asfd extends anxo implements anzf {
    private asfd() {
        super(asfa.f);
    }

    public final asfd a(asdn asdn) {
        copyOnWrite();
        asfa asfa = (asfa) this.instance;
        asfa.c = (asdk) ((anxl) asdn.build());
        asfa.a |= 2;
        return this;
    }

    @Deprecated
    public final asfd a(String str) {
        copyOnWrite();
        asfa asfa = (asfa) this.instance;
        if (str != null) {
            asfa.a |= 4;
            asfa.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final asfd a(asdl asdl) {
        copyOnWrite();
        asfa asfa = (asfa) this.instance;
        asfa.e = (asdi) ((anxl) asdl.build());
        asfa.a |= 8;
        return this;
    }

    /* synthetic */ asfd(byte b) {
        super(asfa.f);
    }
}
