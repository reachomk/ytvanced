package defpackage;

/* renamed from: azrd */
public final class azrd extends anxo implements anzf {
    private azrd() {
        super(azra.d);
    }

    /* synthetic */ azrd(byte b) {
        super(azra.d);
    }

    public final azrd a(int i) {
        copyOnWrite();
        azra azra = (azra) this.instance;
        azra.a |= 1;
        azra.b = i - 1;
        return this;
    }
}
