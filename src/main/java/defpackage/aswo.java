package defpackage;

/* renamed from: aswo */
public final class aswo extends anxo implements anzf {
    private aswo() {
        super(aswl.e);
    }

    public final aswo a(String str) {
        copyOnWrite();
        aswl aswl = (aswl) this.instance;
        if (str != null) {
            aswl.a |= 2;
            aswl.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aswo(byte b) {
        super(aswl.e);
    }
}
