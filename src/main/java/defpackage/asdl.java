package defpackage;

/* renamed from: asdl */
public final class asdl extends anxo implements anzf {
    private asdl() {
        super(asdi.d);
    }

    public final asdl a(String str) {
        copyOnWrite();
        asdi asdi = (asdi) this.instance;
        if (str != null) {
            asdi.a |= 1;
            asdi.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final asdl b(String str) {
        copyOnWrite();
        asdi asdi = (asdi) this.instance;
        if (str != null) {
            asdi.a |= 2;
            asdi.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asdl(byte b) {
        super(asdi.d);
    }
}
