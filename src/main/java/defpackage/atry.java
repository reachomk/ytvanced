package defpackage;

/* renamed from: atry */
public final class atry extends anxo implements anzf {
    private atry() {
        super(atrz.f);
    }

    public final atry a(String str) {
        copyOnWrite();
        atrz atrz = (atrz) this.instance;
        if (str != null) {
            atrz.a |= 1;
            atrz.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final atry a(azfa azfa) {
        copyOnWrite();
        atrz atrz = (atrz) this.instance;
        if (azfa != null) {
            atrz.c = azfa;
            atrz.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atry(byte b) {
        super(atrz.f);
    }

    public final atry a(int i) {
        copyOnWrite();
        atrz atrz = (atrz) this.instance;
        if (i != 0) {
            atrz.a |= 8;
            atrz.e = i - 1;
            return this;
        }
        throw new NullPointerException();
    }
}
