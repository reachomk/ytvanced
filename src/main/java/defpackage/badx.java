package defpackage;

/* renamed from: badx */
public final class badx extends anxo implements anzf {
    private badx() {
        super(badu.d);
    }

    public final badx a(String str) {
        copyOnWrite();
        badu badu = (badu) this.instance;
        if (str != null) {
            badu.a |= 1;
            badu.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ badx(byte b) {
        super(badu.d);
    }

    public final badx a(int i) {
        copyOnWrite();
        badu badu = (badu) this.instance;
        badu.a |= 2;
        badu.c = i;
        return this;
    }
}
