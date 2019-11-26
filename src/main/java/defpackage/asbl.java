package defpackage;

/* renamed from: asbl */
public final class asbl extends anxo implements anzf {
    private asbl() {
        super(asbi.b);
    }

    public final asbl a(Iterable iterable) {
        copyOnWrite();
        asbi asbi = (asbi) this.instance;
        if (!asbi.a.a()) {
            asbi.a = anxl.mutableCopy(asbi.a);
        }
        anvf.addAll(iterable, asbi.a);
        return this;
    }

    /* synthetic */ asbl(byte b) {
        super(asbi.b);
    }
}
