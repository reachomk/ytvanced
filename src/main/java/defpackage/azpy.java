package defpackage;

/* renamed from: azpy */
public final class azpy extends anxo implements anzf {
    private azpy() {
        super(azpz.g);
    }

    public final azpy a(String str) {
        copyOnWrite();
        azpz azpz = (azpz) this.instance;
        if (str != null) {
            azpz.a |= 1;
            azpz.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final azpy a(long j) {
        copyOnWrite();
        azpz azpz = (azpz) this.instance;
        azpz.a |= 4;
        azpz.d = j;
        return this;
    }

    public final azpy b(long j) {
        copyOnWrite();
        azpz azpz = (azpz) this.instance;
        azpz.a |= 8;
        azpz.e = j;
        return this;
    }

    /* synthetic */ azpy(byte b) {
        super(azpz.g);
    }

    public final azpy a(int i) {
        copyOnWrite();
        azpz azpz = (azpz) this.instance;
        if (i != 0) {
            azpz.a |= 2;
            azpz.c = i - 1;
            return this;
        }
        throw new NullPointerException();
    }
}
