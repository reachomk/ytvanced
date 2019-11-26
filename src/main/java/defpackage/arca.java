package defpackage;

/* renamed from: arca */
public final class arca extends anxo implements anzf {
    private arca() {
        super(arcb.e);
    }

    public final arca a(String str) {
        copyOnWrite();
        arcb arcb = (arcb) this.instance;
        if (str != null) {
            arcb.a |= 4;
            arcb.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ arca(byte b) {
        super(arcb.e);
    }
}
