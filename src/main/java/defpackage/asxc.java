package defpackage;

/* renamed from: asxc */
public final class asxc extends anxo implements anzf {
    private asxc() {
        super(aswz.g);
    }

    public final asxc a(String str) {
        copyOnWrite();
        aswz aswz = (aswz) this.instance;
        if (str != null) {
            aswz.a |= 4;
            aswz.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final asxc b(String str) {
        copyOnWrite();
        aswz aswz = (aswz) this.instance;
        if (str != null) {
            aswz.a |= 8;
            aswz.e = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asxc(byte b) {
        super(aswz.g);
    }

    public final asxc a(int i) {
        copyOnWrite();
        aswz aswz = (aswz) this.instance;
        aswz.a |= 16;
        aswz.f = 2;
        return this;
    }
}
