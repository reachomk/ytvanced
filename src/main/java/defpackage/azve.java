package defpackage;

/* renamed from: azve */
public final class azve extends anxo implements anzf {
    private azve() {
        super(azvf.d);
    }

    public final azve a(float f) {
        copyOnWrite();
        azvf azvf = (azvf) this.instance;
        azvf.a |= 1;
        azvf.b = f;
        return this;
    }

    public final azve b(float f) {
        copyOnWrite();
        azvf azvf = (azvf) this.instance;
        azvf.a |= 2;
        azvf.c = f;
        return this;
    }

    /* synthetic */ azve(byte b) {
        super(azvf.d);
    }
}
