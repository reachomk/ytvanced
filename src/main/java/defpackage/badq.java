package defpackage;

/* renamed from: badq */
public final class badq extends anxo implements anzf {
    private badq() {
        super(badr.d);
    }

    public final badq a(String str) {
        copyOnWrite();
        badr badr = (badr) this.instance;
        if (str != null) {
            badr.a |= 1;
            badr.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ badq(byte b) {
        super(badr.d);
    }
}
