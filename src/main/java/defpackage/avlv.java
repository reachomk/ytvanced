package defpackage;

/* renamed from: avlv */
public final class avlv extends anxq implements anzf {
    private avlv() {
        super(avls.g);
    }

    public final avlv a(arml arml) {
        copyOnWrite();
        avls avls = (avls) this.instance;
        if (arml != null) {
            avls.b = arml;
            avls.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ avlv(byte b) {
        super(avls.g);
    }
}
