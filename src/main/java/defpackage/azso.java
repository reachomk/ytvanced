package defpackage;

/* renamed from: azso */
public final class azso extends anxo implements anzf {
    private azso() {
        super(azsp.c);
    }

    public final azso a(int i) {
        copyOnWrite();
        azsp azsp = (azsp) this.instance;
        azsp.a |= 2;
        azsp.b = i;
        return this;
    }

    /* synthetic */ azso(byte b) {
        super(azsp.c);
    }
}
