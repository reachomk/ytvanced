package defpackage;

/* renamed from: asxo */
public final class asxo extends anxo implements anzf {
    private asxo() {
        super(asxl.b);
    }

    public final asxo a(Iterable iterable) {
        copyOnWrite();
        asxl asxl = (asxl) this.instance;
        if (!asxl.a.a()) {
            asxl.a = anxl.mutableCopy(asxl.a);
        }
        anvf.addAll(iterable, asxl.a);
        return this;
    }

    /* synthetic */ asxo(byte b) {
        super(asxl.b);
    }
}
