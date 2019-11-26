package defpackage;

/* renamed from: babf */
public final class babf extends anxo implements anzf {
    private babf() {
        super(babd.e);
    }

    public final babf a(babe babe) {
        copyOnWrite();
        babd babd = (babd) this.instance;
        if (babe != null) {
            babd.a |= 1;
            babd.b = babe.d;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ babf(byte b) {
        super(babd.e);
    }
}
