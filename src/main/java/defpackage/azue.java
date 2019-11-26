package defpackage;

/* renamed from: azue */
public final class azue extends anxo implements anzf {
    private azue() {
        super(azuf.e);
    }

    public final azue a(azsg azsg) {
        copyOnWrite();
        azuf azuf = (azuf) this.instance;
        if (azsg != null) {
            azuf.b = azsg;
            azuf.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final azue a(int i) {
        copyOnWrite();
        azuf azuf = (azuf) this.instance;
        azuf.a |= 2;
        azuf.c = i;
        return this;
    }

    public final azue a(boolean z) {
        copyOnWrite();
        azuf azuf = (azuf) this.instance;
        azuf.a |= 8;
        azuf.d = z;
        return this;
    }

    /* synthetic */ azue(byte b) {
        super(azuf.e);
    }
}
