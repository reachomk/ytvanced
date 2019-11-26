package defpackage;

/* renamed from: auvu */
public final class auvu extends anxo implements anzf {
    private auvu() {
        super(auvr.c);
    }

    public final auvu a(auvn auvn) {
        copyOnWrite();
        auvr auvr = (auvr) this.instance;
        if (auvn != null) {
            auvr.b = auvn;
            auvr.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ auvu(byte b) {
        super(auvr.c);
    }
}
