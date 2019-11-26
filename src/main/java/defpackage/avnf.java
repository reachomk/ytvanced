package defpackage;

/* renamed from: avnf */
public final class avnf extends anxo implements anzf {
    private avnf() {
        super(avnc.c);
    }

    public final avna a() {
        avna avna = ((avnc) this.instance).b;
        return avna == null ? avna.g : avna;
    }

    public final avnf a(avna avna) {
        copyOnWrite();
        avnc avnc = (avnc) this.instance;
        if (avna != null) {
            avnc.b = avna;
            avnc.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ avnf(byte b) {
        super(avnc.c);
    }
}
