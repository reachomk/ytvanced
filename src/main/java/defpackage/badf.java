package defpackage;

/* renamed from: badf */
public final class badf extends anxo implements anzf {
    private badf() {
        super(badc.d);
    }

    public final badf a(String str) {
        copyOnWrite();
        badc badc = (badc) this.instance;
        if (str != null) {
            badc.a |= 1;
            badc.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ badf(byte b) {
        super(badc.d);
    }
}
