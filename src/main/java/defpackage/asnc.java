package defpackage;

/* renamed from: asnc */
public final class asnc extends anxo implements anzf {
    private asnc() {
        super(asnd.g);
    }

    public final asnc a(Iterable iterable) {
        copyOnWrite();
        asnd asnd = (asnd) this.instance;
        if (!asnd.e.a()) {
            asnd.e = anxl.mutableCopy(asnd.e);
        }
        anvf.addAll(iterable, asnd.e);
        return this;
    }

    /* synthetic */ asnc(byte b) {
        super(asnd.g);
    }
}
