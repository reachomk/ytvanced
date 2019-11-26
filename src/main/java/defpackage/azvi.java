package defpackage;

/* renamed from: azvi */
public final class azvi extends anxo implements anzf {
    private azvi() {
        super(azvj.c);
    }

    public final azvi a(azvf azvf) {
        copyOnWrite();
        azvj azvj = (azvj) this.instance;
        if (azvf != null) {
            azvj.b = azvf;
            azvj.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ azvi(byte b) {
        super(azvj.c);
    }
}
