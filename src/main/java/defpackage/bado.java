package defpackage;

/* renamed from: bado */
public final class bado extends anxo implements anzf {
    private bado() {
        super(badp.e);
    }

    public final bado a(String str) {
        copyOnWrite();
        badp badp = (badp) this.instance;
        if (str != null) {
            badp.a |= 2;
            badp.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final bado a(badr badr) {
        copyOnWrite();
        badp badp = (badp) this.instance;
        if (badr != null) {
            badp.d = badr;
            badp.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ bado(byte b) {
        super(badp.e);
    }
}
