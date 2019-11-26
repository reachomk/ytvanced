package defpackage;

/* renamed from: nkj */
public final class nkj extends anxo implements anzf {
    private nkj() {
        super(nkk.e);
    }

    public final nkj a(boolean z) {
        copyOnWrite();
        nkk nkk = (nkk) this.instance;
        nkk.a |= 1;
        nkk.b = z;
        return this;
    }

    public final nkj b(boolean z) {
        copyOnWrite();
        nkk nkk = (nkk) this.instance;
        nkk.a |= 2;
        nkk.c = z;
        return this;
    }

    public final nkj a(Iterable iterable) {
        copyOnWrite();
        nkk nkk = (nkk) this.instance;
        if (!nkk.d.a()) {
            nkk.d = anxl.mutableCopy(nkk.d);
        }
        anvf.addAll(iterable, nkk.d);
        return this;
    }

    /* synthetic */ nkj(byte b) {
        super(nkk.e);
    }
}
