package defpackage;

/* renamed from: asxi */
public final class asxi extends anxo implements anzf {
    private asxi() {
        super(asxf.c);
    }

    public final asxi a(awnx awnx) {
        copyOnWrite();
        asxf asxf = (asxf) this.instance;
        if (awnx != null) {
            asxf.a |= 1;
            asxf.b = awnx.d;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asxi(byte b) {
        super(asxf.c);
    }
}
