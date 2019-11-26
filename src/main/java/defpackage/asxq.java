package defpackage;

/* renamed from: asxq */
public final class asxq extends anxo implements anzf {
    private asxq() {
        super(asxn.c);
    }

    public final asxq a(String str) {
        copyOnWrite();
        asxn asxn = (asxn) this.instance;
        if (str != null) {
            asxn.a |= 1;
            asxn.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asxq(byte b) {
        super(asxn.c);
    }
}
