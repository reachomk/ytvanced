package defpackage;

/* renamed from: bcai */
public final class bcai extends anxo implements anzf {
    private bcai() {
        super(bcaf.d);
    }

    public final bcai a(int i) {
        copyOnWrite();
        bcaf bcaf = (bcaf) this.instance;
        bcaf.a |= 1;
        bcaf.b = i;
        return this;
    }

    public final bcai a(bcah bcah) {
        copyOnWrite();
        bcaf bcaf = (bcaf) this.instance;
        if (bcah != null) {
            bcaf.c = bcah;
            bcaf.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ bcai(byte b) {
        super(bcaf.d);
    }
}
