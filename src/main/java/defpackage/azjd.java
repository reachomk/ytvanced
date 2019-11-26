package defpackage;

/* renamed from: azjd */
public final class azjd extends anxo implements anzf {
    private azjd() {
        super(azje.r);
    }

    public final azjd a(String str) {
        copyOnWrite();
        azje azje = (azje) this.instance;
        if (str != null) {
            azje.a |= 1;
            azje.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final azjd b(String str) {
        copyOnWrite();
        azje azje = (azje) this.instance;
        if (str != null) {
            azje.a |= 2;
            azje.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final azjd a(int i) {
        copyOnWrite();
        azje azje = (azje) this.instance;
        azje.a |= 4;
        azje.d = i;
        return this;
    }

    public final azjd a(float f) {
        copyOnWrite();
        azje azje = (azje) this.instance;
        azje.a |= 64;
        azje.g = f;
        return this;
    }

    public final azjd c(String str) {
        copyOnWrite();
        azje azje = (azje) this.instance;
        if (str != null) {
            azje.a |= 256;
            azje.j = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ azjd(byte b) {
        super(azje.r);
    }
}
